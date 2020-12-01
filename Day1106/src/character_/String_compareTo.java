package character_;

public class String_compareTo {

	public static void main(String[] args) {

		
//--------------------------String methods--------------------------
		
	String str="abcde";
	
	str.charAt(0);  // index에 해당하는 char#를 추출 해주는 명령어.
	
	System.out.println(str.charAt(1));
	
	System.out.println("--------------------------");
		
	
	 String str1 = "abc";
     String str2 = new String("abc");
     String str3 = new String("bbc");
     
     int result = str1.compareTo( str2 );  // A.compareTo( B )   A과 B를 비교해서 0이나오면 true 아니면 false를 반환한다. 
     System.out.println(result);           // 계산하는 방식은 해당 문자열들의 unicode를 계산해서 A-B를 해서 반환한다.
     
     result = str2.compareTo( str3 );
     System.out.println(result);
     
     
    System.out.println("--------------------------");	
		
    
    // if(str1.compareTo( str2 )) {  }   <-- 이 문장이 성립하지 않는 이유는, if문이 필요한 것은 boolern(true/false)이 되는 문장만 허용하기 때문임.
    // 그래서 이것도 잘 안쓰는 코딩방식이고, equals를 사용하게 된다.    
    
    
	}

}
