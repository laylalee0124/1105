package loop;

import java.util.Scanner;

public class Scan_test05 {

	public static void main(String[] args) {

//-----------------for 구문을 사용한 키보드 입력값 test2------------------------------------------

		// *
		// * *
		// * * *
		// * *
		// *

		// for4번? 
		
		// 코드내에서는 상수데이터보다는 항상 규칙을 찾아서 변수데이터로 넣는것이 수정/보완이 쉽다.

		Scanner in = new Scanner(System.in);
		int keyboardvalue;

		System.out.printf("숫자입력: ");
		keyboardvalue = in.nextInt(); // 키보드에서 입력받은 내용을 int 형으로 'keyboardvalue'에 저장함.

		int c = keyboardvalue * 2 - 1; // 

		for (int lop = 0; lop < c; lop++) { //행을 늘리는 조건: 0줄부터 시작해서 c값이 되기 전까지 줄을 한줄씩 늘림.

			if (lop < keyboardvalue) {  //행을 늘리는 조건:  단, lop를 0부터 시작해서 key값이 되기 전이면, {}를 실행,
				for (int val = 0; val < lop + 1; val++) {// 초기값은 0에서 시작해서, 0이 keyboardvalue되기전까지 반복하는데, val을 1개씩 증가.
					System.out.print("* ");
				}

			} else {// lop=3,4
				for (int val = 0; val < c - lop; val++) {// 초기값은 0에서 시작해서, 0이 keyboardvalue되기전까지 반복하는데, val을 1개씩 증가.
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}
}