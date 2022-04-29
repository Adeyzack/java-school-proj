package OS;
import java.util.*;
public class CompleteNumbers {

	public static void main(String[] args) {
		

		int count = 0;
		for(int i = 1; i<= 30000; i++) {
			int sum = 0;
			boolean flag = false;
			for(int j = 1; j <= i; j++) {
				if((i % j) == 0) {
					sum += j;

				}
				if(sum == i) {
					flag = true;
					
				}
				
				
			}
			if (flag == true) {
				System.out.print(" " + i + ",");
				count++;
			}
			//sum = 0;
			
		}
		System.out.println();
		System.out.println("\ntotal number of complete numbers b/n 1 and 30,000: " + count);
	}

}
