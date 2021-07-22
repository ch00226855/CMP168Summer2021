package week1day3;

public class Restaurant {
	
//	// attributes: name, rating
//	String restaurantName;
//	int restaurantRating;
//	
//	// functionalities: tell me the name, show me the menu, tell me the phone number, ...
//	void printInfo() {
//		
//		System.out.println("Restaurant Name:" + restaurantName);
//		System.out.println("Restaurant Rating:" + restaurantRating);
//		
//	}
	
	// private member variables
	private String restaurantName;
	private int restaurantRating;
	
	// class constructor: assign default values to member variables
	public Restaurant() {
		restaurantName = "";
		restaurantRating = 0;
	}
	
	// overloaded constructors: assign user-specified values to member variables
	public Restaurant(String name, int rating) {
		restaurantName = name;
		
		if (isRatingValid(rating)) {
			restaurantRating = rating;
		} else {
			restaurantRating = 0;
		}
	}
	
	// mutator (setter) method
	public void setName(String name) {
		restaurantName = name;
	}
	
	public void setRating(int rating) {
		if (isRatingValid(rating)) {
			restaurantRating = rating;
		} else {
			System.out.println("The new rating " + rating + " is invalid.");
		}
	}
	
	// accessor (getter) method
	public String getName() {
		return restaurantName;
	}
	
	public int getRating() {
		return restaurantRating;
	}
	
	public String getRatingAsStars() {
		return starRating(restaurantRating);
	}
	
	// other public methods
	public void printInfo() {
		System.out.println("Restaurant Name: " + restaurantName);
		System.out.println("Restaurant Rating: " + restaurantRating);
		
	}
	
	// private methods that can help other methods in the class
	private boolean isRatingValid(int rating) {
		return (rating >= 0) && (rating <= 5);
	}
	
	private String starRating(int rating) {
		String output = "";
		for (int i = 0; i < rating; i++) {
			output += "*";
		}
		return output;
	}
	
	

}
