package CollectionExample_BankingSystem;

interface BankOperations {
	public void deposit(int amout);
	public void withdraw(int amount);
	public double checkBalance();
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