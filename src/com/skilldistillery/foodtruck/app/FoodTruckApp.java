package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck; // import Truck class from package
import com.skilldistillery.foodtruck.entities.Menu;

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

		while(i < 5) {
			
			System.out.println("Please Input a Food truck");
			System.out.println("Add Food Truck name: ");
			name = sc.nextLine();
			if(name.equalsIgnoreCase("quit")) {
				break;
			}
			
			System.out.println("Add the Food Type of the truck: ");
			foodType = sc.nextLine();

			System.out.println("Add a rating: ");
			rating = sc.nextDouble();

			FoodTruck one = new FoodTruck(name, foodType, rating);
			p1.addCar(one);

			i++;
			sc.nextLine();
			

		}
		p1.displayCar();

	}

}
