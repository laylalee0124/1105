package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest5 {
	public static void main(String[] args) {


	FileReader fr = null;
	
	// [순서]
	// 1. 예외구문처리 try-catch
	// 2. finally 추가
	// 3. fr. close시켜주기
	// 4. close method에 대한 try-catch 추가.
	// 5. variable value <- null로 initialized해주기.
	
	try {	
		fr=new FileReader("basic.txt");  // file을 읽어와서 fr에 저장.
		//---원래 코딩 범주---
		int read;
		while ((read=fr.read()) != -1) {  // read()로 읽을때 -1은 파일의 끝을 의미.
		System.out.print((char)read);	  // int로 읽어온 read를 char으로 출력하고, 파일의 끝(-1)에 도달할대까지 반복출력
		}
		//---원래 코딩 범주---
		
	} catch (FileNotFoundException e) {
		// e.printStackTrace(); 에러 문구 표기하는 구문
		// 대신
		System.out.println("파일이 존재하지않습니다.\n 파일체크후 재실행하세요");
		System.exit(0); //프로그램을 정상적으로 종료 해주는 명령어
		
	} catch (IOException e) {
		// e.printStackTrace(); 에러 문구 표기하는 구문
		// 대신
		System.out.println("파일을 읽지못했습니다.");
	} finally {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	}
}
