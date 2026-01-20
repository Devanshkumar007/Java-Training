package Collection_AND_WrapperClass;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();
		ts.add("Kabir");
		ts.add("Devansh");
		ts.add("Nitish");
		ts.add("Sher");
		ts.add("Cheetah");
		System.out.println("Asc: "+ts);
		TreeSet<String> dts = (TreeSet) ts;
		System.out.println("Desc: "+dts.descendingSet());
	}
}
