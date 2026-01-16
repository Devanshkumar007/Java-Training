package ExceptionHandling;

import java.util.Scanner;

public class CustomExceptionExample2 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		int a = new Scanner(System.in).nextInt();
		try {
		checkEligibility(a);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main End");
		
		//in this case even though we have added throws to method checkEligibility we still need to surround 
		//that method calling with either try catch block or add throws to main method too 
		
		
	}
	
	public static void checkEligibility(int age) throws EligibilityException {
		if(age>=18) {
			System.out.println("You are eligible");
		}else {
			throw new EligibilityException("Underage");
		}
	}
}
