package loop;

import java.util.Scanner;

public class Scan_test04_needTOfinish {

	public static void main(String[] args) {

//-----------------for 구문을 사용한 키보드 입력값 test2------------------------------------------

		//     *        = x - 4   
		//   * * *      = x - 2
		// * * * * *    = x < key
		//   * * *      = x - 2
		//     *        = x - 1

		// 만들어보기

		Scanner in= new Scanner(System.in);

		int key;

		System.out.printf("숫자입력: ");

		key = in.nextInt();
		
		int ui = (key * 2) - 1;
		int di = (key * -2) - 1;

		for (int loop = 0; loop < key; loop++) { // 0부터 시작해서, loop가 key 값보다 작을때까지 loop를 1씩 증가해서 반복
			

			/*
			if가 참이면 "* " 출력
			if가 거짓이면 "  " 출력
			
			5/5=1 =
			5/
			
			
			*/
			
			
			/*
			if (loop == key) {
				if (loop >= key) {
					for (int num = 0; num < ui; num++) { // 0부터 시작해서 num가 u값보다 작을때까지 num에 ++해서 for loop 시킨다는 의미.
					}
				} else {
					for (int num = 0; num < di; num++) {
					}

				}

			}
			*/

			System.out.print("* ");
		}
					
		
//================================================================
	}
}