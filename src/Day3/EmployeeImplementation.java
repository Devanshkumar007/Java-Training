package Day3;

import java.util.Scanner;

public class EmployeeImplementation {
	public static void main(String[] args) {
		Employee emp = new Employee() ;
		System.out.println("Enter age of employee : " );
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age <= 21 ) {
			System.out.println("Employee is not eligible to work");
			return ;
		}
		emp.setAge(age);
		
		System.out.println("Enter the name of the employee: ");
		String name = sc.next();
		emp.setName(name);
		
		
		//DEPARTMENTS AND ROLES 
		System.out.println("Select dept :\n 1.IT \n 2.HR \n 3.Finance");
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			
			System.out.println("Select roles :\n 1.Developer\n 2.Tester");
			emp.setDept("IT");
			int roles = sc.nextInt();
				switch (roles) {
					case 1:
						emp.setRole("Developer");
						emp.setAllowance(30);
						break;
					case 2:
						emp.setRole("Tester");
						emp.setAllowance(25);
						break;
			default:
				System.out.println("INVALID ROLES");
				break;
			}
			
			break;
		
		case 2:
			
			System.out.println("Select roles :\n 1.Recruiter\n 2.Payroll");
			emp.setDept("HR");
			roles = sc.nextInt();
			switch (roles) {
			case 1:
				emp.setRole("Recruiter");
				emp.setAllowance(20);
				break;
			case 2:
				emp.setRole("Payroll");
				emp.setAllowance(22);
				break;
			default:
				System.out.println("INVALID ROLES");
				break;
			}
			
			break;
		case 3:
			
			System.out.println("Select roles :\n 1.Accountant \n 2.Auditor");
			emp.setDept("Finance");
			roles = sc.nextInt();
			switch (roles) {
			case 1:
				emp.setRole("Accountant");
				emp.setAllowance(28);
				break;
			case 2:
				emp.setRole("Auditor");
				emp.setAllowance(26);
				break;
			default:
				System.out.println("INVALID ROLES");
				break;
			}
			
			break;

		default:
			System.out.println("Invalid DEPARTMENT");
			break;
		}
		
		
		if(emp.getDept()==null || emp.getRole()==null ) {
			System.out.println("Invalid department or role try again");
			return ;
		}
		
		
		System.out.println("Enter the basic salary of the employee :");
		int basic = sc.nextInt();
		emp.setBasicSalary(basic);
		emp.setSalary(basic + (basic * emp.getAllowance() / 100));
		
		
		
		if(emp.getDept().equals("IT") && emp.getSalary()>=60000) emp.setAccess("ADMIN");
		else if(emp.getSalary() >=60000) emp.setAccess("Manager");
		else emp.setAccess("Employee");
		
		
		System.out.println(emp.toString()) ;
			
	}
}
