package inheritance;

class Newclass implements Interface01, Interface11{
	// class에서 extends 키워드로 받을수있는 상속은 class뿐임.
	// interface를 상속받을때는 implements 키워드를 써야함.
	
	//---------Interface01 상속부분----------------
	@Override  // 상속받은 Interface01안에 있는 abstract method에 대해 override해서 쓰라고 자동으로 만들어줌.
	public void display() {
		System.out.println("override된 method");
	}

	@Override  // 여기서 재정의한 abstract method들은 main에서 constructor로써 사용할수 있음.
	public void move() {
		System.out.println("MOVE! 움직인다요");
		
	}

	//---------Interface11 상속부분----------------
	@Override    // Interface11 으로부터 확장된 ab.method 다중 확장도 가능하다.
	public void display1() {
		System.out.println("다중상속도가능하지롱");
	}
}



public class Interface2{
	 public static void main(String[] args) {
		 Interface01 inter=new Newclass();  	// interface도 이런식의 다형성 표현은 가능하나..
		 inter.display();
		 System.out.println(inter.a);			// **The static field Interface01.a should be accessed in a static way
		 System.out.println(inter.str);			// **Static way :   ClassName.VariableValue  (ex) Class.a / Class.str
		 
		 System.out.println("--------------");
		 
		 System.out.println(Interface01.a);		// 이거나,
		 System.out.println(Interface01.str);
		 
		 System.out.println("--------------");
		 
		 System.out.println(Newclass.a);		// 이렇게 사용하라는 말임.
		 System.out.println(Newclass.str);		// static way를 써서, 해당 class로 직접 접근해서 쓰면됨.
		 
		 /*
		 inter.a=10;			// The final field Interface01.a cannot be assigned
		 inter.str="name";		// The final field Interface01.str cannot be assigned
		 interface의 member field은 무조건 final field 이기 때문에, 재선언 불가능.
		 */
		 
		 Newclass nc=new Newclass();
		 nc.move();
	}
}