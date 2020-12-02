package date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest1 {
	public static void main(String[] args) {

		
		
////////////////////////////////////////시간의 여러가지 표현방식//////////////////////////////////////
		
		
//====================Date 사용========================//
	// 옛날 표현방식이고, 잘쓰지 않음.
	Date date=new Date();
	System.out.println(date);
	System.out.println("연도 : " + (date.getYear()+1900));	// 율리우스력 기준으로 나타내고, 그 기준이 1900 기준이라서.
	System.out.println("월 : "+(date.getMonth()+1));			// 1월 리턴기준이 0이라서.
	System.out.println("일: "+(date.getDate()));

	
	System.out.println("-------------------------------");
	
	
	
//====================Calendar 사용========================//	
	/* 예를들어 Calendar class는 접근자가 protected로 막혀있기 때문에, 생성자를 쓸수없음. 
	 * method의 return형이 class이름인 것이 생성자를 대신하는 method임.
	 * public Calendar getInstence(); 이 method로는 calendar의 constructor를 호출할수 없기 때문에 접근하기위해
	 * public static Calendar get Instence();를 써서 static way를 사용하여 접근하는 방법이있다.
	 * */
	
	// Calendar cal=new Calendar();				// Calendar의 access modifier가 Protected라서 constructor 생성이 불가능하기 때문에 불가능한 방법.
	Calendar cal=Calendar.getInstance();		// static way를 사용하여 접근하는 방법.

	System.out.println(cal);
	System.out.println("연도 : " + cal.get(Calendar.YEAR));			// 자동으로 그레고리안력을 사용해줌.
	System.out.println("월   : " + (cal.get(Calendar.MONTH))+1);		// get() method를 사용해서 field값으로 static way의 method를 호출해줌.
	System.out.println("일   : " + cal.get(Calendar.DAY_OF_MONTH));

	System.out.println("-------------------------------");

	
	
//====================Localdate 사용========================//
	LocalDate ld=LocalDate.now();
	
	System.out.println(ld);
	System.out.println("연도 : " + ld.getYear());
	System.out.println("월  : " + ld.getMonth());		// 열거형 enum (enumeration) data type 으로 출력됨
	System.out.println("월  : " + ld.getMonthValue());	// 숫자형으로 출력.
	System.out.println("일  : " + ld.getDayOfMonth());
	
	System.out.println("월말 : " + ld.lengthOfMonth());	// 현재 달의 길이.
	
	}
}
