package inheritance_learn;


//////////////////////////////////////상속의 개념////////////////////////////////////////

//-----부모 클래스------
	class Animal{ // 동물
		void display() {
			System.out.println("ANIMAL");
		}
	}

//-----부모를 상속하는 자식 클래스------
	class Mammal extends Animal{ // Mammal is an animal.
		@Override				// 실제 display() method는 Animal의 display()하나 뿐임. 이를 데려와서 override해서 쓰는것 뿐임.
		void display() {
			System.out.println("MAMMAL");
		}
	}
	
	class Reptile extends Animal{ // Reptile is an animal.
	}
//------자식을 상속하는 손자 클래스----------------
	class Dog extends Mammal{ // Dog is a mammal.
		@Override
		void display() {
			System.out.println("DOG");
		}
	}


//----출력 테스트----
	public class Inheritance06 {
		public static void main(String[] args) {
			//접근주체      //메모리 
			//영역         //만드는영역
			Animal a   = new Animal();
			Mammal m   = new Mammal();
			Dog d      = new Dog();
			Animal dog = new Dog();
			
			System.out.println(m instanceof Animal);  // m은 Animal의 instance입니까?
			System.out.println(d instanceof Mammal);  // d은 Mammal의 instance입니까?
			System.out.println(d instanceof Animal);  // 따라서, d은 Animal의 instance입니까?
			
			System.out.println("======================");
			
			a.display();	// Animal의 display 호출
			m.display();	// Mammal의 display 호출
			d.display();	// Dog의 display 호출
			dog.display();	// Animal의 override된 display 호출 
			
			
		}
	}