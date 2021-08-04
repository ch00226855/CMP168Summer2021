package midtermstarter;

public class Faculty extends Employee {

	private Course[] coursesTaught;
	private int numCourseTaught;
	private boolean isTenured;
	
	public Faculty() {
		// TODO implement this
		super();
	}

	public Faculty(boolean isTenured) {
		// TODO implement this
		super();
		this.isTenured = isTenured;
	}
	
	public Faculty(String deptName, boolean isTenured) {
		// TODO implement this
		System.out.println("Fauclty() not implemented.");
	}
	
	public Faculty(String name,
					int birthYear,
					String deptName,
					boolean isTenured) {
		// TODO implement this
		System.out.println("Faculty() not implemented.");
	}

	public boolean isTenured() {
		return isTenured;
	}

	public void setTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}

	public int getNumCourseTaught() {
		return numCourseTaught;
	}
	
	public void addCourseTaught(Course course) {
		// TODO implement this
		System.out.println("Faculty.addCourseTaught() not implemented.");
	}
	
	public void addCourseTaught(Course[] courses) {
		// TODO implement this
		System.out.println("Faculty.addCourseTaught() not implemented.");
	}
	
	public Course getCourseTaught(int index) {
		// TODO implement this
		System.out.println("Faculty.getCourseTaught() not implemented.");
		return null;
	}
	
	public String getCourseTaughtAsString(int index) {
		// TODO implement this
		System.out.println("Faculty.getCourseTaughtAsString() not implemented.");
		return "Faculty.getCourseTaughtAsString() not implemented.";
	}
	
	public String getAllCoursesTaughtAsString() {
		// TODO implement this
		return "Faculty.getAllCoursesTaughtAsString() not implemented.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO implement this
		System.out.println("Faculty.equals not implemented.");
		return false;
	}
	
	@Override
	public String toString() {
		// TODO implement this
		System.out.println("Faculty.toString not implemented.");
		return "";
	}
	
	@Override
	public int compareTo(Person p) {
		// TODO implement this
		System.out.println("Faculty.compareTo not implemented.");
		return -1;
	}
}
