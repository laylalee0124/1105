package arry;

import java.util.Arrays;

public class Bubble_array {

	public static void main(String[] args) {
		
//------------------BUBBLE함수를 FOR로 구현해보기-----------------------------------
		
	int num[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};	
	System.out.println(Arrays.toString(num));
	
	/*    선생님 예제
	for (int c = 5; c > 0; c--);
	for (int i = 0; i < c; i++) {
		if (num[i] > num[i + 1]) {
			int temp = num[i];
			num[i] = num[i];
			num[i + 1] = temp;
		}
	}
	*/	
	
	
	for (int j = num.length; j > 0; j--) { // 정렬시키는 회전수는 0이 되기 전까지만 회전시킴
		for (int i = 0; i < num.length - 1; i++) { // 서로 비교 횟수는 전체 숫자-1
			if (num[i] > num[i + 1]) { // 배열의 i번째와 i+1번째를 서로 비교 해보고, 비교한 값이 i가 크면 if내의 구문을 실행해줌
				int temp = num[i]; // 서로 자리를 바꾸기위해 임시 공간 할당
				num[i] = num[i + 1]; // 첫번째자리인 i에는 i+1인 두번째 값을 저장해주고
				num[i + 1] = temp; // 두번째자리인 i+1에는 temp에 저장했던 첫번재자리값이 였던 i값을 저장해줌.
			}
		}

	}

	// 출력구문.
	for (int i = 0; i < num.length; i++) {
		System.out.printf("%02d ", num[i]);
	}
	
//------------------------------------------------------------------		
		
		
		
		
	}
}
