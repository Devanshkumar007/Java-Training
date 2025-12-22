package Day3;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String marks = sc.next();
		
		switch (marks) {
		case "A":{
			System.out.println("Excellent");
			break;
		}
		case "B":{
			System.out.println("Good");
			break;
		}
		case "C":{
			System.out.println("Fair");
			break;
		}
		case "D":{
			System.out.println("Pass");
			break;
		}
		case "F":{
			System.out.println("Fail");
			break;
		}
		default:{
			System.out.println("INVALID GRADE");
			break;
		}
		}
	}
}	
