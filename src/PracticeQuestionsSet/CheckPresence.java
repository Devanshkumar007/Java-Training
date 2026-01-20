package PracticeQuestionsSet;

import java.util.HashSet;

public class CheckPresence {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		System.out.println(hashSet.contains(30));
		System.out.println(hashSet.contains(40));
	}
}

//4. Check Element Presence
//Check whether a given element exists in a Set.
