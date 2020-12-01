package collection_;


// class에 generic 적용하는 방법 2.
//------------------key & value 형식으로 모든 data처리하기----------------

// Generic의 약속된 표현 방식
// T=type, K=key, V=value, E=elements


public class Product <K, V> {

	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setKey(K key) {
		this.key=key;
	}
	
	public void setValue(V value) {
		this.value=value;
	}

}
