package Day7;

public class BankLoan {
	public static void main(String[] args) {
		System.out.printf("%.2f\n",loan(200000,5,"HOME"));
//		System.out.println(Math.pow(107/100.00,5));
	}
	
	public static double loan(double principle) {
		return 108*principle/100.00 ;
	}
	public static double loan(double principle, int years) {
		return principle* Math.pow(1.08,years);
	}
	public static double loan(double principle, int years , String loanType) {
		
		int r = 8 ;
		if(loanType.equals("HOME")) r = 7;
		if(loanType.equals("AUTO")) r = 9;
		if(loanType.equals("PERSONAL")) r = 12;
		
		double amount = principle * Math.pow( ((100+r) /100.00) ,years);
		
		return amount ;
	}
}


//Loan Payable Amount Calculation
//
//Question Description
//
//A bank wants to compute the payable loan amount under different interest structures.
//
//Implement overloaded methods named loan to calculate the final payable amount based on the provided inputs.
//
//Overloads Required
//double loan(double principal)
//double loan(double principal, int years)
//double loan(double principal, int years, String loanType)
//
//
//Rules
//Base Interest
//	Default interest is 8% simple interest when only principal is provided.
//With Years
//	When years are provided, interest is compounded annually at 10%.
//With Loan Type
//	HOME → compound annually at 7%
//	AUTO → compound annually at 9%
//	PERSONAL → compound annually at 12%
//	
//Hardcoded Data Set to Use
//	Principal = 200000
//	Years = 5
//	Loan Type = "HOME"
//	
//Expected Output
//	HOME loan compound rate = 7%
//	Amount = 200000 * (1.0.07)^5 = 280510.35