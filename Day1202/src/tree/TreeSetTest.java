package tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		
		TreeSet<Integer> set= new TreeSet<>();
		set.add(Integer.valueOf(1));
		set.add(Integer.valueOf(11));
		set.add(Integer.valueOf(111));
		set.add(Integer.valueOf(1109));
		set.add(Integer.valueOf(1111));
		set.add(Integer.valueOf(11111));
		set.add(Integer.valueOf(111111));
		
		// set.first() = 최소값. 오름차순기준으로 제일 첫번째 숫자를 반환 (제일 작은 수)
		System.out.println("set.first()"+set.first());
		
		// set.last() = 최대값. 오름차순기준으로 제일 마지막 숫자를 반환 (제일 큰 수)
		System.out.println("set.last()"+set.last());
		
		// set.lower() = 지정된 값보다 낮은 첫번째 수.
		System.out.println("set.lower()"+set.lower(1000));
		
		// set.higher() = 지정된 값보다 높은 첫번째 수
		System.out.println("set.higher()"+set.higher(1000));
		
		// set.floor() = 지정된 값 이하 첫번째 값 반환. 
		System.out.println("set.floor()"+set.floor(1110));
		
		// set.ceiling() =  지정된 값 이상 첫번째 값 반환. 
		System.out.println("set.ceiling()"+set.ceiling(1110));

		// (Ascending) Treeset 출력
		System.out.println("Ascending TreeSet 출력: ");
		for (Integer n : set) {
			System.out.print(n+ " ");
		}
		System.out.println();
		
		// 오름차순(ascendingSet)이 default값이라 method가 없음.
		// 내림차순(descendingSet)으로 변환후 출력해보기.
		NavigableSet<Integer> desc=set.descendingSet(); 
		System.out.println("Descending TreeSet 출력: ");
		for (Integer m : desc) {
			System.out.print(m+ " ");
		}
		System.out.println();
		
		// 데이터 중복 저장 불가 : object는 hashcode로 데이터를 구별한다
		// 1. hashcode() 비교해서 같으면
		// 2. equals() 비교해서 같으면
		// 3. 저장 안함.
		System.out.println(new TreeSetTest());
		System.out.println(new TreeSetTest());
		System.out.println(new TreeSetTest());
		
	}
}
