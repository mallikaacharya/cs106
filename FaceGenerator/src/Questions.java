//console
import java.util.Scanner;
//Import for file operations
import java.io.*;
//Import for scanner
import java.util.*;

	/**
	 * @author Mallika Acharya
	 *Questions class:
	 *This loads and asks questions
	 *Calculates a score based on the user's answers
	 *Then it prints a picture based on the score
	 */

	public class Questions {
	  
	/**
	* Defining tree maps, etc... here, so other classes can use them. 
	*/
	        String text;
	        String chosenAnswer;
	        
	     // A class to structure the answer row
	     // Answer row is the way Questions.txt is formatted
	     // After the question there are lines:
	     // Each one has:
	     //ansLetter (letter choice of answer) tab ansValue (points per that choice) ansText (text; the answer choice)
	        
	        public class AnswerRow {
	            String ansText;
	            Integer ansValue;
	            public  AnswerRow(String t, Integer p) {
	            this.ansText = t;
	            this.ansValue = p;
	            }
	        }  
	        
	        //TreeMap: key = Letter of the answer; value = Answer that corresponds to letter
	        TreeMap <String, AnswerRow> answerChoices;
	        
	        static int numQuestions;
	        static Questions [] myQuestionList = new Questions[100];
	                
	        /**
	* This method reads the input file, creates tree map, and loops through the questions & answer choices.
	         * @param ansRow 
	* @param console
	*/
	public void loadQuestions () throws FileNotFoundException {
	//Open Questions.txt file
	Scanner fileReader = new Scanner(new File("src/Questions.txt"));
			//Create the variables that are in the file
	        String questionText, ansLetter, ansText;
	        AnswerRow ansRow;
	        Integer ansValue;
	int i = 0;
	//Loop, go through the Questions.txt file
	while (fileReader.hasNext() && i < 100) {
	/// Maximum 100 questions
	//qestionText = the question written out
	questionText = fileReader.nextLine();
	            myQuestionList[i] = new Questions();
	            myQuestionList[i].text = questionText;
	            myQuestionList[i].answerChoices = new TreeMap <String, AnswerRow>();
	            
	            //ansLetter = e.g. A,B,C,D
	            //ansValue = e.g. 1,2,3,4
	            //ansText = the written answer choice
	            while(fileReader.hasNext() && !fileReader.hasNext("END")) {
	            ansLetter = fileReader.next("[A-Z]");
	            ansValue = fileReader.nextInt();
	            ansText = fileReader.nextLine();
	            ansRow = myQuestionList[i].new AnswerRow(ansText, ansValue);
	            myQuestionList[i].answerChoices.put(ansLetter, ansRow);  
	            }
	questionText = fileReader.nextLine(); // Eats the END
	i++;
	}
	fileReader.close();
	numQuestions = i;
	}
	
	
	/**
	* This method prompts questions & respective answer choices for the user and gets responses for each question
	*/
	public void askQuestions () {
		Scanner input = new Scanner(System.in);
		
		// For Each Question...
		for (int i=0;i <numQuestions ; i++) {
		// Print the question
		System.out.println(i+1 + " " + myQuestionList[i].text);
		
		// For each item in the TreeMap print the answerChoice (ansLetter and ansText)
		for (String answerLetter:  myQuestionList[i].answerChoices.keySet()) {
		String s = myQuestionList[i].answerChoices.get(answerLetter).ansText;
		System.out.println(answerLetter + ": " + s);
		}
		
		//Loop for invalid answer
		String readAnswer;
		boolean first = true;		
		do {
				if (!first)	{
						System.out.println("Please enter a valid response.");
				}
				readAnswer = input.nextLine();
				first = false;
				}
		
		while (! myQuestionList[i].answerChoices.containsKey(myQuestionList[i].chosenAnswer));
	
		// Reset the answer for this question
		myQuestionList[i].chosenAnswer="";
		
		//If answer is valid... (If it is one of the letter choices in the file): 
		if (myQuestionList[i].answerChoices.containsKey(myQuestionList[i].chosenAnswer)) {
		myQuestionList[i].chosenAnswer = readAnswer;	
		}
		//Close input
		 input.close();
		}
	}
		
	
		
	/**
	* This method is in charge of the scores
	*/
	public int scoring () {
	//integer score, keeps track of the score
	int score = 0;
	//For each question...
	for (int i=0;i <numQuestions ; i++) {
		//Get the corresponding value for the answer choice entered (written in Questions.txt; defined as ansValue)
		//Then add that value to int score
		for (String chosenAnswer: myQuestionList[i].answerChoices.keySet()) {
		score += myQuestionList[i].answerChoices.get(chosenAnswer).ansValue;
		System.out.println(score);
		}
	}
	//return the final score
	return score;
	}
	
	
	/**
	 * This method displays an image based on score
	 */
	public void showImage () {
		
	int score = this.scoring();
	
	//If score the score is low, display Face1.jpg
	if (score <= 6) {	
	System.out.println("Low");
	
	//If score the score is medium, display Face2.jpg
	} else if (score >= 7 && score <= 9) {
	System.out.println("Medium");
	
	//If score the score is high, display Face3.jpg
	} else if (score >= 10 ) {
	System.out.println("High");
	}
	}
	}
	
	
	
	

