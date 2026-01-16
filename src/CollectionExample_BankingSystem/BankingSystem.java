package CollectionExample_BankingSystem;

import java.util.ArrayList;
import java.util.ListIterator;

public class BankingSystem {
	public static void main(String[] args) {
		ArrayList<Account> acc = new ArrayList<>();
		acc.add(new SavingAccount(101,"Devansh",10000));
		acc.add(new CurrentAccount(102,"Devansh",30000));
		
		acc.add(new SavingAccount(103,"Sher",50000));
		acc.add(new CurrentAccount(104,"Sher",60000));
		
		acc.add(new SavingAccount(105,"Cheetah",80000));
		acc.add(new CurrentAccount(106,"Cheetah",90000));
		
		//remove account by account number 106;
		
		for(int i=0; i<acc.size(); i++) {
			if(acc.get(i).getAccNo()==106) {
				acc.remove(i);
				break;
			}
		}
		System.out.println("LIST OF ALL ACCOUNTS: ");
		acc.forEach(System.out::println);
		System.out.println();
		
		
		// search for account 103
		ListIterator<Account> itr = acc.listIterator();
		while(itr.hasNext()) {
			if(itr.next().getAccNo()==103) {
				System.out.println(itr.previous());
				break;
			}
		}
		
		System.out.println("LIST OF ALL ACCOUNTS: ");
		acc.forEach(System.out::println);
		System.out.println();
		
		//withdraw from 105 && deposit into 103
		itr = acc.listIterator();
		while(itr.hasNext()) {
			if(itr.next().getAccNo()==103) {
				itr.previous().deposit(1000);
				itr.next();
			}
			else if(itr.next().getAccNo()==105) {
				itr.previous().withdraw(1000);
				itr.next();
			}
		}
		
		System.out.println("LIST OF ALL ACCOUNTS: ");
		acc.forEach(System.out::println);
		System.out.println();
		
		
		
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