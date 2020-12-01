package thread_test;

public class Maintest1 {
	public static void main(String[] args) {
		
		Calculator cal1=new Calculator();
		
		
		User1 user1=new User1();
		user1.setCal(cal1);
		
		
		User2 user2=new User2();
		user2.setCal(cal1);
		
		User3 user3=new User3();
		user3.setCal(cal1);
		
		User4 user4=new User4();
		user4.setCal(cal1);
		
		user1.setPriority(10); // 짧은 데이터 파일 처리할때는 순서를 정하는게 크게 의미가 없음. 거의 동시 처리된다고 보면됨.
		user2.setPriority(10);  // cpu가 처리하는게 muliprocess이기 때문에 그럼.
		user3.setPriority(1);  // 큰 데이터를 처리하면 수치를 먼저 처리하게됨.
		user4.setPriority(1);
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		
		// 상기와 같이 세팅할 경우. Calculator 의 int money에 들어가는 값이 sleep하는 2초동안 바뀌어버리기 때문에. 뒤에들어온 값으로 user1, user2가 출력되버린디ㅏ.
		// 때문에 한 값을 여러 method에서 호출해서 쓰는 경우, Calculator내에 값이 저장되는 변수에 synchronized처리를 해줘야한다.
		
		
	}
}
