package character_;

public class String_somthing {

	public static void main(String[] args) {

	
	// 주소를 ""의 값을 기준으로 나눠줌.
	String path="https://www.tutorialspoint.com/java";
	path.split("/");      // path.split(regex);  <-- regex : regualr expression.
	
	String a[]=path.split("/");
	
	//System.out.println(int indexof=(int a));

				
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
		
	}

	System.out.println("*************************");
	System.out.println("마지막 문자열:"+ a[a.length-1]);   // a라는 변수의 [인덱스번호] 라는 개념을 꼭 기억할것. 마지막 단어를 불러오려면 스플릿 조각-1하면 맨 마지막조각을 불러옴. <- 왜냐면 번호를 매기는게 0부터 매기기 때문에....4조각이면 0.1.2.3 <- 이므로 length의 -1임.
	
	System.out.println("*************************");	
	System.out.println("첫번쨰"+a[0]);
	System.out.println("두번쨰"+a[1]);
	System.out.println("세번쨰"+a[2]);
	System.out.println("네번쨰"+a[3]);
		
	System.out.println("*************************");	
	
	// 문자열을 byte 단위값으로 변환
	byte [] s=path.getBytes();
	System.out.println("*************************");
	
	
	// 문자열에서 ""에 있는 문자가 몇번재 인덱스 값 지를 반환.
	System.out.println(path.indexOf("."));
	System.out.println("*************************");
	
	
	// 글자 앞뒤로 잇는 필요없는 빈공간 삭제
	String sss="  룰     랄 ";
	System.out.println(sss.trim());
	System.out.println("*************************");
	
	
	
	
	}

}
