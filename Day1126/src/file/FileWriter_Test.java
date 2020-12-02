package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Test {
	public static void main(String[] args) {

		
		//---------------string읽어서 파일을 생성하는 구문-----------------//
		FileWriter fw = null;
		try { // 예외가 발생 가능한 부분을 try{ }에서 표현하고.
			fw = new FileWriter("basic.txt"); // 기본적으로 파일이없으면 생성시켜 주는 기능있음.

			fw.write("하이");

		} catch (IOException e) { // 예외가 발생되면 catch{ }블록에서 처리
			e.printStackTrace();
		} finally { // try가 정상적으로 끝나면 catch처리후 끝나면 처리되는영역.
			try {
				fw.close();// filwriter는 쓰면 바로 닫아줄것.
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
