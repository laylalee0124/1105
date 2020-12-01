package loop;

import java.util.Scanner;

public class Scan_test {

	public static void main(String[] args) {

//-----------------for 구문을 사용한 키보드 입력값 test------------------------------------------

		
		//반복구문을 만들때는 반복되는 구문을 먼저 샘플링 (반복되는 부분을 특정화) 해서 {}를 씌우고 구문을 쓰면 빠르고 쉬움
		
		
		Scanner in = new Scanner(System.in);
		int keyboardvalue;

		System.out.printf("숫자입력: ");
		keyboardvalue = in.nextInt(); // 키보드에서 입력받은 내용을 int 형으로 'keyboardvalue'에 저장함.

		for (int lop = 0; lop < keyboardvalue; lop++) {
			for (int val = 0; val < keyboardvalue; val++) {// 초기값은 0에서 시작해서, 0이 keyboardvalue되기전까지 반복하는데, val을 1개씩 증가.
				System.out.print("* ");
			}
			System.out.println();
		}
		

	
	}
}
