package generic_;

//=================Generic===========================
		/*
		 예를 들어, println() method의 경우 ()안에 들어오는 모든데이터유형을 처리하기위해서 모든 데이터 유형에 대해서 method를 만들어놓았음.
		 generic을 이용하면 좀더 쉽게 표현할수 있음.
		 */
		
	//-----Generic expression을 class에 적용하는 방법---------
	// obj의 데이터타입을 현재 결정하지말고. 객체만들때 결정하게 하는방법
	

public class Box2 <X> {  // <T>라는 표현을 data type으로 쓰겠다고 선언.
	
	private X obj;		// T가 어떤 data type인지는 객체화 할때 가서 결정하게 됨. (지금시점에서 확정x)

	public void setObj(X obj) {
		this.obj = obj;
	}
	
	public X getObj() {
		return obj;
	}

	
		
}
