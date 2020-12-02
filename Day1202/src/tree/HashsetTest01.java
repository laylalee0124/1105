package tree;

import java.util.HashSet;
import java.util.Set;

class Point{
	int x;
	int y;
	
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class HashsetTest01 {
	public static void main(String[] args) {
		
		
		// 데이터 중복 저장 불가 : object는 hashcode로 데이터를 구별한다
		// 1. hashcode() 비교해서 같으면
		// 2. equals() 비교해서 같으면
		// 3. 저장 안함.

		Set<Point> set=new HashSet<>();
		
		// 총 3개의 object가 생성됨.
		set.add(new Point(10, 20));	
		set.add(new Point(10, 20));
		Point point=new Point(10, 20);
		set.add(point);
		
		System.out.println(set.size());
	}
}
