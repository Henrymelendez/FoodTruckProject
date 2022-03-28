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

	} // end of displayTrucks method
	
	
	/**
	* This method adds an instance of a FoodTruck array to a null spot and increments the value of a 
	* place holder value numberOfTrucks by one for use in later for loops 
	* 
	* @param  FoodTruck object  a FoodTruck object to be added to the FoodTruck array
	*/

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
	
	
	/**
	* This method prints a menu for the user to make choices in the main menu 
	* 
	* @param  none
	*/


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
	
	/**
	* This method return the average of all of the FoodTruck objects by keeping count of
	* each FoodTruck object being summed and then using them to calculate the average 
	* 
	* @param  none
	*/


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
			System.out.println("Average Rating of all trucks is: ");
			System.out.printf("%.2f", (sum/count));
			System.out.println();
		}

	}// end of calculate average method
	
	/**
	* This method returns a FoodTruck object, the maximum value of an array of FoodTrucks objects is calculated
	* by looping through and adding the maximum value to a place holder value and comparing it to the next value in
	* the array then returning the FoodTruck object with the maximum value 
	* 
	* @param  none
	*/

	
	public FoodTruck getMax() {
		double max_value = 0;
		int indexOfMax = 0;

		for (int i = 0; i < numberOfTrucks; i++) {
			if(trucks[i].getRating() > max_value) {
				indexOfMax = i;
				max_value = trucks[i].getRating();
				
			}
		}
		return trucks[indexOfMax];
	
		
	}// end of max value method
	
	/**
	* This method displays a single value of the FoodTruck array using the toString method
	* 
	* @param  none
	*/

	public void displayTruck() {
		String truckData = toString();
		System.out.println(truckData);
	}
}
