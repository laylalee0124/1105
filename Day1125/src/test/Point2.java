package test;

public class Point2 {

	public static void main(String[] args) {

		/////////// question : 피타고라스정리를 이용해서, x1,y1 에서 x2,y2까지의 거리 나타내기///////////
		/*
		 * a2+b2=c2 c=r(a2+b2)
		 * 
		 * 
		 * x1, y1 = 0, 0 x2, x2 = 2, 2
		 */

		// x1,y1좌표 위치
		Point pos = new Point();
		System.out.println("pos.x" + pos.x);
		System.out.println("pos.y" + pos.y);

		// x2,y2 좌표 위치
		Point des = new Point();
		des.x = 2;
		des.y = 1;
		System.out.println("des.x" + des.x);
		System.out.println("des.y" + des.y);

		System.out.println("첫번 째 좌표 [x,y] : [" + des.x + " + " + des.y + "]");

		
		System.out.println("=======================");
		
		// 내가 한거
		double c2 = ((des.x - pos.x) * (des.x - pos.x)) + ((des.y - pos.y) * (des.y - pos.y));
		System.out.println("a*a + b*b = "+c2);
		System.out.printf("loot 값은 = %.6f\n", Math.sqrt(c2));
		
		
		System.out.println("=======================");
		
		
		// 선생님이 한거
		int a = des.x - pos.x;
		System.out.println("a =" +a); // 2

		int b = des.y - pos.y;
		System.out.println("b =" +b); // 2

		// c = lt(a^2 + b^2)
		double dist = Math.sqrt((double)a * a + Math.pow(b,2 ));
		System.out.println("distance ="+dist);

		// System.out.println(Math.sqrt(y));

	}

}
