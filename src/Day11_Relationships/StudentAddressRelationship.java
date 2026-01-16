package Day11_Relationships;



class Student{
	int id ;
	String name ;
	double marks;
	Address address ;
	public Student(int id, String name, double marks, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
}

class Address{
	String city ;
	String state;
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
}



public class StudentAddressRelationship {
	public static void main(String[] args) {
		Address ad = new Address("Haridwar","Uttarakhand");
		Student st = new Student(1,"Devansh",90.00,ad);
		
		System.out.println(ad);
		System.out.println(st);
	}
}





// Aggregation is a weak has a relationship if we change address ad from outside it would affect the student associated object ad also that is why its weak 


// empty diamond is used to display this  
