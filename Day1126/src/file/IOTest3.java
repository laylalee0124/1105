package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest3 {
	public static void main(String[] args) throws IOException {
		
		// 버퍼: 빠르게 byte를 옮기기 위한 손수레 개념.
		// 중복 method. 옛날방식임.
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String data=in.readLine();  // line 단위로 \n, \r까지  읽어들임.
		
		// 문자열로 되어잇는 숫자문자열을 숫자로 변환해줌
		int n = Integer.parseInt(data);
		
		System.out.println(n+111);
		
		
		
	}
	
}
