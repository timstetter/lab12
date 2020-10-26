package lab12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	static List<Car> carList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean buyCar = false;
		int choice = -1;

		carList.add(new Car("Ford", "Mustang", 2005, 25000));
		carList.add(new Car("Dodge", "Charger", 2019, 65000));
		carList.add(new Car("Honda", "Civic", 2010, 12000));
		carList.add(new UsedCar("Mercedes", "S500", 2012, 70000, 15000));
		carList.add(new UsedCar("Jeep", "Grand Cherokee", 1998, 5000, 90000));
		carList.add(new UsedCar("Nissan", "300Z", 2008, 35000, 5000));

		while (true) {
			printList();

			try {
				choice = Validator.getInt(scnr, "Which car would you like? ");
			} catch (InputMismatchException e) {
				System.out.println("Please enter an integer for your choice");
			}
			if (choice == carList.size() + 1) {
				break;
			}
			try {
				printChoice(choice);

				buyCar = Validator.getYesNo(scnr, "Would you like to buy this car? ");
				if (buyCar) {
					carList.remove(choice);
					System.out.println("Excellent! Our finance dept. will be in touch.");
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Please enter a correct choice option");
			}

		}
		System.out.println("Have a great day!");
	}

	public static void printList() {
		int count = 1;
		for (Car car : carList) {
			System.out.printf("%-1s %-10s %-20s %-10s $%1s", count + ") ", car.getMake(), car.getModel(), car.getYear(),
					car.getPrice());
			if (car instanceof UsedCar) {
				System.out.print(" (Used) " + ((UsedCar) car).getMileage() + " miles");
			}
			System.out.println();
			count++;
		}
		System.out.println(count + ")  Exit.");
	}

	public static void printChoice(int choice) {
		Car car = carList.get(choice - 1);
		System.out.printf("%-10s %-20s %-10s $%1s", car.getMake(), car.getModel(), car.getYear(), car.getPrice());
		if (car instanceof UsedCar) {
			System.out.print(" (Used) " + ((UsedCar) car).getMileage() + " miles");
		}
		System.out.println();
	}
}