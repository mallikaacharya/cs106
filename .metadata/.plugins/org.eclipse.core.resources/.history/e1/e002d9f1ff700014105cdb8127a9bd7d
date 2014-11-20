/** 
 * Final Project > Questions Class
 * Essentially does the following:
 * Loads questions and answer choices from an input file (Questions.txt)
 * Prompts user for a response
 * Returns a value for each response
 * Sources used:
 * http://stackoverflow.com/questions/19141661/regular-expression0-9-issue-in-java
 */

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
        //TreeMap: key = Letter of the answer; value = Answer that corresponds to letter
        TreeMap <String, String> answerChoices;
        static int numQuestions;
        static Questions [] myQuestionList = new Questions[0];
        
        String ans;
        int valPerAns;
        //TreeMap: key = Letter of the answer; value = Answer that corresponds to letter
        TreeMap <String, Integer> answerValues;
        static int theValues;
        static Values [] myAnswerValues = new Values [0];
        
        /**
		 * This method reads the input file, creates tree map, and loops through the questions & answer choices.
		 * @param console
		 */
		public static void loadQuestions () throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("src/Questions.txt"));
        String questionText, ansLetter, ansText, ansValue;
		int i = 0, v=0;
		while (fileReader.hasNext()) {			
			questionText = fileReader.nextLine();
            myQuestionList[i] = new Questions();
            myQuestionList[i].text = questionText;
            myAnswerValues[v] = new Values();
            myAnswerValues[v].ans = ansValue;

            while(fileReader.hasNext() && !fileReader.hasNext("END")) {
            	ansLetter = fileReader.next("[A-Z]");
            	ansValue = fileReader.next("[1-4]");
                ansText = fileReader.next(); 
                //TreeMap: key = Letter of the answer; value = Answer that corresponds to letter
            	myQuestionList[i].answerChoices.put(ansLetter, ansText);
            	//TreeMap: key = Letter of the answer; value = Value of the letter
            	myAnswerValues[v].answerChoices.put(ansLetter, ansValue);
            }
			i++;
			v++;
		}
		numQuestions = i;
		myAnswerValues = v;
		}
		
		
		/**
		 * This method prompts writes out questions for the user and gets responses for each question
		 */
		public static void AskQuestions (){	
		// For Each Question
		for (int i=0;i <numQuestions ; i++) {
			// print the question
			// for each item in the TreeMap print the answerChoice			
			for (String answerLetter:  myQuestionList[i].answerChoices.keySet()) {
				System.out.println(answerLetter + ": " + myQuestionList[i].answerChoices.get(answerLetter));
			}
			myQuestionList[i].chosenAnswer = ""; // Reset the answer for this question
			// Validates answer
			while (! myQuestionList[i].answerChoices.containsKey(myQuestionList[i].chosenAnswer)) {
				System.out.println("Please enter a valid response.");

			// store the answer in myQuestions[i].chosenAnswer = console.nextline
			  
			}
		}
		}	
}	
