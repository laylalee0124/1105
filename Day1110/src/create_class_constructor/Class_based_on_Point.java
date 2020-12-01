package create_class_constructor;

public class Class_based_on_Point {
	
	
	public static void main(String[] args) {
		Point p=new Point();  //Point.java에 저장된 기본 틀을 가지고 heap의 다른 메모리영역에 값을 저장한다.
		p.x=10;
		p.y=20;
		
		System.out.printf("[x, y] : [%d, %d]\n", p.x, p.y);
		
		Point p2=new Point();
		p2.x=2;
		p2.y=1;
		
		System.out.printf("[x, y] : [%d, %d]\n", p2.x, p2.y);
		
		
		Point p3=new Point();
		p3.x=2;
		p3.y=1;
		System.out.printf("[x, y] : [%d, %d]\n", p3.x, p3.y);
		
		
		Point p4=new Point(1000);  //외부에서 데이터를 지정했을경우. int 정수 값을 Point내의 int x에 저장한다.
		System.out.printf("[x, y] : [%d, %d]\n", p4.x, p4.y);
		
	
	
	
	}

}
