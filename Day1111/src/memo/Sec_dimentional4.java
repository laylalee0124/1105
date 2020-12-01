package memo;
public class Sec_dimentional4 {
	public static void main(String[] args) {

	//출력 문제
	/*
	16  12  08  04
	15  11  07  03
	14  10  06  02
	13  09  05  01
	*/
		
	//데이터 입력
		/*
		arr[0][0] 16  arr[0][1] 12  arr[0][2] 08  arr[0][3] 04   // 04을 [행0][열3]에 넣기.
		arr[1][0] 15  arr[1][1] 11  arr[1][2] 07  arr[1][3] 03   // 03을 [행1][열3]에 넣기.
		arr[2][0] 14  arr[2][1] 10  arr[2][2] 06  arr[2][3] 02   // 02을 [행2][열3]에 넣기.
		arr[3][0] 15  arr[3][1] 09  arr[3][2] 05  arr[3][3] 01   // 01을 [행3][열3]에 넣기.
		*/
		
	int m=4;
	int n=4;
	int arr[][]=new int[m][n];  // [2차원][1차원]
	
	System.out.println("원본데이터");
	int count=1;
	int row=arr.length;
	for(int i = row-1; i >= 0; i--) {
		int colmn=arr[i].length;
		for (int y = colmn-1; y >=0; y--) {
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
			System.out.printf("%02d ", b);   
			                                
		}
		System.out.println();
	}
	
	
		
	
	
	
	
	
	
		
	}

}
