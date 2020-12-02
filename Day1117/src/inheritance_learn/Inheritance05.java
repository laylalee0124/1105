package inheritance_learn;


//-----부모 클래스------
	abstract class XX{				// abstract는 미완성이니, 메모리에 생성 하지 못한다는 의미.
		abstract void display();	// abstract method
		// {System.out.println("XX class의 display");} 이 내용은 아래 YY에서 override되어버리기 때문에, 아래 출력 구문에서는 필요없는 dead code가되어버린다.
		// 이때 class와 method를 abstract(추상)으로 변경해주면, 
		// 바디가 없는 추상 method인 display()를 포함한 추상 class가된다.
		// 단, 추상 class여도 추상 method를 꼭 포함하지 않을수도 있다.
	}
	
	
	// 참조를 위해 만들어본 추상 method를 포함하지 않는 abstract class. 
	// abstract class 자체로는 constructor로 사용할수 없으나,
	// 정상적인 class에다가 상속 시켜서 쓸 수 있음.
	abstract class ZZ{ 	 
		int a=88;
		public ZZ() {}
	}
	
	
//-----자식 클래스------
	class YY extends XX{
		@Override
		void display() {
			// super.display();   <== Generate로 생성시 default 값.
			System.out.println("YY class의 display");
		}
	}
	
	class ZZ_sub extends ZZ{
		// 생략된 super(); 가 ZZ의 내용을 상속해옴.
	}
	
//----출력 테스트----
	public class Inheritance05 {
		public static void main(String[] args) {
			
			// JAVA의 4대 개념중 하나인 polymorphism(다형성)을 표현하고 있다.
			XX xy = new YY();		// 부모 class인 XX를 포함하고 있기 때문에 가능.
			Object yx = new YY();	// 최상위 class인 object를 포함하고 있기 때문에 이것도 가능.
			
			xy.display(); 			// class XX에 있는 display를 가져오지만, 실행 순서순으로 보면 YY내에서 Override(재정의)된 값이 XX의 display()에 덮어씌워졌기 때문에 override된 값이 출력 됨.
			
			System.out.println("-------------------------------------------------");
			
			// ZZ zz= new ZZ();				// abstract class는 메모리 할당 불가능.
			ZZ_sub zzSub = new ZZ_sub();	// 대신, ZZ_sub에서 ZZ를 상속 받아서 ZZ_sub를 통해 대신 사용하게 만들어 줌.
			System.out.println(zzSub.a);
		}
	}
