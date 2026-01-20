package FunctionalProgramming;


@FunctionalInterface
interface F1{
	void greet();
}

@FunctionalInterface
interface F2{
	int add(int a, int b);
}


public class First {
	public static void main(String[] args) {
		F1 ref1 = new F1() { 
			public void greet() {
				System.out.println(" Hello World! using anonymous class");
			}
		};//Anonymous Class
		
		F1 ref2 = () -> System.out.println("Hello World using lambda");
		// lambda
		
		F2 ref3 = new F2(){
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		F2 ref4 = (a,b) -> a-b ;
		
		ref1.greet();
		ref2.greet();
		System.out.println("-------------------------------");
		System.out.println("Anonymous class : "+ref3.add(10, 20));
		System.out.println("Lambda Function : "+ref4.add(10, 20));
		
		
		
	}
}
