package loop_sentance;

public class Switch_case_logic {

	public static void main(String[] args) {
		
		// if else보다 switch case가 성능이 더 좋음
		// 가독성이 좋고, if보다 처리 횟수가 적다.
		// 책에 책갈피 해놓고 그쪽으로 바로 가서 읽는 것과 비슷함.
		
		/*---------------<LOGIC>----------------------
		switch(expression) {
		   case value :
		      // Statements
		      break; // optional  //이게 있으면, 아래 구문은 실행안하고 빠져나감. 없으면 아래 구문도 실행해봄.
		   
		   case value :
		      // Statements
		      break; // optional
		   
		   // You can have any number of case statements.
		   default : // Optional
		      // Statements
		}
		*/
		
		//--------------------실행예제----------------------
		// char grade = args[0].charAt(0);
	      char grade = 'C';

	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
		
	}

}
