package ExceptionHandling;

import java.util.Scanner;


public class Ex_CustomExceptions {
	public static void main(String[] args) throws EligibilityException {
		System.out.println("MAIN START");
		
		System.out.print("Enter age: ");
		int a = new Scanner(System.in).nextInt();
		
		if(a >=18) {
			System.out.println("Eligible AGE");
		}else {
			throw new EligibilityException("You are underage");
			// if we are usign throw we ust add throws to the method iside which we are using throw 
			// in this case we throw an object of class EligibilityException so main must throws an Eligibility Exception 
			// throws basically tells the compiler that a method can throw a exception of the desired type 
		}
		
		System.out.println("Main End");
	}
}
