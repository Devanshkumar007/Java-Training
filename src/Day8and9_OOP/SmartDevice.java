package Day8and9_OOP;

public class SmartDevice {
	String deviceName;
	String os;
	int batteryCapacity;
	public SmartDevice() {
		this.deviceName = "IPhone";
		this.os = "IOS";
		this.batteryCapacity = 4000;
	}
	public SmartDevice(String deviceName) {
		this();
		this.deviceName = deviceName;
	}
	public SmartDevice(String deviceName, String os) {
		this();
		this.deviceName = deviceName;
		this.os = os;
	}
	
	public SmartDevice(String deviceName, String os, int batteryCapacity) {
		this.deviceName = deviceName;
		this.os = os;
		this.batteryCapacity = batteryCapacity;
	}
	@Override
	public String toString() {
		return "SmartDevice [deviceName=" + deviceName + ", os=" + os + ", batteryCapacity=" + batteryCapacity + "]";
	}
	
	public static void main(String[] args) {
		SmartDevice s1 = new SmartDevice();
		SmartDevice s2 = new SmartDevice("Iphone16");
		SmartDevice s3 = new SmartDevice("Galaxy s","Android");
		SmartDevice s4 = new SmartDevice("Pixel","Android",6000);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}
	
	
}
//
//A smart device can be initialized in multiple stages depending on the information available at the time of creation.
//
//
//Class Name: SmartDevice
//
//Instance Variables
//	•	String deviceName
//	•	String os
//	•	int batteryCapacity
//
//
//
//Constructor Requirements
//
//Implement the following constructors using constructor chaining with this():
//	1.	Default constructor
//	•	Initializes the device with default values.
//	2.	Constructor with deviceName
//	•	Initializes the device name and uses constructor chaining.
//	3.	Constructor with deviceName and os
//	•	Initializes device name and operating system using constructor chaining.
//	4.	Constructor with all fields (deviceName, os, batteryCapacity)
//	•	Initializes all instance variables.