package test;

public class PrimeThread extends Thread{

	//메인과 같은 역할
	@Override
	public void run() {
		
		for(int i=0; i<100; i++) {
			System.out.println("Primethread"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
