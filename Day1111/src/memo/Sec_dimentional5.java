package memo;
public class Sec_dimentional5 {
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
		arr[0][0] 01  arr[0][1] 02  arr[0][2] 03  arr[0][3] 04  // 증가패턴   
		arr[0][0] 08  arr[1][1] 07  arr[1][2] 06  arr[1][3] 05  // 감소패턴
		arr[0][0] 09  arr[2][1] 10  arr[2][2] 11  arr[2][3] 12  // 증가패턴
		arr[0][0] 16  arr[3][1] 15  arr[3][2] 14  arr[3][3] 13  // 감소패턴
		*/
		
	int m=4;
	int n=4;
	int arr[][]=new int[m][n];  // [2차원][1차원]
	
	
	int count=1;
	int row=arr.length;
	for (int i = 0; i < row; i++) {
		if (i%2==0) {// 증가패턴, i가 0,2일때 짝수줄일때  0 혹은 2만 참으로 하려면 i==0 || i==2 로도 표현 가능하지만 배열변수갯수가 바뀌는 걸 감안해야한다. 
			int colmn = arr[i].length;
			for (int y = 0; y < colmn; y++) {
				arr[i][y] = count++;
			}
		}

		else {// 감소패턴, i가 1,3일때 홀수줄일때   // 나누기 연산자는 생각보다 많은 곳에서 쓰인다.
			int colmn = arr[i].length;
			for (int y = colmn - 1; y >= 0; y--) {
				arr[i][y] = count++;
			}
		}
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
