package bui.spring.project3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Jungle {
	private Animal animal;
	private Food food;
	
	

	public Animal getAnimal() {
		return animal;
	}


	//@Autowired	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	
	public Food getFood() {
		return food;
	}


	//@Autowired
	public void setFood(Food food) {
		this.food = food;
	}



	public Jungle() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Jungle [animal=" + animal + ", food=" + food + "]";
	}

	@Autowired
	public Jungle(Animal animal, Food food) {
		super();
		this.animal = animal;
		this.food = food;
	}
	

}
