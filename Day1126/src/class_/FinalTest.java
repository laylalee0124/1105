package class_;

class AA{
	final int a=10;
	int b;
	
	void disp() {
		System.out.println(a);
	}
	
	final void disp1() {
		System.out.println(a);
	}
}

final class Point2 extends AA{ // final method는 상속 가능
	int x;
	int y;
	
}

/* final class는 상속 불가능
class Circle extends Point2{ 
	int r;
}
*/



public class FinalTest {
	
			public final static double PI=3.14; //상수표현
	
	public static void main(String[] args) {
	
			System.out.println(FinalTest.PI);
			System.out.println(Math.PI);
			System.out.println(Math.E);
		

	}
}
