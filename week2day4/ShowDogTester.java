package week2day4;

public class ShowDogTester {

	public static void main(String[] args) {
		
		// Create 3 showdogs
		ShowDog sd1 = new ShowDog();
		ShowDog sd2 = new ShowDog("Cookie");
		ShowDog sd3 = new ShowDog("Queen",
				10.0, 12, true, 2, 3);
		
		// Set the names
		sd1.setName("Knight");
		
		// Set weights and heights
		sd1.setWeight(25.0);
		sd1.setHeight(20.5);
		sd2.setWeight(27.0);
		sd2.setHeight(21.5);
		
		// Set number of trophies
		sd1.setNumTrophies(0);
		sd2.setNumTrophies(5);
		sd1.addTrophy();
		
		// Create an array of showdogs
//		ShowDog[] team = new ShowDog[3];
		ShowDog[] team = {sd1, sd2, sd3};
		
		// Attempt to assign invalid values
		sd1.setWeight(-10);
		sd1.setHeight(-20);
		sd1.setNumTrophies(-2);
		
		// Show details of all showdogs in array
		for (int i = 0; i < team.length; i++) {
			System.out.println(team[i].toString());
		}
	}

}
