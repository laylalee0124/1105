package loop;
public class While_for_do_while {
	public static void main(String[] args) {

		
		
		
//----------------------while loop----------------------------------

		// 구문이 길어지면 몇번 반복하는지 확인하기 어려울수도있다.
		// Repeats a statement or group of statements while a given condition is true.
		// It tests the condition before executing the loop body.
		// 조건이 true이면 {}실행하고, {} 실행후 다시 조건문으로 돌아가 조건을 체크한다.
		// 조건이 false일때 {}바깥쪽 구문을 실행한다.

		int num = 1; // 초기값 설정

		while (num <= 10) { // num(1)이 10보다 작거나 같을때
			System.out.print(num + "\n"); // num을 출력하고, \n은 새줄에 출력하라는 의미.
			num++; // 조건문이 true일때 수행하는 구문
			num += 2; // 조건문이 true일때 수행하는 구문 2
		}

		System.out.println("--------------");
//-----------------------------------------------------------------

		int i = 1;
		/*
		 * System.out.println(i);i++; System.out.println(i);i++;
		 * System.out.println(i);i++; System.out.println(i);i++;
		 * System.out.println(i);i++;
		 */

		// 상기 반복구문을 아래처럼 한줄로 축약가능하다는 이야기임.
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------");
		
		
	}

}
