package PracticeQuestionsSet;

import java.util.Arrays;
import java.util.HashSet;

public class CountUnique {
	public static void main(String[] args) {
		String str = "A quick brown fox jumps over the lazy dog";
		HashSet<Character> hs = new HashSet<>();
		for(char c : str.toCharArray()) {
			hs.add(c);
		}
		System.out.println(hs.size());	
		
	}
}

//2. Count Unique Elements
//Write a program to count the number of unique characters in a given string using Set.