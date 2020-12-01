package create_class_constructor;

public class Exam {  //class를 만들때는 모델링만 하고, 데이터는 외부에서 받아서 넣을수있도록 만드는 것이 기본임.

	// 멤버1: Class변수=멤버필드, Exam 이라는 Class이름의 data 모음.
	// class영역에서는 '정의(만듦)'만 가능하고.
	// int ttl=100; 선언과 동시에 초기화는 가능하지만
	// rank=100;    선언 이후에 명령문은 허용하지 않는다.
	// summar();    호출도 불가능

	String name;
	int korscore;
	int engscore;
	double avg;
	int rank;
	int ttl;

	

	
	// 멤버2: 생성자, 일반적으로 멤버필드의 초기화를 담당한다. 여기에 값을 넣으면 해당 값이 초기화값이 됨.
	// 생성자는 같은 이름을 여러개 허용한다(overloading)
	public Exam() {
		ttl=korscore+engscore;
		avg=ttl/2.0;
		rank=1;
		//name="aaa";     //이 데이터 값은 여기에 고정값으로 지정해 놓을만한 data가 아님. 
		//korscore=100;   //이 데이터 값은 여기에 고정값으로 지정해 놓을만한 data가 아님.
		//engscore=85;    //이 데이터 값은 여기에 고정값으로 지정해 놓을만한 data가 아님. 그래서 아래와 같이 입력받을수 있는 생성자를 쓸수도있다.
		
	}
	
	public Exam(String name, int korscore, int engscore) { 
		// 현재줄에서 우클릭 [Source]-[Generate toString()] 을 통해 만든 생성자
		// 외부에서 값을 받아 셋팅할수 있다.
		super();
		this.name = name;
		this.korscore = korscore;
		this.engscore = engscore;
		
		ttl=korscore+engscore;
		avg=ttl/2.0;
		rank=1;
	}

	public void summry() {  //이런식으로 생성할수도있다.
		ttl=korscore+engscore;
	}
	
	
	
	// 멤버3: Exam 이라는 Class이름의 Method. (기능)
	// 현재줄에서 우클릭 [Source]-[Generate toString()] 
	// 아래와 같은 문자열을 만들어줘서 ex[]배열의 출력을 해당 문자열로 출력되도록 돕는다.
	
	@Override
	public String toString() {
		return "Exam [이름=" + name + ", 국어=" + korscore + ", 영어=" + engscore + ", 평균=" + avg + ", 순위="
				+ rank + ", 총점=" + ttl + "]";
		
		
		
		
		
		
	}
}
