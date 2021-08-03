package project1;

public class Employee extends Person implements Comparable<Person> {

	private static int numEmployees = 0;
	private String deptName;
	private int employeeID;

	
	public Employee() {
		super();
		this.deptName = "";
		this.employeeID = ++Employee.numEmployees;
	}
	
	public Employee(String deptName) {
		super();
		this.deptName = deptName;
		this.employeeID = ++Employee.numEmployees;
	}

	public Employee(String name, int birthYear, String deptName) {
		super(name, birthYear);
		this.deptName = deptName;
		this.employeeID = ++Employee.numEmployees;
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
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		Employee other = (Employee) obj;
		if (!deptName.equalsIgnoreCase(other.deptName))
			return false;
		if (employeeID != other.employeeID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s = s + String.format(" Employee: Department: %20s | Employee Number: %3d", this.deptName, this.employeeID);
		return s;
	}

	@Override
	public int compareTo(Person p) {
		if (p == null) {
			throw new NullPointerException("Cannot compare an Employee object to a NULL pointer");
		}

		if (getClass() == p.getClass()) {
			Employee e = (Employee) p;
			
			if (this.employeeID == e.getEmployeeID()) {
				return 0;
			} else if (this.employeeID < e.getEmployeeID()) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return super.compareTo(p);
		}
	}
}

