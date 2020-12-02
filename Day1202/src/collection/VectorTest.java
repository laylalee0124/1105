package collection;
import java.util.Vector;
public class VectorTest {
	public static void main(String[] args) {

		// ArrayList와 용법은 같은데, Synchronized method가 포함 되어 있음.
		// multi-thread상에서 안전하게 처리 가능. but, 처리시간이 느릴 수 있다.

		// 앞에 Integer선언되어있기 때문에, 뒤에 <>안을 비워도 동일하게 처리 됨.
		
		Vector<Integer> list = new Vector<>();
		list.add(3);
		list.add(4);
		list.add(10);
		list.add(12);
		
		System.out.println("list.size : "+list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========");
		// ArrayList와 마찬가지로 특정위치에 값을 넣어주면 나머지 데이터는 순차적으로 밀려남.
		list.add(0, 200);
		
		// 확장형for문:foreach - 배열(list)에서 값을 차례대로 가져와서 n에 저장해줌. 배열이 끝날때까지 반복.
		for (Integer n : list) {
			System.out.println(n);
		}
		System.out.println("==========");
		
		// set은 data를 replace하는 기능임.
		list.set(0, 5800);
		list.set(1, 8888);
		for (Integer n : list) {
			System.out.println(n);
		}
		System.out.println("==========");
		
		// remove는 data를 remove하는 기능.
		list.remove(4);
		System.out.println("list.size : "+list.size());
		
		
		
		System.out.println("*************************");
		System.out.println("*************************");
		
		Vector<String> string = new Vector<>();
		string.add("aaa");
		string.add("aaaa");
		string.add("aaaaa");
		string.add("aaaaaa");
		string.add(new String("bbb"));
		string.remove("aaaa");
		
		System.out.println(string.size());
		System.out.println("================");
		
		for(String m : string) {
			System.out.println( m );
		}
		System.out.println("================");
		
		// Vectorlist를 Array 배열형식으로 변환.
		String[] arr=string.toArray(new String[string.size()]);
		for(String z : arr) {
			System.out.println( z );
		}
	}
}
