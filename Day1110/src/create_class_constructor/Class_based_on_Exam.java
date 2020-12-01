package create_class_constructor;

public class Class_based_on_Exam {
	public static void main(String[] args) {
		
		
		// 붕어빵 틀이 Exam이고,
		// 슈붕어빵, 팥붕어빵이 ex[0].method="슈", ex[1].method="빵" 이라고 이해하면 편함
		

		Exam[] ex=new Exam[3];
		
		/*
		ex[0]=new Exam(name, korscore, engscore); //Exam에다 미리 만들어놨던 생성자를 양식을 불러올수있다. */
		ex[0]=new Exam("예섬", 89, 98);
		ex[1]=new Exam("예지", 69, 81);
		ex[2]=new Exam("예주", 79, 78);
		
		
		
		/*  //복잡한 아래 구문대신 상기와 같이 간략화가능.
		ex[0]=new Exam();  //exam에 들어있는 ref변수들을 ex[0]변수에 셋팅.
			ex[0].name="이예섬";
			ex[0].korscore=80;
			ex[0].engscore=70;
			ex[0].ttl=ex[0].korscore+ex[0].engscore;
			ex[0].avg=ex[0].ttl/2.0;
			ex[0].rank=1;

		ex[1]=new Exam();
			ex[1].name="이예섬";
			ex[1].korscore=80;
			ex[1].engscore=70;
			ex[1].ttl=ex[1].korscore+ex[1].engscore;
			ex[1].avg=ex[1].ttl/2.0;
			ex[1].rank=1;
			
		ex[2]=new Exam();
			ex[2].name="이예섬";
			ex[2].korscore=80;
			ex[2].engscore=70;
			ex[2].ttl=ex[2].korscore+ex[2].engscore;
			ex[2].avg=ex[2].ttl/2.0;
			ex[2].rank=1;
		*/
			
			
		
		for(int i=0;i<3;i++) {
			System.out.println(ex[i].toString());
		}
			
		/* 복잡한 아래 문장대신 대신 상기 구문으로 출력가능. 
		for(int i=0;i<3;i++) {  //상기 로컬 변수 초기화 값과 관계없이 이미 Exam이라는 클래스내에 초기화를 선언해놨기 때문에, 해당 초기화값을 가져온다.
			System.out.print(ex[i].name + " ");
			System.out.print(ex[i].korscore + " ");
			System.out.print(ex[i].engscore + " ");
			System.out.print(ex[i].ttl + " ");
			System.out.print(ex[i].avg + " ");
			System.out.print(ex[i].rank + " \n"); }
		 */
			
			
			
		/*
		 *exam은 같은 'method'라는 pkg안에있는 class 이름이므로 사용이 가능해진다.
		Exam ex=new Exam(); //ex는 ref변수이다. 값을 지정해주지 않았으므로, default값으로 초기화해준다.
		
		ex.name="예섬";
		ex.korscore=90;
		ex.engscore=95;
		ex.ttl=ex.korscore+ex.engscore;
		ex.avg=ex.ttl/2.0;
		ex.rank=1;
		


		System.out.println(ex.engscore);
		System.out.println(ex.korscore);
		System.out.println(ex.avg);
		System.out.println(ex.rank);
		System.out.println(ex.name);
		*/
		
	}
}
