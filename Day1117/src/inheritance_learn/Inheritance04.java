package inheritance_learn;


//-----부모 클래스------
	class A{
		int a=10;
		int b=20;
		void disp() {
			System.out.println(a);
		}
	}

	
//-----자식 클래스------
	class B extends A{
		int a=100;
		int c=1000;
		
		@Override //재정의
		void disp() {		// A에 있는 동일한 method()를 override 받아서 재정의 해버림. 
			System.out.println("this ="+this.a);
			System.out.println("super ="+super.a);
		}
	}

	
//----출력 테스트----
	public class Inheritance04 {
		public static void main(String[] args) {
			A a=new A();
			a.disp();
			System.out.println("-------------------");
			B b=new B();
			b.disp();
			
			System.out.println("-------------------");
			A ab=new B();			// B()method를 써서 heap 메모리에 공간 만든다음, A class의 ab변수에 저장.
									// class B는 class A를 내포(상속됨)하고잇기 때문에, A class에 있는 멤버들에 접근 할 수 있음.
			// B ba=new A();        // class A는 상속하고있는 class가 없음. 때문에 B에 있는 멤버에 접근할수 없음.
			
			System.out.println(ab.a);
			System.out.println(ab.b);
			ab.disp();				// class B에서 이미 class A의 disp()를 override(재정의) 해버렸기 때문에, 새내용을 표기해서 그럼
		}
	}
