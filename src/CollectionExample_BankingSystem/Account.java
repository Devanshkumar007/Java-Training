package CollectionExample_BankingSystem;

abstract class Account implements BankOperations{
	private int accNo;
	private String holderName;
	private double balance;
	public Account(int accNo, String holderName, double balance) {
		super();
		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", holderName=" + holderName + ", balance=" + balance + "]";
	}
	
}
//
//Banking System (Main Question)
//
//- Create an interface BankOperations with methods deposit(), withdraw(), and checkBalance().
//
//- Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.
//
//- Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).
//
//- Store multiple accounts in an ArrayList<Account>.
//
//Demonstrate runtime polymorphism while performing operations.
//	Add features:
//	Add a new account
//	Remove an account by account number
//	Search for an account
//	Display all accounts
//	Deposit/Withdraw money into/from a chosen account