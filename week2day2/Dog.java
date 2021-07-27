package week2day2;

public class Dog {
	
	private String name;
	private double weight;
	
	public Dog() {
		this.name = "";
		this.weight = 0.0;
	}
	
	public Dog(String name, double weight) {
		this.name = name;
		
//		if (weight > 0) {
//			this.weight = weight;
//		} else {
//			this.weight = -1.0;
//		}
		
		try {
			if (weight < 0) {
				throw new Exception("Negative weight.");
			}
			this.weight = weight;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Zero is assigned to weight instead.");
			this.weight = 0.0;
		}
		
	}

}
