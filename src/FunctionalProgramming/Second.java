package FunctionalProgramming;

@FunctionalInterface
interface Factorial {
	int findFactorial(int n);
}

public class Second {
	public static void main(String[] args) {
		Factorial f1 = new Factorial() {

			@Override
			public int findFactorial(int n) {
				if (n == 0 || n == 1)
					return 1;
				return n * findFactorial(n - 1);
			}
		};

		Factorial f2 = (a) -> {
			int prod = 1;
			while (a > 1) {
				prod *= a--;
			}
			return prod;
		};
		
		
		System.out.println(f1.findFactorial(5));
		System.out.println(f2.findFactorial(6));
		
		
		
		

	
	
	}
}
