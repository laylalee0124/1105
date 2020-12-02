package inheritance_learn;


//////////////////////////////////////상속의 개념////////////////////////////////////////////


//----부모 클래스----
	class DD {
		int a = 10;
		int b = 20;
	
		void disp() {
			System.out.println(a);
		}
		
		/*		// default 생성자. 이걸 생략하게 될경우에는, 상속받는 하위 클래스에서 super();가 작동을 못함.
		public DD() {						  
			System.out.println("DD default 생성자 실행");
		}
		 */
		public DD(int a, int b) {
			// super();    <-- 모든 클래스는 기본적으로 최상위 class인 Object를 상속받고 있음.
			this.a = a;
			this.b = b;
			System.out.println("DD parameter 생성자 실행");
		}
	}
	

//----자식 클래스----
	class FF extends DD {
		int a = 100;
		int c = 300;
	
		void disp() {
			System.out.println(this.a);		// sub class내의 int a
			System.out.println(c);			// sub class내의 int c
			System.out.println(super.a);	// 부모 class내의 int a
			System.out.println(b);			// 부모 class내의 int b. DD class를 상속받았고 이름이 다르기 때문에 가능함.
		}
		public FF() {
			super(10, 20); 						// 상속 관계에서 상위 클래스의 default constructor를 표현하는 키워드. default는 생략임. 첫줄에만 사용가능. 이게 없어도 상속받은 DD를 먼저 실행하고, 자식 class인 FF를 실행하게 되어있음.
												// 상위 클래스에서 default constructor가 없으면, 이와 같이 값을 지정해주면됨
			System.out.println("FF parameter 생성자 실행_type1");
		}
		public FF(int a, int b) {				// 아니면 이런식으로 type을 맞춰주고, 변수를 super에 지정 해서 match시켜줌. 
			super(a,b);
			System.out.println("FF parameter 생성자 실행_type2");
		}
		
		
	}


	
//----출력 테스트----
	public class Inheritance03 {
		public static void main(String[] args) {
	
		FF ff=new FF();						// type 1.
		FF ff2=new FF(10, 20);				// type 2.
	
		}
	}
