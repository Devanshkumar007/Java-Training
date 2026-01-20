package PracticeQuestionsSet;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoSets {
	public static void main(String[] args) {

	    Set<Integer> set1 = new HashSet<>();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);

	    Set<Integer> set2 = new HashSet<>();
	    set2.add(2);
	    set2.add(3);
	    set2.add(4);

	    Set<Integer> intersection = new HashSet<>(set1);
	    intersection.retainAll(set2);

	    System.out.println(intersection);
	 }
}


