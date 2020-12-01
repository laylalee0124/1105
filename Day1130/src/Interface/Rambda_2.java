package Interface;

public class Rambda_2 {

	public static void main(String args[]) {
		
		// 1개의 추상멧서드만 선언된 interface만 람다식으로 사용할수있음.
		// Runnable rb=new Runnable();  instance는 instance화 불가능.
		// 대신, interface는 annonymous inter type 으로 객체화 가능.
		
		// 익명구현객체 = abstract run() method를 override시켜서 생성자를 만들어줌.
		Runnable rb=new Runnable() {
			@Override
			public void run() {
			}
		};
		
		// 하지만 상기 구문이 너무 복잡하므로, 아래와 같은 rambda식으로 바꿔서 쓸수있음.
		Runnable rb2 =  () -> {};
		
		
		// rambda식으로 쓰려면, functional interface만 가능. (=ab.method가 1개뿐인 interface)
		Rambda_ex my = ( ) -> { };						// no parameter
		Rambda_ex3 rd3 = (str, aa) -> {};				// prameter o
		Rambda_ex2 rd2 = (x, y) -> { return x * y;};	// prameter o
		
	}
}
