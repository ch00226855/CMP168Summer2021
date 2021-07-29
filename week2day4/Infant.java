package week2day4;

public class Infant {
	
	public class InfantToy {

		private String infantToyName;
		private int infantToyRating;
		
		public InfantToy(String name,
						int rating) {
			this.infantToyName = name;
			this.infantToyRating = rating;
		}
		
		@Override
		public String toString() {
			return this.infantToyName + 
					", " + this.infantToyRating;
		}
		
	}
	
	private InfantToy[] toys;
	private int numBabyToys;
	
	public Infant() {
		// This is incomplete. only the statements regarding 
		// the toy array is shown.
		
		toys = new InfantToy[10];
		numBabyToys = 0;
	}
	
	public void addInfantToy(String name, int rating) {
		
		if (numBabyToys == toys.length) {
			System.out.println("toys has reached capacity of 10");
		} else {
			toys[numBabyToys] = new InfantToy(name, rating);
			numBabyToys++;
		}		
	}
	
	public String getInfantToyAsString(int index) {
		
		if (index < 0 || index >= numBabyToys) {
			return "invalid index " + index;
		}
		
		return toys[index].toString();
		
	}
	

}
