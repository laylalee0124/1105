package generic_method;

// method에 Generic표현 사용하는 방법.
// return type앞(Box2)에 위치해야함.
// 파라미터에도 표현해줘야 한다.

public class Utill {

	public static <X>Box2 <X>boxing(X x){
	
		Box2<X> box=new Box2<X>();
		box.setObj(x);
		return box;
		
	}
}
