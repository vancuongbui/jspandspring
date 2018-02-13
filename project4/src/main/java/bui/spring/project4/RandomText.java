package bui.spring.project4;

import java.util.Random;

public class RandomText {
	
	private static String[] texts = {	//define an array of string
			"I will be back",
			"get out!",
			"I want your clothes, boots and motocycle"
	};
	
	public String getTexts() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}

	public RandomText() {
		// TODO Auto-generated constructor stub
	}

}
