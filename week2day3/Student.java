package week2day3;

public class Student {

	private String name;
	private int id;
	private String major;
	
	public Student() {
		name = "";
		id = 0;
		major = "undecided";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.id + ", " + this.major;
	}
	
}
