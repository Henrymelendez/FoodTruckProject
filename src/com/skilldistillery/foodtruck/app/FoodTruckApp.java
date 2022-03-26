package com.skilldistillery.foodtruck.app;
import java.util.Scanner;


import com.skilldistillery.foodtruck.entities.FoodTruck;  // import Truck class from package

public class FoodTruckApp {

	public static void main(String[] args) {
		//TODO an array of Food Truck objects;
		Scanner sc = new Scanner(System.in);
		FoodTruck p1 = new FoodTruck();
		
		System.out.println("Please Input a Food truck");
		System.out.print("Add Food Truck name: ");
		String name = sc.nextLine();
		System.out.print("Add the Food Type of the truck: ");
		String foodType = sc.nextLine();
		System.out.print("Add a rating: ");
		double rating = sc.nextDouble();
		
		FoodTruck one = new FoodTruck(name,foodType, rating);
		
		p1.addTruck(one);
		
		
		p1.displayTrucks();
		
		
		
		

	}

}
