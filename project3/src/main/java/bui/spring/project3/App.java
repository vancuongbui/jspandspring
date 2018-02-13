package bui.spring.project3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bui.spring.project3.Animal;
import bui.spring.project3.Food;
import bui.spring.project3.Jungle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("bui/spring/project3/beans/beans.xml");
        
    	//animal
    	Animal animal = (Animal)context.getBean("animal");
    	System.out.println(animal);
    	//food
    	Food food = (Food)context.getBean("food");
    	System.out.println(food);
    	
    	Jungle jungle = (Jungle)context.getBean("jungle");
    	System.out.println( jungle );
    }
}
