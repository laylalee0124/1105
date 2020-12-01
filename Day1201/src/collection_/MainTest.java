package collection_;

public class MainTest <K, V> {
public static void main(String[] args) {
	
	// Product의 class type이 여기에서 확정됨.
	Product<Integer,String> prd=new Product<Integer,String>();
	
	prd.setKey(1);
	prd.setValue("하하");

	System.out.println(prd.getKey());
	System.out.println(prd.getValue());
}
}
