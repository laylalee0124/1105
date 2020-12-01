
package loop;
import java.util.Scanner;
public class For_Using_Scanner {
	public static void main(String[] args) {
		
		
//-----------------for 구문을 사용한 키보드 입력값 test------------------------------------------
		// Question
		// keyboard로 정수 입력받기
		// 해당 갯수만큼 '*' 출력하기

		
		Scanner in = new Scanner(System.in);
		int keyboardvalue;    
				
		System.out.printf("숫자입력: ");
		keyboardvalue = in.nextInt();  //키보드에서 입력받은 내용을 int 형으로 'keyboardvalue'에 저장함.
		
		for(int val=0 ; val<keyboardvalue; val++ ) {//초기값은 0에서 시작해서, 0이 keyboardvalue되기전까지 반복하는데, val을 1개씩 증가.
			System.out.print("* ");
			}
		
		
				
//-----------------------------------------------------------------------
		
		
		
		
	}
}
