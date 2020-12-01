package character_;

import java.util.Random;

public class Data_type_ {

	public static void main(String[] args) {

		//스택메모리//                     /필요메모리공간을/
		//에다가저장//  /assignment연산자/   /힙에다/
		char[] str           =            new   char[100];
		//하는부분 //                      /저장/
		//--> 힙에다 할당되었던 메모리 주소(Ref변수)는 int형(4byte)주소로 stack메모리에 저장됨.
		
		int[] arr=new int[3];
		double[] darr=new double[7];
		
	System.out.println(str.toString());  // '[C@7d6f77cc'라고 표기되는데, char타입의 메모리7d6f77cc에 저장된 값이라고 얘기하는 것.
	System.out.println(arr.toString());  // '[I@5aaa6d82'라고 표기되는데, integer타입의 메모리 5aaa6d82에 저장된 값이라고 얘기하는 것.
	System.out.println(darr.toString());  // '[I@5aaa6d82'라고 표기되는데, double타입의 메모리 73a28541에 저장된 값이라고 얘기하는 것.

	//Class type의 변수의 예.
	Random random=new Random();
	
	//Class를 사용할때는 object를 만들어서 사용해야하는것이 필수사항.
	
	/*
	primitive data type = int long ~~~
	Ref(=object) data type= 배열 변수나 class type의 변수들도 모두 ref 변수.
	*/
	
	
	
	}
}