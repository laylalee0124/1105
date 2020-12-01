package memo;
public class Sec_dimentional {
	public static void main(String[] args) {

	//출력 문제
	/*
	1  5  9   13 
	2  6  10  14
	3  7  11  15
	4  8  12  16
	*/
		
	//데이터 입력
		/*
		arr[0][0] 1  arr[0][1] 5  arr[0][2] 9   arr[0][3] 13   
		arr[1][0] 2  arr[1][1] 6  arr[1][2] 10  arr[1][3] 14
		arr[2][0] 3  arr[2][1] 7  arr[2][2] 11  arr[2][3] 15
		arr[3][0] 4  arr[3][1] 8  arr[3][2] 12  arr[3][3] 16
		*/
		
	int m=4;
	int n=4;
	int arr[][]=new int[m][n];  // [2차원][1차원]
	
	int count=1;
	int row=arr.length;
	for(int i = 0; i < row; i++) {
		int colmn=arr[i].length;
		for (int y = 0; y < colmn; y++) {
			arr[y][i] = count++;
		}
	}
	
	
	//출력 구문
	for(int[ ] a : arr) {
		for(int b : a) {
			System.out.printf("%2d ", b);   
			                                
		}
		System.out.println();
	}
	
	
		
	
	
	
	
	
	
		
	}

}
