/**
 * 
 */
package bui.spring.project2;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author cuong
 *
 */
public class Jungle {
	
	/**This is the class of Jungle, using List as a field
	 * 
	 */
	//define class's fields/properties
	private Animal longest;
	private List<Animal> animals;		
	

	public Animal getLongest() {
		return longest;
	}

	public void setLongest(Animal longest) {
		this.longest = longest;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("longest: " + longest);
		sb.append("\n");	//goto next line
		sb.append("other: \n");
		
		for (Animal animal: animals) {
			sb.append(animal);
			sb.append("\n");
		}
		
		return sb.toString();
	}

	public Jungle() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor with fields
	//@Autowired
	public Jungle(Animal longest, List<Animal> animals) {
		super();
		this.longest = longest;
		this.animals = animals;
	}

}
