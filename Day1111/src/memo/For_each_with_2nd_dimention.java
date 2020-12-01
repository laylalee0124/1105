package memo;
public class For_each_with_2nd_dimention {
	public static void main(String[] args) {

		//%d = decimal(10진법)의 약자. %o = octal(8진법). %x = hexa decimal(16진법)
		//%f = double/float 표현.
		
		// ------------------------------FOREACH 구문------------------------------------------
		/*
		 * foreach는 집합의 모든 데이터에 접근. for구문과는 다른것은 for는 ;를쓰고 foreach는 :를 씀.
		 * for(변수이름선언:집합(array변수이름)) { }
		 */

		int arr[] = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + i;
		}
		
		for(int i=0;i<arr.length;i++) {   
			System.out.println(arr[i]);
		}
		
		
		System.out.println("----------------------------------------");
		
		
		//아래 foreach는 상기 구문과 동일한 기능을 한다
		for (int x : arr) { // arr 배열에서 0번부터 읽어와서 x에 순차적으로 저장해준다는 의미.
			System.out.println(x);
		}
		System.out.println("----------------------------------------");
		
		
		
		
		//-----------------------1차원 배열의 FOREACH연습---------------------------
		
		String yrr[]=new String[8];
		String str[]={"A", "B", "C", "D", "E", "F", "G", "H"};
		
		for(int i=0; i<yrr.length; i++) {
			yrr[i]=str[i];
		}
		
		for (String y: yrr) {
			System.out.println(y);
		}
		
		System.out.println("----------------------------------------");
		
		
		
		
		//-----------------------2차원 배열의 FOREACH연습---------------------------
		// 사용할 배열이 순차배열이라면, for구문대신 foreach가 편하다.
		
		double[][] zrr = new double [2][3];
		for(double[] z : zrr) {     // (2차원) 여러줄 출력
			for(double a :z) {      // (1차원) 한줄내의 배열들 설정
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
