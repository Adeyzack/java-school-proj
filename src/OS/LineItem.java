package OS;

import java.util.*;

public class LineItem {

	int num1, num2, year, date, invoiceNum;
	String  month = "";
	public LineItem() {

		this.invoiceNum = 0;
		
	}
	
	//generate a random five digit invoice number
	public int generateInvoiceNumber() {
		Random generator = new Random();
		num1 = generator.nextInt(90000) + 10000;
		return num1;
	}
	
	//convert numerical month value to alphabet
	public String date(int user_mon) {
		
		switch(user_mon) {
		
		case 1:
			month = "JAN";
			break;
		case 2:
			month = "FEB";
			break;
		case 3:
			month = "MAR";
			break;
		case 4:
			month = "APR";
			break;
		case 5:
			month = "MAY";
			break;
		case 6:
			month = "JUN";
			break;	
		case 7:
			month = "JUL";
			break;
		case 8:
			month = "AUG";
			break;
		case 9:
			month = "SEP";
			break;
		case 10:
			month = "OCT";
			break;
		case 11:
			month = "NOV";
			break;
		case 12:
			month = "DEC";
			break;
		default:
			System.out.println("Incorrect Input");
		
		}
		return month;
		
	}
	
	//display outputs
	public void display(int mon, int user_day, int user_yr) {
		
		
		System.out.println("====================================================");
		System.out.println("Invoice #\t\t\t Invoice Date");
		System.out.println(generateInvoiceNumber() + "\t\t\t\t" + date(mon) +"-"+ user_day +"-" + user_yr);
		System.out.println("====================================================");
		System.out.println("\t\t"+"\\\\\\\\\\" + "Description/////");
		System.out.println("====================================================");
		System.out.println("Product      Unit Price       Quantity        Cost");
		System.out.println("====================================================");
	}
}
