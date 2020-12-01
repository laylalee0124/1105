package test;

public class MyThread extends Thread {

	Thread th = new Thread();

	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("자동저장기능 실행");
		}
	};

}
