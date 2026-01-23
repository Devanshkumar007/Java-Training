package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex17 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\w+)@(\\w+)(\\.\\w+)");
		Matcher m = p.matcher("mail: test@gmail.com");

		if (m.find()) {
	  	  System.out.println("User: " + m.group(1)); // User: test
	  	  System.out.println("Domain: " + m.group(2));// Domain: gmail
	  	  System.out.println("Extension: "+m.group(3));
		}
	}
}
