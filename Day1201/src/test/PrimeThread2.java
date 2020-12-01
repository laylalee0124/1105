package test;

class Point{
	int x;
	int y;
}
public class PrimeThread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("circle"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
