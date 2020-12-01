package array;

public class Array_test3 {

	public static void main(String[] args) {
		
		
		/*
		13 14 15 16
		9  10 11 12
		5  6  7  8
		1  2  3  4 
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
		for (int i = arr.length-1; i >=0; i--) {
			
			//한줄 출력 구문
			for (int j=0; j<arr.length; j++) {          //int j=3; j>=0 0이될때까지; j--
				System.out.printf("%02d  ", arr[i][j]);
			}
			/*
			System.out.printf("%d  ", arr[i][j]);            //arr[3][1]
			System.out.printf("%d  ", arr[i--][j++]);        //arr[2][2]
			System.out.printf("%d  ", arr[i--][j++]);        //arr[1][3]
			System.out.printf("%d  ", arr[i--][j++]);        //arr[0][4]
			*/
			System.out.println();
		}
		
		
		
		
	}

}
