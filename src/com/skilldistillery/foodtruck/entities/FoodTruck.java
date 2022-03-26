package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId;
	private final int MAX_TRUCKS = 5;
	private FoodTruck[] trucks;
	private String name;
	private String foodType;
	private double rating;
	
	public FoodTruck() {
		trucks = new FoodTruck[MAX_TRUCKS];
	}

	public FoodTruck(String name, String foodType, double rating) {
		this.nextTruckId = ++nextTruckId;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}

	public String toString() {
		String output = "Id=" + nextTruckId + ", name=" + name + ", Food Type=" + foodType + ", rating=" + rating;
		return output;
	}

	public void addTruck(FoodTruck f) {
		if (nextTruckId == MAX_TRUCKS) {
			System.out.println("Sorry you cant add any more Food Trucks");
		} else {
			for(int spot = 0; spot < MAX_TRUCKS; spot++) {
				if(trucks[spot] == null) {
					trucks[spot] = f;
					break;
				}
			}
		}
	} // end of add truck method
	
	public void displayTrucks() {
		for(FoodTruck ft : trucks) {
			if(ft != null) {
				System.out.println("Id=" + nextTruckId + ", name=" + ft.getName() + ", Food Type=" + ft.getFoodType() + ", rating=" + ft.getRating());
			}
		}
	}

	public String getName() {
		return name;
	}

// TODO finish the set logic based on max cars allowed
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
