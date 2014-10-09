



/**
 * 
 */

/**
 * @author mallikaacharya
 *
 */
import java.util.Scanner;

public class Project3 {
		/**
	 * @author mallikaacharya
	 */
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
			//The name of string for console input is answer
			
			
			String answer;
			boolean first = true;
					
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					answer = console.nextLine();
					first = false;
					}	

			while (!answer.equalsIgnoreCase("yes")
			&& !answer.equalsIgnoreCase("no"));
			
			
			if (answer.equals("yes")) {
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
			
			String b;
			boolean first = true;		
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					b = console.nextLine();
					first = false;
					}	

			while (!b.equalsIgnoreCase("yes")
			&& !b.equalsIgnoreCase("no"));
			
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

			String c;
			boolean first = true;		
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					c = console.nextLine();
					first = false;
					}	

			while (!c.equalsIgnoreCase("yes")
			&& !c.equalsIgnoreCase("no"));
			
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
				
				String d;
				boolean first = true;		
						
				do {
						if (!first)	{
								System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
						}
						d = console.nextLine();
						first = false;
						}	

				while (!d.equalsIgnoreCase("yes")
				&& !d.equalsIgnoreCase("no")); 
				
				
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
		
			String e;
			
			//while loop
			boolean first = true;		
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					e = console.nextLine();
					first = false;
					}	

			while (!e.equalsIgnoreCase("yes")
			&& !e.equalsIgnoreCase("no")); 
			
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
			String f;
			boolean first = true;		
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					f = console.nextLine();
					first = false;
					}	

			while (!f.equalsIgnoreCase("yes")
			&& !f.equalsIgnoreCase("no"));
			
			
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
			String g;
			boolean first = true;		
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					g = console.nextLine();
					first = false;
					}	

			while (!g.equalsIgnoreCase("yes")
			&& !g.equalsIgnoreCase("no"));
			
			
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

			String h;
			boolean first = true;		
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					h = console.nextLine();
					first = false;
					}	

			while (!h.equalsIgnoreCase("yes")
			&& !h.equalsIgnoreCase("no"));
			
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

			String j;
			boolean first = true;		
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					j = console.nextLine();
					first = false;
					}	

			while (!j.equalsIgnoreCase("yes")
			&& !j.equalsIgnoreCase("no"));
			
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
			String k;
			boolean first = true;		
					
			do {
					if (!first)	{
							System.out.println("Please enter \"yes\" or \"no\". Do not use spaces, numbers, or special characters.");
					}
					k = console.nextLine();
					first = false;
					}	

			while (!k.equalsIgnoreCase("yes")
			&& !k.equalsIgnoreCase("no"));
			
			if (k.equals("yes")) {
				return 1;
			} 
				return 0;		
		}
		
	}	

