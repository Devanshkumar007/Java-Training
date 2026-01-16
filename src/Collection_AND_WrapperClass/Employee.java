package Collection_AND_WrapperClass;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Company.ls.add(this);
	}
		
	public static Employee createObject(int id, String name, double salary) {
		Employee emp = new Employee(id,name,salary);
		return emp;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}


class Student{
    String name;
    Integer maths;
    Integer science;
    Integer english;
    int total = 0 ;
	public Student(String name, Integer maths, Integer science, Integer english, int total) {
		this.name = name;
		this.maths = maths==null? 0 : maths;
		this.science = science==null? 0 : science;
		this.english = english==null ? 0 : english;
		this.total = total;
	}
	
	
    
    

    
}



