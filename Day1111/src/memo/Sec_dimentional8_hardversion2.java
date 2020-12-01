package memo;
public class Sec_dimentional8_hardversion2 {
	public static void main(String[] args) {

//===============================================================
	/*
	          16			1줄 0
	       15   14			2줄 1
	     13   12   11		3줄 2
	  10    9    8    7		4줄 3
	     6    5    4		5줄 4 
	       3    2			6줄 5 
	          1				7줄 6
	 
	 */
//===============================================================	
		
	// 데이터 입력
	/*
	arr[0][0]= 16
	
	arr[1][1]= 14
	arr[1][0]= 15
	
	arr[2][2]= 11
	arr[2][1]= 12
	arr[2][0]= 13
	
	arr[3][3]= 7
	arr[3][2]= 8
	arr[3][1]= 9
	arr[3][0]= 10
	
	arr[4][2]= 11
	arr[4][1]= 12
	arr[4][0]= 13
	
	arr[5][1]= 14
	arr[5][0]= 15
	
	arr[6][0]= 16
	*/	
		
		
	int m=4;
	int n=4;
	int arr[][]=new int[m][n];
	
	int o=m*n;
	int u=1;
	int row=arr.length*2-1;  // 7회전
	
	for (int i = 0; i < row; i++) {
		if(i<m) {   //i:0,1,2,3  - 가장 큰행까지는 아래 for문 실행
			int x=0;  
			int y=i;
			for (int j=0; j<=i; j++) {
				arr[x++][y--]= o--;
				
				//1바퀴 arr[0][0] = 0
				
				//2바퀴 arr[1][1] = 1
				//3바퀴 arr[1][0] = 2
			}
		}else {   			 //i:4,5,6   - 가장 큰행 다음행부터는 아래 for문 실행.
			int x=i-(m-1);   //int x=u++; 을 넣어도 같은 결과가나온다.
			int y=n-1;
			for (int j=i; j<row; j++) {
				arr[x++][y--]= o--;
				
			}
		}
	}
	
	
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
