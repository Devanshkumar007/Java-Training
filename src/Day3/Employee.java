package Day3;

public class Employee {
	int employee_id;
	String name;
	int age;
	String dept;
	int basicSalary ;
	double salary;
	String role ;
	int allowance;
	String access ;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmployee_id() {
		return employee_id;
	}




	public String getName() {
		return name;
	}




	public int getAge() {
		return age;
	}




	public String getDept() {
		return dept;
	}




	public double getSalary() {
		return salary;
	}




	public String getRole() {
		return role;
	}




	public int getAllowance() {
		return allowance;
	}




	public String getAccess() {
		return access;
	}




	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}




	public void setAccess(String access) {
		this.access = access;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", age=" + age + ", dept=" + dept
				+ ", basicSalary=" + basicSalary + ", salary=" + salary + ", role=" + role + ", allowance=" + allowance
				+ ", access=" + access + "]";
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}




	
	
	
	
	
}	
