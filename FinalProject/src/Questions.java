//console
import java.util.Scanner;
//Import for file operations
import java.io.*;
//Import for scanner
import java.util.*;

/**
 * @author Mallika Acharya
 *This class contains the questions for the user
 */

public class Questions {
		
		/**
		 * Defining things here, so other classes can use them. 
		 */
	
        String text;
        String chosenAnswer;
        TreeMap <String, String> answerChoices;
        static int numQuestions;
        static Questions [] myQuestionList = new Questions[0];
        
        /**
		 * This method reads the input file, creates tree map, and loops through the questions & answer choices.
		 * @param console
		 */
		public static void loadQuestions () throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("src/Questions.txt"));
        String questionText, ansLetter, ansText;
		int i = 0;
		while (fileReader.hasNext()) {			
			questionText = fileReader.nextLine();
            myQuestionList[i] = new Questions();
            myQuestionList[i].text = questionText;
            while(fileReader.hasNext() && !fileReader.hasNext("END")) {
            	ansLetter = fileReader.next("[A-Z]");
                ansText = fileReader.next();          
            	myQuestionList[i].answerChoices.put(ansLetter, ansText);
            }
			i++;
		}
		
		numQuestions = i;
		}
		
		
		/**
		 * This method prompts writes out questions for the user and gets responses for each question
		 */
		
		public static void AskQuestions (){
		
		// For Each Question
		for (int i=0;i <numQuestions ; i++) {
			// print the question
			// for each item in the treemap print the answerChoice
			myQuestionList[i].chosenAnswer = ""; // Reset the answer for this question
			// loop
			while (! myQuestionList[i].answerChoices.containsKey(myQuestionList[i].chosenAnswer)) {
			// read from console the answer
			// validate the answer
			// store the answer in myQuestions[i].chosenAnswer
			}
		}
		}
		
		
			
			
			
			
			Scanner theirAnswer = new Scanner(System.in);
			for(String element: q){
            System.out.println(element + theirAnswer);
		}	
			
		
		}	
		
		
		
		
		
		
		
		
		
		
		
		public static void QuestionsArray (Scanner console) {	
		
		private int[] questionsArray = new String[2] {
			
		questionsArray[0] = "Which of the following do you prefer to eat for breakfast?"; 
		questionsArray[1] = "What would you typically do on a Sunday morning?";
		questionsArray[2] = "If you could live anywhere, where would it be?";
				
		;
		
		/**
		 * This method has a multidimensional array of the answer choices to each question. 
		 */
		public static void AnswersArray (Scanner console) {
		
		String AnswersArray [][];
		AnswersArray[3][1];
		AnswersArray[1][1] = "A Black coffee \nB Fruit bowl \nC Pancakes with syrup \nD Leftover Pizza";
		AnswersArray[2][1] = "A Lay in bed and watch TV \nB Go on a 5K run \nC Walk the dog \nD Cook brunch";
		AnswersArray[3][1] = "A On a farm \nB Within a mountain range, like the Alps \nC On a beach in California \nD In a city like New York";
		}
		}
		
		
		/**
		 * This method creates an array that gives a value to each question.
		 * @param console
		 * http://math.hws.edu/javanotes/c7/s5.html
		 */
		public static void AnswerValueArray (Scanner console) {
		
		String[] answerValueArray = new String[4];
		answerValueArray[1] = "A";
		answerValueArray[2] = "B";
		answerValueArray[3] = "C";
		answerValueArray[4] = "D";		
		
		}
	
		/**
		 * NOTES TO SELF:
		 *  
		 * Questions Class: 
		 *  Make arrays for questions, answer choices and values for A, B, C, D (e.g. A = 1, B = 2, etc...) 
		 *  Print question array + Answer array.
		 *  If I can somehow make this a loop, so it doesn't have to be written for each question, make one.
		 *  A do while loop for invalid answer
		 *  Return a value for each type of answers; not in a redundant way, just one generic one that functions for each question
		 * 
		 * Input Class:
		 *  Will read the input file containing the information about the jpgs, and load images?
		 *  USE ARRAYS!!!
		 *  Use import java.util.*;
		 *  Use import java.io.*;
		 *  
		 * Image class:
		 *  Will print the image that corresponds to a specific answer (A,B,C,D) for each question probably (if/else)
		 *  Use import java.awt.* (Jpanel)
		 *  Source: http://www.coderanch.com/t/550294/GUI/java/put-image-JPanel
		 *  The source above gives sample code of jpegs being inerted at specific points
		 * 
		 * Main class/method:
		 *  Print the final image
		 *  Can't be > 10 lines of code
		 */
		
		}
		
	}	
	}		
		
}

