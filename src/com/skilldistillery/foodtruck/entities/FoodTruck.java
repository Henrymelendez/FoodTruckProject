package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId;
	private final int MAX_TRUCKS = 5;
	private String name;
	private String foodType;
	private double rating;
	
	
	
	public FoodTruck(String name, String foodType, double rating) {
		this.nextTruckId = ++nextTruckId;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		
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
	
	

}
