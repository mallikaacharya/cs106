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
		
		//How many lines in input.txt?
		int numLines = 0;
		Scanner fileReader = new Scanner(new File("src/Input.txt"));
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numLines++;		
		}

		//Provision arrays to hold values based on the number of lines
		String[] dates = new String[numLines];
		String[] accounts = new String[numLines];
		String[] transactions = new String [numLines];
		double [] amounts = new double [numLines];
		
		//Populate the arrays from file
		int i = 0;
		fileReader = new Scanner(new File("src/Input.txt"));
		while (fileReader.hasNext()) {
		
		
		dates [i] = fileReader.next();	
		
		
		accounts [i] = fileReader.next();
		if (accounts [i].equals("Credit")) {
			accounts[i] = accounts[i] + " " + fileReader.next();	
		}
		
		transactions[i] = fileReader.next();
		if (transactions[i].equals("Opening")) {
			transactions[i] = transactions[i] + " " + fileReader.next();	
		}		
		amounts [i] = fileReader.nextDouble();
		
		i++;
		
		}
		fileReader.close();
		
		double checkingArray = 0.0;
		double savingsArray = 0.0;
		double creditArray = 0.0;
		
		for (i=0; i<dates.length; i++) {
			if (accounts[i].equals("Checking")) {
				if (transactions[i].equals("Withdrawal")) {
					checkingArray -= amounts[i];
				} else {
					checkingArray += amounts[i];
				}
			} else if (accounts[i].equals("Savings")) {
				if (transactions[i].equals("Withdrawal")) {
					savingsArray -= amounts[i];
				} else {
					savingsArray += amounts [i];					
				}	
			} else {
				if (transactions[i].equals("Withdrawal")) {
					creditArray -= amounts[i];
				} else { 
					creditArray += amounts[i];
				}
			}
			
		}
		System.out.println("The checking balance is $ " + checkingArray);
		System.out.println("The savings balance is $ " + savingsArray);
		System.out.println("The credit balance is $ " + creditArray);

		
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

	public static void outputFile (double checkingbalance, double savings, double credit)
		throws FileNotFoundException {
	  PrintStream output = 
	  	new PrintStream(new File("Ouput.txt"));
		output.println("The checking balance is $" + checkingbalance);
		output.println("The credit is $" + credit);
		output.println("The savings $" + savings);
	output.close();
	}
}	
	
			


