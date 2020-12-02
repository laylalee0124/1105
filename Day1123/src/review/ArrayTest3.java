package review;

public class ArrayTest3 {

	public static void main(String[] args) {

		
		
		// 저장문장
		int arr[][]=new int[3][2];
		
		/*int m=1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=m; m++;
			}
		}*/
		
		
		// 출력문장
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
