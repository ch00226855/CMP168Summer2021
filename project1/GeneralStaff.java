package project1;


public class GeneralStaff extends Employee {

	private String duty;
	
	public GeneralStaff() {
		super();
		this.duty = "";
	}
	
	public GeneralStaff(String duty) {
		super();
		this.duty = duty;
	}
	
	public GeneralStaff(String deptName, String duty) {
		super(deptName);
		this.duty = duty;
	}	
	
	public GeneralStaff(String name, int birthYear, String deptName, String duty) {
		super(name, birthYear, deptName);
		this.duty = duty;
	}	
	
	public String getDuty(){
		return duty;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneralStaff other = (GeneralStaff) obj;
		if (duty == null) {
			if (other.duty != null)
				return false;
		} else if (!duty.equals(other.duty))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s = s + String.format(" GeneralStaff: Duty: %10s", this.duty);
		return s;
	}
}

