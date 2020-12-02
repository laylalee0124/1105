package inheritance;

public interface Interface01 {
	
	// Q. interface는 instance화 할수 없음? 왜?
	
	// inteface의 원래 목적은 method를 사용하는것이 주목적으로 개발되었고,
	// interface는 abstract method가 기본이다. (body가 없는 abstract method를 기본적으로 허용 함.)
	// interface의 field는 무조건 final field이다.
	// interface의 field는 static field이기 때문에, field 변수들은 가급적 공유자원으로 사용될수 있는 것만 정의하고, static way로 사용.
	// static field 애들은, 객체를 만들지 말고 static way로 사용.  Static way :   ClassName.VariableValue  (ex) Class.a / Class.str
	// interface - 기능을 수행하기 위한 접근 버튼같은 거?
	// 기본적으로 constructor가 없음.
	// class에 상속시켜 사용할때는 impliment라는 키워드를 써서 상속시킴 
	// 인터페이스끼리의 확장에서는 다중 확장 가능.
	
	
	// 선언과 동시에 초기화 되어야한다.
	int a=0;		// (final static) int a=0; 앞에 final static이 생략되어있는 것임. 멤버 변수는 상수만 가능함.
	String str=null;
	//int b;		// final field에서 값이 정의되지 않았기 때문에 불가능.
	
	
	// abstract 키워드를 사용할 필요가 없음.
	void display();
	abstract void move();  // abstract를 쓰던 안쓰던 동일함.

	
	// interface는 (body가 없는)abstract method가 기본이다.
	// body가 있는걸 쓸때는 syntax default라는 의미로, default 라고 붙여줌.
	default void display1(){ }
	
	
	// static도 허용 - static은 값이 있는걸 허용해야 하기 때문에 이도 허용하는것.
	static void display2(){ }
	
	
	// 이너 클래스, 이너 인터페이스 모두 가능.
	class Method01{}
	interface Interface2{}
	
}

interface Interface11 {
	void display1();
	
}
