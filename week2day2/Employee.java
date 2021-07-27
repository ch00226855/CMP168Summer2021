package week2day2;

public class Employee extends Person{
	
	private static int numEmployee = 0;
	private int employeeID;
	
	public Employee() {
		super();
		numEmployee++;
		this.employeeID = this.birthYear * 1000 + numEmployee;
	}
	
	public Employee(String name, int birthYear) {
		super(name, birthYear);
		numEmployee++;
		this.employeeID = this.birthYear * 1000 + numEmployee;
	}
	
	@Override
	public int compareTo(Person obj) {
		
		int compareVal = super.compareTo(obj);
		if (compareVal == 0 && obj instanceof Employee) {
			Employee objEmployee = (Employee) obj;
			if (this.employeeID < objEmployee.employeeID) {
				return -1;
			} else if (this.employeeID == objEmployee.employeeID) {
				return 0;
			} else {
				return 1;
			}
		}
		return compareVal;
		
	}

}
