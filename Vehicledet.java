/*
 * Author - Pranav S Nair
 * Date - 08/08/2025
 * Purpose - "To print details of Electric Car from Car which is a child class of vehicle."
 */
class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayDetails() {
		System.out.println("Brand: "+ brand);
		System.out.println("Model: "+ model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Fuel Type: "+fuelType);
	}
}
class Ecar extends Car{
	double batteryCap;
	Ecar(String brand,String model,String fuelType,double batteryCap){
		super(brand,model,fuelType);
		this.batteryCap=batteryCap;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Battery Capacity: "+batteryCap+"Kwh");
	}
}
public class Vehicledet {
	public static void main(String[] args) {
		Ecar ecar = new Ecar("Tata","Punch EV","Electric",350.00);
		ecar.displayDetails();
	}
}
