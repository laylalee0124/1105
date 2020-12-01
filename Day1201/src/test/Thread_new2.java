package test;

public class Thread_new2 {
	public static void main(String[] args) {

		// thread 만들기
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 100; i++) {
				}
				System.out.println("AAA 종료");
			}
		}, "METHOD NAME: AAA");
		
		
		// thread 2 만들기.
		Thread th2=new Thread(()->{
			for (int i = 0; i < 100; i++) {
			}
			System.out.println("BBB 종료");
		}, "METHOD NAME: BBB");
		
		
		// 우선순위 설정. start() 이전에 설정해야함.
		th1.setPriority(1); // =Thread.MIN_PRIORITY. 설정안하면 기본 5
		th2.setPriority(Thread.MAX_PRIORITY); // =10 
		
		// 실행.
		th1.start(); // 이렇게 처리하면, 안에있는 run이 실행됨.
		th2.start(); 
	}
}
