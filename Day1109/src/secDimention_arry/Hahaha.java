package secDimention_arry;

public class Hahaha {
	
	// heap에 할당된 new는 ref(memory adress)라서 4byte로 stack memory에 저장된다.
	// ref address의 defalut 값은 null 이다.
	
	public static void main(String[] args) {
		
		

	int[][] arr=new int[2][];   //이렇게 지정하는게 가능할까에 대한 수업.
  	                            // 상기 행은 arr[0], arr[1] : 1차원 배열 변수만 지정해 준것임. int a[], b[];  : 이것과 동일한 표현임
	/*	
	arr[0]=new int[];  //상기 식은 이 식과 동일한 의미이다. 아직 메모리 할당하지않음.
	arr[1]=new int[];
	*/
	
	
	//--------------------------------------------
	arr[0]=new int[2];  //이런식으로 행마다 열 갯수를 다르게 지정하는 표현도 가능하나. 하지 않는 것이 범용코딩을 위해 좋다.
	arr[1]=new int[3];
	
	
	/*----------------------------
	int [][] arr1= {{1,2},{3,4,5}};  //상기 집합 구조를 이와 같이 표현할수도있다.	
	----------------------------*/
	
	
	
	for(int i=0 ; i<arr[0].length ; i++) {
		for(int j=0 ; j<arr[i].length ; j++) {
			System.out.print(arr[i][j]+"");
		}
		System.out.println();
	}
	
	
		
	}

}
