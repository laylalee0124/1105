package test;

public class Thread_new3 {
	public static void main(String[] args) {

		//======================DAEMON THREAD===========================
		/*데몬(daemon) 스레드
		: 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
		: 주 스레드가 종료되면 데몬 스레드는 강제적으로 자동종료
		 => 워드 프로세서의 자동저장, 미디어 플레이어의 동영상 및 음악재생,가비지 컬렉터
		 
		데몬 스레드 설정 방법
		:주 스레드가 데몬이 될 스레드의 setDaemon(true)을 호출
		: 반드시 start() 메소드 호출전에 setDaemon(true)을 호출 => 그렇지 않으면 illegalThreadStateException 발생 
		*/		
		
		
		// Thread 1) MyThread 구문
		Thread th1 = new MyThread();
		th1.setDaemon(true); // th1(=MyThread)를 Daemon thread로 설정.
							 // Daemon 설정을 하지않으면 독립thread로 실행되고
							 // Daemon 설정을 하면 main thread에 종속되어 실행된다.
		th1.start();
		

		
		// Thread 2) Main thread 구문
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"종료~!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		
	}
}
