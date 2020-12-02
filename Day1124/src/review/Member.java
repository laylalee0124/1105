// Method overload  =  use same method name with/without parameter
// Method override  =  redefine method to use in new class.


package review;
import java.time.LocalDateTime;

public class Member {
	private String id;
	private String password;
	private String name;
	private String email;
	private LocalDateTime date;
	private boolean auth;
	
	
	//---------------
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//---------------
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//---------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	//---------------
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//---------------
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	//---------------
	public boolean isAuth() {		// Getter for boolean type should be use 'is'with variable name.
		return auth;				// 'is' from this is ture or faluse. 
	}
	public void setAuth(boolean auth) {
		this.auth = auth;
	}
	
	
	
}
