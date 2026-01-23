package Regex;

public class Regex_Extra {
	public static void main(String[] args) {
		
		
		// Regex for DevDevDevDevDev 
		String regex = "(Dev)*";
		System.out.println("\nRegex 1: "+regex);
		System.out.println("DevDevDevDevDev".matches(regex));
		
		//Regex for DDDDDeeeVVVVV
		String regex2 = "D*e*V*";
		System.out.println("\nRegex 2: "+regex2);
		System.out.println("DDDDDeeeVVVVV".matches(regex2));
		
		
		// Regex that passes all 
		// Aditya , AAAAddddiiiityaaa, Additttyya, dityaaaa, Adtttyyaa
		String regex3 = "A*d*i*t*y+a+";
		System.out.println("\nRegex 3: "+regex3);
		System.out.println("Aditya".matches(regex3));
		System.out.println("AAAAddddiiiityaaa".matches(regex3));
		System.out.println("Additttyya".matches(regex3));
		System.out.println("dityaaaa".matches(regex3));
		System.out.println("Adtttyyaa".matches(regex3));
		
		
		
		// Suraj, SURAJ, suraj, SuRaJ, Suuraj, Surrajj, Suraj@123 , 123Suraj , 12345 
		String regex4 = "(\\d)*S*s*U*u*R*r*A*a*J*j*@(\\d)*";
		System.out.println("\nRegex 4: "+regex4);
		System.out.println("Suraj".matches(regex4));
		System.out.println("SURAJ".matches(regex4));
		System.out.println("suraj".matches(regex4));
		System.out.println("SuRaJ".matches(regex4));
		System.out.println("Suuraj".matches(regex4));
		System.out.println("Surrajj".matches(regex4));
		System.out.println("Suraj@123".matches(regex4));
		System.out.println("123Suraj".matches(regex4));
		System.out.println("12345".matches(regex4));
		
		
		
		// Suraj, SURAJ, suraj, SuRaJ, Suuraj, Surrajj, Suraj@123 , 123Suraj , 12345 , "", uiewfbeo,iuwqfbwe
		String regex5 = ".*";
		System.out.println("\nRegex 5: "+regex5);
		System.out.println("Suraj".matches(regex5));
		System.out.println("SURAJ".matches(regex5));
		System.out.println("suraj".matches(regex5));
		System.out.println("SuRaJ".matches(regex5));
		System.out.println("Suuraj".matches(regex5));
		System.out.println("Surrajj".matches(regex5));
		System.out.println("Suraj@123".matches(regex5));
		System.out.println("123Suraj".matches(regex5));
		System.out.println("12345".matches(regex5));
		System.out.println("".matches(regex5));
		System.out.println("iufgbewu".matches(regex5));
		

		
		
	}
}
