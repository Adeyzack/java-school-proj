package OS;
import java.util.Scanner;
public class AvgTemps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total = 0, average=0;
		int count = 1;
		String str = "";
		double[] temps = new double[30];
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("\nEnter temprature for Day:  1");
		for(int i =0;i < temps.length; i++) {
			
			
			temps[i] = scan.nextDouble();
			/*for(int j =0; j< count; j++) {
				total =total + temps[j];
			}
			*/
			 str = Double.toString(temps[i]);
			
			total =total + temps[i];
			average = total/count;
			System.out.println("Average Temp: " + average);
			if(temps[i] > average) {
				System.out.println("Day "+ (i+1) + " greter than Average.");
			}else if(temps[i] < average){
				System.out.println("Day "+ (i+1) + " less than Average.");
			}else {
				System.out.println("Day "+ (i+1) + " equals to the Average.");
			}
			
			count++;
			
			System.out.println("\nEnter temprature for Day: " + (i+2));
		}
		/*
		for(int i = 0; i < temps.length; i++) {
			total += temps[i];
		}
		
		average = total/temps.length;
		System.out.println("Average: " + average);
		for(int i= 0; i < temps.length; i++) {
			if(temps[i] > average) {
				System.out.println("Day "+ (i+1) + " greter than Average.");
			}else if(temps[i] < average){
				System.out.println("Day "+ (i+1) + " less than Average.");
			}else {
				System.out.println("Day "+ (i+1) + " equals to the Average.");
			}
		}
*/
	}

}
