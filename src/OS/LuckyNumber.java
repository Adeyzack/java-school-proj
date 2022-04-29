package OS;

import java.util.*;
public class LuckyNumber {

	public static void main(String[] args) {
		
		int max = 15, min = 5; //declare variables
		Scanner scan = new Scanner(System.in);// create scanner object
		
		Random rand = new Random();//create obj from class Rndom
		
		//prompt user to inter first and last name
		System.out.println("Enter First Name");
		
		String firstName = scan.nextLine();
		
		System.out.println("Enter Last Name");
		
		String lastName = scan.nextLine();
		
		//pick random number b/n 5 and 15 inclusive
		int luckyNum = rand.nextInt(max - min + 1) + min;
		
		// concatinate ++
		System.out.println(firstName.charAt(0) + "." + lastName);
		System.out.println("Your Lucky Number is: " + luckyNum);
		

	}

}
