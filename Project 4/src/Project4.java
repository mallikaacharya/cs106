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
	
	public static void main(String[] args) throws FileNotFoundException {
		double checkingbalance = processChecking();
		double credit = processCredit();
		double savings = processSavings();
		
		System.out.println("The checking balance is $" + checkingbalance);
		System.out.println("The credit is $" + credit);
		System.out.println("The savings $" + savings);
	}

	public static double processChecking() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/Input.txt"));
		double checkingbalance = 0.0;
		while (input.hasNext()) {
			//Skip the date column
			input.next();
			if(input.hasNext("Checking")) {
				input.next();
				if(input.hasNext("Withdrawal")) {
					input.next();
					checkingbalance -= input.nextDouble();
				} else if(input.hasNext("Deposit")) { 
					input.next();
					checkingbalance += input.nextDouble();
				} else {
					input.next();
					input.next();
					checkingbalance += input.nextDouble();
				}
			} else {
				input.nextLine();
			}
		}
		input.close();
		return checkingbalance;			
	}
	
	public static double processCredit() throws FileNotFoundException{
	Scanner input = new Scanner(new File("src/Input.txt"));
		double credit = 0.0;
		while (input.hasNext()) {
		//Skip the date column
		input.next();
		if(input.hasNext("Credit")) {
					input.next();
					input.next();
			if(input.hasNext("Withdrawal")) {
					input.next();	
			credit -= input.nextDouble();
			} else if(input.hasNext("Deposit")) {
					input.next();
				credit += input.nextDouble();
			} else {
					input.next();
					input.next();
					credit += input.nextDouble();
				}
			} else {
			input.nextLine();
			}
		}	
		input.close();
		return credit;
}
	public static double processSavings() throws FileNotFoundException {
	Scanner input = new Scanner(new File("src/Input.txt"));
		double savings = 0.0;
		while (input.hasNext()) {
			//Skip the date column
			input.next();
			if(input.hasNext("Savings")) {
				input.next();
				if(input.hasNext("Deposit")) {
					input.next();
					savings += input.nextDouble();
				} else if(input.hasNext("Opening")) {
					input.next();
					input.next();
					savings += input.nextDouble();
				}
			} else {
			input.nextLine();
			}
		}	
		input.close();
		return savings;		
		}
	}	



	
	
			


