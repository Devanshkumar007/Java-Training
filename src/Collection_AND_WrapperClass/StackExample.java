package Collection_AND_WrapperClass;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println("push(Object obj):Object -> push data to stack ");
		st.push(10); // push(Object obj):Object -> push data to stack 
		st.push(20);
		st.push(30);
		st.push(14);
		st.push(0);
		System.out.println(st);
		
		System.out.println("Peek():Object -> return Top:  "+st.peek());
		System.out.println("pop():Object -> removes top element from the stack : "+st.pop());
		System.out.println(st);
		System.out.println("When stack is empty and we try to use peek or pop method it will throw empty stack exception");
		
		System.out.println("isEmpty():Boolean -> true if stack is empty else false : "+st.isEmpty());
	
		st.empty();
		st.isEmpty();
	
	}
}
