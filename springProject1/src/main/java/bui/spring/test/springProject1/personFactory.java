package bui.spring.test.springProject1;

public class personFactory {
	public Person createPerson(int id, String name) {
		System.out.println("Using factory-method to create Person");
		return new Person(id, name);
	}
}
