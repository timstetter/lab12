package lab12;

public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
	private Dealership dealership;
	
	public Car() {
		
	}
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Car(String make, String model, int year, double price, Dealership dealership) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.dealership = dealership;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
	public Dealership getDealership() {
		return dealership;
	}
	public void setDealership(Dealership dealership) {
		this.dealership = dealership;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
