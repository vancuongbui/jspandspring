package vndemy.org.dao;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Offer {
	private int id;
	
	@Pattern(regexp="[A-Za-z-\\s]{5,30}", message="Name must be between 5 and 30 characters")
	private String name;
	
	@Pattern(regexp="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String email;
	private String text;
	
	public Offer(int id, String name, String email, String text) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	public Offer() {
		
	}
	
	public Offer(String name, String email, String text) {
		this.name = name;
		this.email = email;
		this.text = text;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}
	
	
}