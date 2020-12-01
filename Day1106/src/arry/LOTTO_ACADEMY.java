package arry;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
// java.util.*; 이라고 쓰면 util 내에있는 모든걸 쓰게 된다, 과도한 로딩을 초래하기 때문에 이렇게 쓰는 경우는 없다.
import java.util.Scanner;

public class LOTTO_ACADEMY {

	public static void main(String[] args) {

		
		Scanner sys=new Scanner(System.in);   //class이름 변수이름=new 생성자(방법=call)
		Random random=new Random();
		
		System.out.print("몇줄? :");
		Scanner sc=new Scanner(System.in);   // 인풋시스템에서 입력받은 값을 sc에 저장하기위해 초기화함.
		
		int key = sc.nextInt();				 // sc에 입력받은 값을 key라는 변수에 int형으로 저장.
		
		int num[] = new int[3];            // 우선 데이터를 공간을 n개 생성. 이경 우에는 n값만큼 생성.
		int save=num.length;
		
		
		for (int k = 0; k < key; k++) {
			for (int i = 0; i < save; i++) {
				// 일단 랜덤번호 1개 번호 생성
				int newnum = random.nextInt(15) + 1;   // 15까지 출력하되, 1부터 출력하기위해서 +1을 써줌.

				// 번호 새로 생성해서 기존 배열에 있거랑 같은지 비교 후, 같은게 있으면 아래출력.
				boolean haha = false;
				for (int j = 0; j < save; j++) {
					if (newnum == num[j]) {
						haha = true;
						break;
					}
				}
				// 같은게 없으면 그대로 저장
				if (haha == true) {
					haha = false;
					i--;
					continue;
				}

				// 번호저장
				num[i] = newnum;

			}
			// 오름차순 정렬
			
			for (int j = num.length; j > 0; j--) { // 정렬시키는 회전수는 0이 되기 전까지만 회전시킴
				for (int i = 0; i < num.length - 1; i++) { // 서로 비교 횟수는 전체 숫자-1
					if (num[i] > num[i + 1]) { // 배열의 i번째와 i+1번째를 서로 비교 해보고, 비교한 값이 i가 크면 if내의 구문을 실행해줌
						int temp = num[i]; // 서로 자리를 바꾸기위해 임시 공간 할당
						num[i] = num[i + 1]; // 첫번째자리인 i에는 i+1인 두번째 값을 저장해주고
						num[i + 1] = temp; // 두번째자리인 i+1에는 temp에 저장했던 첫번재자리값이 였던 i값을 저장해줌.
					}
				}
			}
			
			// 출력구문
			for (int i = 0; i < save; i++) {
				System.out.printf("%02d ", num[i]);
			}
			System.out.println();
		}
		
		
		
	}

}
