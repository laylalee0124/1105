package date;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTest3 {
	public static void main(String[] args) {

		int year, month;
		Scanner in = new Scanner(System.in);
		
		System.out.print("연도: ");
		year=in.nextInt();
		
		System.out.print("월: ");
		month=in.nextInt();
		
		LocalDate date=LocalDate.of(year, month, 1);		// 해당 년/월의 1일의 객체 생성.
		
		System.out.println("요일: "  +  (date.getDayOfWeek().getValue()));	// 해당 년/월의 요일 생성. getDayOfWeek() method의, getValue() 멧서드로 int값을 받음.
		System.out.println();

		
		// 달력글자 출력
		System.out.println("         "+year + "년 " + month +"월");
		// 요일글자 출력
		String dayofweek[] = { "MON", "TUE", "WED", "THR", "FRI", "SAT", "SUN" };

		for (int j = 0; j < 7; j++) {
			System.out.print(dayofweek[j] + " ");
		}
		System.out.println();
		
		int first_fow = date.getDayOfWeek().getValue();		// 1일이 몇번째 요일에서 시작하는지 계산. 4.

		//=====================공백 대신에, 지난달 날짜표기 해보기.===================================
		LocalDate lastmonth=LocalDate.of(year, month-1, 1);		// 전달 년/월의 1일의 객체 생성.
		int lastMonthDay = lastmonth.lengthOfMonth();					// 전달의 마지막 날이 몇일인지 계산.
		System.out.println("지난 달 "+lastmonth);
		System.out.println("지난 달 마지막날 "+lastMonthDay);
		
		if (1<first_fow) {								// 월요일에 시작하는게 아니면 아래 구문 실행.
			for(int z=(first_fow-2); z >= 0; z--) {		// 실행하는 요일-1 개를 출력하되, 역순으로 실행.
					System.out.printf(" %02d ", lastMonthDay-(z));
				}
			}
		//======================================================================================
		
		
		int lastDay = date.lengthOfMonth();					// 해당 월의 마지막날이 몇일인지 계산.
		
		// 날짜 출력 방법 2
		for (int day = 1; day <= lastDay; day++) {
			System.out.printf(" %02d ", day);
			
			
			if(first_fow % 7 == 0) { 
				System.out.println();
			}first_fow++;
		}
		
		
		/*
		// 날짜 출력 방법 1
			for (int day = 1; day <= lastDay; day++) {
				System.out.printf("%02d  ", day);
				
				LocalDate today=LocalDate.of(year, month, day);		// 요일 값을 이용해서 줄바꿈을 실행하는 방법 1
				int dow = today.getDayOfWeek().getValue();
				
				if(first_fow==6) {	// 줄바꿈 체크. 매주 토요일마다 줄바꿈 
					System.out.println();
				}
			}
		*/
		
		

			
			
			
			
	}
}
