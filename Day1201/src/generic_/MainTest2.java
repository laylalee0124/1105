package generic_;

public class MainTest2 {
	public static void main(String[] args) {

		// Question???
		// String str=box.getObj(); 이거랑, 
		// casting해서  String str = (String) box.getObj(); 이렇게 쓰는거랑 뭐가달라???
		// Generic표현하면 뭐가조아??????
		
		
		// <Generic>표현은 Class만 가능
		Box2<String> box=new Box2<String>(); // Box2에서 만들어뒀던 <X>의 datatype을 여기서 결정.
		box.setObj("문자열저장");
		String str=box.getObj();
		System.out.println(str);
		
		
		Box2<Integer> box1=new Box2<Integer>();
		box1.setObj(100);
		int n=box1.getObj();
		System.out.println(n);
		
		
	}
}
