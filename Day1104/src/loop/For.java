package loop;
public class For {
	public static void main(String[] args) {
		
		
//---------------------For loop 구문-----------------
		/*
		 * for(initialization(초기값); Boolean_expression(조건문); update(증감)) {} true이면 계속
		 * loop, false이면 loop종료 사이즈 측정이 어려운 데이터 구문은 while을 쓰고, 측정가능한 데이터구문은 for을 쓰는게
		 * 좋을수있다.
		 */

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%d\n", 2, i, 2 * i);
		}

		for (int i = 1; i <= 9;) {
			// i++구문위치를 바디안으로 넣어도 동일한 결과가 나옴.
			// 증감문 자리에, 다른 구문을 써도 되지만, for구문은 이렇게 쓰기로 약속한 구문이므로 굳이 형식을 변경해서 쓰지않는다.
			System.out.printf("%d*%d=%d\n", 2, i, 2 * i);
			i++;
		}

		System.out.println("-------------------------------------");
		
//------------------------for의 반복구문 중첩-------------------------------------------------	

		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 0; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}

//-------------------------------------
	}

}
