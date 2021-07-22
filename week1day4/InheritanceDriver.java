package week1day4;

public class InheritanceDriver {

	public static void main(String[] args) {
		
		// Define a business object
		Business b1 = new Business();
		b1.setName("18 Miles");
		b1.setAddress("123 5th Avenue");
		System.out.println(b1.getDescription());
		
		// Define a restaurant object
		Restaurant r1 = new Restaurant();
		r1.setName("18 Miles");
		r1.setAddress("123 5th Avenue");
		System.out.println(r1.getDescription());
		
		r1.setRating(5);
		System.out.println(r1.getRating());

		// toString method
		System.out.println(b1.toString());
		System.out.println(r1.toString());
		
		// equals() methods
		System.out.println(b1.equals(r1));
		System.out.println(b1.equals(b1));
		
		Business b2 = new Business();
		b2.setName("18 Miles");
		b2.setAddress("123 5th Avenue");
		System.out.println(b1.equals(b2));
		
		// Example of polymorphism: a generic array
		// Create an array containg b1, b2, r1.
		Business[] ary = new Business[3];
		ary[0] = b1;
		ary[1] = b2;
		ary[2] = r1; // can we pass a restaurant?
		// r1 is considered as a business here.
		
		// Let's write a loop and ask every business 
		// to display its description.
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i].getDescription());
		}
		
	}

}
