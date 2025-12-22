package Day3;

import java.util.Scanner;

public class ArithmaticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter operations of your choice : ");
		String operator = sc.next();
//		System.out.println("Enter the numbers : ");
		
		switch (operator) {
		case "+":{
			System.out.println("Enter your choice for number of variables :");
			int n = sc.nextInt();
			int sum = 0; 
			for(int i=0; i<n ; i++) {
				System.out.println("Enter number : ");
				int curr = sc.nextInt();
				sum+=curr ;
			}
			System.out.printf("Sum of %d numbers is : %d",n,sum);
			break;
		}
		case "-":{
			System.out.println("Enter your choice for number of variables :");
			int n = sc.nextInt();
			int diff = 0; 
			for(int i=0; i<n ; i++) {
				System.out.println("Enter number : ");
				int curr = sc.nextInt();
				if(i==0) diff = curr ;
				else diff-=curr ;
			}
			System.out.printf("Difference of %d numbers is : %d",n,diff);
			break;
		}
		case "*":{
			System.out.println("Enter your choice for number of variables :");
			int n = sc.nextInt();
			int mul = 1; 
			for(int i=0; i<n ; i++) {
				System.out.println("Enter number : ");
				int curr = sc.nextInt();
				mul*=curr ;
			}
			System.out.printf("Product of %d numbers is : %d",n,mul);
			break;
		}
		case "/":{
			System.out.println("Enter your choice for number of variables :");
			int n = sc.nextInt();
			int div = 0; 
			for(int i=0; i<n ; i++) {
				System.out.println("Enter number : ");
				int curr = sc.nextInt();
				if(i == 0 )div = curr ;
				else div /= curr ;
			}
			System.out.printf("Division of %d numbers is : %d",n,div);
			break;
		}
		default:
			System.out.println("Invalid Operation");
			break;
		}
		
	}
}
