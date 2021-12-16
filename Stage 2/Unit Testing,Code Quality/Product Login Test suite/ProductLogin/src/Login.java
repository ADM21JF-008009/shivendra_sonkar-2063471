public class Login {
	private String userName;
	private String Password;
	public Login(String userName, String i) {
		super();
		this.userName = userName;
		Password = i;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}


}
