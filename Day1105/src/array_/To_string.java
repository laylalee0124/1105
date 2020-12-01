package array_;

import java.util.Arrays;

public class To_string {

	public static void main(String[] args) {

		// ---------------------Arrays 클래스의 toStrcing 옵션 구문-------------------------------------
		/*
		 * 어떤 데이터가 어디에 저장되어있는지 보여줌.
		 * 디버깅할때 체크하기위한 목적으로 사용함
		 */

		//--여기서부터
		int arr[] = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + i;
		}
		//--여기까지는 for each와 동일한 조건일때.
		
		System.out.println( Arrays.toString(arr) );   
		
		
		
		
		
	}
}
