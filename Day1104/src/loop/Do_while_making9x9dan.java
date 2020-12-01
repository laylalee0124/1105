package loop;
public class Do_while_making9x9dan {
	public static void main(String[] args) {
		
		

		// -----------------------------------------------------------------

		// 구구단만들기, 내가만든것

		int sec = 2;

		while (sec <= 18) {
			System.out.println(sec);
			sec += 2;

		}
		System.out.println("--------------");
		// ----------------------------------------------------------------

		// 구구단만들기, 강사

		int in = 1;

		while (in <= 9) {
			System.out.printf("2*%d=%d" + "\n", in, 2 * in);
			in++;// %d 데시멀이라고 읽음, 콤마 뒤에오는 값을 해당 자리에 반영 시켜 줌
		}
		System.out.println();

		in = 1; // 상기 구문에서 i는 이미 18까지 증가했기 때문에 다시한번 리셋해주는 선언을 해야함.
		while (in <= 9) {
			System.out.printf("3*%d=%d" + "\n", in, 3 * in);
			in++;// %d 데시멀이라고 읽음, 콤마 뒤에오는 값을 해당 자리에 반영 시켜 줌
		}
		System.out.println();

		in = 1; // 상기 구문에서 i는 이미 18까지 증가했기 때문에 다시한번 리셋해주는 선언을 해야함.
		while (in <= 9) {
			System.out.printf("4*%d=%d" + "\n", in, 4 * in);
			in++;// %d 데시멀이라고 읽음, 콤마 뒤에오는 값을 해당 자리에 반영 시켜 줌
		}
		System.out.println();

		// ---------------------중첩구문 test------------------------------

		System.out.println("여기부터 구구단시작");

		int ya = 1;
		int ba = 2;

		while (ba <= 9) {

			ya = 1;
			System.out.println(ba + "단");
			while (ya <= 9) {
				System.out.printf("%d*%d=%d\n", ba, ya, ba * ya);
				ya++;
			}
			System.out.println(); // 줄바꿈
			ba++;
		}

		// ---------------------------------------------------

	}

}
