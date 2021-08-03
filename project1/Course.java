package project1;


public class Course implements Comparable<Course> {

	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
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
		String s;
		
		if (isGraduateCourse) {
			s = "G";
		} else {
			s = "U";
		}
		
		s = s + courseDept + courseNum;
		
		return s;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseDept == null) {
			if (other.courseDept != null)
				return false;
		} else if (!courseDept.equals(other.courseDept))
			return false;
		if (courseNum != other.courseNum)
			return false;
		if (isGraduateCourse != other.isGraduateCourse)
			return false;
		if (numCredits != other.numCredits)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Course: %3s-%3d | Number of Credits: %02d | %s", 
								this.courseDept, 
								this.courseNum, 
								this.numCredits, 
								(this.isGraduateCourse ? "Graduate" : "Undergraduate"));
	}

	@Override
	public int compareTo(Course c) {
		if (c == null) {
			throw new NullPointerException("Cannot compare a Course object to a NULL pointer");
		}
		
		if (this.courseNum == c.getCourseNum()) {
			return 0;
		} else if (this.courseNum < c.getCourseNum()) {
			return -1;
		} else {
			return 1;
		}
	}
}
