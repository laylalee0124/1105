package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_inoutput_char {
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		System.out.print("문자 입력:  ");
		String c=in.nextLine();  //문자열을 입력 받는 next입력법 
		
		

		// InputStream 연결
		File file = new File("data.txt");	  // 이미지를 읽어들일 곳을 file이라는 변수에 저장.
		FileWriter fw = new FileWriter(file); // 해당 문서를 읽어 들여서 fw에 써줌

		fw.write(c);
		
		
		// OutputStream 연결
		File des = new File("data_1.txt"); // 복사할 장소를 정해주고
		FileReader fr = new FileReader(des); // 이미지를 fos 복사

		
		
		
		// ---------------------------출력구문------------------------------------------
		System.out.println("복사 완료");
		
		fw.close(); // inputStream 해제 / 사용한 스트림은 사용이 끝나면 꼭 close해줄것
		fr.close(); // outputStream 해제 / 사용한 스트림은 사용이 끝나면 꼭 close해줄것



	}

}
