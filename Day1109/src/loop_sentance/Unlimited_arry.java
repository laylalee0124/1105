package loop_sentance;

import java.util.ArrayList;
import java.util.HashSet;

public class Unlimited_arry {

	public static void main(String[] args) {

	//이 집합은 갯수가 있고, 중복된 데이터도 허용 함
	int arr[] = { 1, 2, 3, 4, 5 };
	double a[]=new double[10]; //10개
	
	//중복을 허용하지않는 데이터 구조 = size가 지정되어있지 않음. 계속해서 늘어날수있음.
	HashSet<Integer> set=new HashSet<>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	set.add(5);
	
	System.out.println(set.size());
	 
		
	ArrayList<Integer> list=new ArrayList<>();   //이건 사이즈를 지정하지 않아도 int형 숫자를 무제한으로 넣을수있음.	
	System.out.println(list.size());
	
	
	
	

	
	
	}

}
