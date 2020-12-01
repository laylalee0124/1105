package basic_operators;
public class Assignment_Operators {
	public static void main(String[] args) {
		
		
//------------------대입 연산자 assignment operator----------------------------------
// = : assignment operator
// 왼쪽  =        : 메모리 공간 
//	   =  오른쪽  : value 값/데이터
						
		int num = 100;

		System.out.println("num : " + num);			
				
//-------------------------------------------------------------------		
		
		int a=10;  // a에 10이라는 데이터를 먼저 저장.
		 
		a = a + 10;  // 저장된 a(10)에 10을 더해서 다시 a에 저장
		System.out.println(a);  //20이 출력됨
		
		a = a + 10;  // 저장된 a(10)에 10을 더해서 다시 a에 저장
		System.out.println(a);  //30이 출력됨
		//다만 중복된 구문이 너무 많기 때문에, 같은 부분을 지워주기위해서
		// a =  + 10;    -  a를 먼저 없애고
		// a +=   10;    -  +와= 위치를 바꿔주면 같은 구문의 다른표현이됨.
		
		a += 10; 
		System.out.println(a);  //40이 출력됨
		
		
		//연산자 우선순위는 시험에 자주나오므로 외울것.JAVA tutorials페이지에나와있음.


	}

}
