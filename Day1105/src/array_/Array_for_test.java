package array_;

public class Array_for_test {

	public static void main(String[] args) {

//-------------------------Question-------------------------
		//평균내기
		//step1. 총점을 더하고 값을 저장.
		//step2. 총점을 더한 값 수만큼 나누기.
		//step3. 소수점 아래 두자리까지 출력하기.
		
		
		
		int score[]={11,25,32};  
		int totalscore=0;			
		
		for(int i=0; i<score.length ; i++) {//총점을 더하고 값을 저장
		 totalscore = totalscore + score[i];
		}
		
		System.out.println("총점 "+totalscore);
		
		double result = (double)totalscore/score.length;    
		
		System.out.printf("평균 "+"%.2f",result);	
		
		
		
		
		
//--------------------------------------------------------------
		//놓쳤던 부분 1. printf("%.2f") 구문  / printf("형식지정", 변수이름)
		//놓쳤던 부분 2. int는 정수 출력이기때문에, 그대로 나눗셈하면 소수점을 버리고 정수만 반환한다. (double)연산자 꼭 써줘야 소수점나옴.
//--------------------------------------------------------------	
	}
}
