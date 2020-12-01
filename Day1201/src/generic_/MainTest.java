package generic_;

public class MainTest {
	public static void main(String[] args) {


		Box box = new Box();

		
		box.setObj("문자열저장");
		String str = (String) box.getObj();
		System.out.println(str);
		
		box.setObj(100);
		int n=(int)box.getObj();
		System.out.println(n);
		
		box.setObj(3.14);
		double pi=(double)box.getObj();
		System.out.println(pi);
		
		// 이것도 가능
		box.setObj(3.14);
		System.out.println(box.getObj());
		
		
		// 이런식으로 collection을 이용하면 매번 빼낼때마다, casting해줘야 하는 불편함이있음.
		// 이는 for나 while로 돌릴 수 없음.
		// 이렇게 다양한 데이터타입을 처리하라고 Class라는게 존재했고.
		// generic을 이용해서 다양항데이터타입을가진 class를 가져와사용하는것.
		
		/*
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(3.14);
		list.add("aa");
		list.add(new Box());
		
		int m=(int)list.get(0);
		double j=(double)list.get(8.16);
		String k=(String)list.get("ㅎㅎ");
		*/
		
	}
}
