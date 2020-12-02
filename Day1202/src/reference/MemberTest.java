package reference;

public class MemberTest {
	
	private String name;
	private String age;
	private String id;
	
	public MemberTest() {
		System.out.println("MemberTest() 실행");
	}
	
	public MemberTest(String id) {
		System.out.println("MemberTest(String id) 실행");
		this.id=id;
	}
	
	public MemberTest(String name, String id) {
		System.out.println("MemberTest(String name, String id) 실행");
		this.name=name;
		this.id=id;
	}

}
