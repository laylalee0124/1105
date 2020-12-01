package decision_making;
public class If_else_overlap {
	public static void main(String[] args) {
		
		
		
		if(true) {
			System.out.println("여기를 실행"); 
			System.out.println("{}를 실행");
		}
		//{}을 생략할수있는 경우에는, 해당 블락의 내용이 한줄일 경우에만 가능하나 가급적이면 생략하지 않는것이 매우좋음.
		
		if(false) {
			System.out.println("여기를 실행"); 
			System.out.println("{}를 실행");
		}
		//이 구문의 경우에는 Dead code라는 경고가 뜸, 이런 구문은 실행되지도 않는 구문인데 왜 넣었냐는 의미.
		
//-------------------------------if 다중중첩구문-------------------------
		//점수입력(정수) (0~100)
		//90점 이상이면 A
		//80점 이상이면 B
		//70점 이상이면 C
		//60점 이상이면 D
		//60점 이상이면 F
		
		int num=11;
		//판단문 작성
		
		
		if(num>=90) {System.out.println("A");
		}else {//90점 미만의 모든 값
			if(num>=80) {
				System.out.println("B");
			}else {//80점 미만의 모든 값
				if(num>=70) {
					System.out.println("C");
				}else {//70점 미만의 모든 값
					if(num>=60) {
						System.out.println("D");
					}else {//60점 미만의 모든 값
						if(num<60) {//이 if값은 안넣어도 그만임.
							System.out.println("F");
						}				
					}
				}
			}
		}
//----------------------------------------------------------------
//----------------if 다중중첩구문에서 중괄호 삭제-------------------------
				//if{}..else if{}..else if{}..else if{}..else if{}..else if{}..else ...... 
				//자동정렬 ctrl+shift+F
				if (num >= 90) {
					System.out.println("A");
				} else if (num >= 80) {
					System.out.println("B");
				} else if (num >= 70) {
					System.out.println("C");
				} else if (num >= 60) {
					System.out.println("D");
				} else {
					System.out.println("F");
				}			
			
//----------------------------------------------------------------
	}
}

