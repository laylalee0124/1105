package firstclass;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class New_2 {
	public static void main(String[] args) {

		File file=new File("input.txt");
		
		Scanner scanner;
		try {
			scanner = new Scanner(file);			// 파일을 읽어와서

			String name=scanner.next();				// string type 'name'에 저장.
			System.out.println(name);				// 출력 'name'
			
			int kor=scanner.nextInt();
			System.out.println("kor "+kor);
			
			int eng=scanner.nextInt();
			System.out.println("eng "+eng);
			
			int mat=scanner.nextInt();
			System.out.println("mat "+mat);
			
			int tot=kor+eng+mat;
			System.out.println("tot "+tot);
			System.out.println("avg "+tot/3.0);
			
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		
		
		
	
		
		
		
	}
}
