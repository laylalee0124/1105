package decision_making;
public class Third_assignment {
	public static void main(String[] args) {
		
		
//------------------------삼항 연산자----------------------
	//if else문과 비슷하게 사용할수 있음.
	//(조건문)?조건이 참 일떄:조건이 거짓 일떄;
	//(num==0)?A:B;  <== A,B에는 value가 들어가야함.
	//절대값을 표현할때 사용가능한 표현
		
	//표현방법 1
		int a=-100;
		int n=(a>0)?a:-(a);
		 System.out.println(n);

	//표현방법 2				
		System.out.println(((a>0)?a:-(a)));

	//표현방법 3
		String str = (a>=0)?"짭":"찐";
		System.out.println(str);
			
				
//-------------------------------------------		
	}

}
