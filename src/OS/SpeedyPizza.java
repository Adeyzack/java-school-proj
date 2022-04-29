package OS;

import java.util.*;
import java.text.NumberFormat;
public class SpeedyPizza {
	

	public static void main(String[] args) {
	
	String cashierName;
	double meat_tot = 0, veggie_tot = 0, cheese_tot = 0, total;
	int num_of_sale_meat_lovers, num_of_sale_veggie, num_of_sale_three_cheese;
	Scanner scan = new Scanner(System.in);
	NumberFormat formatcur = NumberFormat.getCurrencyInstance();
	Random rand = new Random();
	
	System.out.println("enter cashier name: ");
	cashierName = scan.nextLine();
	
	//cashierName = cashierName.toUpperCase();
	
	System.out.println("Enter number of sale for meat lovers");
	num_of_sale_meat_lovers = scan.nextInt();
	
	System.out.println("Enter number of sale for veggies");
	num_of_sale_veggie = scan.nextInt();
	
	System.out.println("Enter number of sale for 3 cheese");
	num_of_sale_three_cheese = scan.nextInt();
	
	meat_tot = num_of_sale_meat_lovers * 10.99;
	veggie_tot = num_of_sale_veggie * 9.50;
	cheese_tot = num_of_sale_three_cheese * 9.99;
	total = meat_tot + veggie_tot + cheese_tot;
	
	System.out.println("\n\t\t\t\t" + cashierName.toUpperCase());
	
	System.out.println("\n\t\t//---------//-------~--------\\----------\\");
	System.out.println("\n\t\t\t\t# of Sales\tPrice\tTotal");
	System.out.println("\nMeat lovers\t\t\t" + num_of_sale_meat_lovers + " \t\t" + formatcur.format(10.99) + "\t" + formatcur.format(meat_tot) );
	System.out.println("\nVeggies\t\t\t\t" + num_of_sale_veggie + " \t\t" + formatcur.format(9.50) + "\t" + formatcur.format(veggie_tot) );
	System.out.println("\n3 Cheese\t\t\t" + num_of_sale_three_cheese + " \t\t" + formatcur.format(9.99) + "\t" + formatcur.format(cheese_tot) );
	System.out.println("\n\t\t\t\tTotal\t\t\t" + formatcur.format(total) );
	
	System.out.println("\n\t\t\t\tConfirmation code: " + rand.nextInt(999999999));
	}

}
