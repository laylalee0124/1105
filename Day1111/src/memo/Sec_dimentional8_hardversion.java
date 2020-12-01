package memo;
public class Sec_dimentional8_hardversion {
	public static void main(String[] args) {

	//===============================숙제================================
	/*
	         1				1줄
	       3   2			2줄
	     6   5   4			3줄
	  10   9   8    7		4줄
	    13  12   11			5줄
	      15   14			6줄
	         16				7줄 이라고 판단해서 구문작성하면 쉬움
	  
	  
	  
	 
	 */
		
	// 데이터 입력
		/*
		arr[0][0] 01  arr[0][1] 02  arr[0][2] 04  arr[0][3] 07  // 증가패턴 
		  
		arr[0][0] 03  arr[1][1] 05  arr[1][2] 08  arr[1][3] 11  // 감소패턴
		
		arr[0][0] 06  arr[2][1] 09  arr[2][2] 12  arr[2][3] 14  // 증가패턴
		
		arr[0][0] 10  arr[3][1] 13  arr[3][2] 15  arr[3][3] 16  // 감소패턴
		*/
		
	// 새로운 변수 이용
		
		
	int m=4;
	int n=4;
	int arr[][]=new int[m][n];
	
	int u=1;
	int count=1;
	int row=arr.length*2-1;  // 7회전
	
	for (int i = 0; i < row; i++) {
		if(i<m) {  //i:0,1,2,3  - 가장 큰행까지는 순차 증가로 돌리고.
			int x=0;
			int y=i;	
			for (int j=0; j<=i; j++) {
				arr[x++][y--]= count++;
			}
		}else {    //i:4,5,6   - 가장 큰행에서 가장 작은행까지는 순차 감소로 돌림.
			int x=i-(m-1);  //int x=u++; 을 넣어도 같은 결과가나온다.
			int y=n-1;
			for (int j=i; j<row; j++) {
				arr[x++][y--]= count++;
			}
		}
	}
	
	
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
