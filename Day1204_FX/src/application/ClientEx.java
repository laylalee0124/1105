package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {

		Socket skt = null;

		try {

			// 연결 요청~연결 완료 구문
			skt = new Socket();
			System.out.println("연결요청");
			skt.connect(new InetSocketAddress("localhost", 9999)); // localhost=127.0.0.1 으로도 쓸수있음.
			System.out.println("연결성공");

			// 서버측으로 데이터 보내는 구문
			OutputStream os=skt.getOutputStream();
			String msg=":D HAHAHHA";
			os.write(msg.getBytes("utf-8"));  	// getBytes() 문자열을 바이트배열로바꿔줌. (utf-8타입으로 보내줌)
			os.flush();					// 버퍼에 저장된 스트림을 모두 output 시킴.
			System.out.println("데이터 전송 완료");
			
			
			
			// 서버 측에서 데이터 수신받는 구문
			InputStream is=skt.getInputStream();
			byte[] buff=new byte[1024];		// getByte로 변환한 데이터를 받아저장할 공간 생성		
			int readCount=is.read(buff);	// write로 읽은 data를 만들어놓은 buff에 저장, 몇글자를 받았는지 readCount로 카운팅가능
			String str=new String(buff, 0, readCount, "utf-8");	// buff에 저장된 데이터를, 0번부터, readCount갯수만큼, charset을 utf-8타입의, 문자열로 변환.
					
			System.out.println("------받은 메세지-----");
			System.out.println(str);
			
			
			os.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (skt != null)
					skt.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
