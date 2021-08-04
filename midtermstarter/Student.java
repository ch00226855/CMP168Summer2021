package midtermstarter;

public class Student extends Person {

	private static int numStudents;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	public Student() {
		// TODO implement this
		System.out.println("Student() not implemented.");
	}
	
	public Student(boolean isGraduate) {
		// TODO implement this
		System.out.println("Student() not implemented.");
	}
	
	public Student(String major,
					boolean isGraduate) {
		// TODO implement this
		System.out.println("Student() not implemented.");
	}
	
	public Student(String name,
					int birthYear,
					String major,
					boolean isGraudate) {
		// TODO implement this
		System.out.println("Student() not implemented.");
	}

	public boolean isGraduate() {
		return isGraduate;
	}

	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public static int getNumStudents() {
		return numStudents;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}
	
	public void addCourseTaken(Course course) {
		// TODO implement this
		System.out.println("Student.addCourseTaken()"
				+ "not implemented.");
	}
	
	public void addCoursesTaken(Course[] courses) {
		// TODO implement this
		System.out.println("Student.addCoursesTaken()"
				+ "not implemented.");
	}
	
	public Course getCourseTaken(int index) {
		// TODO implement this
		System.out.println("Student.getCourseTaken()"
				+ "not implemented.");
		return null;
	}
	
	public String getCourseTakenAsString(int index) {
		// TODO implement this
		return "Student.getCourseTakenAsString()" +
				"not implemented";
	}
	
	public String getAllCoursesTakenAsString() {
		// TODO implement this
		return "Student.getAllCoursesTakenAsString()" +
						"not implemented";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO implement this
		System.out.println("Student.equals not implemented.");
		return false;
	}
	
	@Override
	public String toString() {
		// TODO implement this
		System.out.println("Student.toString not implemented.");
		return "";
	}
	
	@Override
	public int compareTo(Person p) {
		// TODO implement this
		System.out.println("Student.compareTo not implemented.");
		return -1;
	}
	
	
}
