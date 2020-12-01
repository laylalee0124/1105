package loop_sentance;

public class Array_test {

	public static void main(String[] args) {

		
		String name[]= {"A", "B", "C"};
		int ttl[]= {170, 150, 160};
		int rank[]=new int[ttl.length];
		
		
		//다시한번 뜯어보자. 3개 데이터에 랭크를 모두 1로 매겨놓은다음, ttl배열끼리 비교해서 큰수에 1, 두번재숫자에 2, 세번재 큰 숫자에3 을 반영해준다.
		for (int i=0 ;  i< ttl.length ; i++) {
			rank[i]=1;
			for (int j = 0; j < ttl.length; j++) {
				if (rank[i] < rank[j]) {
					rank[i]++;
				}
			}

		}

		// 출력구문.
		for (int i = 0; i < ttl.length; i++) {
			System.out.printf("%s %d  %d\n", name[i], ttl[i], rank[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
