package Day3;

import java.util.Scanner;

public class Fruits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fruit = sc.nextLine();
		
		switch (fruit) {
		case "Apple":
		{	System.out.println("Apples are rich in fibre and Vitamin C");
			break;
		}	
		case "Banana":
		{	System.out.println("Bananas are a great source of potassium");
			break;
		}
		case "Mango":
		{System.out.println("Mangoes are the king of fruits");
			break;
		}
		case "Orange":{
			System.out.println("Oranges are packed with Vitamin C");
			break;
		}
		default:{
			System.out.println("Sorry I dont have information about that");
			break;
		}
		}
		
		
	}
}
