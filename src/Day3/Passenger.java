package Day3;

public class Passenger {
	String name ;
	int age ;
	String travelType;
	String travelClass;
	double multiplier;
	double basePrice;
	double finalPrice ;
	int discount ;
	String bookingStatus;
	boolean isGovEmployee ;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getTravelType() {
		return travelType;
	}
	public String getTravelClass() {
		return travelClass;
	}
	public double getMultiplier() {
		return multiplier;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public boolean isGovEmployee() {
		return isGovEmployee;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}
	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public void setGovEmployee(boolean isGovEmployee) {
		this.isGovEmployee = isGovEmployee;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", travelType=" + travelType + ", travelClass="
				+ travelClass + ", multiplier=" + multiplier + ", basePrice=" + basePrice + ", finalPrice=" + finalPrice
				+ ", discount=" + discount + ", bookingStatus=" + bookingStatus + ", isGovEmployee=" + isGovEmployee
				+ "]";
	}
	
	
	
}
