package week2day1;

public class Dog extends Pet implements FoodEater, Communicator {
	
	private String favoriteToy;
	private static final int METABOLISM_FACTOR = 1000; // gains 1 pound from 1000 calories.
	private double weight;
	


	public Dog() {
//		this.name = "";
//		this.favoriteFood = "";
//		this.goesOutside = false;
		super(); // call the constructor from Pet to get all inherited variables initialized
		this.favoriteToy = "";
		this.weight = 0.0;
	}
	
	public Dog(String name,
				String favoriteFood,
				boolean goesOutside,
				String favoriteToy,
				double weight) {
		// call the constructor from Pet to get all inherited variables initialized
		super(name, favoriteFood, goesOutside);
		this.favoriteToy = favoriteToy;
		this.weight = weight;
	}
	
	@Override
	public void play() {
		System.out.println("Woof! I like to play with " + this.favoriteToy + "!");
	}
	
	@Override
	public String toString() {
		String output = super.toString();
		output += " | Favorite Toy: " + this.favoriteToy;
		return output;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Dog) {
			Dog objDog = (Dog) obj; // Type casting to Dog
			if (super.equals(obj) &&
				this.favoriteToy.equals(objDog.favoriteToy)) {
				return true;
			}
		}
		
		return false;
		
	}
	

	public String getFavoriteToy() {
		return favoriteToy;
	}

	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}

	@Override
	public void eat() {
		System.out.println("Woof! I am eating!");		
	}

	@Override
	public void eat(Food fd) {
		System.out.println("Woof! I am eating " + fd.getName() + "!");		
	}

	@Override
	public void metabolizeFood(Food fd) {
		// metabolizing means converting calories to weight.
		double additionalWeight = fd.getCalories() / (double)METABOLISM_FACTOR;
		this.weight += additionalWeight;
		
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void speak() {
		
		System.out.println("Woof!");
		
	}

	@Override
	public void speak(String words) {

		System.out.println("Woof! " + words);
		
	}

	
}
