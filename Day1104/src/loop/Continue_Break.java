package loop;
public class Continue_Break {
	public static void main(String[] args) {

		
		
		
		
		for(int i=0; i<10; i++) {
			if(i%2==1){continue;  // i를 2로나눈게 몫이 1이면 continue 하라는 의미.
			}
			System.out.println(i);
		}

		
		int i=0;
		while(true) {
			System.out.println(i);
			if(i==10) { 
				break;  //문장내에서 break를 만나면 박스를 탈출합니다.
			}
			i++;
		}
		
		
		System.out.println("----------------------------------------");
		
		
		for(;;) {
			if(i==10) {
				break;  //이 구문은 for에 조건문을 넣지 않았기 때문에 무한루프 true 구문임.
			}
		}
		

	
	
	}

}
