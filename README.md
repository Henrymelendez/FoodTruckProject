# Food Truck Project


## Description
A User inputs the name, Food Type, and a rating for a food trucks and return a list of five food trucks or less if the user chooses. the user is then directed to a menu of choices that allows them list the food trucks, get the overall average, and lastly find the truck with the max value.

## User Stories

###### User Story #1

The user is prompted to input the name, food type, and rating for up to five food trucks. For each set of input, a FoodTruck object is created, its fields set to the user's input, and it is added to the array. The truck id is not input by the user, but instead assigned automatically in the FoodTruck constructor from a static field that is incremented as each truck is created.

###### User Story #2

If the user inputs quit for the food truck name, input ends immediately and the program continues.

###### User Story #3

After input is complete, the user sees a menu from which they can choose to:

List all existing food trucks.
See the average rating of food trucks.
Display the highest-rated food truck.
Quit the program.

###### User Story #4

After choosing a menu item, the user sees the menu again and can choose another item until the choose to quit.

## Technologies / Skills 
* Java
* Eclipse
* Object
* Classes
* Arrays
* Encapsulation
* For / For each loops
* toString method
* Switch cases
* Getters / Setters


## Lessons Learned

I learn different ways of accessing arrays since arrays of objects have to be accessed in unique ways. A challenge I faced was calculating the average logic. which required me to put a place hold variable to keep track of the amount Food trucks in the array as each one was created. this variable became the back bone for my for loops, because it allowed me to loop through the array of objects and not throw an out of bounds exceptions. A Challenge for the future would be for me to keep it just to the FoodTruck and FoodTruckApp file instead of having to make another file to hold the FoodTruck array. 