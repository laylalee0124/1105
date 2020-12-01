package Interface;

class Typetest {
	int a=5;
	double b=8.2354;
	String c="하이";
}

public class Var_sentence {
	public static void main(String[] args) {
		Typetest obj= new Typetest();
		
		int aa=obj.a;
		double bb=obj.b;
		String cc=obj.c;
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		
		//--------var=variable 모든 변수타입을 처리해주는 데이터타입-------------------
		// 잘못된 구문임에도 불구하고, 정상 작동하는 경우도있기때문에
		// 전문가만 쓰는걸 추천
		var aaa=(obj.a=3);
		var bbb=(obj.b=3.14);
		var ccc=(obj.c="하하");
		
		System.out.println(aaa);
		System.out.println(bbb);
		System.out.println(ccc);
		
		
		
		
		
	}
}
