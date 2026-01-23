package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex16 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
		Matcher m = p.matcher("DOB: 12-05-2024");

		if (m.find()) {
	  	  System.out.println(m.group());    // full match 	12-05-2024
	  	  System.out.println(m.group(1));   // first group	12
	  	  System.out.println(m.group(2));   // second group	05
	  	  System.out.println(m.group(3));   // third group	2024
		}
	}
}
