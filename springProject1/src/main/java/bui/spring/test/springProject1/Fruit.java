package bui.spring.test.springProject1;
import java.util.List;

public class Fruit {
	private String type;
	private List<String> fruits;
	
	//constructor
	public Fruit(String type, List<String> fruits) {
		super();
		this.type = type;
		this.fruits = fruits;
	}
	
	//get and set method
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getFruits() {
		return fruits;
	}

	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return "Fruit [type=" + type + ", fruits=" + fruits + "]";
	}
	
	//toString method
	
	
	
	
}
