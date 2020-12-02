package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_inoutput_binary {
	public static void main(String[] args) throws IOException {
		
		/*
		File file=null;
		FileInputStream fis=new FileInputStream(file);
			// Unhandled expection type FileNotFoundException : 해당 파일이 없음.
			// 문제가 발생된 경우에도 정상적으로 종료될수 있도록 해주는 방법 
			// 1) throws FileNotFoundException
			// 2) try{} catch{}
			// 3) input/output의 exception도  / IOException를 통해 throws 가능. 
			
		*/
		
		//InputStream 연결
		File file=new File("img_1.jpg");			 	   // 이미지를 읽을 장소를 정하고  // img_1.jpg파일은 Day1112에 저장해두었다.
		FileInputStream fis=new FileInputStream(file);	   // 해당 이미지를 읽어 들여서 fis에 저장

		//OutputStream 연결		
		File des=new File("img_1_copy.jpg");      	       // 복사할 장소를 정해주고
		FileOutputStream fos = new FileOutputStream(des);  // 이미지를 fos 복사
		
		
		long s=System.nanoTime(); //걸린시간계산한번해본거

		// 1 byte씩 읽어들이는데, 얼마나 읽어들일지 모르므로 while구문사용하고 data의 끝을 찾기위해 -1과 비교했다.
		// read() method는 파일을 더 읽을수 없을때 -1을 return한다.
		// 읽어들인 데이터가 -1가 아니면, {바디} 실행
		// 이렇게 읽는 방법은 비효율적이므로 '버퍼'를 써서 빠르게 처리 할수도있다.
		int data;
		while((data=fis.read()) != -1) {
			fos.write(data);
		}
		long e=System.nanoTime(); //걸린시간계산한번해본거
		
		System.out.println("걸린 시간"+(double)(e-s)/1000000000+"초");
		System.out.println("복사 완료");
		
		fis.close(); // inputStream 해제 / 사용한 스트림은 사용이 끝나면 꼭 close해줄것
		fos.close(); // outputStream 해제 / 사용한 스트림은 사용이 끝나면 꼭 close해줄것

	}
}
