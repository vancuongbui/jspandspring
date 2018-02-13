package bui.spring.project3;

public class Animal {
	//create fields
	private String name;
	private String type;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Animal() {
		// TODO Auto-generated constructor stub
	}


	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	

}
