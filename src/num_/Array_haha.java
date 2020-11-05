package num_;

public class Array_haha {

	public static void main(String[] args) {

		/* ---------------Array----------------
		 * Array는 같은 데이터 타입끼리 집합으로 묶어줌
		 * 비슷한 유형의 변수들을 순차적으로 만들어줌. (자동으로 변소이름을 만들어준다
		 *배열이름[인덱스번호]; 인덱스번호 0~순차증가
		 *    //are, are1, are2....
		 
		
		 * 메모리기준 순차적으로 콜렉션해줌 (메모리 공간을 만들때 근처에 순차적으로 만든다는 의미)
		 * 
		 * ex) //preferred way. dataType arrayRefVar[] <- works. but not preferred way.
		 * dataType[] arrayRefVar = new dataType[arraySize]; 
		 * dataType[] arrayRefVar = {value0, value1, ..., valuek};
		 */
		
		/*
		 * 이렇게 복잡한 애들을 간단히만들수있다.
		 * int []you1=1;
		 * int you2[]=1;
		 * int you3=1; 
		*/
		
		int[] arr = new int[10];    
			// 'new' 는 heap 메모리 사용, 자동 초기화 해줌.
			// 'int arr'같은 local 배열 변수들은 'arr'변수의 제일 첫 메모리주소를 stack 메모리에 int형식(4byte) 저장.	
			// int를 저장할수 있는 공간 10개를 만들어 달라는 의미.  배열은 변수이름을 자동으로 만들어준다.
			// 배열이름[인덱스번호] : 인덱스 번호는 0부터 1씩증가.
			// ex) arr[0], arr[1], arr[2]...
		
			System.out.println(arr[0]);  //array는 변수를 초기화 해주지 않아도, default value로 초기화 해준다.
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			
		double[] we = new double [3];
			System.out.println(we[2]);
			
		char [] are = new char [6];
			System.out.println(are[2]);
		
			/* boolearn형은왜안돼?
			boolearn[] in = new boolearn[3];
			System.out.println(in[0]);
			System.out.println(in[1]);
			System.out.println(in[2]);
			*/
			
		
			System.out.println("------------------------------------------------------------");
		
			
		// 메모리주소를 효과적으로 할당하기위해서, 해당 메모리주소에 해시태그를 달아 관리하고, 해당 태그를 해시코드라고 한다.
		// 주소체계는 int형(4byte)으로 만들어지고 관리된다.
		// ex 값을 할당하지 않은 그룹을 순서지정 없이 출력해보면 아래와 같이 출력된다.
			
			double [] jul = new double [3];
			System.out.println(jul);
						
			
		//더이상 해당 메모리를 참조하지 않으려면, null이라는 것으로 없애주면 된다. --> garbage collector가 메모리를 한번씩 스캔하면서 null로 폐기된 메모리를 초기화한다.
		arr = null;
		we = null;
		are = null;
			
	
//------------------------------------------------
		//dataType[] arrayRefVar = {value0, value1, ..., valuek}; 형식은 실무에서는 고정값이 아닌이상 잘 쓰이지않음
		System.out.println("------------------------------------------------------------");
		
		
		int arr2[]= {10,20,30,40}; //10,20,30,40 값을 메모리에 할당하고, 해당 메모리주소를 arr2에 할당한다는 의미.
		
		System.out.println("메모리 2에 해당하는 값을 출력합니다 = "+arr2[2]);
			
		
		
		
		
		
	}
}
