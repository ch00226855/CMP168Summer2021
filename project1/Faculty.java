package project1;

import java.util.Arrays;

public class Faculty extends Employee implements Comparable<Person> {

	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty() {
		super();
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = false;
	}
	
	public Faculty(boolean isTenured) {
		super();
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	
	public Faculty(String deptName, boolean isTenured) {
		super(deptName);
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}

	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super(name, birthYear, deptName);
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}

	public boolean isTenured() {
		return isTenured;
	}

	public void setTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}

	public int getNumCoursesTaught() {
		return numCoursesTaught;
	}
 
	public void addCourseTaught(Course course) {//BUG FIXED //logic missing to avoid surpassing capacity
		if(numCoursesTaught < coursesTaught.length){
			this.coursesTaught[this.numCoursesTaught++] = course; //BUG FIXED //bug preincrementation incorrect skipping 0 index
		}
	}
	
	
	public void addCoursesTaught(Course[] courses) {
		for ( int i = 0 ;  ( (i < courses.length) && (numCoursesTaught < coursesTaught.length) ); i++ ) {//BUG FIXED //logic missing to avoid surpassing capacity
			this.coursesTaught[this.numCoursesTaught++] = courses[i];  //BUG FIXED //bug preincrementation incorrect skipping 0 index
		}
	}
	
	public Course getCourseTaught(int index) {
		if ((index >= 0) && (index < this.numCoursesTaught)) {//BUG FIXED (inefficient) would not short circuit before with 1 & symbol
			return this.coursesTaught[index];
		} else {
			return null;
		}
	}
	
	public String getCourseTaughtAsString(int index) {
		if ((index >= 0) && (index < this.numCoursesTaught)) {//BUG FIXED (inefficient) would not short circuit before with 1 & symbol
			return this.coursesTaught[index].getCourseDept() + "-" + this.coursesTaught[index].getCourseNum();
		} else {
			return "";
		}
	}
	
	public String getAllCoursesTaughtAsString() {
		String s;
		if (this.numCoursesTaught > 0) {
			s = this.getCourseTaughtAsString(0);
			for ( int i = 1 ; i < this.numCoursesTaught ; i++ ) {
				s = s + ", " + this.getCourseTaughtAsString(i);
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
		if (getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		Faculty other = (Faculty) obj;
		if (isTenured != other.isTenured)
			return false;
		if (numCoursesTaught != other.numCoursesTaught)
			return false;
		if (!Arrays.equals(coursesTaught, other.coursesTaught))//works when array content is in exact same order
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s = s + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s",
								(this.isTenured ? "Is Tenured" : "Not Tenured"),
								this.numCoursesTaught,
								this.getAllCoursesTaughtAsString());
		return s;
	}

	@Override
	public int compareTo(Person p) {
		if (p == null) {
			throw new NullPointerException("Cannot compare an Faculty object to a NULL pointer");
		}

		if (getClass() == p.getClass()) {
			Faculty f = (Faculty) p;
			
			if (this.numCoursesTaught == f.getNumCoursesTaught()) {
				return 0;
			} else if (this.numCoursesTaught < f.getNumCoursesTaught()) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return super.compareTo(p);
		}
	}
}

