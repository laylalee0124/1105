package test;

public class Threadtest2 {

	public static void main(String[] args) {

		Runnable runnable = new PrimeThread2();
		Thread th = new Thread(runnable); // thread를 실행시키는건 여기서 기능함.
		th.start();
		

		for (int i = 0; i < 20; i++) {
			System.out.println("we" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
