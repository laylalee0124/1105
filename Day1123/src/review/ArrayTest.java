package review;
import java.util.ArrayList;
public class ArrayTest {
	public static void main(String[] args) {

		int arr[]=new int[100];
		Person per1=new Person();
		per1.name="조인성";
		per1.birthYear=1987;
		per1.height=188;
		per1.email="aa@naver.com";
		
		Person per2=new Person();
		per2.name="누구지";
		per2.birthYear=1982;
		per2.height=178;
		per2.email="a3a@naver.com";
		
		////////////////////2차원 처럼 쓰는 ArrayList////////////////////////////////////
		ArrayList<Person> list=new ArrayList<Person>();		// Person형 data type만 넣을게요 라는 의미. 
		list.add(per1);
		list.add(per2);
		
		
		///////////////////for each - 확장형for/////////////////////////////////////////
		for( Person man : list ) { 		// Person형 data를 저장할수있는 Person class변수로 지정해줌.
			System.out.println(man.name);
			System.out.println(man.birthYear);
			System.out.println(man.height);
			System.out.println(man.email);
			System.out.println();
		}
		
		//-----------------------두번째방법-----------------------------
		Person man[]=new Person[2];
		
		 man[0]=new Person();
		 man[0].name="조인성";
		 man[0].birthYear=1987;
		 man[0].height=188;
		 man[0].email="aa@naver.com";
		
		 man[1]=new Person();
		 man[1].name="누구지";
		 man[1].birthYear=1982;
		 man[1].height=178;
		 man[1].email="a3a@naver.com";
		
		 for (Person m : man) {
			 System.out.println(m.name);
			 System.out.println(m.birthYear);
			 System.out.println(m.height);
			 System.out.println(m.email);
		 }
		
	}

}
