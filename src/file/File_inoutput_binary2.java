package file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_inoutput_binary2 {
	public static void main(String[] args) throws IOException {
		
		
		//InputStream 연결
		File file=new File("img_1.jpg");			 	   // 이미지를 읽을 장소를 정하고  // img_1.jpg파일은 Day1112에 저장해두었다.
		FileInputStream fis=new FileInputStream(file);	   // 해당 이미지를 읽어 들여서 fis에 저장

		//OutputStream 연결		
		File des=new File("img_1_copy.jpg");      	       // 복사할 장소를 정해주고
		FileOutputStream fos = new FileOutputStream(des);  // 이미지를 fos 복사
		
		
//-------------------------------case 1-----------------------------------------
		// 1 byte씩 읽는 방법은 비효율적이므로 '버퍼'를 써서 빠르게 처리 할수도있다.
		long s=System.nanoTime(); //걸린시간계산한번해본거
		int data;
		byte buffer[]=new byte[1024];
		
		while((data=fis.read(buffer)) != -1) {  // 데이터를 더 읽을게 없을 때.
			fos.write(buffer);
		}
		
//-------------------------------case 2-----------------------------------------		
		/*   무한루프로 돌릴경우에는, 아래 구문을 통해서도 탈출이 가능하다.
		while (true){
		int readCount=fis.read(buffer);
		fos.write(buffer);
		if(readCount<buffer.length)break;
		}
		*/

//---------------------------출력구문------------------------------------------
		long e = System.nanoTime(); // 걸린시간계산한번해본거

		System.out.println("걸린 시간"+(double)(e-s)/1000000000+"초");
		System.out.println("복사 완료");
		
		fis.close(); // inputStream 해제 / 사용한 스트림은 사용이 끝나면 꼭 close해줄것
		fos.close(); // outputStream 해제 / 사용한 스트림은 사용이 끝나면 꼭 close해줄것

	}
}
