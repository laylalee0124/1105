package reference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReference {
	public static void main(String[] args) {

		// string 1개짜리 member object를 만드는 식
		Function<String, MemberTest> func1 = MemberTest::new;
		MemberTest mt = func1.apply("what an angel");
		
		
		BiFunction<String, String, MemberTest> func2 = MemberTest::new;
		MemberTest mt1 = func2.apply("예섬", "what an evil");
		
		

	}
}
