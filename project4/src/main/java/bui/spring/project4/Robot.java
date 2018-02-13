package bui.spring.project4;

import org.springframework.stereotype.Component;

@Component
public class Robot {
	//fields:
	private String id = "Default robot";
	private String speech = "Hello";	
	
	public void speak() {
		System.out.println(id + ": " + speech);
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setSpeech(String speech) {
		this.speech = speech;
	}
	public Robot() {
		// TODO Auto-generated constructor stub
	}

}
