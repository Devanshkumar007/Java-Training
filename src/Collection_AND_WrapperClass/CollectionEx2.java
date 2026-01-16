package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx2 {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		for(int i=0; i<=100 ; i++) ls.add(i);
		for(int i=0; i<ls.size(); i++) {
			if(i%10==1) System.out.println();
			System.out.print(ls.get(i)+" ");
		}
	}
}

//WAJP TO STORE AND PRINT SOMETHJING IN LIST

