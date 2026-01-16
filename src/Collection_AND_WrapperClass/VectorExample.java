package Collection_AND_WrapperClass;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		for(int i: v) {
			System.out.println(i);
		}
		
		//same as ArrayList
	}
}	
