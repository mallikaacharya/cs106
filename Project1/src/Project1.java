/**
 * 
 */

/**
 * @author mallikaacharya
 *
 */
		// Import declaration
import java.util.*;
		
public class Project1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Import Declaration 
		Scanner console = new Scanner(System.in);
		// TODO Auto-generated method stub
		/* Define the sum of squares */
		double sumofsquares = console.nextDouble();
		
		/* Define the number of trials */
		int trials = console.nextInt();
		
		/* Display phrase */
		System.out.print("The Standard Deviation is: " + result(sumofsquares, trials));
		
		/*Standard deviation formula */

	}
		

	public static double result(double sumofsquares, int trials) {
		/* This method is to perform calculation and return result */
		return Math.sqrt( sumofsquares ) / ( trials - 1 );

		
		
	}

}
