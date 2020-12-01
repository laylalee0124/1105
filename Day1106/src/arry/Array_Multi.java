package arry;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
// java.util.*; 이라고 쓰면 util 내에있는 모든걸 쓰게 된다, 과도한 로딩을 초래하기 때문에 이렇게 쓰는 경우는 없다.
import java.util.Scanner;

public class Array_Multi {

	public static void main(String[] args) {

		
		/*
		1~45 생성
		
		*/
		
		Scanner sys=new Scanner(System.in);   //class이름 변수이름=new 생성자(방법=call)
		//값을 저장하는건 변수에다 저장
		//그 값의 상태를 변형하는 것은 method로 작업하게될것.
		
		//Random random=new Random();   // class이름 변수이름=new 생성자(콜);
		
		//int num = random.nextInt(45);      	  // assignment연산자(=)가 먼저 연산하기전에, random 실행자가 nextInt를이용해 45개를 call하여 값을 리턴한다. 
		
		
//--------------------------LOTTO 추첨 시스템 만들기 Question ---------------------------------------------
		
		/*
		 1) 한줄에 랜덤 번호 5 출력
		 2) 한줄내 중복 없이 1부터 5까지 출력할 것 
		 3) 정렬 : 오름차순 정렬
		 4) scanner를 이용해서 몇줄 생성할지 물어보고 반영할 것.
		 5) 모든 숫지는 2자리로 표현하기
		 */
		
		// if문, for문, 정렬 사용할것.
		
		//num[i] = random.nextInt(6)+1;  // 0~44대신, 1~45출력하기위해서 +1을 써줌.
		
		Random random=new Random();
		
		System.out.print("몇줄? :");
		Scanner sc=new Scanner(System.in);   // 인풋시스템에서 입력받은 값을 sc에 저장하기위해 초기화함.
		
		int key = sc.nextInt();				 // sc에 입력받은 값을 key라는 변수에 int형으로 저장.
		
		int num[] = new int[6];            // 우선 데이터를 공간을 n개 생성. 이경우에는 n값만큼 생성.
		
		for (int k = 0; k < key; k++) {
			for (int i = 0; i < 5; i++) {
				// 일단 랜덤번호 1개 번호 생성
				int newnum = random.nextInt(40) + 1;   // 45까지 출력하되, 1부터 출력하기위해서 +1을 써줌.

				// 번호 새로 생성해서 기존 배열에 있거랑 같은지 비교 후, 같은게 있으면 아래출력.
				boolean haha = false;
				for (int j = 0; j < 5; j++) {
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
					// for i
				}
				// for i
			}
			// for j
			// 출력구문
			for (int i = 0; i < 5; i++) {
				System.out.printf("%02d ", num[i]);
			}
			System.out.println();
		}
		
		/*
		//배열출력 구문
		Arrays.sort(num); //정렬 구문. Array라는 클래스 안에있는 sort라는 method를 사용해서 정렬해줌.
		System.out.println(Arrays.toString(num));   //array도 class인데 생성자를 통해서 object를 만들지 못하는 이유는 private 안에있는 class이기때문.
		*/
		
		
		
		// 실행 순서 보고 싶을때는 디버깅 모드로 one step씩 보면서 이해해볼것.
		// 1) 랜덤 넘버를 6개 생성
		// 2) 랜덤 넘버를 각각의 배열에다가 저장.
		// 3) 중복을 제거.
		//    만약, 중복열에 중복되는 숫자가 없으면 댜음 for문 출력.
		//    아니면, 중복열에 중복되는 숫자가 있으면 for문 한번더 출력.
		// <3) 배열을 오름차순으로 만들기> optional
		// 4) 배열을 출력???
		
		
		
	}

}
