package basic_operators;
public class Arithmetic_Operators {
	public static void main(String[] args) {
		
		
		
// +,-,*,/   : 사칙연산자
// A % B     : A를 B로 나눈 몫을 제외한 나머지만 반환
// A++, A--  : A값에서 +1한 값, A값에서 -1한 값
		
		
	int A = 10,	B = 20;
	
	System.out.println("A+B :"+(A+B)); 
		//("A+B : "+A+B); --> 괄호없이 쓰면, +를 왼쪽부터 순서대로 연산 하기 때문에 문자열+A (=A+B  :10)후, 그 결과 값과+B (=A+B  :1020)으로 출력됨.
	System.out.println("A-B :"+(A-B));
	System.out.println("A*B :"+A*B);
	System.out.println("A/B 소수점생략 :"+A/B);
		//산술적으로는 결과값이 0.5이 나와야 하지만, int가 제공하는 공간은 4byte이므로 8byte 실수인 0.5를 표현할수는 없기 때문에 결과값이 0으로 출력 됨.
		//때문에 연산상 정수만 허용하는 int값을 표현하기 위해, 소수점이하를 버림 하고 정수만 표현하게 됨.
	
	A = 10;	B=20;  //A,B 재선언. 이번엔 int를 사용하지않았기 떄문에 , 로 나열 불가능.
	System.out.println("A/B 소숫점표현1 :"+(1.0*A/B));  //좌측부터 순서대로 연산되기 때문에 1.0*A(10)/B=0.5
		//System.out.println("A/B 소숫점표현 :"+(A/B*1.0));  //좌측부터 순서대로 연산되기 때문에 A/B(0.5)*1.0=0이 연산되게 됨.(오류)
	System.out.println("A/B 소숫점표현2_double이용 :"+(double)A/B); //괄호안의 double이 우선 연산자가 됨. A의 데이터를 8byte인 double로 casting 하였기 때문에, 작은 수인 B는 A에 맞춰지게 됨.
	System.out.println("A/B 소숫점표현3_double이용 :"+A/(double)B); //괄호안의 double이 우선 연산자가 됨. B의 데이터를 8byte인 double로 casting 하였기 때문에, 작은 수인 A는 B에 맞춰지게 됨.
	
	System.out.println("소수점아래표현1"+ (int)3.14/10); 
	System.out.println("소수점아래표현2"+ (double)3.14/10);
		//동일한 값이지만 강제 casting방식을 '명시'함에 따라 다른 결과 값을 리턴 함.
	double ex = 10.1234567890f;
	System.out.println("Double의 값을 f로 auto-casting : "+ex);
	
	System.out.println("10/20.0 :"+(10/20.0)); 
		//컴퓨터는 연산을 위해 이항(양쪽항)의 데이터가 같은 표현방식인것을 선호함, 양쪽표현방식이 다르다면 괄호로 먼저 연산시켜주면 됨.
	System.out.println("B % A :"+B%A);
		// A % B     : A를 B로 나눈 몫을 제외한 나머지만 반환
	
	// A++, A--  : A값에서 +1한 값, A값에서 -1한 값
	System.out.println("A++  :"+(A++));
		//++연산이 되긴하지만 data보다 뒤쪽에있는 후위 연산자이기 때문에, 해당 연산줄에 있는 method인 "println"이 먼저 연산 됨. 결과적으로 증가연산은 되지만, 출력이 먼저 일어나서 기존값인 10이 출력되는것 
	A = 10;   //A 변수를 10으로 재 선언.
	System.out.println("++A  :"+(++A)); 
		//++이 data보다 먼저 연산되기 때문에, ++먼저 연산후 println 연산되어 11이 됨.
		//이 구조가 매우 헷갈릴수잇기 때문에, 결합구조로 쓰는것을 지양하는것이 좋다. 
		//아래와 같이 별도로 지정해서 써줄 것.	
	A++;  //+1시킴, 이 값을 x라고 하면,
	System.out.println("A++  :"+A);
	A--;  //x에서 -1시킴.
	System.out.println("A--  :"+A);

	

	
	}

}
