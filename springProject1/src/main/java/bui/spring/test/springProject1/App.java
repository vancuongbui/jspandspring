package bui.spring.test.springProject1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//the following code is to obtain info from an beans.xml file
    	ApplicationContext context =new ClassPathXmlApplicationContext("bui/spring/test/springProject1/beans/beans.xml");		//import first
    	
    	//now, the code is to look for an instance of a given class based on id (from <bean>)
    	Person person1 = (Person)context.getBean("person");	//look for the id="person" from beans.xml
    	Person person2 = (Person)context.getBean("person");		
    	
    	Address address = (Address)context.getBean("address");	//look for id="address"
    	
    	
    	//set age for person1 to make it different from person2
    	person2.setAge(40);
    	
    	//set address
    	Address newAddress = new Address("3000","1st Burk street");
    	    	
    	person2.setAddress(newAddress);
    	System.out.println( person1 );
    	System.out.println( person2 );
    	
        
        ((ClassPathXmlApplicationContext)context).close();     //close the "context"
    }
}
