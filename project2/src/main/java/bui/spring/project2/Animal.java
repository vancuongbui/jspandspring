/**
 * 
 */
package bui.spring.project2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/**
 * @author cuong
 *
 */
public class Animal {

	/**
	 * 
	 */
	private String name;
	private String type;
	

	//The following are set/get fields of the class
	public String getName() {
		return name;
	}
	
	//annotation with autowired
	//@Autowired	
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	
	//annotation with autowired
	//@Autowired
	public void setType(String type) {
		this.type = type;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
		
	}
	
	//construct an instance of the class
	//@Autowired
	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	//special method toString() = return this
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	
	

}
