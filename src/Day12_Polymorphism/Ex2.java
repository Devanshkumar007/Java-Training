package Day12_Polymorphism;


class Engineer{
	public Engineer() {
		System.out.println("Engineering called");
	}
	public void work() {
		System.out.println("Engineer is working");
	}
}

class CSEEngineer extends Engineer{
	
	public CSEEngineer() {
		System.out.println("CSE called");
	}

	public void coding() {
		System.out.println("CSE GUY is coding");
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Engineer obj = new CSEEngineer();
		obj.work();
		CSEEngineer obj2 = (CSEEngineer) obj ;
		obj2.coding();
	}
}



//
//college wants to manage different branches of engineers using Java inheritance.
//
//You are given a superclass Engineer and a subclass CSEEngineer.
//
//Class Structure
//Engineer
//	Method: work()
//CSEEngineer (extends Engineer)
//	Method: coding()
//
//Task :
//	Create a superclass Engineer with method work().
//	Create a subclass CSEEngineer with an additional method coding().
//	In the main method:
//		Create a CSEEngineer object.
//		Perform upcasting and call the work() method.
//		Perform downcasting and call the coding() method.
//	Add proper comments to explain each step.