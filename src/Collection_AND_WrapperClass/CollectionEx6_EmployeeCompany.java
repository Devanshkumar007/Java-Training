package Collection_AND_WrapperClass;


public class CollectionEx6_EmployeeCompany {
	public static void main(String[] args) {
		Employee.createObject(101, "Devansh", 100000);
		Employee.createObject(102, "Deva", 200000);
		Employee emp = new Employee(103,"Saka",10000);
		
		Company.ls.forEach(System.out::println);
	}
}


//class Employee {
//	int id;
//	String name;
//	double salary;
//	
//	public Employee(int id, String name, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		Company.ls.add(this);
//	}
//		
//	public static Employee createObject(int id, String name, double salary) {
//		Employee emp = new Employee(id,name,salary);
//		return emp;
//	}
//	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//	
//}
//
//class Company {
//	static List<Employee> ls = new ArrayList<>();
//}