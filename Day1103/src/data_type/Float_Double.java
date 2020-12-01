package data_type;
public class Float_Double {
	public static void main(String[] args) {
		
		
		float aaa=0;
		//float는 4byte
		for(int i=0; i<10; i++) {
			aaa = aaa + 0.1f; 
		// for는 반복문장 ()안에있는 내용을 반복해달라.
		// =는 = 우측내용을, = 좌측 위치에 표현해달라는 명령어
		}
		System.out.println("float 소수정 지정x : "+aaa);
		// 출력값이 1.0000001이 나오는 이유는 0.1f가 정확한 실수값이 아니기 때문.
		
		
		double bbb=0;
		//double은 8byte임.
		for(int i=0; i<10; i++) {
			bbb = bbb + 0.1; 
		}
		System.out.println("double 소수정 지정x : "+bbb);
		
		
		//------------------------------------------------------
		
		
		float sum=0;

		for(int i=0; i<10; i++) {
			sum = sum + 0.1f; 
						
		}
		
		System.out.printf("float 소수정 지정 : %.6f\n",sum);
		//printf는 소숫점 자릿수 줄여줌.
		//%.6f\n : %.6f 실수형 소수점이하 6자리까지로 표현해달라는 명렁어, \n = newline줄바꿈 
		
		double tot=0;
	
		for(int i=0; i<10; i++) {
			tot = tot + 0.1; 
	
		}
		
		System.out.printf("double 소수정 지정 : %.6f\n",tot);

	}

}
