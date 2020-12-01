package array;

public class Array_test2 {

	public static void main(String[] args) {
		
		
		/*
		4  3  2  1
		8  7  6  5
		12 11 10 9
		16 15 14 13  
		 */
		
		int m = 4;
		int arr[][] = new int[m][m];
		
		
		//값을 arr에 저장해주는 구문. arr[0][0], arr[0][1], arr[0][2]
		int c = 1;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i<arr[j].length; i++) {
				arr[j][i] = c++;
			}
		}

		
		//전체 행 출력 구문
		for (int i = 0; i < arr.length; i++) {
			
			//한줄 출력 구문
			for (int j=arr.length-1; j>=0; j--) {          //int j=3; j>=0 0이될때까지; j--
				System.out.printf("%02d  ", arr[i][j]);
				
				/*
				System.out.printf("%d  ", arr[i][j]);          //arr[0][3]
				System.out.printf("%d  ", arr[i][j--]);        //arr[0][2]
				System.out.printf("%d  ", arr[i][j--]);        //arr[0][1]
				System.out.printf("%d  ", arr[i][j--]);        //arr[0][0]
				*/
			}
			System.out.println();
		}
		
		
		
		
	}

}
