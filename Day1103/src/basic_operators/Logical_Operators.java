package basic_operators;
public class Logical_Operators {
	public static void main(String[] args) {
		
		
//----------------------------논리 연산자 Logical Operators-----------------------------
		//&& (logical and)	논리값이 둘다 zero가 아닐 경우 true를 리턴한다.  (A && B) is false
		//|| (logical or)	논리값중 하나가 zero가 아닐경우 true를 리턴한다. (A || B) is true
		//! (logical not)	논리값을 반대로 리턴한다. !(A && B) is true
		
		int A=1;
		int B=2;		
		System.out.println("A&&B :"+(A==B && A<B));
		System.out.println("A||B :"+(A!=B || A>B));
		System.out.println("!A&&B :"+(!(A==B&& A<B)));
		

		//char C=C;
		//char D=D;
		//System.out.println("C&&D :",C&&D);
		System.out.println("A||B :"+(A!=B || A>B));
		System.out.println("!A&&B :"+(!(A==B&& A<B)));
		
	}
}
