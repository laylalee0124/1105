package generic_method;

public class MainTest {

	public static void main(String[] args) {

		//Utill의 method가 static이므로 static way로 접근.
		Box2<Integer> box1=Utill./*<Integer>*/ boxing(8000);
		
		/*int n=box1.getObj();*/
		System.out.println(box1.getObj());
		
		
	}

}
