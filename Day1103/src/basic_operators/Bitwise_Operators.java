package basic_operators;
public class Bitwise_Operators {
	public static void main(String[] args) {
		
		
//----------------------------이진 연산자 Bitwise Operators-----------------------------
//A&B (bitwise and)	이진Binary에서, AND 연산 A와 B의 이진값이 모두 1(true)이면 1을 반환. ex) (A & B) will give 12 which is 0000 1100
//A|B (bitwise or)	이진Binary에서, OR 연산 A와 B의 이진값중 하나가 1(true)이면 1을 반환.	(A | B) will give 61 which is 0011 1101
//A^B (bitwise XOR)	이진Binary에서, XOR(exclusive or)연산, A와 B의 이진값이 서로 다르면, 1을 반환. (A ^ B) will give 49 which is 0011 0001
//A~B (bitwise compliment)	이진Binary으로 해당 이진값의 0과 1을 서로 뒤집어줌. 보수 계산시유용	(~A ) will give -61 which is 1100 0011
//A<<2 (left shift)	이진Binary에서, 8bit 전체를 왼쪽으로 지정 숫자 만큼이동하는 연산자. 밀려나간 bit는 삭제됨.	A << 2 will give 240 which is 1111 0000
//A>>2 (right shift) 이진Binary에서, 8bit 전체를 오른쪽으로 지정 숫자 만큼이동하는 연산자. 밀려나간 bit는 삭제됨.	A >> 2 will give 15 which is 1111
//A>>>2 (zero fill right shift)	이진Binary에서, 8bit 전체를 오른쪽으로 지정 숫자만큼 이동하고, 밀린 빈공간에는 0을 반환	A >>>2 will give 15 which is 0000 1111
		
	byte A=60; //0011 1100
	byte B=13; //0000 1101
	
	System.out.println("A&B :"+(A&B));
	System.out.println("A|B :"+(A|B));
	System.out.println("A^B :"+(A^B));
	System.out.println("~A :"+(~A));
	System.out.println("A<<B :"+(A<<4));  //bit를 왼쪽으로 4칸 밀었는데,  A값이 byte단위를 쓰고있음에도 불구하고, int로 결과가 표시됨 
	System.out.println("A<<B :"+( (byte)(A<<4)));  //이럴때는 이와 같이 강제캐스팅으로 (byte)로 단위를 고정해주면됨.
	System.out.println("A>>B :"+(A>>4));
	System.out.println("A>>> :"+(A>>>2));
	

	byte C = -60; //1byte가 아니라 4byte로 계산되기 때문에 "1073741809"라는 값이 나옴.	
	System.out.println("C>>>2 :"+((byte)C>>>2));  // 0011 0001 = 49
	
	
	System.out.println(60>>2);    // 이 수식은 아래 수식과 동일함. 60x2^-2과 같은 값임.
	System.out.println(60*(1/(2*2)));  //이거 왜 연산안되는지 확인해보기.

	}

}
