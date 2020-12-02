package test;

public class Test01 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		for (j = 2; j <= 9; j++) {
			// 줄
			for (i = 1; i <= 9; i++) {
				System.out.printf("%02d*%02d=%02d   ", j, i, j * i);
			}
			System.out.println();
		}
		
		
	}

}
