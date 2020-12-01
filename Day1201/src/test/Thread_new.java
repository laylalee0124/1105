package test;

public class Thread_new {
public static void main(String[] args) {
	
	// Runnable rab=new Runnable() // interface라서 object생성불가. 익명구현객체로만 가능.
	Runnable rab=new Runnable() {
		@Override
		public void run() {	} 
	}; 
	
	// Runnable의 method가 1개이므로, 아래와 같이 Rambda식으로 표현가능.
	Runnable rab1= () -> {};
	
	
	// 아래 표현을-----------------------------------
	Thread th=new Thread();
	
	// 익명구현객체를 활용해서 이런 식으로 표현도 가능 1
	Thread th1=new Thread(new Runnable() {
		@Override
		public void run() {	} 
	});
	
	// 익명구현객체를 활용해서 이런 식으로 표현도 가능 2
	Thread th2=new Thread(() -> {});
	
	//---------------------------------------------
	
	th.start();
	
	
}
}
