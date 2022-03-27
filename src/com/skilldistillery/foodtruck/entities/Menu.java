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
					numberOfTrucks++;
					break;
				}
			}
		}
	}// end of add truck

}
