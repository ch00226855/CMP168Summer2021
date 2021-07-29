package week2day4;

public class DogTrainer extends Person 
			implements Comparable<Person> {
	
	private Dog[] dogAry;
	private int numDogs;
	
	public DogTrainer() {
		super();
		dogAry = new Dog[20];
		numDogs = 0;
	}
	
	public DogTrainer(String name, int birthYear) {
		super(name, birthYear);
		dogAry = new Dog[20];
		numDogs = 0;
	}
	
	public void work() {
		for (int i = 0; i < numDogs; i++) {
			System.out.println("I am training " +
					dogAry[i].getName());
		}
	}
	
	public void addDog(Dog newDog) throws 
							DogInfoIncompleteException {
		
		if (newDog.getName().equals("")) {
			throw new DogInfoIncompleteException("Failed to"
					+ " add a dog due to missing name.");
		}
		
		if (numDogs >= dogAry.length) {
			System.out.println("Error: dog array is full.");
		} else {
			dogAry[numDogs] = newDog;
			numDogs++;
		}
	}
	
	@Override
	public int compareTo(Person p) {
		if (this.getBirthYear() < p.getBirthYear()) {
			return -1; // this object goes first
		} else if (this.getBirthYear() == p.getBirthYear()) {
			return 0; // two objects are equal
		} else {
			return 1;
		}
	}

}
