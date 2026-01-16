package CollectionExample_BankingSystem;

class SavingAccount extends Account {

	public SavingAccount(int accNo, String holderName, double balance) {
		super(accNo, holderName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		super.setBalance(amount + super.getBalance());
		System.out.println("Amount Credited \n Availiable Balance: "+super.getBalance());
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(super.getBalance() < amount) {
			System.out.println("Insufficient Balance");
			return;
		}
		super.setBalance(super.getBalance()-amount);
		System.out.println("Amount :"+amount+" withdrawn \n Availiable balance: "+super.getBalance());
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}

}

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