package Day3;

import java.util.Scanner;

public class PassengerTicketBooking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age ;");
		Passenger passenger = new Passenger() ;
		passenger.setAge(sc.nextInt());
		sc.nextLine();
		
		if(passenger.getAge() < 5) {
			System.out.println("No Booking required and stop execution");
			return ;
		}
		else if(passenger.getAge()>80) {
			System.out.println("Medical Clearance Required");
			return ;
		}
		System.out.println("Enter name");
		passenger.setName(sc.nextLine());
		
		System.out.println("Select the travel type :\n 1.Bus \n 2.Train\n 3.Flight");
		int mode = sc.nextInt();
		int type = 0 ;
		switch (mode) {
		case 1:
			passenger.setTravelType("BUS");
			System.out.println("Enter the travel class: \n 1.Sleeper \n 2.Seater");
			type = sc.nextInt();
			switch(type) {
				case 1: passenger.setTravelClass("Sleeper"); passenger.setMultiplier(1.2); break ;
				case 2: passenger.setTravelClass("Seater"); passenger.setMultiplier(1.0); break ;
				default: System.out.println("Invalid class"); break ;
			}
			break;
		case 2:
			passenger.setTravelType("Train");
			System.out.println("Enter the travel class: \n 1.General \n 2.Sleeper \n 3.AC");
			type = sc.nextInt();
			switch(type) {
			case 1: passenger.setTravelClass("General"); passenger.setMultiplier(1.0); break ;
			case 2: passenger.setTravelClass("Sleeper"); passenger.setMultiplier(1.3); break ;
			case 3: passenger.setTravelClass("AC"); passenger.setMultiplier(1.6); break ;
			default:  System.out.println("Invalid class"); break ;
			}
			break ;
		case 3:
			passenger.setTravelType("Flight");
			System.out.println("Enter the travel class: \n 1.Economy \n 2.Bussiness");
			type = sc.nextInt();
			switch(type) {
			case 1: passenger.setTravelClass("Economy"); passenger.setMultiplier(2.5); break ;
			case 2: passenger.setTravelClass("Bussiness"); passenger.setMultiplier(3.5); break ;
			default:  System.out.println("Invalid class"); break ;
			}
			break;

		default:
			System.out.println("Invalid Vehical type");
			break;
		}
		
		if(passenger.getTravelClass() == null || passenger.getTravelType()==null ) {
			return ;
		}
		
		System.out.println("Enter the base fare :");
		int base = sc.nextInt();
		passenger.setBasePrice(base);
		double fare = base * passenger.getMultiplier();
		passenger.setFinalPrice(fare);
		
		System.out.println("Is government Employee : y/n");
		passenger.setGovEmployee( sc.next().equals("y")  ? true : false) ;
		
		
		if(passenger.getAge()>= 60 ) {
			passenger.setDiscount(30);
			passenger.setFinalPrice(fare * 0.7);
		}else if(passenger.isGovEmployee()) {
			passenger.setDiscount(15);
			passenger.setFinalPrice(fare * 0.85);
		}else if( passenger.getAge()>5 && passenger.getAge()<12 ) {
			passenger.setDiscount(50);
			passenger.setFinalPrice(fare * 0.5);
			
		}
		
		
		if(fare > 10000) {
			if(passenger.getTravelType().equals("Flight")) passenger.setBookingStatus("Confirmed");
			else passenger.setBookingStatus("Waiting List");
		}else {
			passenger.setBookingStatus("Confirmed");
		}
		
		
		System.out.println(passenger.toString());
		
		
		
		
		
		
	}
}	
