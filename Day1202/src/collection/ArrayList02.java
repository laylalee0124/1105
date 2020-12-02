package collection;

import java.util.ArrayList;
import java.util.List;



//=============class를 활용한 ArrayList 활용 방법================//

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}



public class ArrayList02 {
	public static void main(String[] args) {
		
		// 이렇게 둘다 생성 가능.
		// 일반 데이터 타입보다 이런식으로 class를 활용한 data type활용을 많이 하게될듯.
		ArrayList<Person> list = new ArrayList<>();
		List<Person> list1 = new ArrayList<>();
		
		// 굳이 이렇게 따로 객채 표현안하고
		Person person1=new Person("하하", 20);
		list.add(person1);
		
		// 이렇게 표현 가능
		list.add(new Person("우하하", 80));
		
		for (Person z : list) {
			System.out.println(z.name +" "+ z.age);
		}
		
	}
}
