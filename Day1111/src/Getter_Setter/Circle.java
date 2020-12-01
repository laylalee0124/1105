package Getter_Setter;

public class Circle {

	//선언 -객체 유형과 변수 이름을 가진 변수 선언.
	private int x;   //access modifier 를 "private"로 만들어놓으면, 해당 class 내부에서만 접근이 가능하다는 의미. 이처럼 캡슐화 하기위해 getter/setter를 씀.
	private int y;
	int z;
	int q;
	private double radius;
	String str;
	
	private boolean bool;  // 위와 다른 규칙으로 만들어짐 getter/setter대신, is/set으로 만들어짐.
	
	// 메서드 유형 #1
	// return O,        method_name (parameter o)
	public double calcRound(double radius) {
		this.radius=radius;

		double result = 2 * Math.PI * radius;
		return result;
		}

		
	// 메서드 유형 #2
	// return O,        method_name (parameter x)
	public int getX() { 	 // parameter없음.return있음.access를 제한한 x값을 읽어오기위해 geter 멧서드를 사용. 
		return x; 			 // 실행시킨 값을 getX에 리턴함. 메서드 종료를 의미.
	}
	
	
	// 메서드 유형 #3
	// void(=return value x), method_name (parameter o)
	public void setX(int x) {// parameter있음.return없음.   /setter 멧서드 사용
		this.x=x;            // int로 x에입력받은 값을 private int x에 저장하기위해 this.x로 씀.

	}
	// 메서드 유형 #4
	// void(=return value x), method_name (parameter x)
	public void display() {
		System.out.println("x :   "+x);
		System.out.println("y :   "+y);
		System.out.println("radius :    "+radius);
		
		
	}

//--------------------y를 private로 입출력 만들어보기-------------------------------------
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;

	}

	
//--------------------radius를 private로 입출력 만들어보기-------------------------------------	
	public double getR() {
		return radius;
	}

	public void setR(double radius) {
		this.radius = radius;

	}


//----------------Getter/Setter 자동생성기--------------
// [우클릭]-[source]-[generate getter setter]
// 원하는 private 변수 선택.
	
	public int getQ() {
		return q;
	}


	public void setQ(int q) {
		this.q = q;
	}



//--------------위와 다른 규칙으로 만들어지는 getter/setter----------------------

	public boolean isBool() {
		return bool;
	}


	public void setBool(boolean bool) {
		this.bool = bool;
	}

	
	
/*	
public Circle (int y, double radis, String str, double radius) {//overide개념
	super();
	this.y=y;
	this.radius=radius;
	
	this.str=str;
	}
*/
	
	
	
	
	
}

