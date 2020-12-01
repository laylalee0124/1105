package generic_method;


public class Box2 <X> {  // <T>라는 표현을 data type으로 쓰겠다고 선언.
	
	private X obj;		// T가 어떤 data type인지는 객체화 할때 가서 결정하게 됨. (지금시점에서 확정x)

	public void setObj(X obj) {
		this.obj = obj;
	}
	
	public X getObj() {
		return obj;
	}

	
		
}
