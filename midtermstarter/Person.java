package midtermstarter;

public class Person implements Comparable<Person>{
	
	private String name;
	private int birthYear;
	
	public Person() {
		// TODO check this
		super();
	}

	public Person(String name, int birthYear) {
		// TODO check this
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
		// TODO implement this
		System.out.println("Person.equals not implemented.");
		return false;
	}
	
	@Override
	public String toString() {
		// TODO implement this
		System.out.println("Person.toString not implemented.");
		return "";
	}
	
	@Override
	public int compareTo(Person p) {
		// TODO implement this
		System.out.println("Person.compareTo not implemented.");
		return -1;
	}
	
	

}
