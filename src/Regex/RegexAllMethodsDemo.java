package Regex;
import java.util.regex.*;

public class RegexAllMethodsDemo {
    public static void main(String[] args) {

        String text = "Java 123 and 456 released on 12-05-2024";

        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("-----");
        }
    }
}
