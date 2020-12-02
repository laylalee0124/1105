package firstclass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class New_ {
	public static void main(String[] args) throws IOException {

		/* 경로 방법 1 - 리눅스서버를 위해 쓰는듯?
		String path="."+File.separator+"input.txt";
		File file=new File(path);  //()안에는 문자열도넣을수있음. 
		// ./은 나를 포함한 부모폴더.
		// pathseparator - 여러 개의 path경로를 서로 구분하기 위한 separator (;)
		// separator - 한 주소 내의 경로를 구분하기위한 separator (\) 
		System.out.println(path);
		*/
		
		// 경로 방법 2
		File file=new File("input.txt");
		
		
		
		// 파일 읽을때 예외 처리 방법 중 하나.	
		FileInputStream fis = null;
		try {											// 예외가 발생할 여지가 있는 코드를 넣고 try 해보게함.
			fis=new FileInputStream(file);				// (변수), 여기에서는 input.txt를 fileinputstream fis에 넣을수 있는지를 체크해보고.
			System.out.println("파일 연결 완료");
			
			int data;									// 우선순위 : 관계연산자가 먼저 대입연산자가 나중. / 데이터의 끝인 -1도 따로 변수선언(EOD)해서 알아보기 쉽게 쓸수도있다.
			while((data=fis.read()) == -1) {			// fis.read에서도 예외가 발생할수있는 여지가있다. throw IOException/catch에 조건을 (|)통해 추가(문구를 하나로 출력하고싶을떄)/catch구문자체를 하나더 만들기(문구를따로출력하고싶을때)/아님 아예 이 바디안에 try/catch 또 추가..
				
			}
			
			
		}catch (FileNotFoundException e) {				// 예외가 실제 발생되면 이걸로 잡음. exception에 관한 최상위 클래스는 Exception임. 무수한 에러가 있기 때문에 참고.
			e.printStackTrace();  						// exception이 발생된 경로를 추적해서 알려주는 method
			System.out.println("파일이 존재하지 않습니다");  // 예외가 발생되면 이 문장을 출력하고 program을 정상 종료 시켜줌.
		
		
		}finally { 										// try~catch의 optional 항목. 선택적 사용가능.
														// try에서 exception발생하면 catch로, catch에서 exception발생하면 finally로 움직이는 구조. 무조건실행.
			if(fis!=null) try {fis.close();} catch (IOException e) {}   // fis 변수를 try{}내에 생성하게되면, block밖에서 fis를 읽을수 없어서 구문밖에서 close가 안되기 때문에, fis선언 부를 try{}보다 먼저 해준다.	
			System.out.println("예외상황 - 스트림 종료");
		}
		
		
	
		
		
		
	}
}
