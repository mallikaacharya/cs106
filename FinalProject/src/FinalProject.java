import java.io.FileNotFoundException;

import javax.print.attribute.standard.MediaSize.Other;


/**
 * @author mallikaacharya
 *Final Project: Face Generator: Main Method
 */

public class FinalProject{

	private static Questions otherClass;

	/**
	 * MAIN METHOD
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
	//Get everthing from other methods. 
	otherClass = new Questions();
	Questions.loadQuestions();
	Questions.scoring();
	Questions.askQuestions();
	
		
	
	}
}
