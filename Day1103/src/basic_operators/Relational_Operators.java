package basic_operators;
public class Relational_Operators {
	public static void main(String[] args) {
				
		
		
//---------------------관계 연산자 Relational Operators---------------------------
//관계연산자는 모두 true or false로 표현 됨.
//A==B  : A is equal to B? 
//A!=B  : A is not equal to B?
//A>B   : A is grater than B?
//A<B   : A is less than B?
//A>=B  : A is grater than or equal to B?
//A<=B  : A is less than or equal to B?

		int A=10;
		int B=20;
		
		System.out.println("A==B :"+(A==B));
		System.out.println("A!=B :"+(A!=B));  //=!는 사용되지 않음.
		System.out.println("A>B :"+(A>B));   //좌측 데이터가 우측 데이터보다 크다. *지정된 기호임
		System.out.println("A<B :"+(A<B));   //좌측 데이터가 우측 데이터보다 작다. *지정된 기호임
		System.out.println("A>= :"+(A>=B));  //좌측 데이터가 우측 데이터보다 크거나 같다. *지정된 기호임
		System.out.println("A<=B :"+(A<=B));  //좌측 데이터가 우측 데이터보다 작거나 같다. *지정된 기호임
		
		
	}

}
