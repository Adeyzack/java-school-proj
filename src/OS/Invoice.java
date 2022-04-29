package OS;

import java.text.NumberFormat;

public class Invoice {
	
	//declare variables
	//private final double tax = 0.06;
	String item_name;
	double unit_price;
	int quantity;
	double cost = 0, tot = 0;
	double subtotal = 0;
	
	//constructor
	public Invoice(String name, double price, int quant) {
		this.item_name = name;
		this.unit_price = price;
		this.quantity = quant;
		//this.cost = 0;
		
	}
	
	//method to get the cost of items
	public double Cost() {
		cost = unit_price * quantity;
		
		return cost;
		
	}

	//calculate sub-total before tax
	public double getsubtotal() {
		
		subtotal = subtotal + Cost();
		return subtotal;
	}
	
	public double total() {
		
		 
		 tot = getsubtotal() + getsubtotal()*0.06 ;
		 
		// System.out.println("Subtotal: " + subtotal + "\nTax: " + tax + "\nTotal: " + tot);
		return tot; 
	}
	
	public void display() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println(item_name + "\t\t" + fmt.format(unit_price) + "\t\t" + quantity + "\t\t" + fmt.format(cost));
		
	}
	

	
	public void getTotal() {
		System.out.println("Total:\t   " + tot);
	}

}
