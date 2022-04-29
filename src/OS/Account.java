package OS;


public class Account {
	//account attributes
	long id ; 
	 double balance; 
	double interestRate; 
	 
	//constructor, initialize attributes
	public Account(){
		 id = -1;
		 balance = 5;
		 interestRate = 0;
		 
	 }
	 
	//constructor
	public Account(long ID, double bal, double intRate){
		 interestRate = intRate;
		 balance = bal;
		 
		 id = ID;
	 }
	 
	//Mutator method, update balance
	 public void withdraw(double draw) {
		 
		 if((draw > 0) && (balance > 0)) {
			 
			 balance -= draw;
		 }
		 
		
	 }
	 
	 //Mutator method, add interest to balance
	 public void addInterest(double rate) {
		 balance +=(balance*(rate/100));
		 
		// return balance;
	 }
	 
	 //accesser method, access id
	 public long getId() {
		 return id;
	 }
	 public void deposit(double depo) {
		 if((depo > 0) && (balance > 0)) {
			 
			 balance += depo;
		 }
		 //return balance;
	 }
	 //access balance
	 public double getBalance() {
		 return balance;
	 }
	 
	 //close account.
	 public void closeAcc() {
		 
		 System.out.println("Account is closed");
	 }
}
