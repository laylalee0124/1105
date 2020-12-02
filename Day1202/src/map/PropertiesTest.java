package map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
public static void main(String[] args) {
	
	Properties prop=new Properties();
	//prop.load(inStream);  둘다 가능 byte type이냐 char type이냐의 차이
	//prop.load(reader);
	
	InputStream is=PropertiesTest.class.getResourceAsStream("propdata.properties");
	try {
		prop.load(is);
		System.out.println("파일 읽기 성공");
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	System.out.println( prop.size() );
	
	String key=(String)prop.get("key");
	String username=(String)prop.get("username");
	String password=(String)prop.get("password");
	
	
	Set<Object> keys=prop.keySet();
	
	for (Object obj : keys) {
		System.out.println(obj+" : "+prop.get(obj));
	}
	
	String driver=prop.getProperty("driver");
	System.out.println(driver);
	
	
	
}
}
