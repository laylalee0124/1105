package loop;

import java.util.Scanner;

public class Scan_test03 {

	public static void main(String[] args) {

//-----------------for 구문을 사용한 키보드 입력값 test2------------------------------------------



				// * * *
				// * *		
				// *
				
				
				Scanner in = new Scanner(System.in);
				System.out.printf("숫자입력: ");
				int keyboardvalue = in.nextInt(); // 키보드에서 입력받은 내용을 int 형으로 'keyboardvalue'에 저장함.
			
				
				for (int lop = 0; lop < keyboardvalue; lop++) {  //lop는 0,1,2,3...으로 증가.
					for (int val = 0; val < keyboardvalue-lop; val++) {// val도 동일하게 0,1,2,3..증가하지만 루프끝나면 0으로 리셋되므로 사용하기어려움
						System.out.print("* ");
					}
					System.out.println();
				}

			}
		}