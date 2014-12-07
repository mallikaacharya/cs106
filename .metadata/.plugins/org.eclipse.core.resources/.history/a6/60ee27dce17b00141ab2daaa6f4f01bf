/** 
 * Final Project > Questions Class
 * Essentially does the following:
 * Loads/prints questions and answer choices from an input file (Questions.txt)
 * Prompts user for a response
 * Creates a score of responses that will be used in the Images class
 * The Images class will use the score and produce an image
 */

//console
import java.util.Scanner;
//Import for file operations
import java.io.*;
//Import for scanner
import java.util.*;

//import libraries for images
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.applet.Applet;

/**
 * @author Mallika Acharya
 *This class contains the questions for the user
 */

public class Questions {
		
		/**
		 * Defining tree maps, etc... here, so other classes can use them. 
		 */
	
        String text;
        String chosenAnswer;
        
     // Added this class, to structure the answer row
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
        static Questions [] myQuestionList = new Questions[0];
                
        /**
		 * This method reads the input file, creates tree map, and loops through the questions & answer choices.
         * @param ansRow 
		 * @param console
		 */
		public static void loadQuestions () throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("src/Questions.txt"));
        String questionText, ansLetter, ansText;
        AnswerRow ansRow;
        Integer ansValue;
		int i = 0;
		
        //Loop, go through the Questions.txt file
		while (fileReader.hasNext()) {	
			//qestionText = the question written out
			questionText = fileReader.nextLine();
            myQuestionList[i] = new Questions();
            myQuestionList[i].text = questionText;
            
            //ansLetter = e.g. A,B,C,D
            //ansValue = e.g. 1,2,3,4
            //ansText = the written answer choice
            while(fileReader.hasNext() && !fileReader.hasNext("END")) {
            	ansLetter = fileReader.next("[A-Z]");
            	ansValue = fileReader.nextInt();
                ansText = fileReader.next();
                ansRow = myQuestionList[i].new AnswerRow(ansText, ansValue);
            	myQuestionList[i].answerChoices.put(ansLetter, ansRow);  	
            }
			i++;
			fileReader.close();
		}
		numQuestions = i;
		}
		
		/**
		 * This method prompts writes out questions for the user and gets responses for each question
		 */
		public static void askQuestions () {	
		Scanner input = new Scanner(System.in);	
		// For Each Question
		for (int i=0;i <numQuestions ; i++) {
			// Print the question
			// For each item in the TreeMap print the answerChoice (ansLetter and ansText)			
			for (String answerLetter:  myQuestionList[i].answerChoices.keySet()) {
				String s = myQuestionList[i].answerChoices.get(answerLetter).ansText;
				System.out.println(answerLetter + ": " + s);
			}
			// Reset the answer for this question
			myQuestionList[i].chosenAnswer = ""; 
			// Validates answer
			while (! myQuestionList[i].answerChoices.containsKey(myQuestionList[i].chosenAnswer)) {
				System.out.println("Please enter a valid response.");

				//Store answer
				myQuestionList[i].chosenAnswer = input.nextLine();
			
			  //Close input
			  input.close();
			}
		} 
		}	

		/**
		 * This method is in charge of the scores
		 */
		public static int scoring () {
		// For Each Question
		//integer score
		int score = 0;	
		for (int i=0;i <numQuestions ; i++) {
			//Get the value for the answer choice entered (written in Questions.txt; defined as ansValue)
			for (String chosenAnswer: myQuestionList[i].answerChoices.keySet()) {
			score = myQuestionList[i].answerChoices.get(chosenAnswer).ansValue;				
			}
			score ++;
			}
			//return the final score
			return score;
	}
	
		public static void image (int score) {
			if (score >= 4 && score <= 6) {
				System.out.println("Low");
			} else if (score >= 7 && score <= 9) {
				System.out.println("Medium");
			} else if (score >= 10 && score <= 12) {
				System.out.println("High");	
		}
	}	
}