package loop;

import java.util.Scanner;

public class Scan_test01{

public static void main(String[] args) {

//-----------------for 구문을 사용한 키보드 입력값 test------------------------------------------


		//1 2 3
		//5 4 6
		//7 8 9
	
		
		
		Scanner in = new Scanner(System.in);
		int keyboardvalue;

		System.out.printf("숫자입력: ");
		keyboardvalue = in.nextInt(); // 키보드에서 입력받은 내용을 int 형으로 'keyboardvalue'에 저장함.
		
		int count=1;

		for (int lop = 0; lop < keyboardvalue;lop++) {
			for (int val = 0; val < keyboardvalue; val++) {// 초기값은 0에서 시작해서, 0이 keyboardvalue되기전까지 반복하는데, val을 1개씩 증가.
				System.out.print(count+" ");count++;
			}
			System.out.println();
		}
		



}
}