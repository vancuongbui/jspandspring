package vndemy.org.dao;
import javax.validation.constraints.Pattern;

public class User {
	@Pattern(regexp="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message="invalid email address")
	private String username;
	
	@Pattern(regexp="^.{8,}$", message="password must contains at least 8 characters")
	private String password;
	private String confirmPassword;
	private boolean enabled = true;
	private String authorities = "guest";
	
	//toString method
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	//get and set methods
	public String getUsername() {
			return username;
		}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getconfirmPassword() {
		return confirmPassword;
	}
	public void setconfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	//constructor
	public User(String username, String password, String confirmPassword, boolean enabled, String authorities) {		
		this.username = username;
		this.password = password;
		//this.confirmPassword = confirmPassword;
		this.enabled = enabled;
		this.authorities = authorities;
	}
	public User() {
		//default constructor
	}
	

}
