package file;

import java.io.IOException;

public class IOTest2 {
	public static void main(String[] args) throws IOException  {
		
		System.out.println("영문자만 입력하던가");
		int n;
		
		
		//몇번 입력할지 모르는 만큼 반복할대는 while쓰기.
		// System.in.read는 byte 단위로 읽다가 문서의 끝에도달하면 -1을 리턴함.
		// 키보드에서 입력되는 값은 '문자'이고, 이를 byte로 변환해서 읽어들이는거임.
		// 아래 구문에서는 -1과 비교해야되는게 맞는데, 제대로 작동을 안해서 enter를 만나면 종료하는것으로 enter값인(13)을 대신 입력함.
		while ((n=System.in.read()) !=  13) {
			System.out.println(n);
		}
		
		System.out.println("읽기 완료");
		
		
		
	}
	
}
