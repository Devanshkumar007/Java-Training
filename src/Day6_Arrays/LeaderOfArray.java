package Day6_Arrays;

import java.util.HashSet;
import java.util.Stack;

public class LeaderOfArray {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		int[] arr = {8,7,4,3,5,2};
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=arr.length-1 ; i>=0 ; i--) {
			while(!st.isEmpty() && st.peek()<arr[i]) st.pop();
			if(st.isEmpty()) st.push(arr[i]);
			hs.add(st.peek());
		}
		System.out.println(hs);
		
	}
}
