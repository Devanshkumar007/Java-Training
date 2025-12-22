package Day3;

import java.util.Scanner;

public class Weekend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		if(day.equals("Saturday") || day.equals("Sunday")) System.out.println("Weekend");
		else if (day.equals("Monday") || day.equals("Tuesday") ||  day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
			System.out.println("Weekday");
		}else {
			System.out.println("Invalid");
		}
	}
}

