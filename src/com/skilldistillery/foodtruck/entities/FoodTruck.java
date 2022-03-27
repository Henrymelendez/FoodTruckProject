package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId;
	private int id;
	private String name;
	private String foodType;
	private double rating;

	public FoodTruck() {

	}

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		FoodTruck.nextTruckId += 1;
		this.id = FoodTruck.nextTruckId;
	}

	public String toString() {
		String output = "Id=" + id + ", name=" + name + ", Food Type=" + foodType + ", rating="
				+ rating;
		return output;
	}
	public void displaytruck() {
		String data = toString();
		System.out.println(data);
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
