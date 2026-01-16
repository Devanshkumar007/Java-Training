package Collection_AND_WrapperClass;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println("Valid Parenthesis "+s+": "+check(s));
		
	}
	
	public static boolean check(String s) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char curr= s.charAt(i);
			if(curr=='(' || curr=='{' || curr=='[') st.push(curr);
			else if(st.isEmpty()) return false;
			else if(curr==')' && st.peek()!='(') return false; 
			else if(curr=='}' && st.peek()!='{') return false; 
			else if(curr==']' && st.peek()!='[') return false;
			else st.pop();
		}
		return st.isEmpty();
	}
}
