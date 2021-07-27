package week2day1;

public class Food {
	
	private String name;
	private int calories;
	private int weight;
	
	// Constructor
	public Food(String name, int calories, int weight) {
		this.name = name;
		
		if (calories >= 0) {
			this.calories = calories;
		} else {
			this.calories = 0;
		}
		
		if (isWeightValid(weight)) {
			this.weight = weight;
		} else {
			this.weight = 0;
		}
		
	}
	
	private boolean isWeightValid(int weight) {
		return weight >= 0;
	}
	
	// getters
	public String getName() {
		return this.name;
	}
	
	public int getCalories() {
		return this.calories;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	// toString
	@Override
	public String toString() {
		return String.format("Name: %10s | Calories: %6d | Weight: %3d",
				this.name, this.calories, this.weight);
	}

}
