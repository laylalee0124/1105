package application;

//import시 awx안쓰도록 주의. 옛날거임.
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController {

	// XML에있는 widget을 자바로 옮겨서 활성화 시키는 구문.

	// 각 function에 대한 객체 생성
	// thread pool
	
	@FXML 	Button bttnserver; 
	@FXML 	TextArea textdisplay;
	ServerSocket serversocket;
	
	ExecutorService executorservice;
	
	// collection으로 몇개가 될지 모르는 접속된 클라이언트 정보를 저장해준다.
		List<Client> connections=new Vector<>();
	
	
	@FXML
	public void onBtnServer(Event event) {
		// button에있는 글자를 trim해서 string으로 저장.
		String bttnText = bttnserver.getText().trim();
		if (bttnText.equals("눌러보새오  :)")) {
			// 글자를 변경해주기
			startserver();
		} else if (bttnText.equals("꺼버려야징 :D")) {
			stopserver();
		}
	}

	// 다중 접속일때 socket이 몇개접속되있는지를 파악하기위해 inner class "Client"를 만들었다.
	// collection으로 몇개가 될지 모르는 접속된 클라이언트 정보를 저장해준다.
	// List<Client> connections=new Vector<>();
	
	class Client{
		Socket socket;
		
		// 데이터 송수신
		void recieve() {}
		void send(String data) {}
		
		public Client (Socket socket) {
			this.socket=socket;
		}
	}
	
	
	///////////////////////////////////////////////////////////////////////
	// stopserver()
	private void stopserver() {

		// try/catch구문에 들어있는 socket정보가 저장된 client socket을 불러와서 close시켜준다.
		for (Client client : connections) {
			try {
				client.socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// server socket닫기.
		// serversocket이 not null이거나, isclosed되지않았으면. close시킴.
		if(serversocket != null && !serversocket.isClosed()) {
			try {
				serversocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// thread pool도 닫아줘야함. 
		// thread pool은 shutdown으로 control함.
		if(executorservice !=null && !executorservice.isShutdown()) {
			executorservice.shutdown();
		}
		
		
		Platform.runLater(() -> {
			Print("[server closed!]");
			bttnserver.setText("눌러보새오  :)");
		});
	}

	
	
	
	///////////////////////////////////////////////////////////////////////
	private void startserver() {
		// Runnable도 interface이므로 rambda식으로 표현
		// 이걸 그냥 쓰는게 아니라 Thread pool을 이용해서 사용하게 됨.
		
		// 클라이언트의 폭증으로 인해 서버의 과도한 thread생성을 막기위해 thread수를 제한해서 사용. (여기서는 method를 이용해서 갯수를 정해봄)
		executorservice=Executors.newFixedThreadPool(
				
				//Returns the number of processors available to the Java virtual machine.
				Runtime.getRuntime().availableProcessors()  
				
				);
		
		//--------독립 thread start------------
		Runnable runnable=()->{
			
			// UI변경
			Platform.runLater(()->{
				bttnserver.setText("꺼버려야징 :D");
			});
			
			// 서버시작로직
			try {
				serversocket = new ServerSocket();
				serversocket.bind(new InetSocketAddress("localhost",5001));
				Print("[Ready]");
				
				//다중접속일때 socket이 몇개접속되있는지를 파악하기위해 inner class "Client"를 만들었다.
				Socket socket = serversocket.accept();
				
				String mssg="[ 연 결 완 료 ] ; "+socket.getRemoteSocketAddress()+" - "+Thread.currentThread().getName();
				Print(mssg);
				
				Client client=new Client(socket);
				
				// 클라이언트 정보를 collection에 저장
				connections.add(client);
				Print("몇개 연결됐을까욤? : "+connections.size()); // 사이즈출력해보는것
				
			} catch (IOException e) {
				// 예외사항 처리 구조 : serversocket이 close된경우, server를 stop시킴.
				if(!serversocket.isClosed()) {
					stopserver();
				}
				//e.printStackTrace();
			} // finally를 안쓰는건 try/catch로 종료하지않고 계속 돌리기위해서임.
		};
		//--------thread end------------
		
		// submit()를 통해 thread(runnable)를 thread pool에서 처리하는 로직.
		executorservice.submit(runnable);
		
	}
	
	

	// startserver()
	///////////////////////////////////////////////////////////////////////
	private void Print(String str) {
		Platform.runLater(() -> {
			textdisplay.appendText(str + "\n");
		});

	}

}