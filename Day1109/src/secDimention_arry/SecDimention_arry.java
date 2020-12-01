package secDimention_arry;

public class SecDimention_arry {

	public static void main(String[] args) {

	// int[] 1차원은 정수의 집합
	// int[][] 2차원은 1차원의 집합.
		
	
	int[][] arr0, arr5, arr6;      // 범용으로 쓰이는 배열 문법.	
	int[] arr1[], arr2, arr3[][];  // int[]는 공통적용차원이므로, arr1[]은 2차원, arr2는 2차원 arr3는 3차원으로 판단된다. 
	                               // 매우복잡하게 읽히므로 이런 구조는 쓰지않도록 하는것이 좋다. 
		
	
	int[][] ary=new int[2][3];     // [A][B] A개 행, B개 열을 가진다고 생각하면 쉽다. 
 								   // ary[0][0], ary[0][1], ary[0][2] 
								   // ary[1][0], ary[1][1], ary[1][2] 		

	System.out.println(ary.length);// ary.length은 왜 2로 나오낭?
	System.out.println("-----------");
	
	
	ary[0][0] = 1;
	ary[0][1] = 2;
	ary[0][2] = 3;
	ary[1][0] = 4;
	ary[1][1] = 5;
	ary[1][2] = 6;

	
	for(int i=0; i<ary[0].length; i++) {      // length는 1차원의 열 갯수를 세주므로, ary[0].length로 써야 해당 행(1차원)의 열갯수를 읽어준다.
		System.out.println("첫째행출력 :" + ary[0][i]);
	}
	
	
	for(int i=0; i<ary[1].length; i++) {      // length는 1차원의 열 갯수를 세주므로, ary[0].length로 써야 해당 행(1차원)의 열갯수를 읽어준다.
		System.out.println("둘째행출력 :" + ary[1][i]);
	}
	
	
	
	
	
	
	}

}
