package com.skilldistillery.foodtruck.entities;

public class Menu {
	private int numberOfTrucks;
	private FoodTruck[] trucks;
	private int MAX_TRUCKS = 5;

	public Menu() {
		trucks = new FoodTruck[MAX_TRUCKS];
	}

	public void displayTrucks() {
		for (FoodTruck ft : trucks) {
			if (ft != null) {
				System.out.println(ft.toString());
			}
		}

	}// end of method

	public void addTruck(FoodTruck truckToAdd) {
		if (numberOfTrucks == MAX_TRUCKS) {
			System.out.println("Lot is full come back monday");

		} else {
			for (int spot = 0; spot < MAX_TRUCKS; spot++) {
				if (trucks[spot] == null) {
					trucks[spot] = truckToAdd;
					numberOfTrucks += 1;
					break;
				}
			}
		}
	}// end of add truck

	public void printMenu() {
		System.out.println("------------------");
		System.out.println("What would you like to do:");
		System.out.println();
		System.out.println("1. List all trucks");
		System.out.println("2. See Average Rating of all Trucks");
		System.out.println("3. Display Highest rated Truck");
		System.out.println("4. Quit");
		System.out.println();
		System.out.println("------------------");
	}// end of print method

	public void calculateAverage() {
		double sum = 0;
		int count = 0;
		if (numberOfTrucks == 1) {
			System.out.println("The Average Rating is: " + trucks[0].getRating());
		} else {

			for (int i = 0; i < numberOfTrucks; i++) {
				sum += trucks[i].getRating();
				count++;
			}
			System.out.println("Average Rating of all trucks is: " + (sum / count) );
	}// end of method

}
	}
	
