package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex18 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\bd\\w+"); //    \b-> word starts with 
        Matcher m = p.matcher(
            "devansh dinesh deva dev suraj pawan mridul dibambar"
        );

        while (m.find()) {
            System.out.println(m.group());
        }
	}
}
