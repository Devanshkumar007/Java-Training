package FunctionalProgramming;

import java.util.List;

public class MethodReferencingEmployee {
	public static void main(String[] args) {
		List<Employee> emps = List.of(
			new Employee(1,"Devansh",654163),
			new Employee(2,"Sher",65486),
			new Employee(3,"Cheetah",86745),
			new Employee(4,"Bhalu",97946));
		
		emps.forEach(Employee::printDetails);
		
	}
}
