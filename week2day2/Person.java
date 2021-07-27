package week2day2;

public class Person implements Comparable<Person> {
	
	protected String name;
	protected int birthYear;
	
	public Person() {
		this.name = "";
		this.birthYear = 0;
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	@Override
	public int compareTo(Person obj) {
		if (this.birthYear < obj.birthYear) {
			return -1;
		} else if (this.birthYear == obj.birthYear) {
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.birthYear;
	}

}
