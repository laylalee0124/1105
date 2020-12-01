package array_;

public class Array_haha2 {

	public static void main(String[] args) {

		/* ---------------Array----------------
		 * 1. 배열 변수 선언 = data type설정 + 변수 선언.
		 * 2. 메모리 공간 생성 = 'new' 키워드 사용하여 heap에 생성
		*/
		
		int arr[] = new int[7];    
		
		//---------자동으로 arr[] 데이터 값 순차적으로 정해주기 - 내가한거----------------
		int d=1;
		for(int c=0 ; c<arr.length; c++) {
			arr[c]=d; d++;
		}
		
		//---------자동으로 arr[] 데이터 값 순차적으로 정해주기 - 강사----------------
		for(int i=0 ; i<arr.length; i++) {
			arr[i]=d++;
		}
		
		for(int i=0 ; i<arr.length; i++) {
			arr[i]=1+i;
		}
		//----------------------------------------------------------------
		
		for(int i=0;i<arr.length;i++) {   //arr.length로 길이정보를 입력할수있음. 상단에 선언한 net int[숫자]에 해당하는 길이만큼을 반영해줌.
			System.out.println("메모리 "+i+"에 해당하는 값을 출력합니다 = "+arr[i]);
		}

		
		

		
		
		
		
	}
}
