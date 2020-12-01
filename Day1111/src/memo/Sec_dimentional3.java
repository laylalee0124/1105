package memo;
public class Sec_dimentional3 {
	public static void main(String[] args) {

	//출력 문제
	/*
	13  09  05  01
	14  10  06  02
	15  11  07  03
	16  12  08  04
	*/
		
	//데이터 입력
		/*
		arr[0][0] 13  arr[0][1] 09  arr[0][2] 05  arr[0][3] 01  
		arr[1][0] 14  arr[1][1] 10  arr[1][2] 06  arr[1][3] 02
		arr[2][0] 15  arr[2][1] 11  arr[2][2] 07  arr[2][3] 03
		arr[3][0] 16  arr[3][1] 12  arr[3][2] 08  arr[3][3] 04
		*/
		
	int m=4;
	int n=4;
	int arr[][]=new int[m][n];  // [2차원][1차원]
	
	System.out.println("원본데이터");
	int count=1;
	int row=arr.length;
	for(int i = row-1; i >= 0; i--) {
		int colmn=arr[i].length;
		for (int y = 0; y < colmn; y++) {
			arr[y][i] = count;
			System.out.printf("%2d ", count++);
		}
		System.out.println();
	}
	System.out.println();
	
	//출력 구문
	System.out.println("출력데이터");
	for(int[ ] a : arr) {
		for(int b : a) {
			System.out.printf("%2d ", b);   
			                                
		}
		System.out.println();
	}
	
	
		
	
	
	
	
	
	
		
	}

}
