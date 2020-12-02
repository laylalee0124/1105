package collection;

import java.util.ArrayList;

class AAA{

}


public class ArrayList01 {
public static void main(String[] args) {
	
	// 객체생성
	ArrayList list = new ArrayList();
	
	// 값 저장
	// 순차적으로 저장해주면서 list index번호를 자동으로 부여해준다.
	list.add(10);		//0
	list.add(3.14);		//1
	list.add(new AAA());//2
	list.add("문자열");	//3
	list.add(10);		//0
	
	// 값 출력
	// get(index#) return data는 모두 Object type으로 리턴된다.
	// Q. 캐스팅 해도 안해도 결과는 같은데 왜 해야된다고???
	System.out.println((int)list.get(0));
	System.out.println((double)list.get(1));
	System.out.println(list.get(2));
	System.out.println((String)list.get(3));


	// list.add(index#, elements)의 형태로 지정한 index# 넣어줄수있음.
	// addtional add로 생각해야한다. 1번위치에 삽입하게되면 기존의 index#1,2,3,4는 2,3,4,5가 된다.
	System.out.println("---------------");
	list.add(1, 15);
	System.out.println(list.get(1));
	System.out.println(list.get(2)); // 기존의 1번
	System.out.println(list.get(3));
	
	// array.length와 같은 기능. list의 사이즈를 알려준다.
	System.out.println(list.size()); 
	
	
	
	
}
}
