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
		//add up scores of all of the questions
		int total = 0;
		total += question1(console);
		total += question2(console);
		total += question3(console);
		total += question4(console);
		total += question5(console);
		total += question6(console);
		total += question7(console);
		total += question8(console);
		total += question9(console);
		total += question10(console);

		String score;
	    if (total <= 8) {
			score = "you're not lazy enough; you need to relax";
		} else if (9 <= total && total <= 15) {
			score = "you're healthily lazy; you don't do things that are unnecessary";	
		} else if (16 <= total && total <= 23) {
			score = "you're borderline lazy; be cautious and don't let things get out of hand";
		} else {
			score = "you may be so lazy that you may need help! Whoa!";
		}	
		System.out.println("Based on your answers " + score);
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
		/**
		*Second question
		*If yes, +4 points
		*If no, +0 points
		*Print question:
		*/
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
		/**
		*Third question
		*If yes, +5 points
		*If no, +0 points
		*Print question:
		*/
		System.out.print("Do you ever fall asleep with food in your mouth and wake up and eat that food for breakfast (yes or no)?");
		//Console enters answer
		//The name of string for console input is c
		String c = console.nextLine();
		if (c.equals("yes")) {
			return 5;
		} 
			return 0;

	}

	public static int question4(Scanner console) {
			//Fourth question
			//If yes, +3 points
			//If no, +0 points
			//Print question:
			System.out.print("Do you ever put perfume/cologne on instead of taking a shower (yes or no)?");
			//Console enters answer
			//The name of string for console input is d
			String d = console.nextLine();
			if (d.equals("yes")) {
				return 3;
			} 
				return 0;			
	}
	
	public static int question5(Scanner console) {
		//Fifth question
		//If yes, +4 points
		//If no, +0 points
		//Print question:
		System.out.print("Do you ever lie to people about having a car so they will feel obliged to drive you (yes or no)?");
		//Console enters answer
		//The name of string for console input is e
		String e = console.nextLine();
		if (e.equals("yes")) {
			return 4;
		} 
			return 0;	
	}		

	public static int question6(Scanner console) {
		//Sixth question
		//If yes, +3 points
		//If no, +0 points
		//Print question:
		System.out.print("Have you ever spilled food or drinks in public places, but neglected to clean it up because you knew someone at some point would do it anyway (yes or no)?");
		//Console enters answer
		//The name of string for console input is f
		String f = console.nextLine();
		if (f.equals("yes")) {
			return 3;
		} 
			return 0;			
	}
	
	public static int question7(Scanner console) {
		//Fifth question
		//If yes, +5 points
		//If no, +0 points
		//Print question:
		System.out.print("Have you ever not handed in an assignment because you \"don't own any paper or writing tools\" (yes or no)?");
		//Console enters answer
		//The name of string for console input is g
		String g = console.nextLine();
		if (g.equals("yes")) {
			return 5;
		} 
			return 0;			
	}
	
	public static int question8(Scanner console) {
		//Eighth question
		//If yes, +2 points
		//If no, +0 points
		//Print question:
		System.out.print("Do you ever leave your room messy, but claim it is because everything is in a place where you can remember (yes or no)?");
		//Console enters answer
		//The name of string for console input is h
		String h = console.nextLine();
		if (h.equals("yes")) {
			return 2;
		} 
			return 0;		
	}
	
	public static int question9(Scanner console) {
		//Ninth question
		//If yes, +2 points
		//If no, +0 points
		//Print question:
		System.out.print("Do you ever not feel like changing, and end up wearing a big sweater, so no one realizes you're wearing the same shirt as the day before (yes or no)?");
		//Console enters answer
		//The name of string for console input is j
		String j = console.nextLine();
		if (j.equals("yes")) {
			return 2;
		} 
			return 0;		
	}	
	
	public static int question10(Scanner console) {
		//Tenth question
		//If yes, +1 point
		//If no, +0 points
		//Print question:
		System.out.print("Has your computer run out of battery but you let it die anyway, because you did not want to get up, find the charger, and then plug it in (yes or no)?");
		//Console enters answer
		//The name of string for console input is k
		String k = console.nextLine();
		if (k.equals("yes")) {
			return 1;
		} 
			return 0;		
	}
	
}	
	