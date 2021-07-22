package week1day3;

public class RestaurantDriver {

	public static void main(String[] args) {
		
		// define my favorite restaurant for breakfast, lunch, and dinner.
		Restaurant myFavBreakfastRestaurant = new Restaurant("Brooklyn Deli", 4);
		Restaurant myFavLunchRestaurant = new Restaurant("Chipotle", 5);
		Restaurant myFavDinnerRestaurant = new Restaurant();
		
		// Give my favorite dinner restaurant a name "Outback Steakhouse", and a rating 3.
		myFavDinnerRestaurant.setName("Outback Steakhouse");
		myFavDinnerRestaurant.setRating(3);
		
//		// Give the restaurant a name and a rating
//		myFavBreakfastRestaurant.restaurantName = "Brooklyn Deli";
//		myFavLunchRestaurant.restaurantName = "Chipotle";
//		myFavBreakfastRestaurant.restaurantRating = 4;
//		myFavLunchRestaurant.restaurantRating = 5;
		
		// Call their printInfo method
		myFavBreakfastRestaurant.printInfo();
		myFavLunchRestaurant.printInfo();
		myFavDinnerRestaurant.printInfo();
		
		// Print the rating of my favorite dinner restaurant
		System.out.println(myFavDinnerRestaurant.getRating());

	}

}
