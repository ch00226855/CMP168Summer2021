package week4day3;

public class Person implements Comparable<Person> {
	
	private String name;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	public Person(String name, int year, int month, int day) {
		this.name = name;
		this.birthYear = year;
		this.birthMonth = month;
		this.birthDay = day;
	}

	@Override
	public int compareTo(Person p) {
		// sort person by date of birth.
		if (this.birthYear != p.birthYear) {
			return (this.birthYear - p.birthYear);
		} else if(this.birthMonth != p.birthMonth) {
			return (this.birthMonth - p.birthMonth);
		} else {
			return (this.birthDay - p.birthDay);
		}
	}
}
