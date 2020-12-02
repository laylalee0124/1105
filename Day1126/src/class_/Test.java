package class_;

class Car{
	
	public String name;
	int speed;  // package (생략)
	protected String oil;
	private int price;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

class Point{
	public static int x; //공유
	int y;
}

public class Test {
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.name="Porche";
		car1.speed=300;
		car1.oil="gasolin";
		car1.setPrice(200000);
		System.out.println(car1.getPrice());
		//======================================
		
		Point pos=new Point();
		pos.x=10;		//가능은 하지만 쓰지x
		Point.x=100;	//static(공유) modifier이므로, static way로 접근하는게 맞음. 
		
		
				
	}

}
