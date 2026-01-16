package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExArithmatic_AND_InputMismatch {
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Valuer of a");
			int a = sc.nextInt();
			System.out.print("Enter Valuer of b");
			int b = sc.nextInt();
			System.out.println("A/B = "+a/b);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block executed");
		}
		
		System.out.println("Main End");
		
	}
}
