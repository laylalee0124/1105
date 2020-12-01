package loop;

import java.util.Scanner; //library에 있는 lang pkg이외의 class를 사용할 경우에 import로 해당 pkg를 지정해줘야 사용가능해짐.

public class Scanner_ {

	public static void main(String[] args) {

		// class를 만들고 instance를 만듭니다. ? 인스턴스가 뭐여...객채화를 한다는 뜻인디... //Scanner() =
		// default생성자라고 부름.
		// keyboard로 부터 입력받으려면 (System.in) <- inputStream을 의미.
		// stream은 단방향 입력을 의미함. inputstream/outputstream/errorstream 세가지.

		// 키보드로부터 입력처리하기위한 objext
		Scanner in = new Scanner(System.in);
		// 요거 에러표시나는건 키보드로부터 값을 받아야해서 그런것.

		int num;
		System.out.printf("숫자만 정수로 입력:"); // printf는 기본줄바꿈없음.
		num = in.nextInt(); // 키보드에 입력된 데이터를 int형으로 읽어 들인다.

		int i = 1;
		while (i<=num) {
			System.out.println("num : " + i); // println은 기본줄바꿈있음.
			i++;
		}

	}

}
