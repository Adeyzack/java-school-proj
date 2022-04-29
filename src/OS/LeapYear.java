package OS;

import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		
		boolean flag = false; //declare variable
		Scanner scan = new Scanner(System.in); //create scanner object
		
		//prompt and accept inputs from user
		System.out.println("Enter year number: ");
		int year = scan.nextInt();
		
		System.out.println("Enter month: ");
		int month = scan.nextInt();
		
		//determine if year is leap
		
		if(year % 100 == 0)
			flag = true;
		
		//based on input values, printout month
		switch(month) {
		case 1:
			System.out.println("Junauary in " + year + " is 31 days");
			break;
		case 2:
			if ((flag) || ((year % 4) != 0)) {
				System.out.println("February in " + year + " is 28 days");
				break;
			}if((year % 4) == 0) {
				System.out.println("February in " + year + " is 29 days");
				break;
			}
		case 3:
			System.out.println("March in " + year + " is 31 days");
			break;
		case 4:
			System.out.println("April in " + year + " is 30 days");
			break;
		case 5:
			System.out.println("May in " + year + " is 31 days");
			break;
		case 6:
			System.out.println("June in " + year + " is 30 days");
			break;
		case 7:
			System.out.println("July in " + year + " is 31 days");
			break;
		case 8:
			System.out.println("August in " + year + " is 31 days");
			break;
		case 9:
			System.out.println("September in " + year + " is 30 days");
			break;
		case 10:
			System.out.println("October in " + year + " is 31 days");
			break;
		case 11:
			System.out.println("November in " + year + " is 30 days");
			break;
		case 12:
			System.out.println("December in " + year + " is 31 days");
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
		

	}

}
