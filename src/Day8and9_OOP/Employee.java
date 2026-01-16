package Day8and9_OOP;

public class Employee {
	int id ;
	Address address;
	
	public Employee(int id,  Address add) {
		this.id = id ;
		this.address = add ;
	}
	
	public Employee(Employee e) {
		this.id = e.id ;
		this.address = e.address;
	}

	public void details() {
		System.out.println("Employee [id=" + id + ", address=" + address.city + "]");
	}
	

	public static void main(String[] args) {
		Employee e1 = new Employee(1, new Address("Haridwar"));
		Employee e2 = new Employee(e1);
		
		e2.address.city = "Phagwara";
		
		
		e1.details();
		e2.details();
	}
	
}

class Address{
	String city ;
	public Address(String city) {
		this.city = city ;
	}
}


//A company stores employee details along with address information.
//Question
//Create classes:
//	1. Address → city
//	2. Employee → id, Address address
//Add:
//	parameterized constructor
//	copy constructor that performs shallow copy
//Steps:
//	1	Create employee emp1
//	2	Create emp2 using copy constructor
//	3	Change city via emp2
//	4	Print city of both employees