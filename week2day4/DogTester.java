package week2day4;

public class DogTester {

	public static void main(String[] args) {
		
		// Create 3 dog instances
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		// Set the names
		d1.setName("Husky");
		d2.setName("Police Dog");
		d3.setName("Lightning");
		
		// Set weight and height on d1 and d2
		d1.setWeight(50.0);
		d2.setWeight(60.0);
		d1.setHeight(30.0);
		d2.setHeight(40.0);
		
		// Print dog information
		System.out.println(d1.getName() + ", " +
			d1.getWeight() + ", " + d1.getHeight() +
			", " + d1.isVaccinated() + ", " +
			d1.getAgeInDogYears());
		
		System.out.println(d2.getName() + ", " +
				d2.getWeight() + ", " + d2.getHeight() +
				", " + d2.isVaccinated() + ", " +
				d2.getAgeInDogYears());
		
		System.out.println(d3.getName() + ", " +
				d3.getWeight() + ", " + d3.getHeight() +
				", " + d3.isVaccinated() + ", " +
				d3.getAgeInDogYears());
		
		// Set other attributes
		d1.setVaccinated(true);
		d3.setAgeInDogYears(7);
		d3.setVaccinated(true);

	}

}
