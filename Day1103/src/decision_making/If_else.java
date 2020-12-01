package decision_making;

public class If_else {

	public static void main(String[] args) {
	
		
		int num=10;
	
//------------------if문 (1가지 구문)--------------------------------------------		
		if(num%2==0) { 
			//num을2로 나눈 나머지가 0과 같은지? --> true임.
			System.out.println("짝수");
			}
//------------------if else문 (if else를 중첩시키면 2가지 이상구문가능)--------------------------------------------	
		if(num%3==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
//------------------if else문 (if else를 중첩시키면 2가지 이상구문가능)--------------------------------------------	
		if(num==0) {
			System.out.println("0입니다.");
			}else {
				System.out.println("음수");
			}
//---------------------------------------------------------------------------------------	    
	}	
}