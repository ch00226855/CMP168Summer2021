package week2day4;

public class Dog {
	
	private static int numDogs = 0;
	private int dogID;
	private String name;
	private double weight;
	private double height;
	private boolean isVaccinated;
	private int ageInDogYears;
	
	public Dog() {
		numDogs++;
		this.dogID = numDogs;
		this.name = "";
		this.weight = 0.0;
		this.height = 0.0;
		this.isVaccinated = false;
		this.ageInDogYears = 0;
	}
	
	public Dog(String name) {
		this();
		this.name = name;
		this.weight = 0.0;
		this.height = 0.0;
		this.isVaccinated = false;
		this.ageInDogYears = 0;
	}
	
	public Dog(String name, double weight,
			double height) {
		this();
		this.name = name;
		if (isValid(weight)) {
			this.weight = weight;
		} else {
			System.out.println("Invalid weight.");
			this.weight = 0.0;
		}
		
		if (isValid(height)) {
			this.height = height;
		} else {
			System.out.println("Invalid height.");
			this.height = 0.0;
		}
		this.isVaccinated = false;
		this.ageInDogYears = 0;
	}
	
	public Dog (String name,
				double weight,
				double height,
				boolean isVaccinated,
				int age) {
		this(name, weight, height);
		this.isVaccinated = isVaccinated;
		this.ageInDogYears = age;
	}
	
	public void speak() {
		System.out.println("Woof!");
	}
	
	public void sit() {
		System.out.println("I am sitting!");
	}
	
	public void growTaller() {
		this.height += 1.0;
	}
	
	public void growTaller(double growthAmount) 
			throws Exception {
// Error-check without exception
//		if (isValid(growthAmount)) {
//			this.height += growthAmount;
//		} else {
//			System.out.println("Method growTaller() "
//				+ "does not accept negative input.");
//		}
		
		// error-checking with exception
		if (isValid(growthAmount)) {
			this.height += growthAmount;
		} else {
			throw new Exception("Negative growth amount");
		}
	}
	
	@Override
	public String toString() {
		return name + ", " + weight + ", " + height + 
				", " + isVaccinated + ", " + ageInDogYears;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Dog) {
			
			Dog dogObj = (Dog) obj;
			
			if (this.name.equals(dogObj.name) &&
				Math.abs(this.weight - dogObj.weight) < 0.05 &&
				Math.abs(this.height - dogObj.height) < 0.05 &&
				this.isVaccinated == dogObj.isVaccinated &&
				this.ageInDogYears == dogObj.ageInDogYears) {
				
				return true;
			}
			
		}
		
		return false;
		
	}
	
	
	private boolean isValid(double x) {
		return (x > 0);
	}
	
	public static int getNumDogs() {
		return numDogs;
	}
	
	public int getDogID() {
		return this.dogID;
	}

	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}

	public double getHeight() {
		return height;
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public int getAgeInDogYears() {
		return ageInDogYears;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		if (isValid(weight)) {
			this.weight = weight;
		} else {
			System.out.println("Invalid weight.");
			this.weight = 0.0;
		}
	}

	public void setHeight(double height) {
		if (isValid(height)) {
			this.height = height;
		} else {
			System.out.println("Invalid height.");
			this.height = 0.0;
		}
	}

	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public void setAgeInDogYears(int ageInDogYears) {
		if (isValid(ageInDogYears)) {
			this.ageInDogYears = ageInDogYears;
		} else {
			System.out.println("Invalid ageInDogYears.");
			this.ageInDogYears = 0;
		}
	}
	
}
