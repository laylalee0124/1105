package constructor_;

class AAA{  // class AAA의 멤버필드
	int a;
	int b;
	int c;
	int d;
	
	
	public AAA() {} //생성자 AAA가 default 값으로 초기화 해줌.
	public AAA(int a) {  //같은 생성자이름 & 다른 parameter
	this.a=a;
	}
	
	
	// 그냥 toString을 print하면 객체 정보를 해시코드로 출력해준다. 이 정보는 필요 없는 정보이기 때문에 대신 사용자가 쓸 내용을 넣어주면 된다.
	// String class의 toString() method를 가져와서 재정의하는데 쓴다. 라는 의미.
	@Override    
	public String toString() {
		return "AAA [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	public void disp() {
		System.out.print("AAA [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]");
	}

	//변수갯수마다 따로 생성자를 만들어주는건 매우 비효율 적이므로
	public AAA(int a, int b, int c, int d) { 
		this(a,b,c);  // abc생략, 추가된 d만 표현. 단 호출은, 첫문장에만 가능.
		this.d = d;
		//constructor call must be the first statement in a constructor
	}
	
	// 아래는 상기와 같은 형식으로 표현이가능하다.
	public AAA(int a, int b, int c) {    
		this.a = a;
		this.b = b;
		this.c = c;
	
	}
}



public class Constructor {
	public static void main(String[] args) {
	
	AAA a1=new AAA();  // default 생성자를 불러와서 사용
	System.out.println( a1.toString() );  //둘다 같은의미.
	System.out.println( a1 );             //둘다 같은의미.
	System.out.println("-------------");
	
	AAA a2=new AAA(5); // 사용자 지정 생성자 불러와서 사용
	System.out.println( a2 );   // 상기에서 지정한 값을 a에 반영해서 불러옴.
	a2.disp();     // 새로 생성한 disp method를 사용해서 출력.
	System.out.println();
	System.out.println("-------------");
	
	AAA a3=new AAA(3,4,5,6);
	System.out.println( a3 );
	
	
	}
}
