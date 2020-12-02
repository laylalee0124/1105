	package inheritance_learn;
	
	class Ihrtnc {
		int x = 11;
		int y = 9;
		int z = x+y;
	}
	
	class Inhritance2 extends Ihrtnc {
		int x = 10;
		int y = 100;
		int z = x+y;
	}

	class Inhritance3 extends Ihrtnc{
		int x;		
	}
	
	class DDD extends Inhritance3{ // 상속은 단일 상속만 가능. 한클래스에서는 한클래스만 단일상속가능)
		
	}

