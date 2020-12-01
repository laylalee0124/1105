package loop_sentance;

import java.util.Arrays;
import java.util.Scanner;

public class Array_test_ttl_avgscore {
	public static void main(String[] args) {

//----------------------------과목별 점수/총점/평균 구하기-----------------------------
	
	//키보드에서 값 입력 받기
	int arr[]=new int[3]; //시험 점수 입력	
	Scanner input=new Scanner(System.in);
	String menu[]= {"국어", "영어", "수학"}; 
	
	int i=0;
	for(i=0 ; i<arr.length ; i++) {
	System.out.print(menu[i]+": ");
	arr[i] = input.nextInt();
	}
	
	
	
	//총점 계산
	//tot=arr[0]+arr[1]+arr[2]
	int tot=0;
	for (i=0; i<arr.length; i++) {
		tot= tot+arr[i];
	}
	
	
	
	//평균 계산
	double avg;
	avg = (double)tot / (double)arr.length;    //(double)을 써주면 실수형으로 변경 가능.
			
			
	//모든점수 / 총점 / 평점 출력
	System.out.println("모든점수     ");
	for(i=0;i<arr.length;i++) {
		System.out.println( menu[i] + arr[i]);	
	}
	System.out.println("총점"+tot);
	System.out.println("평균"+avg);
		
		

	
	//=============================상기 구문의 단순화========================
	/*
		int arr[]=new int[3]; //시험 점수 입력	
		Scanner input=new Scanner(System.in);
		String menu[]= {"국어", "영어", "수학"}; 
		
		int i=0;
		for(i=0 ; i<arr.length ; i++) {
		System.out.print(menu[i]+": ");
		arr[i] = input.nextInt();
		tot= tot+arr[i];
		}
		
		double avg;
		avg = (double)tot / (double)arr.length;    //(double)을 써주면 실수형으로 변경 가능.
				
		System.out.println("모든점수");
		for(i=0;i<arr.length;i++) {
			System.out.println( menu[i] + arr[i]);	
		}
		System.out.println("총점"+tot);
		System.out.println("평균"+avg);	
		*/
	}
}
