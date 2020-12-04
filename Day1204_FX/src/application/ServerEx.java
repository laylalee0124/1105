package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
public static void main(String[] args) {
	
	ServerSocket svrskt = null;
	
	try {
		// 포트가 이미 열려있는 상황에서 재접속할경우 발생하는 error는 catch에서 잡아줌 BindException.
		svrskt = new ServerSocket(9999); //(포트번호)
		
		Socket skt=svrskt.accept();
		System.out.println("연결대기상태");
		
		InetSocketAddress ia=(InetSocketAddress) skt.getRemoteSocketAddress(); // 상대방 소켓주소 확인
		System.out.println("연결완료 : " + ia.getHostName());
		
		// 클라이언트 측에서 데이터 수신받는 구문
		InputStream is=skt.getInputStream();
		byte[] buff=new byte[1024];		// getByte로 변환한 데이터를 받아저장할 공간 생성		
		int readCount=is.read(buff);	// write로 읽은 data를 만들어놓은 buff에 저장, 몇글자를 받았는지 readCount로 카운팅가능
		String str=new String(buff, 0, readCount, "utf-8");	// buff에 저장된 데이터를, 0번부터, readCount갯수만큼, charset을 utf-8타입의, 문자열로 변환.
				
		System.out.println("------받은 메세지-----");
		System.out.println(str);
		
		
		
		// 클라이언트측으로 데이터 회신 구문
		OutputStream os=skt.getOutputStream();
		String msg=":D WELL RECEIVED!!!";
		os.write(msg.getBytes("utf-8"));  	// getBytes() 문자열을 바이트배열로바꿔줌.(utf-8타입으로 보내줌)
		os.flush();					// 버퍼에 저장된 스트림을 모두 output 시킴.
		System.out.println("데이터 전송 완료");
		
		
		is.close();	
		os.close();
		
	} catch (IOException e) { 
		e.printStackTrace();
	}
	
	
	// skt 닫기
	try {
		//if((sverskt.isc\Closed()) sverskt.close()) 가능
		if(svrskt!=null) svrskt.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
