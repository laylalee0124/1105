package inheritance;



abstract class Super{
	// 하지만 abstract class는 꼭 abstract method를 포함하지않아도된다.
	abstract void disp();
	// method의 body를 생략하고 abstract화.
	// abstract method는 abstract class내에서만 허용하므로 class도 abstract로 변환.
	public Super() {
		// 생성자는 존재하지만 메모리에 공간을 확보할순 없다. 
		// 그러므로 이 생성자는 필요없음.
		// 단, 필드 멤벅 초기화는 생성자가 처리함.
	}
}

class Sub1 extends Super{
	@Override // 가 숨겨져잇음.
	// 여러개의 class가있을때 중복된 이름의 method는 정의할수없기때문임.
	// 기존 method를 이용하되 내용에 일부를 재정의하여 쓰고싶을때 쓰기도함
	
	void disp() {
		System.out.println("sub class영역");
	}
}


class Sub2 extends Super{
	// 추상 method는 사용시 override로 반드시 재정의 해줘야 된다.
	@Override
	void disp() {
		// classs 에서 sub2를 재정의 해서 추상 클래스인 supperabstract method를 사용 할수있다.
		
	}
	
}

public class Method01 {
	public static void main(String[] args) {
	Super sb=new Sub1();
	sb.disp();
	
	
	//Super sp=new Super();
	// abstract 가 붙은 class는 instance(메모리에 생성)화 할수 없다.
	// abstract class는 생성자는 있지만, memory공간을 생성할 기능은 없다.
	
	}
}
