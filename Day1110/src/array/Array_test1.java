package array;

public class Array_test1 {

	public static void main(String[] args) {

		/*
		1  2  3  4  5  
		6  7  8  9  10  
		11  12  13  14  15  
		16  17  18  19  20  
		21  22  23  24  25 
		 */
		
		int m = 5;
	
		int arr[][] = new int[m][m];
		
		int c = 1;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i<arr[j].length; i++) {
				arr[j][i] = c++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%d  ", arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
