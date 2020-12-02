package inheritance_learn;

class AA{
	void disp() {
		System.out.println("AAA의 disp 클래스입니다.");
	}
}

class BB extends AA{
	void display() {
		System.out.println("BBB 클래스입니다.");
	}
	void disp() {
		System.out.println("BBB의 disp 클래스입니다.");
	}
}


public class Inheritance02 {

	public static void main(String[] args) {

	AA aa=new AA();
	aa.disp();
	
	BB bb=new BB();
	bb.disp();
	bb.display();
	
	
		
	}

}
