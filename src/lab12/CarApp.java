package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		List<Car> carList = new ArrayList<>();

		System.out.println("Welcome to the Grand Circus Motors admin console!");

		int count = Validator.getInt(scnr, "How many cars are you entering: ");

		for (int i = 0; i < count; i++) {
			Car car = new Car();

			car.setMake(Validator.getString(scnr, "Enter car #" + (i + 1) + " make: "));
			car.setModel(Validator.getString(scnr, "Enter car #" + (i + 1) + " model: "));
			car.setYear(Validator.getInt(scnr, "Enter car #" + (i + 1) + " year: "));
			car.setPrice(Validator.getDouble(scnr, "Enter car #" + (i + 1) + " price: "));
			carList.add(car);
		}
		
		System.out.println("Current Inventory:");
		System.out.printf("%-10s %-10s %-10s %1s\n", "Make", "Model", "Year", "Price");
		System.out.printf("%-10s %-10s %-10s %1s\n", "====", "=====", "====", "=====");
		for (Car car : carList) {
			System.out.printf("%-10s %-10s %-10s $%1s\n", car.getMake(), car.getModel(), car.getYear(), car.getPrice());
		}
		
		scnr.close();
		
		
	}

}
