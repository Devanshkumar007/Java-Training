package Day8and9_OOP;

public class MobilePhone {
	String brand;
	int storage;
	boolean is5G ;
	
	public MobilePhone() {
		brand = "Unknown";
		storage = 64;
		is5G = false ;
	}
	
	public MobilePhone(String brand, int storage, boolean is5g) {
		this.brand = brand;
		this.storage = storage;
		is5G = is5g;
	}
	public MobilePhone(String brand) {
		this();
		this.brand = brand;
	}
	
	public MobilePhone(int storage) {
		this();
		this.storage = storage;
	}
	
	
	
	@Override
	public String toString() {
		return "MobilePhone [brand=" + brand + ", storage=" + storage + ", is5G=" + is5G + "]";
	}

	public static void main(String[] args) {
		MobilePhone m1 = new MobilePhone();
		MobilePhone m2 = new MobilePhone("Samsung", 512 , true);
		MobilePhone m3 = new MobilePhone("Nokia");
		MobilePhone m4 = new MobilePhone(128);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		
		
	}
	
	
	
	
}


//A mobile phone can be initialized with default settings or custom settings.
//
//Create class Mobile with:
//	•	String brand
//	•	int storage
//	•	boolean is5G
//
//Requirements:
//	1.	Default constructor sets:
//	•	brand = “Unknown”
//	•	storage = 64
//	•	is5G = false
//	2.	Parameterized constructor sets all values.
//	3.	Use this() to chain constructors.