package PracticeQuestionsSet;

import java.util.HashSet;
import java.util.Set;

public class DifferenceOfSets {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(5);
		s1.add(9);
		s1.add(7);
		Set<Integer> s2 = new HashSet<>();
		s2.add(10);
		s2.add(2);
		s2.add(8);
		s2.add(4);
		s2.add(9);
		s2.add(4);
		
		Set<Integer> diff = new HashSet<>(s1);
		diff.removeAll(s2);
		
		System.out.println(diff);
		
	}
}	
