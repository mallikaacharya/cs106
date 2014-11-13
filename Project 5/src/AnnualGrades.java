/**
 * 
 */

/**
 * @author mallikaacharya
 *
 */

import java.util.*;
import java.io.*;

public class AnnualGrades { 

	private int year;
	
	private double first;
	
	private double second;
	
	private String EnrollmentLevel;
	
	/**
	 * Constructor function. Sets initial values based on provided values.
	 * 
	 * @param initYear				The year of annual grade.
	 * @param initFirst				The average GPA of the first semester, per given year (all students).
	 * @param initSecond			The average GPA of the second semester, per given year (all students).
	 * @param initEnrollmentLevel	The level of student enrollment each year, including both semesters.
	 */
	public AnnualGrades(int initYear, double initFirst, double initSecond, String initEnrollmentLevel) {
		
		/* Check year . */
		if (!(initYear > 1979 
			&& initYear < 2015)
		) {
			throw new IllegalArgumentException();
		}
		
		/* Check GPA for first semester . */
		if (!(initFirst >= 0.0 
			&& initFirst <= 4.0)
		) {
			throw new IllegalArgumentException();
		}
		
		/* Check GPA for second semester . */
		if (!(initSecond >= 0.0 
			&& initSecond <= 4.0)
		) {
			throw new IllegalArgumentException();
		}
		
		/* Check Enrollment Level. */
		if (!initEnrollmentLevel.equalsIgnoreCase("High")
			&& !initEnrollmentLevel.equalsIgnoreCase("Low")
		) {
			throw new IllegalArgumentException();
		}
		
		/* Set variables. */
		this.year = initYear;
		this.first = initFirst;
		this.second = initSecond;
		this.EnrollmentLevel = initEnrollmentLevel;
	}
	/**
	 * This method gets the number of lines in the input file. 
	 * @return
	 * @throws FileNotFoundException 
	 */
	public static int GetLines () throws FileNotFoundException {
	int numLines = 0;
	Scanner fileReader = new Scanner(new File("src/InputGrades.txt")); 
	while (fileReader.hasNextLine()) {
		fileReader.nextLine();
		numLines++;		
	}
	fileReader.close();
	return numLines;
	}	
	
	/**
	 * This method creates the array. 
	 * @return
	 * @throws FileNotFoundException
	 */
	public static void CreateArray (AnnualGrades []ag) throws FileNotFoundException {
	  Scanner fileReader = new Scanner(new File("src/InputGrades.txt")); 
	
      int i = 0;

	  while (fileReader.hasNext() ) {
		
		//Read first column value (year)
		int y = fileReader.nextInt();
		
		//Read second column value (first semester)
		double f = fileReader.nextDouble();
		
		//Read third column value (second semester)
		double s = fileReader.nextDouble();
		
		//Read fourth column value (enrollment level)
		String E = fileReader.next();
		
		ag[i] = new AnnualGrades(y, f, s, E);
		i++;
	   }
	  fileReader.close();
    }
	
	/**
	 * This method gets the average of the first semester grades. 
	 * @return
	 * @throws FileNotFoundException
	 */
	public static double FirstSemAvg (AnnualGrades[]ag) throws FileNotFoundException {

	int i = 0; double sum =0.0;
	int nl = AnnualGrades.GetLines();
	while( i < nl) {
		sum += ag[i].first;
		i++;
	}
	return sum / nl;
	}
	/**
	 * This method gets the average of the second semester grades. 
	 * @return
	 * @throws FileNotFoundException
	 */
	public static double SecondSemAvg (AnnualGrades[]ag) throws FileNotFoundException {

		int i = 0; double sum =0.0;
		int nl = AnnualGrades.GetLines();
		while( i < nl) {
			sum += ag[i].second;
			i++;
		}
		return sum / nl;
		}
	/**
	 * This method gets the number of years with high enrollment. 
	 * @return
	 * @throws FileNotFoundException
	 */
	public static int NumELHigh (AnnualGrades[]ag) throws FileNotFoundException {

		int i = 0; int sum = 0;
		int nl = AnnualGrades.GetLines();
		while( i < nl) {
			if (ag[i].EnrollmentLevel.equalsIgnoreCase("High")) {
					sum ++; }
			i ++;
		}
		return sum;
		}
	/**
	 * This method gets the number of years with low enrollment. 
	 * @return
	 * @throws FileNotFoundException
	 */
	public static int NumELLow (AnnualGrades[]ag) throws FileNotFoundException {

		int i = 0; int sum = 0;
		int nl = AnnualGrades.GetLines();
		while( i < nl) {
			if (ag[i].EnrollmentLevel.equalsIgnoreCase("Low")) {
					sum ++; }
			i ++;
		}
		return sum;
	
	}
	
}	