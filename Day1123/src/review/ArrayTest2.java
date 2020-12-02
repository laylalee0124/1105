package review;

public class ArrayTest2 {

	public static void main(String[] args) {

		/*
		int[][] arr=new int[2][2];
		
		int[][] arr2= {1,2,3,4,5,6};   //불가능.
		int[][] arr2= {{1,2,3},{4,5,6}};  //가능.
		
		// 열의 갯수가 다른 배열
		int[][] arr3= {{1,2,3},{4,5}};  //가능.
		
		
		System.out.println(arr2.length); // 2차원 배열의 길이는, 행의 갯수(1차원배열의 갯수)를 읽어준다. 
		*/
		
		// 저장문장
		int arr[][]=new int[2][3];
		int m=1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=m; m++;
			}
		}
		
		// 출력문장
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
