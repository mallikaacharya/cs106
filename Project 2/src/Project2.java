import java.util.Scanner;

/**
 * @author mallikaacharya
 */
public class Project2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Import Declaration 
		Scanner console = new Scanner(System.in);
		//call questions
		//pass console
		int total = 0;
		total += question1(console);
		total += question2(console);
	}



	public static int question1(Scanner console) {
		//First question
		//If yes, +4 points
		//If no, +0 points
		//Print question:
		System.out.print("Do you bribe other people to do your laundry for you (yes or no)?");
		//Console enters answer
		//The name of string for console input is a
		String a = console.nextLine();
		if (a.equals("yes")) {
			return 4;
		} 
			return 0;
	}	
	
	public static int question2(Scanner console) {
		//Second question
		//If yes, +4 points
		//If no, +0 points
		//Print question:
		System.out.print("Do you record your classes so you don't have to pay attention (yes or no)?");
		//Console enters answer
		//The name of string for console input is b
		String b = console.nextLine();
		if (b.equals("yes")) {
			return 4;
		} 
			return 0;	
	}
	
	public static int question3(Scanner console) {
		//Third question
		//If yes, +5 points
		//If no, +0 points
		//Print question:
		System.out.print("Do you ever fall asleep with food in your mouth and wake up and eat that food for breakfast (yes or no)?");
		//Console enters answer
		//The name of string for console input is c
		String c = console.nextLine();
		if (c.equals("yes")) {
			return 5;
		} 
			return 0;
	}
}

	
			