/**
 *Project 4 File Processing 
 */

/** 
 * @author mallikaacharya
 */

//For file operations
import java.io.*;
//For scanner
import java.util.*;

public class Project4 {
	/**
	 * @param args
	 */
	public static void main(String[] args)
		throws FileNotFoundException {
	Scanner input = new Scanner(new File("src/Input.txt")); 
	double checkingbalance = processChecking();
	// double credit = processCredit();
	// double savings = processSavings();		
	}


	public static double processChecking(){
	Scanner input = new Scanner(new File("src/Input.txt"));
		double checkingbalance = 0.0;
		while (input.hasNext()) {
			//Skip the date column
			input.next();
			if(input.hasNext("Checking")) {
				input.next();
				if(input.hasNext("Withdrawl")) {
				input.next();	
				checkingbalance -= input.nextDouble();
				} else if(input.hasNext("Deposit")) 
				input.next();
					checkingbalance += input.nextDouble();
				} else {
					}
				}			
		input.close();
		return checkingbalance;			
		}
	
}

