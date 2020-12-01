package loop;

public class Do_while {

	public static void main(String[] args) {
		
		
//--------------------Do while 구문-------------------------
		/*
		 * do {  반복되는 영역  }
		 * while(조건문);
		 */

		// Do while구문과 while과 다른 부분은, 값이 false라도 한번은 반드시 실행된다는 것 부분이다름.
		// while 구문은 값이 false면 구문을 실행하지 않고 그대로 종료.
		
		int x = 10;

		do {
			System.out.print("value of x : " + x);
			x++;
			System.out.println();
		} while (x < 20);

		
		System.out.println("------------------");
		//---------------------------------------------
		
		
		
		
		//-------------------문제되는 부분을 찾아보시오--------------------------
		
		int num = 2;
		
		while ( num<0 || num>3 ) {
			System.out.println(num);
			num++;
		}
		System.out.println("아니네요");
		
		System.out.println("------------------");
		//---------------------------------------------
		
		do {
			System.out.print(num);
			num=2;
		} while ( num<0 || num>3 );
		
		
		
//---------------------------------------------
	}

}
