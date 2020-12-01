package variable;
public class ClassVariable_LocalVariable {
	
	static int aaa; // <<-- 이 부분이 전역변수(=클래스멤버변수, 정적변수, 멤버변수)로 지정되어 있는 상황. 
	//전역변수는 로컬에서 사용될 땐 알아서 초기화됨.
								
	public static void main (String[] args) {
	//Main method라고 불리는 부분, 프로그램의 시작점임.
		
//-------------------전역변수(Class/Static variables) 연습-----------------------------------------
//		public static void sub(String[] args) {
//			System.out.println(C);  //이공간 내에 선언된 C도 데이터도 없기때문에 아무것도 출력x
//		}
//--------------------------------------------
//		{
//			System.out.println(C);  //이공간 내에 선언된 C도 데이터도 없기때문에 아무것도 출력x
//		}
//--------------------------------------------	
		
		
//--------------------로컬변수(지역변수 Local variables) 연습-------------------------------
		//로컬이란 Method{}로 구분된 공간 혹은 {}으로 구분된 빈공간 내를 말함.
		//지역변수는 사용전 지정된 전역변수를 초기화 하고 사용해줘야함.
		
		//정수형 (메모리는 1byte 사용한다는 의미)
		byte A = 22; //선언과 동시 초기화, 변수를 만든다는건 메모리공간에 이름을 붙이는것.
		short C;
		C=10000;    //선언된 변수에 데이터 부여
		
		int B = 3;
		long D = 4;
		
		//실수형 (메모리는 4byte / 8byte 사용한다는 의미)
		float F = 0.2684684512f;
		double G = 0.1;
		
		//논리형
		boolean H = true;
		boolean I = false;
		
		//문자형
		char J = 'a';
		
		//전역변수테스트
		int aaa = 11;
						
		System.out.println("C = "+C);
		System.out.println("전역변수였던 aaa = "+aaa);
		
	}

}
