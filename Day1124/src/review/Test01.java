package review;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

///////////////////////////거스름돈 계산하기//////////////////////////////////////////		

// 1. 새우깡 700원     2. 돼지바 500원     3. 홈런볼 1000원.
// 각각 몇개씩 살건지 물어보기
		
		
		/*
		 * Scanner sc=new Scanner(System.in); int arr[]=sc.nextInt();
		 */

		int money = 10000;
		System.out.println("받은금액:" + money);

		int srmp = 700;
		int pig = 500;
		int ball = 1000;

// 새우깡 1개 돼지바 2개 홈런볼 2개 구매후 거스름돈 계산.
		int ttl = (srmp * 1) + (pig * 2) + (ball * 2);
		System.out.println("구매총액: " + ttl);

		int remain = money - ttl;
		System.out.println("거스름돈: " + remain);

// 천원 몇개, 오백원 몇개, 백원 몇개 거슬러줘야되는지 확인.
		// 오천원짜리 계산
		int ocw= remain / 5000;
		System.out.println("오천원짜리: " + ocw + "장");

		// 오천원짜리 제외한 나머지로, 천원짜리 계산
		remain %= 5000;	
		int cw = remain/1000;
		System.out.println("천원짜리: " + cw + "장");
		
		// 오천원, 천원짜리 제외한 나머지로, 오백원/백원짜리 계산하되, 오백원짜리가 필요없을때는 백원짜리로만 계산.
		remain %=1000;
		if (remain == 0) {
			int obw = remain / 500;
			System.out.println("오백원짜리: " + obw + "개");
		} else {
			remain %= 500;
			int bw = remain / 100;
			System.out.println("백원짜리: " + bw + "개");
		}
		
		
		
		
	}

}
