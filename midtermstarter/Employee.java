package midtermstarter;

public class Employee extends Person 
			implements Comparable<Person> {

	private String deptName;
	private static int numEmployees = 0;
	private int employeeID;
	
	public Employee() {
		// TODO correct this
		super();
	}

	public Employee(String deptName) {
		// TODO correct this
		super();
		this.deptName = deptName;
	}
	
	public Employee(String name,
			 		int birthYear,
			 		String deptName) {
		// TODO correct this
		System.out.println("Empolyee() not implemented.");
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public static int getNumEmployees() {
		return numEmployees;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO implement this
		System.out.println("Employee.equals not implemented.");
		return false;
	}
	
	@Override
	public String toString() {
		// TODO implement this
		System.out.println("Employee.toString not implemented.");
		return "";
	}
	
	@Override
	public int compareTo(Person p) {
		// TODO implement this
		System.out.println("Employee.compareTo not implemented.");
		return -1;
	}
	
}
