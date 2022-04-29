package OS;

import java.util.*;
public class oddNumbers {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);// create scanner object
		
		//declare variables
		int sum = 0;
		int number;
		//prompt user to enter numbers
		System.out.println("Enter odd nubers :");
		number = scan.nextInt();
		
		//keep adding inputs as long as condition met
			while(((number % 2) != 0)) {
				
				sum = sum + number;
				//System.out.println("Enter another num :");
				number = scan.nextInt();
				
			}	
		
		

		
		System.out.println("Sum of odd numbers :" + sum);
		

	}

}
