package loop;

import java.util.Scanner; //library에 있는 lang pkg이외의 class를 사용할 경우에 import로 해당 pkg를 지정해줘야 사용가능해짐.

public class Scanner_2 {

	public static void main(String[] args) {

	    //import 단축키= ctrl+shift+o
		Scanner in=new Scanner(System.in);   //키보드입력 받는 구문.
		
		int num;
		
		do {
			System.out.println("1. 입력  2.계산  3.출력  4.종료");
			System.out.print("선택 > ");
			
			num=in.nextInt();
			if(num<=0 || 5<=num)
				System.out.println("오류입니다");
		}while(num<=0 || 5<=num);
			

	
		
		switch (num) {
		case 1:
			System.out.println("입력");
			break;
			
		case 2:
			System.out.println("계산");
			break;
			
		case 3:
			System.out.println("출력");
			break;
			
		case 4:
			System.out.println("종료");
			break;
		
		}
				
	}

}
