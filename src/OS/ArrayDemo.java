package OS;
import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//prompt user to enter the size of array
		System.out.println("How many Integers would you like to enter? ");
		int sizeArray = scan.nextInt();
		
		int[] randomNums = new int[sizeArray]; // declare array to store integer numbers
		//System.out.println("Enter Nums:");
		
		//enter the numbers
		for(int i = 0; i < randomNums.length; i++) {
			
			System.out.print("Enter Integer: "+ (i+1));
			randomNums[i] = scan.nextInt();
		}

		System.out.println("Enter Any number: ");
		int num2 = scan.nextInt();
		int count = 0;
		for(int i = 0; i < randomNums.length;i++) {
			if(randomNums[i] == num2) {
				count++;
			}
		}
		
		System.out.println("Number "+ num2 + " occured "+ count +" times.");
		
		//create an array 
		int[] randomNumsDouble = new int[2*sizeArray];
		
		//copy elements of one array to the another array
		for(int i = 0; i < randomNums.length; i++) {
			randomNumsDouble[i] = randomNums[i];
		}
		
		for(int i =  randomNums.length; i < randomNumsDouble.length; i++) {
			randomNumsDouble[i] = randomNums[i-randomNums.length];
		}
		System.out.print("Elements of Array randomNums: "); 
		for(int i = 0; i < randomNums.length; i++) {
			System.out.print(randomNums[i] + " ");
		}
		
		System.out.print("\nElements of Array randomNumsDouble: "); 
		for(int i = 0; i < randomNumsDouble.length; i++) {
			System.out.print(randomNumsDouble[i] + " ");
		}
		
	}

}
