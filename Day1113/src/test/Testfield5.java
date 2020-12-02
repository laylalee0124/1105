package test;

import java.util.Scanner;

public class Testfield5 {
	
	//method 만들기
	
	public void menu() {  
		System.out.println("메뉴를 선택 하던가 말던가 '-'");
		System.out.println("1.입력   2.출력   3.종료");
		System.out.print("선택 - ");
	}
	
	public static void main(String[] args) {
		
		Data dt=new Data();
		
		while(true){
			Testfield5 t5=new Testfield5(); 	// menu()가 static이 아니라서 main에서 menu를 호출할수없다. menu()를 static으로 바꾸거나.
			t5.menu();							// 이런식으로 class 변수를 만들어서 써줄수있다.
			
			Scanner in=new Scanner(System.in);
			int slct=in.nextInt();
			
			switch (slct) {
			case 1:
				System.out.println("입력");
				dt.inputData();
				break;
			case 2:
				System.out.println("출력");
				dt.displayaaa();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);                 // 0으로 설정하면 정상적으로 종료시켜줌.
				break;
	
			default:
				break;
			}
		}
		
		
		
		
		
/*
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

		
		
		
		
*/		
		
	}
}
