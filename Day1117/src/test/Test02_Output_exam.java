package test;

import java.util.Scanner;

public class Test02_Output_exam {
	public static void main(String[] args) {

		// 출력 메뉴이름
		String menu[]= {"name", "kor", "eng", "mat", "ttl", "avg"};
		
		// 저장메모리공간 생성
		int arr[] = new int[3];
		
		// 이름 값 입력받기
		System.out.print(menu[0]+": ");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		
		// Kor, eng, mat 점수 받아서 arr[0~2]에 저장.
		for(int i=1; i<menu.length-2; i++) {
			System.out.print(menu[i]+": ");
			Scanner sc = new Scanner(System.in);
			 arr[i-1] = sc.nextInt();
		}
		
		// 총점/평균 계산
		int tot = arr[0] + arr[1]+arr[2];
		double avg = tot/3.0;
		
		
		System.out.println("-----출력-----");
			System.out.println(menu[0] +": "+ name);		// 출력 'name'
			System.out.println(menu[1] +": "+ arr[0]);
			System.out.println(menu[2] +": "+ arr[1]);
			System.out.println(menu[3] +": "+ arr[2]);
			System.out.println(menu[4] +": "+ tot);
			System.out.printf(menu[5]+": "+"%.2f",avg);
	
	
	}

}
