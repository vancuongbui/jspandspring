package bui.spring.project2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//create a path to the beans.xml file where it contains all the constructor for all classes
    	ApplicationContext context =new ClassPathXmlApplicationContext("bui/spring/project2/beans/beans.xml");
        
    	List<String> animalList = new ArrayList<String>();
    	animalList.add("animal1");
    	animalList.add("animal2");
    	animalList.add("animal3");
    	
    	for (String animalName: animalList) {
    		Animal animal = (Animal)context.getBean(animalName);
    		
        	System.out.println(animal);
        	
    	}
    	Jungle jungle = (Jungle)context.getBean("jungle");
    	System.out.println(jungle);
    	((ClassPathXmlApplicationContext)context).close();    	
    }
}
