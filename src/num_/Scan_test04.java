package num_;

import java.util.Arrays;
import java.util.Scanner;

public class Scan_test04 {

	public static void main(String[] args) {

		
//-----------------for 구문을 사용한 키보드 입력값 test2------------------------------------------

		int ary[] = new int[3]; 			  // 'ary' 변수의 숫자를정해줌.	
		Scanner in = new Scanner(System.in);  // 키보드에서 값을 받아서 in에 저장함.
		
//----------------------------------------------------------------------------------		
		/*			
		System.out.print("국어: ");
		ary[0] = in.nextInt();			// 키보드에서 입력받은 내용을 int 형으로 'ary[0]'에 저장함.
		
		System.out.print("영어: ");
		ary[1] = in.nextInt();			// 키보드에서 입력받은 내용을 int 형으로 'ary[1]'에 저장함.
		
		System.out.print("수학: ");
		ary[2] = in.nextInt();			// 키보드에서 입력받은 내용을 int 형으로 'ary[2]'에 저장함.
		*/
//----------------------상기 내용을 for구문 활용해서 축약해보기---------------------------------------------		
		
		String t[]= {"국어", "영어", "수학"};   // 문장 구문도 String을 써서 배열로 나타 낼수있다. 
		
		int i=0;
		
		for(i=0 ; i<ary.length ; i++) {
		System.out.print(t[i]+": ");
		ary[i] = in.nextInt();
		
		}
		
//----------------------------------------------------------------------------------------------		
						
		for(i=0 ; i<ary.length ; i++) {
		System.out.println(t[i]+" "+ary[i] );
		}
		
//----------------------------------------------------------------------------------------------			
				
		System.out.println("------------------");
		System.out.println( Arrays.toString(ary) );
		System.out.println("------------------");
		
/*
//-------------------------------------------------------------		
		System.out.println("********************");
		
		String o[]= {"국어", "영어", "수학"}; 
		int j=0;
				
		for (j=0;j<ary.length;j++) {
		System.out.print(o[j]);		
		}
			*/	
					
	}
}