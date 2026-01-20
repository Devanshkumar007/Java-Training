package PracticeQuestionsSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveEvenSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(1,3,4,5,6,2,6,8,9,0,5,7,9,13,14,17,20));
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			if((int)(itr.next())% 2 == 0) {
				itr.remove();
			}
		}
		
		System.out.println(hs);
	}
}
