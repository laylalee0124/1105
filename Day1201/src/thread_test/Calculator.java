package thread_test;

public class Calculator {
	
	private int money;
	
	public int getMoney() {
		return money;
	}

	
	// synchronized를 쓸수있는 위치는 아래와 같다. 위치에 따라 출력내용이 달라진다.
	public /*synchronized*/ void setMoney(int money) {
		System.out.println(Thread.currentThread().getName()+" 시작");
		
		// synchronized구간에만 블락설정을 통해 synchronized시킬 수도 잇음.
		synchronized(this) {
			this.money = money;
			try {
				Thread.sleep(100);		// 1000 = 1초. 다음 구문 실행시키기 전까지 sleep(대기) 시키는 시간 설정.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"  :  "+this.money);		//현재 thread의 이름 출력 + moeny값 출력.
		}
		
		
		
	}
}
