package week1day4;

public class Business {
	
	protected String name; // now this variable is visible to Restaurant
	protected String address;
	
	public Business() {
		name = "";
		address = "";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDescription() {
		String output = "Name: " + this.name + ", Address: " + 
						this.address;
		return output;
	}
	
	// Can we modify the toString() method so that
	// it returns a string containing the name and 
	// address?
	
	@Override
	public String toString() {
		return this.name + ", " + this.address;
	}
	
	@Override
	public boolean equals(Object o) {
		// two Business objects are equal if they
		// have the same name and address.
		
		// 1. check if o is a Business object.
		if (o instanceof Business) {
			// Convert o from a generic object to 
			// a Business object.
			Business oBusiness = (Business) o;
			
			// continue compare the attributes
			if (this.name.equals(oBusiness.name) &&
				this.address.equals(oBusiness.address)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
		
	}

}
