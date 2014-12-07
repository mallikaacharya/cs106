import java.io.FileNotFoundException;

/**
 * @author mallikaacharya
 *Final Project: Face Generator: Main Method
 */

public class FinalProject{

	/**
	 * MAIN METHOD
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	 public static void main(String[] args) throws FileNotFoundException {
			new Questions();
			Questions.loadQuestions();
			Questions.scoring();
			Questions.askQuestions();
			
	 }
}
