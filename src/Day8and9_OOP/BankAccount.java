package Day8and9_OOP;

public class BankAccount {
	
	static double interestRate = 5;
	double balance ;
	
	static void updateInterestRate(double newRate) {
		interestRate= newRate ;
	}
	
	
	public BankAccount() {
		super();
		this.balance = 1000;
	}


	void deposit(double amt) {
		this.balance +=amt ;
	}
	
	void withdraw(double amt) {
		if(amt > balance) System.out.println("Insufficient Balance");
		else this.balance-=amt;
	}

	public void displayAccountInfo() {
		System.out.println( "BankAccount [balance=$ " + balance + " interest rate = " + interestRate+"% ]");
	}
	
	
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		
		updateInterestRate(10);
		acc1.deposit(1000);
		acc1.withdraw(500);
		acc2.deposit(3000);
		acc2.withdraw(4000);
		
		acc1.displayAccountInfo();
		acc2.displayAccountInfo();
	}
	
	
}


//
//Q. Write a Java class named BankAccount that meets the following requirements:
//
//1. Static Variable : 
//
//interestRate (a static variable) representing the common interest rate for all accounts. Initialize it to 5.0%.
//
//2. Non-Static Variable : 
//
//balance (a non-static variable) representing the account balance. Each account starts with $1000.
//
//3. Static Method : 
//
//updateInterestRate(double newRate): A static method to update the interestRate for all accounts.
//
//4. Non-Static Methods
//
//- deposit(double amount): Adds money to the account balance.
//
//- withdraw(double amount): Deducts money from the account if sufficient funds exist. Otherwise, display "Insufficient funds!".
//
//- displayAccountInfo(): Displays the account's balance and the current interest rate.
//
//
//
//5. Main Method :
//
//- Create two bank accounts (acc1, acc2).
//
//- Update the interest rate using the static method.
//
//- Perform deposit and withdrawal operations on both accounts.
//
//- Display the account details after transactions.