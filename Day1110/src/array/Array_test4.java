package array;

public class Array_test4 {

	public static void main(String[] args) {

		/*
		 16 15 14 13
		 12 11 10  9
		 8  7  6  5
		 4  3  2  1
		 		   
		
		 */
		
		int m = 4;

		int arr[][] = new int[m][m];

		int c = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = c++;
			}
		}

		for (int j = arr.length - 1; j >= 0; j--) {
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.printf("%d  ", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
