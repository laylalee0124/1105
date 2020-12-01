package string;

public class Char_string {

	public static void main(String[] args) {
		
		
//--------------------문자열 type들------------------------------------
			
			
			char str[]= {'a','b','c'};         // char는 unicode로 인식하는 datatype이므로, 문자열로 인식하지 않는다. 
			char str1[]= {'a','b','c','\0'};   // 문자열로 인식시키기 위해서는 배열의 마지막에 '\0'=null문자를 넣어줘야한다
			String str2= "에이";
			
			char chc=str2.charAt(1);
			System.out.println(chc);
			
			String str3=new String(str);
			System.out.println(str3);
						
			
	}

}
