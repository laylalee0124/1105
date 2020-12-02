package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testfield2 {
	public static void main(String[] args) {
		
		

		File file=new File("input.txt");
		
		Scanner scanner = null;

		try {
			scanner = new Scanner(file);	// 파일을 읽어와서
			
			while (scanner.hasNext()) {		// 이 while문은 여러개의 줄이 있을때 다음줄을 읽어내는 기능. hasNext는 tocken이 존재하면 계속읽음.
			
			String name=scanner.next();		// 각 data type에 scanner로 읽은 값 저장.
			int kor=scanner.nextInt();
			int eng=scanner.nextInt();
			int mat=scanner.nextInt();
			int tot=kor+eng+mat;
			double avg=tot/3.0;
			
			
			Data dt=new Data();				// default method 호출, 값이 0으로 정이되어있음.
											// Data에 private로 변수가 선언되어있기 때문에, 여기서 직접적으로 값을 설정할순없음.
											// 때문에 Data에 getter/setter method를 설정해주고 아래처럼 호출해서 scanner로 읽은 저장해줌.
			
			dt.setName(name);				// Scanner를 통해 'name'에 저장된 값을 dt.setName에 setting해줌.
			dt.setKor(kor);
			dt.setEng(eng);
			dt.setMat(mat);
			dt.setTot(tot);
			dt.setAvg(avg);
			
			System.out.println(dt);						// dt의 overide된 string전체 불러오는 방법.
			System.out.println("Name "+dt.getName());	// dt class에 getName으로 저장된 getName값을 호출(get)함.
			System.out.println("Kor "+dt.getKor());
			System.out.println("Eng "+dt.getEng());
			System.out.println("Mat "+dt.getMat());
			System.out.println("Total "+dt.getTot());
			System.out.println("Average "+dt.getAvg());
			System.out.println();
		}	
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scanner !=null) scanner.close();
		}
	
		
		
		
	}
}
