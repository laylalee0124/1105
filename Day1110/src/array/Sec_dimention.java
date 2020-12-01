package array;

import java.util.Scanner;

public class Sec_dimention {

	public static void main(String[] args) {

		// 1반 3명
		// 과목 : 영어, 수학, 컴 <- string으로 표현
		// 총점, 평균, 반석차, 전교석차.
		
		
				
		// 행=반학생숫자, 
		// 열=국/영/수/총점/석차
		int newrecord[][]= {
				{20,77,33,0,1},
				{50,80,70,0,1},
				{60,70,80,0,1}
		};
		double avg[]=new double[3];
		
		//총점계산해서 총점자리에 넣기.
		for (int i = 0; i < newrecord.length; i++) {
			for (int j = 0; j < 3; j++) {
				newrecord[i][3] += newrecord[i][j];
			}
			//평균계산
			avg[i]=(double)newrecord[i][3] / (double)3.0;
		}
		
		
		
		//석차정리해보기
		// newrecord[i][3]의 점수를 서로 비교해서 newrecord[i][4]에다 저장해주기.
		
		for (int i = 0; i < newrecord.length; i++) {
			for (int j = 0; j < newrecord.length; j++) {
				if (newrecord[i][3] < newrecord[j][3])
					{newrecord[i][4]++;}
			}
		}

		
		// 과목 문자열 정의
		String menu[]= {"국어", "영어", "수학", "총점", "석차", "평균"};
		
		
		// 출력 (총점, 평균)
		for (int i = 0; i < newrecord.length; i++) {
			System.out.print(i+1+"번 학생 = ");
			for(int j=0; j<5; j++) {
			System.out.printf("%s: %d  ", menu[j], newrecord[i][j]);
			}
			System.out.printf("%s: %.2f\n", menu[i], avg[i]);
		}
		
		
		
		
		
	}
}
