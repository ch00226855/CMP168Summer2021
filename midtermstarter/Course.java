package midtermstarter;

public class Course implements Comparable<Course> {
	
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		// TODO check the code
		super();
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}

	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}
	
	public String getCourseName() {
		// TODO implement this
		return "Course.getCourseName() hasn't been"
				+ "implemented.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO implement this
		System.out.println("Course.equals() hasn't "
				+ "been implemented!");
		return false;
	}
	
	@Override
	public String toString() {
		// TODO implement this
		return "Course.toString() not implemented";
	}
	
	
	@Override
	public int compareTo(Course c) {
		// TODO implement this
		System.out.println("Course.compareTo not "
				+ "implemented!");
		return -1;
	}

}
