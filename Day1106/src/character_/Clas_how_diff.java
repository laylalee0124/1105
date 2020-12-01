package character_;

public class Clas_how_diff {

	int classv = 0; // 클래스 변수 (전역변수)

	public static void main(String[] args) {

		int localv = 1; // 로컬 변수
		int classv = 2; // 로컬 변수 <- 'main'이라는 영역내에서 재선언 가능. 이 값은 'main'을 벗어나면 없어짐.
		System.out.println(classv);

	}

	public void newpage() {
		int calssv=3;
		System.out.println(classv);
	}

	public Clas_how_diff() {   //이건 클래스를 불러오는건가?
		int calssv=4;
		System.out.println(classv);

	}
}