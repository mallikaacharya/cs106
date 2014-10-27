
/**
 * @author mallikaacharya
 * Project 5: Inputs, Arrays, Constructor
 * This project analyzes data from an input file
 * The input file contains average GPAs for first and second semester over 25 years at a random institution 
 */

//Import for file operations
import java.io.*;
//Import for scanner
import java.util.*;

public class Project5 {
	public static void main(String[] args) throws FileNotFoundException	{
		int numLines = AnnualGrades.GetLines();
		AnnualGrades[] ag = new AnnualGrades[numLines];
		AnnualGrades.CreateArray(ag);

		System.out.println("The average GPA for the first semester over the course of "
		+ numLines  + " years was " + AnnualGrades.FirstSemAvg(ag));

		System.out.println("The average GPA for the second semester over the course of "
		+ numLines  + " years was " + AnnualGrades.SecondSemAvg(ag));
		
		System.out.println("The number of years of high enrollment was " + AnnualGrades.NumELHigh(ag));	
		
		System.out.println("The number of years of low enrollment was " + AnnualGrades.NumELLow(ag));	

	}

}
