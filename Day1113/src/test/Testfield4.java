package test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testfield4 {
	public static void main(String[] args) {

/////////////입력한 내용을 파일로 저장하기////////////////

		Data dt = new Data(); // Data class를 먼저 불러와서 dt라는 변수에 넣어줌.

		// 입력기능실행
		dt.inputData();

		// 입력받은 값을 저장할 장소 지정
		File file = new File("data.txt");

		// FileWriter 연결
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);

			fw.write(dt.getName());
			fw.write(" " + dt.getKor());
			fw.write(" " + dt.getEng());
			fw.write(" " + dt.getMat());
			fw.write(" " + dt.getTot());
			fw.write(" " + dt.getAvg() + "\n"); // " "와 dt가 먼저 합쳐져서 문자열 연산이 일어나서 문자열이됨.
			// fw.write(dt.getAvg()); <- 이건 왜 안돼지?

			
		} catch (IOException e) {
			e.printStackTrace();
			
			
		} finally {
			if (fw != null) {
				System.out.println("스트림 종료");
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}
}
