package decision_making;

public class Switch {

	public static void main(String[] args) {

		// 점수입력(정수) (0~100)
		// 90점 이상이면 A
		// 80점 이상이면 B
		// 70점 이상이면 C
		// 60점 이상이면 D
		// 60점 이하이면 F
				
		
		//다중 if 구문과는 다르게 구간별로 결과값을 측정할수 없기 때문에, case로 지정된 정확한 값에 대해서만 결과를 리턴함. 
	    // if else 구문과는 다르게, 해당 값을 판단하기 위해서는 한번만 실행하면된다. if else구문은 해당 값을 찾기을때까지 구문을 반복 수행 한다.
		
	      int grade = 70;

	      switch(grade) {
	         case 90 : //지정된 변수(grade)값에 대한 첫번째 조건
	            System.out.println("A"); 
	            break; // case에 해당 하는 값을 찾았을 때 아래에 나열된 다른 case를 굳이 수행하지 않아도 되게 하는 명령어.
	         case 80 : //지정된 변수(grade)값에 대한 두번째 조건
	        	System.out.println("B"); 
		        break;
	         case 70 :
	            System.out.println("C");
	            break;
	         case 60 :
	            System.out.println("D");
	         default : // 상기 case 이외의 나머지 값에 대한 출력 값
	            System.out.println("F");
	      }
	      System.out.println("Your grade is " + grade);
		
		
//-----------------------------------------------------------------

			// 정수 나누기 정수는 소수점 버리고 정수값만 반환됨.
			// 이런 식으로 정수를 10으로 나눠 반환되는 정수 값을 이용해서 if else처럼 사용할수도 있음.
			// Q) 만약 85~95 처럼 점수구간이 다르다면 어떤 연산자를 사용해서 switch 구문을 쓸수있을지 고민해볼것.

			int num = 67;

			switch (num / 10) {
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
			default:
				System.out.println("F");
			}
			System.out.println("Your grade is " + grade);

//-----------------------------------------------------------------

			// 정수 나누기 정수는 소수점 버리고 정수값만 반환됨.
			// 이런 식으로 정수를 10으로 나눠 반환되는 정수 값을 이용해서 if else처럼 사용할수도 있음.
			// Q) 만약 85~95 처럼 점수구간이 다르다면 어떤 연산자를 사용해서 switch 구문을 쓸수있을지 고민해볼것.

			String str="문자열저장";
			
			char ch = 'i';

			switch (ch) {
			case 'i':
				System.out.println("녹이세요");
				break;
			case 'w':
				System.out.println("끓이세요");
				break;
			case 's':
				System.out.println("따뜻합니다!");
			default:
				System.out.println("이건뭐죠?");
			}
			System.out.println(ch + "를");	      
		      
//-----------------
	}

}
