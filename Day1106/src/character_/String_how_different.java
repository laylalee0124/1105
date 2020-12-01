package character_;

public class String_how_different {

	public static void main(String[] args) {

		
//-------------------------문자배열출력--------------------------------------
		
		char ch[] = new char [10];  //문자형 배열, A,B,C,D등 문자를 넣을수있음.
		// 1차원배열   /   배열이름ch +인덱스 번호[0]
		ch[0]=65;                   // unicode의 65번째코드를 문자형으로 ch[0]에 저장한 것.
		System.out.println(ch[0]);
		
		//----------------------------------------------------------
		
		char nch[] = {'a','b','c'};   // '\0' 문자열에는 원래 null문자를 포함해줘야한다.
		
		String str="abc";             // 문자열표현시 배열로 표현하는 어려움을 해결하기 위해 String을 사용함.
		String s=new String("abc");   // Class type을 사용할때는 반드시 object를 만들어 사용해야한다.
		
		System.out.println(nch);
		System.out.printf("%s\n",str);    // 문자열 출력은 %s
		System.out.printf("%s\n",nch);    // 형식이 저장된 값과 맞지 않기 때문에, 저장된 값대신 메모리주소를 표현해버림
		System.out.printf("%s\n",s);      // 문자열이기때문에 잘 불러와짐

		
		//아래 두개는 문자열 상수로 heap 메모리 영역에 저장해두고 heap 메모리에서는 해당 해시코드 hashcode 주소만 불러오기때문에 동일한 문자열은 동일한 해시태크로 인식되어, == 연산자로 비교하면 같다고 나온다.
		//원래는 static메모리에 저장되게 되어있었으나, JAVA1.8버젼부터 heap 메모리에 저장되는 것으로 변경되었다. 
		String n="abc";  //문자열 상수 (문자열은 반복해서 사용하면 메모리 낭비가 심해지기 때문에 해시코드를 사용하여 문자열 상수를 만들어 쓰는 느낌)
		String m="abc"; 
		
		//아래 두개는 heap에서 추출하여 stack메모리에 저장된 서로 다른 메모리 주소를 사용하기 때문에, == 연산자로 비교하면 다르다고 나온다.
		String o=new String("abc");
		String oo=new String("abc");
		
		if(n == o) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		System.out.println("----------------------------");
		
		//그래서 문자열이 같냐 다르냐를 판단할때는 ==를 쓰지않고 대신, str.equals()를 써서 문자열을 비교함.
		if(n.equals(o)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		System.out.println("******************");
		System.out.println("String의 method인 hashcode 썻을때: "+n.hashCode());
		System.out.println("String의 method인 hashcode 썻을때: "+m.hashCode());  // <-- 상기 내용에 근거해서 출력해봤을때, 이것과
		System.out.println("String의 method인 hashcode 썻을때: "+o.hashCode());  // <-- 이것이 동일한 코드로 나오는 이유는 string의 hashcode라는 멧서드를 오브젝트의(상속)특성 때문이고, 기본적으로 object의 값을 취하기 때문에 hashcode값이 동일하게 나온다.
		System.out.println("String의 method인 hashcode 썻을때: "+oo.hashCode());
		System.out.println("******************");
		System.out.println("System의 identityHashCode 썻을때: "+System.identityHashCode(n));  // <-- 이걸 쓰면 오버라이드된 해시코드가 고유화 되어 표현되기 때문에 다름을 표현할수도 있다.
		System.out.println("System의 identityHashCode 썻을때: "+System.identityHashCode(o));  // http://sjava.net/tag/identityhashcode/ 이 사이트 참고해보기~ 잘나와잇음.
		System.out.println("******************");
		
		//--------------------뽀나스-----------------------------------------------------------------
		
		String ss1=new String("abc");
		String ss2=ss1;
		
		System.out.println("String ss1=new String(\"abc\");  "+ss1);
		System.out.println("String ss2=ss1;                "+ss2);
		
		//이와 같이 지정하면, new로 생성된 string "abc"의 주소를 String ss2에 저장하기 때문에 같다는 결과가 나온다.
		if(ss1==ss2) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		System.out.println("******************");
		
		// 만약 이시점에서 ss1을 재정의를 하면?
		ss1=new String("bef");
		System.out.println(ss1);             // <--요거만 재정의 됨.
		System.out.println(ss2);             // <--요거는 기존값이 나오고.
		
		if(ss1==ss2) {                       // 다른 값이라는 결과가 나오게된다.
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
			
		System.out.println("******************");	

			
		}
	}
}
