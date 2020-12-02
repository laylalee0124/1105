package method;

public class Calculator_ {

	
	// 두 정수를 입력 받고, +결과를 리턴하는 멧서드

	// 플러스
	public int plus(int a, int b) { // int plus <- return type.
		return (a + b);
	}

	// 마이너스
	public int minus(int a, int b) {
		return (a - b);
	}

	// 나누기
	public double div(int a, int b) {  // 소숫점이하를 표현하기위해
		if (b==0){
			return 0.0;
			}
		return ((double)a/(double)b);  // 받아들인 int값에 (double)을 casting해줌.
	}
	
	// 곱셈
		public int mul(int a, int b) {
			return (a/b);
		}
		
}
