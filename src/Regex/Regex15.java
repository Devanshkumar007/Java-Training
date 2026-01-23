package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex15 {
	public static void main(String[] args) {

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("Java 123 and 456");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}