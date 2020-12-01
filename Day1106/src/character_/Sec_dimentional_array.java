package character_;

import java.util.Arrays;

public class Sec_dimentional_array {

	public static void main(String[] args) {

			
		// 1차원 배열은 int의 집합
		// 1차원배열   /   배열이름ch +인덱스 번호[0]
		// 2차원 배열은 1차원 배열의 집합
		// 3차원 배열은 2차원 배열의 집합.
		
		// 2차원 배열   /   arr[0], arr[1];
		// 2차원은 1차원을 포함하고 있음. 
		
		

		int arr[][]=new int[2][];
			arr[0]=new int[2];
			//만들어지는 변수= arr[0][0], arr[0][1]
			//arr[x]<-배열변수이름, [1]<-인덱스넘버
			
			arr[1]=new int[2];
			//만들어지는 변수= arr[1][0], arr[1][1]
			//arr[x]<-배열변수이름, [1]<-인덱스넘버
			
		
		
		/* 아래는 arr[2]=new int[10];와 동일한 1차원 형식
		int a[];
		a=new int[10];
		*/
		
		System.out.println(Arrays.toString(arr));
		
	
		
		
	}

}
