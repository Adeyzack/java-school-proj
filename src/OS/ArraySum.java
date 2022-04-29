package OS;
import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		//declare variables
		int row, column, row_total = 0, total = 0;
		Scanner scan = new Scanner(System.in);
		
		//prompt user to enter matrix size
		System.out.println("Enter row: ");
		row = scan.nextInt();
		System.out.println("Enter column: ");
		column = scan.nextInt();	
		
		//declare 2d matrix
		int[][] matrix = new int[row][column];
		
		//fill up the matrix
		for(int i = 0; i < row; i++) {
			System.out.println("Please Enter Row: " + (i+1));
			for(int j = 0; j < column; j++) {
				System.out.println("Column: " + (j+1));
				matrix[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < column; j++) {
				//add values for each rows
				row_total += matrix[i][j];
				//add all elements of the matrix
				total += matrix[i][j];

			}
			System.out.println("Your total for row : " + (i+1) + " is: " + row_total);
			//reset the total value of each row to zero
			row_total = 0;
		}
		System.out.println( "\nYour total for the " + row +"X" + column + " matrix is: "+ total);
		
	}

}
