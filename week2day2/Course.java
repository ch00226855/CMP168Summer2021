package week2day2;

public class Course implements Comparable<Course>{
	
	private String courseDept;
	private int courseNum;
	
	public Course(String courseDept, int courseNum) {
		this.courseDept = courseDept;
		this.courseNum = courseNum;
	}
	
	@Override
	public int compareTo(Course obj) {
		int deptComparison = this.courseDept.compareTo(obj.courseDept);
		if (deptComparison == 0) {
			if (this.courseNum > obj.courseNum) {
				return 1;
			} else if (this.courseNum == obj.courseNum) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return deptComparison;
		}
	}

}
