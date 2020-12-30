package dto;


public class MemberRequestDTO {
	
	private String email;
	private String pass;
	private String name;
	private String ip;
	//////////////////////////////////////////////////////////////////////
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	///////////////////////////////////////////////////////////////////
	public MemberRequestDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberRequestDTO(String email, String pass, String name, String ip) {
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.ip = ip;
	}
	
	
	
	

}
