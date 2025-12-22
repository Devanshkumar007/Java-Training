package Day3;

import java.util.Scanner;

public class AreaCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the shape foe which you want the area : ");
		String shape = sc.next();
		
		switch (shape) {
		case "Circle":
			System.out.println("Enter radius :");
			int r = sc.nextInt();
			System.out.printf("Area of circle with radius %d is %.2f :",r,3.14*r*r);
			break;
		case "Rectangle":
			System.out.println("Enter length breadth :");
			int l = sc.nextInt();
			int br = sc.nextInt();
			System.out.printf("Area of rectangle with length %d and bredth %d  is %.2f :",l,br,l*br);
			break;
		case "Square":
			System.out.println("Enter side :");
			int s = sc.nextInt();
			System.out.printf("Area of square with side %d is %d :",s,s*s);
			break;
		case "Triangle":
			System.out.println("Enter base and height :");
			int b = sc.nextInt();
			int h = sc.nextInt();
			System.out.printf("Area of Triangle with base %d and height %d is %.2f ",b,h,0.5*b*h);
			break;

		default:
			System.out.println("WRONG");
			break;
		}
	}
}
