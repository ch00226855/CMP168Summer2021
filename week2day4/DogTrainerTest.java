package week2day4;

public class DogTrainerTest {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		
		DogTrainer dt1 = new DogTrainer("Peter", 1998);
		
		try {
			dt1.addDog(d1);
		} catch (DogInfoIncompleteException e) {
//			System.err.println("Error: cannot add dog.");
//			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
