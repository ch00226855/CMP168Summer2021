package week2day4;

public class ShowDog extends Dog {
	
	private int numTrophies;
	
	public ShowDog() {
		super();
		this.numTrophies = 0;
	}
	
	public ShowDog(String name) {
		super(name); // Dog(name)
		this.numTrophies = 0;
	}
	
	public ShowDog(String name,
				double wt,
				double ht,
				boolean isVaccinated,
				int age,
				int numTrophies) {
		super(name, wt, ht, isVaccinated, age);
		if (isValid(numTrophies)) {
			this.numTrophies = numTrophies;
		} else {
			System.out.println("Invalid number of trophies.");
		}
	}

	public int getNumTrophies() {
		return numTrophies;
	}

	public void setNumTrophies(int numTrophies) {
		if (isValid(numTrophies)) {
			this.numTrophies = numTrophies;
		} else {
			System.out.println("Invalid number of trophies.");
		}
	}

	private boolean isValid(int val) {
		return (val >= 0);
	}
	
	public void addTrophy() {
		this.numTrophies++;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nShowDog: numTrophies="
			+ numTrophies;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (super.equals(obj) &&
			(obj instanceof ShowDog)) {
			ShowDog showDogObj = (ShowDog) obj;
			if (this.numTrophies == showDogObj.numTrophies) {
				return true;
			}
		}
		return false;
	}
	
	
}
