package MAPs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		Map mp = new HashMap();
		System.out.println(mp.put(1,"Sher"));
		System.out.println(mp.put(2,"Cheetah"));
		System.out.println(mp.put(1,"Bhalu"));
		System.out.println(mp.put(12.5,52));
		mp.put("LPU", "NAAC A++");
		System.out.println();
		
		
		System.out.println(mp.remove(12.5));
		System.out.println(mp.remove(3));
		System.out.println();
		
		
		System.out.println(mp.containsKey("LPU"));
		System.out.println(mp.containsKey(5));
		System.out.println();
		
		
		System.out.println(mp.containsValue("Sher"));
		System.out.println(mp.containsValue(7));
		System.out.println();
		
		
		System.out.println(mp.get("LPU"));
		System.out.println();
		
		
		Set entries = mp.entrySet();
		System.out.println("Set: "+entries);
		System.out.println();
		
		
		for(Object obj : entries) {
			System.out.println(obj);
		}
		System.out.println();
		
		
		
		for (Object obj : mp.keySet()) {
			System.out.println(obj);
		}
		System.out.println();
		
		
		
		Collection values = mp.values();
		for(Object obj : values) {
			System.out.println(obj);
		}
		System.out.println();
		
		
	
	}
}
