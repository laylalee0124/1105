package array_;

public class For_each {

	public static void main(String[] args) {

		// ------------------------------foreach구문------------------------------------------
		/*
		 * foreach는 집합의 모든 데이터에 접근. for구문과는 다른것은 for는 ;를쓰고 foreach는 :를 씀.
		 * for(변수이름선언:집합(array변수이름)) { }
		 */

		int arr[] = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + i;
		}
		//-----------------------------------------------
		
		for (int x : arr) { // arr 배열에서 0번부터 읽어와서 x에 순차적으로 저장해준다는 의미.
			System.out.println(x);
		}

		/*상기 식은 아래 구문과 동일한 기능을 한다

		for(int i=0;i<arr.length;i++) {   
			System.out.println("메모리 "+i+"에 해당하는 값을 출력합니다 = "+arr[i]);
		}

		*/
		
		
	}
}
