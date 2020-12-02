package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testfield {
	public static void main(String[] args) {

		File file=new File("input.txt");
		
		Scanner scanner;
		try {
			scanner = new Scanner(file);			// 파일을 읽어와서

			String name=scanner.next();				// 각 data type에 scanner로 읽은 값 저장.
			int kor=scanner.nextInt();
			int eng=scanner.nextInt();
			int mat=scanner.nextInt();
			int tot=kor+eng+mat;
			
			
			Data dt=new Data();
			Data dt1=new Data(name, kor, eng, mat);
			
			System.out.println(dt);
			System.out.println(dt1);
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		
		
		
	
		
		
		
	}
}
