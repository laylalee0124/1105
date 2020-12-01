package create_class_constructor;

public class Point {

	//멤버필드
	int x;
	int y;

	// 생성자의 특징 //
	/* 모든 클래스에는 생성자가 반드시 한개이상 존재해야 한다.
	 * default 생성자는 생략하여 표현할수 있다. (단, overloading표현들이 없을때 만 가능)
	 * 필드의 초기화를 담당한다.
	 * 생성자의 이름은 클래스 이름으로 만들어져있다.
	 */

		
	// Default 생성자
	public Point() {
	x=10;
	y=20;
	}
	
	
	//Overloading1 
	//overloading은 생성자를 중복해서 표현이 가능함을 말함. 대신 구분할수있어야 하므로 parameter 존재유무/개수/타입등으로 구분 가능하도록 표현해야한다. 
	public Point(int x) { // parameter date가 'int x'로 한개임.
		// x=x; <- 이 경우에는 윗줄에 있는 x값을 불러와서 left x에 집어넣으라는 말이기때문에 no effect 구문이 된다.
		this.x=x; //<-this를 써주면, class변수인 5번째줄의 x를 지칭해준다.
		y=200;    //<- 이경우에는 따로 지정된 local변수가 없으므로 class변수인 y를 자동으로 불러왔다.
		}
	
	//overloading2
	public Point(int x, int y) { //Overloading을 통해서 parameter date가 'int x, int y'로 두개임. 이런식으로 구분해야 함.
		this.x=x;
		this.y=y;

	
	
	}

}
