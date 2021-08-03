package project1;

import java.util.Arrays;

public class Student extends Person implements Comparable<Person> {

	private static int numStudents = 0;
	
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	public Student() {
		super();
		this.studentID = ++Student.numStudents;
		//BUG FIXED //need to initialize numCoursesTaken, coursesTaken,isGraduate, major
		numCoursesTaken=0;
		coursesTaken = new Course[50];
		isGraduate = false;
		major = "undeclared";
	}
	
	public Student(boolean isGraduate) {
		super();
		this.studentID = ++Student.numStudents;
		this.isGraduate = isGraduate;
		//BUG FIXED //need to initialize numCoursesTaken, coursesTaken, major
		numCoursesTaken=0;
		coursesTaken = new Course[50];
		major = "undeclared";
	}
	
	public Student(String major, boolean isGraduate) {
		super();
		this.studentID = ++Student.numStudents;
		this.major = major;
		this.isGraduate = isGraduate;
		//BUG FIXED //need to initialize numCoursesTaken, coursesTaken
		numCoursesTaken=0;
		coursesTaken = new Course[50];
	}
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super(name, birthYear);
		this.studentID = ++Student.numStudents;
		this.major = major;
		this.isGraduate = isGraduate;
		//BUG FIXED //need to initialize numCoursesTaken, coursesTaken
		numCoursesTaken=0;
		coursesTaken = new Course[50];
	}

	public boolean isGraduate() {
		return isGraduate;
	}

	public void setGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}
	public int getStudentID() {//BUG FIXED //added missing method
		return studentID;
	}

	public static int getNumStudents() {
		return numStudents;
	}

	public void addCourseTaken(Course course) {//BUG FIXED //logic missing to avoid surpassing capacity
		if(numCoursesTaken < coursesTaken.length){
			this.coursesTaken[this.numCoursesTaken++] = course;//BUG FIXED //preincrementation skips 0 index
		}
	}
	

	public void addCoursesTaken(Course[] courses){
			for ( int i = 0 ; ( (i < courses.length) && (numCoursesTaken < coursesTaken.length) ); i++ ) {//BUG FIXED //logic missing to avoid surpassing capacity
				this.coursesTaken[this.numCoursesTaken++] = courses[i];//BUG FIXED //preincrementation skips 0 index
			}
	
	}
	
	public Course getCourseTaken(int index) {
		if ((index >= 0) && (index < this.numCoursesTaken)) {//BUG FIXED (inefficient) would not short circuit before with 1 & symbol
			return this.coursesTaken[index];
		} else {
			return null;
		}
	}
	
	public String getCourseTakenAsString(int index) {
		if ((index >= 0) && (index < this.numCoursesTaken)) {//BUG FIXED (inefficient) would not short circuit before with 1 & symbol
			return this.coursesTaken[index].getCourseDept() + "-" + this.coursesTaken[index].getCourseNum();
		} else {
			return "";
		}
	}
	public String getAllCoursesTakenAsString() {
		String s;
		if (this.numCoursesTaken > 0) {
			s = this.getCourseTakenAsString(0);
			for ( int i = 1 ; i < this.numCoursesTaken ; i++ ) {
				s = s + ", " + this.getCourseTakenAsString(i);
			}
		} else {
			s = "";
		}
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (isGraduate != other.isGraduate)
			return false;
		if (!major.equalsIgnoreCase(other.major))//major should never be null
			return false;
		if (numCoursesTaken != other.numCoursesTaken)
			return false;
		if (!Arrays.equals(coursesTaken, other.coursesTaken))//works when array content is in exact same order
			return false;
		if (studentID != other.studentID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s = super.toString() ;
		//BUG FIXED //missing attributes
		s = s + String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
				studentID, major,
				(this.isGraduate ? "Graduate" : "Undergraduate"),
				this.numCoursesTaken,
				this.getAllCoursesTakenAsString());
		return s;
	}

	private int totalCredits() {
		int credits = 0;
		
		for ( int i = 0 ; i < numCoursesTaken ; i++ ) {
			credits += coursesTaken[i].getNumCredits();
		}
		
		return credits;
	}
	
	@Override
	public int compareTo(Person p) {
		if (p == null) {
			throw new NullPointerException("Cannot compare an Student object to a NULL pointer");
		}

		if(p instanceof Student){//		if (getClass() == p.getClass()) { //alternate solution
			Student s = (Student) p;
			if (this.totalCredits() == s.totalCredits()) {
				return 0;
			} else if (this.totalCredits() < s.totalCredits()) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return super.compareTo(p); //not a Student so we use Person's implemented compareTo
		}
	}
}

