package bui.spring.test.springProject1;

public class Person {
	//add some attribuites to Person
	private int id;
	private String name;
	private int age;
	private Address address;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//create a new instance of person
	public Person() {
	
	}
	
	//constructing the class with fields	//can be done by right click here/source/generate constructor
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
		
	//generate a get/set method for address attribute
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//Generate toString method to return id and name
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}	
	

	public String speak() {
		return "Welcome to the first Spring framework project";
	}
	
	public void onCreate() {
		System.out.println("Person created: " + this);
		//note that, "this" right above refers to toString() method, will return a string
	}
		
}
