import java.io.FileNotFoundException;

public class FaceGenerator {

	public static void main(String[] args) throws FileNotFoundException {
	      
	new Questions();
	Questions.loadQuestions();
	Questions.askQuestions();
	Questions.scoring();
	Questions.askQuestions();
	
	}
}       