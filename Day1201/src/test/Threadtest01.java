package test;

public class Threadtest01 {

	public static void main(String[] args) {
		PrimeThread p=new PrimeThread();
		p.start();		// thread를 시작시키는 method. start를 통해서 run()method가 호출됨.
		//p.run();		// thread를 진행시키는 method.
		
		for(int i=0; i<100; i++) {
			System.out.println("Main-thread"+i);
			try {
				Thread.sleep(100); // millsecond 1/1000초.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}	
		
	}
}
