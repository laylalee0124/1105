package file;

import java.io.IOException;


public class IOTest {
	public static void main(String[] args) throws IOException {
		
		
		//===============Standard i/o stream test=================//
		//InputStream is=System.in;
		//int m=is.read(); 			 // byte를 읽어들이지만 return type은 int임.
		
		
		int n=System.in.read();		// 이런형태로 scanner의 역할을 대체가능.
		System.out.printf("ASKI CODE %d  :  CHAR %c ", n, n);
		
		
		
		
		
		
		
		
		
		
	}
	
}
