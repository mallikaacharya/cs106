
import java.io.*;
import java.util.*;

public class Competition {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
	Scanner fileReader = new Scanner(new File("src/Nemo.txt"));		

	String s = "Nemo";
	int i = Integer.parseInt( s );
	
	
		if (fileReader.hasNext("EOI")) {
			fileReader.nextLine();
		} else if(fileReader.equals(i)) {
			System.out.println("Found");
		} else {				
			System.out.println("Missing");		
	fileReader.close();
		
		
		// TODO Auto-generated method stub
	//System.out.println("\\     /\\    ");
	//System.out.println(" )   ( \')");
	//System.out.println("(   /  )");
	//System.out.println(" \\ (__)|");
	
	
	//System.out.println("|\\__/|");
	//System.out.println("|q  p| //}");
	//System.out.println("( 0 )\"\"\"\\");
	//System.out.println("|\"^\"`    |");
	//System.out.println("||_/=\\\\__|");
	
	System.out.println("NFC West        W   L  T");
	System.out.println("------------------------");
	System.out.println("Seattle         13  3  0");
	System.out.println("San Francisco   12  4  0");
	System.out.println("Arizona	        10  6  0");
	System.out.println(" ");
	System.out.println("NFC West       W   L  T");
	System.out.println("-----------------------");
	System.out.println("Seattle        8   7  1");
	System.out.println("Chicago        8   8  0");
	System.out.println("Detroit        7   9  0");
	System.out.println("Minnesota      5  10  1");

	
		
	}	
}

}
