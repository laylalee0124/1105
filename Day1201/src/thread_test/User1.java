package thread_test;

public class User1 extends Thread {
	
	// Calculator를 사용할수 있도록 아래와 같이 정의해주고, getter/setter 생성.
	private Calculator cal;
	
	public void setCal(Calculator cal) {
		this.setName("User 1"); 	// 이름 설정.
		this.cal=cal;
	}

	
	
	// Thread class내의 run() method를 override 해주기. 
	@Override
	public void run() {
	cal.setMoney(10000);
	}
	
	
	
	
	
}
