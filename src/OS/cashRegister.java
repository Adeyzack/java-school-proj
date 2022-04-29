package OS;
import java.util.*;
import java.text.NumberFormat;
public class cashRegister {

	public static void main(String[] args) {

		//declare variables
	     final double  tax = 0.06;
		String choose = "y";
		int ch =1, day, mon, year;
		double total = 0,subtotal = 0, price;
		int count = -1, quantity;
		
		//create objects
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		Invoice[] arr = new Invoice[30];
		LineItem lItem = new LineItem();
		
		//prompt user for date input
		System.out.println("Date of Purchase: (mm dd yy)");
		mon = scan.nextInt();
		day = scan.nextInt();
		year = scan.nextInt();
		//varfy if date is correct or not.
		//and prompt user to re-enter if input is wrong
		while(((mon <= 0) || (mon>12)) || ((day <= 0) || (day>31))) {
			System.out.println("Wrong input!!!\nEnter Date of Purchase again: (mm dd yy)");
			mon = scan.nextInt();
			day = scan.nextInt();
			year = scan.nextInt();
		}
		
		//allow user to enter item informations as much as needed.
		do {
			count++;
			String item ;
			System.out.println("Enter the item name: ");
			item = scan.next();
			
			System.out.println("Enter The unit price: ");
			price = scan.nextDouble();
			
			
			System.out.println("Enter the quantity: ");
			quantity = scan.nextInt();
			
			arr[count] = new Invoice(item,price,quantity);
			System.out.println("Do you want to continue(y/n): ");
			choose = scan.next();
			
			while(!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n")){
				System.out.println("WRONG INPUT!!\nDo you want to continue(y/n): ");
				choose = scan.next();
			}
			
			
		}while(choose.equalsIgnoreCase("y"));
			
		//call display method 
		lItem.display(mon, day, year);

		//
		for(int i =0; i <= count ; i++) {
			arr[i].Cost(); //get cost total cost for each items
			 subtotal += arr[i].getsubtotal(); //add cost of each items
			arr[i].display();//display unit cost, quantity and cost of all the items.		
		}
		
		System.out.println("====================================================");
		
		 System.out.println("***See you soon***\t\t\tSubtotal: " + fmt.format(subtotal));
		 System.out.println("\t\t\t\t\tTax:      " + fmt.format(tax*subtotal));
		 System.out.println("\t\t\t\t\tTotal:    " + fmt.format((subtotal + subtotal*0.06)));
	}

}
