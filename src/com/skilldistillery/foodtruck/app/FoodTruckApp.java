package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck; // import Truck class from package
import com.skilldistillery.foodtruck.entities.Menu; // import menu class that stores Food truck array and methods

public class FoodTruckApp {

	public static void main(String[] args) {
		// TODO an array of Food Truck objects;
		Scanner sc = new Scanner(System.in);
		Menu p1 = new Menu();
		String name = "";
		String foodType;
		double rating;
		int i = 0;
		boolean keepGoing = true;

		do {

			System.out.println("Please Input a Food truck");
			System.out.print("Add Food Truck name: ");
			name = sc.nextLine();
			if (name.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.print("Add the Food Type of the truck: ");
			foodType = sc.nextLine();

			System.out.print("Add a rating: ");
			rating = sc.nextDouble();

			FoodTruck one = new FoodTruck(name, foodType, rating);
			p1.addTruck(one);

			i++;
			sc.nextLine();

		} while (i < 5);

		keepGoing = true;
		while (keepGoing) {
			// TODO menu loop and methods to do math
			p1.printMenu();
//			p1.displayTrucks();
			int input = sc.nextInt();
//			p1.calculateAverage();
//			p1.getMax().displaytruck();
			switch(input) {
			case 1:
				p1.displayTrucks();
				break;
			case 2:
				p1.calculateAverage();
				break;
			case 3:
				p1.getMax().displaytruck();
				break;
			case 4:
				keepGoing = false;
				
			}// end of switch statement
			
		} // end of while loop 

	}// end of main method

}
