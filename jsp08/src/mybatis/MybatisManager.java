
/////// MybatisManager는 SqlSessionFactory 한번만 만들어 쓰도록 싱글턴으로 구현한 것임

package mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/*SqlSessionFactoryBuilder
이 클래스는 인스턴스회되어 사용되고 던져질 수 있다. SqlSessionFactory 를 생성한 후 유지할 필요는 없다. 그러므로 SqlSessionFactoryBuilder 인스턴스의 가장 좋은 스코프는 메소드 스코프(예를들면 메소드 지역변수)이다. 여러개의 SqlSessionFactory 인스턴스를 빌드하기 위해 SqlSessionFactoryBuilder를 재사용할 수도 있지만 유지하지 않는 것이 가장 좋다.

SqlSessionFactory
한번 만든뒤 SqlSessionFactory는 애플리케이션을 실행하는 동안 존재해야만 한다. 그래서 삭제하거나 재생성할 필요가 없다. 애플리케이션이 실행되는 동안 여러 차례 SqlSessionFactory 를 다시 빌드하지 않는 것이 가장 좋은 형태이다. 재빌드하는 형태는 결과적으로 “나쁜냄새” 가 나도록 한다. 그러므로 SqlSessionFactory 의 가장 좋은 스코프는 애플리케이션 스코프이다. 애플리케이션 스코프로 유지하기 위한 다양한 방법이 존재한다. 가장 간단한 방법은 싱글턴 패턴이나 static 싱글턴 패턴을 사용하는 것이다. 또는 구글 쥬스나 스프링과 같은 의존성 삽입 컨테이너를 선호할 수도 있다. 이러한 프레임워크는 SqlSessionFactory의 생명주기를 싱글턴으로 관리할 것이다.*/

// sqlSessionFactory는 SqlSessionFactoryBuilder통해서 생성한다.

public class MybatisManager {
	
	// sqlSessionFactory 변수생성
	private static SqlSessionFactory sqlSessionFactory;
	
	// getSqlSessionFactory 멧서드
	// Static way로 접근하기 위해서 static method로 구문 실행
	// getter 멧서드임.
	public static SqlSessionFactory getSqlSessionFactory() {
		// mybatis-config.xml에 설정한 내용들을 String으로 resource 변수에 저장
		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream=null;
		
		try {
			// inputstrem에 mybatis-config에 저장해둔 정보를 Resources.getResourceAsStream로 읽어들임
			inputStream = Resources.getResourceAsStream(resource);
			//sqlSessionFactory멤버 초기화
			//메서드 호출시 딱한번반 실행하도록 조건을 설정 (싱글턴패턴설정)
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// getSqlSessionFactory()를 호출하면 내부 구문 실행후 아래 값을 리턴함. 
		return sqlSessionFactory;
	}
	
	
	// 기본 생성자 접근제한을 위해 private처리
	// 생성자를 막아놔서 여기에서는 상기 구문을 구문할수 없기 때문에 멧서드를 만들어서 static way로 접근하게 함.
	private MybatisManager() {
	}

}