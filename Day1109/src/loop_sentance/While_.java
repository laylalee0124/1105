package loop_sentance;

public class While_ {
	
	public static void main(String[] args) {	
	
		//---------------WHILE-----------------------
		// 조건이 FALSE면 한번도 실행하지 않고 빠져나간다.
		int i = 5; 
		while (i > 0) { // while구문은 조건이 ture일때만 실행되는 조건문을 쓰면된다. false면 빠져나간다.
			System.out.println("while"); 
			i--; 
		}	
		
		
		
		//----------------DO-WHILE----------------------
		// DO WHILE은 조건에 관계없이 한번은 무조건 실행한다.
		int j = 0; 
		do {
			System.out.println("호호"); //반복부분
			j++;
		}while(j<5);
		
		

		//---------------FOR-----------------------
		// 조건이 FALSE면 한번도 실행하지 않고 빠져나간다.
		for(int o=0; // 초기값을 지정해주는 부분이기 때문에, for구문이 도는동안 처음 한번만 실행되고, 실행되지않는다.
				o<5; // 조건문이므로. 이부분 실행시 false여야지만 빠져나간다.
				o++) {
			System.out.println("하하");
		}
		
		
		
	}
}
