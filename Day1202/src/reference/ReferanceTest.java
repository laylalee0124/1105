package reference;

import java.util.function.IntBinaryOperator;

class Calcul{
	
	int x;
	int y;
	
	public static int staticMethod(int x, int y) {
		return x+y;
	}
	
	public int instanceMethod(int x, int y) {
		return x+y;
	}
	
	public Calcul(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class ReferanceTest {
public static void main(String[] args) {

	// static method 참조식
	// Rambda expression을 이용
	// IntBinaryOperator opr = (x, y) -> {return Calcul.staticMethod(x, y);}; 대괄호 넣을때는 return 키워드 써줘야함.
	IntBinaryOperator opr = (x, y) -> Calcul.staticMethod(x, y);
	System.out.println(opr.applyAsInt(10, 20));
	
	// 상기를 아래와 같이 ref형으로 변경해서 쓸수있음.
	IntBinaryOperator opr1=Calcul::staticMethod;
	System.out.println(opr.applyAsInt(10, 20));
	
	
	// Instance 참조식
	// Rambda expression을 이용
	Calcul obj=new Calcul(11, 22);
	IntBinaryOperator opr2 = (x, y) -> obj.instanceMethod(x, y);
	System.out.println(opr2.applyAsInt(10, 20));
		
	// 상기를 아래와 같이 람다식을 ref형으로 변경해서 쓸 수 있음. 
	IntBinaryOperator opr3=obj::instanceMethod;
	System.out.println(opr3.applyAsInt(10, 20));
	
	// Function을 써서 생성자 참조도 가능 함. = 객체를 생성한다는 의미.
	// Function func = Calcul::new Calcul();
	
}
}
