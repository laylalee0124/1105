package memo;
public class Sec_dimentional2 {
	public static void main(String[] args) {

	//출력 문제
	/*
	4  8  12  16 
	3  7  11  15
	2  6  10  14
	1  5  9   13
	*/
		
	//데이터 입력
		/*
		arr[0][3] 4  arr[1][3] 8  arr[2][2] 11  arr[3][3] 15   
		arr[0][2] 3  arr[1][2] 7  arr[2][2] 11  arr[3][3] 14
		arr[0][1] 2  arr[1][1] 6  arr[2][2] 10  arr[3][3] 13
		arr[0][0] 1  arr[1][0] 5  arr[2][2] 9   arr[3][3] 12
		*/
		
	int m=4;
	int n=4;
	int arr[][]=new int[m][n];  // [2차원][1차원]
	
	
	int count=1;
	int row=arr.length;
	System.out.println("원본데이터");
	
	for(int i = 0; i < row; i++) {
		int colmn=arr[i].length;
		for (int y=colmn-1; y>=0; y--) {
			arr[i][y] = count;  //[0][3] 
			System.out.printf("%2d ", count++);
		}
		System.out.println();
	}
	System.out.println();
	
	
	
	
	//출력 구문
	for(int[ ] a : arr) {
		for(int b : a) {
			System.out.printf("%2d ", b);   
		}
		System.out.println();
	}
	
	
		
	
	
	
	
	
	
		
	}

}
