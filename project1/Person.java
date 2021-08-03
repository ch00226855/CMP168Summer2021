package project1;

public class Person implements Comparable<Person> {

	private String name;
	private int birthYear;

	public Person() {
		super();
		this.name = "";
		this.birthYear = 0;
	}
	
	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (birthYear != other.birthYear)
			return false;
		if (!name.equalsIgnoreCase(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d", this.name, this.birthYear);
	}


	@Override
	public int compareTo(Person p) {
		if (p == null) {
			throw new NullPointerException("Cannot compare a Person object to a NULL pointer");
		}
		
		if (this.birthYear == p.getBirthYear()) {
			return 0;
		} else if (this.birthYear < p.getBirthYear()) {
			return -1;
		} else {
			return 1;
		}
	}
}

