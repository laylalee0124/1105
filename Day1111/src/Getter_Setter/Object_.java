package Getter_Setter;
public class Object_ {
	public static void main(String[] args) {
	// 배열은 같은 데이터타입만 묶을수있었지만
	// class는 다른 타입들을 하나의 필드로 묶을수있기 때문에. 
	// 사용자가 지정하여 유용하게 사용할수있다. 
	
	/*Classes in Java A class is a blueprint from which individual objects are  created.
	 이제 객체가 무엇인지 자세히 살펴 보겠습니다. 현실 세계를 고려하면 우리 주변의 많은 물체, 자동차, 개, 인간 등을 찾을 수 있습니다.이 모든 물체는 상태와 행동을 가지고 있습니다.
	개를 고려하면 그 상태는 이름, 번식, 색이며 행동은-짖고, 꼬리를 흔들고, 달리는 것입니다.
	소프트웨어 개체를 실제 개체와 비교하면 매우 유사한 특성이 있습니다.
	소프트웨어 개체에는 상태와 동작도 있습니다. 소프트웨어 개체의 상태는 필드에 저장되고 동작은 메서드를 통해 표시됩니다.
	따라서 소프트웨어 개발에서 메서드는 개체의 내부 상태에서 작동하고 개체 간 통신은 메서드를 통해 수행됩니다.

	<Object 만들기>
		선언 -객체 유형과 변수 이름을 가진 변수 선언.
		인스턴스화 - 'new'키워드는 object를 만드는 데 사용됩니다.
		초기화- 'new'키워드 뒤에 생성자 호출이 이어집니다. 이 호출은 새 object를 초기화합니다.
	*/
	
	
	
	//초기화- 'new'키워드 뒤에 생성자 호출이 이어집니다. 이 호출은 새 object를 초기화합니다.
	Circle c = new Circle();   // circle이라는 클래스내에 선언된 변수들을 'c'라는 키워드로 지정
	
	c.z=10;    
	
	//c.x는 private 변수라서 외부에서 선언이 불가능함. 때문에 setX, getX를 통해 아래처럼 정의가능.
	c.setX(9);  //class에 만들어진 setX라는 method를 호출하고, 값을 정의.
	int x=c.getX();
	
	System.out.println(c.z);           // c (=circle class) 에있는 선언된 변수들을 '.method' 형태로 불러와서 씀.
	System.out.println(c.getX());      // Circle class에 만들어 놓은 method를 호출함.
	System.out.println(x);
	System.out.println("-------------");
	c.display();
	
	
	double result=c.calcRound(3);
	System.out.println("원의둘럐 : "+result);
	
	// 정적 변수는 프로그램이 시작될 때 생성되고 프로그램이 중지 될 때 소멸됩니다.
	// static으로 선언된 변수는 남발하면 안됨.
	
	
	System.out.println("-------------");
	c.setY(7);  
	int y=c.getY();
	System.out.print("getY = : "+c.getY()+"\n");
	System.out.println("getY = : "+y);
	System.out.println();
	
	System.out.println("-------------");
	c.setR(88.0);  
	double radius=c.getR();
	System.out.print("getRadius = : "+c.getR()+"\n");
	System.out.println("getRadius = : "+radius);
	System.out.println();	
	
	}
	
}
