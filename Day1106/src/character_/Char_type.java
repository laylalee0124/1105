package character_;

public class Char_type {

	public static void main(String[] args) {

		
	char a = 'a';  //문자 데이터는 싱글''을 이용해서 표현한다.
	System.out.println(a);
	System.out.printf("%c\n",a);
	System.out.printf("%d\n", (int)a);     // 'a'에 해당하는 ASKI코드를 정수로 출력 해줌.
	
	// char는 data버무이를 0에서부터 시작.
	// short/long은 data 범위를 마이너스에서 시작.

	
	System.out.println("----------------------------");
	
//------------------------------------QUEST-----------------------------------------------
	// 각 글자에 해당하는 ASKI코드를 표현해보기
	
	
	for(int i=0; i<128; i++) {
	System.out.printf("%3d : %c \n", i,i);      // 뒤의 i를 %3d 라는 표현방식과, %c라는 표현 방식으로 표현해주세요라는 뜻.
	}
		
//------------------------------------------------------------------------------------------------		
	
	char n=0;    //이 0은 char n에 저장된 숫자 0, 유니코드로 변환하면 0
	char m='0';  //이 0은 char m에 저장된 문자 0, 유니코드로 변환하면 48
		
		
		
	}

}
