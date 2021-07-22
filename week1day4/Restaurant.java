package week1day4;

public class Restaurant extends Business {
	
	// By extending the Business class, Restaurant already has
	// name, address, setName(), setAddress(), and getDescription().
	
	// Now we can add things that are special for Restaurant
	private int rating;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	// We want to modify the getDescription() method so that 
	// it also includes the rating information
	@Override
//	public String getDescription() {
//		String output = "Name: " + this.name + ", Address: " + 
//						this.address + ", Rating: " + this.rating;
//		return output;
//	}
	public String getDescription() {
		String output = super.getDescription() +
					", Rating: " + this.rating;
		return output;
	}
}
