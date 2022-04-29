package OS;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account acct = new Account(1234,4321,3.2);
		acct.withdraw(3210);
		acct.deposit(2345);
		
		System.out.println("ID is: " + acct.getId() + "\nBalance: " + acct.getBalance());
		
	}

}
