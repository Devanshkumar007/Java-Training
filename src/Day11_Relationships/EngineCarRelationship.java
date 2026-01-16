package Day11_Relationships;

class Engine{
	void start() {
		System.out.println("Engine started");
	}
	void stop() {
		System.out.println("Engine stopped");
	}
}

class Car{
	private Engine engine ;
	Car(){
		Engine eng = new Engine();
	}
	
	void drive() {
		engine.start();
		System.out.println("Car is running");
	}
	
	void park() {
		engine.stop();
		System.out.println("Car is parked");
	}
}


public class EngineCarRelationship {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		c.park();
		
	}
	
}


//Composition relation is a STRONG HAS-A Relationship because the object engine is intialted inside the class only in private form no changes can be made
// to the object from outside that would interferece with the object associated with the class car 
