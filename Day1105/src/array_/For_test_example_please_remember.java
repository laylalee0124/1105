package array_;

public class For_test_example_please_remember {

	public static void main(String[] args) {
/*
// -----------기출문제 구구단 출력하기-----------------
		int a=2;
		int b=1;

		for (a = 2; a <= 9; a++) {
			System.out.println(a+"단");
			for (b = 1; b <= 9; b++) {
				System.out.printf("%d*%d=%2d\n", a, b, a*b); // printf 는 출력 형태지정하는 명령어
			}
			System.out.println();
		}
		
//----------------------------------------------
*/		

		for (int a=1; a <= 9; a++) {
			for (int b=2; b <= 9; b++) {
				System.out.printf("%d*%d=%2d   ", b, a, b*a); // printf 는 출력 형태지정하는 명령어. 2면 공백포함 2자리. 02면 0포함 2자리를 표시함.
			}
			System.out.println();
		}	
		
		/*
		2*1   3*1   4*1
		2*2   3*2   4*2
		2*3   3*3   4*3
		*/
		
		
		
		
		
		
		
		
		
	}
}
