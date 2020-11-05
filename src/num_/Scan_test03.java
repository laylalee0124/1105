package num_;

import java.util.Scanner;

public class Scan_test03 {

	public static void main(String[] args) {

//-----------------for 구문을 사용한 키보드 입력값 test2------------------------------------------

		
		System.out.print("숫자를 입력하세요: ");
		
		Scanner in = new Scanner(System.in);
		int key = in.nextInt();		// 키보드에서 입력받은 내용을 int 형으로 'key'에 저장함.
		
		
		int ary[] = new int[key]; 	// 몇 배열인지 정하는 숫자는 key에서 값을 받아서 정함.
		
		
		for (int y : ary) {			// 새로운 변수 y는 int형이고, ary배열에서 값을 가져와서 반영함.
		System.out.print(y+" ");
		}
		
		

	}
}