package class_;

public class Student {
	
	private static int num=1000;
	int a;
	
	public static void setNum(int num) { // static way로 num을 set해줄수있음.
		Student.num=num;
		/*
		a=10; // static method 내부에서는 static memery내용만 불러올수있기 때문에, heap메모리에 저장된 int a를 불러올수 없다.
		 */
	}
	
	public static int getNum() {  // getNum에다 static을 붙이는 건 부적절함. (int a를 불러올 수 없음). 단 외부에서 불러오려면 static을 붙여워서 같게만들어줘야 불러낼수잇으므로 붙여줌 
		//a=10;			
		return num;
	}
	
	public static void main(String[] args) {
		Student.setNum(10000);
		System.out.println(Student.getNum());	
		
	}
	
}
