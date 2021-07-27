package week2day1;

public class AbstractClassDriver {

	public static void main(String[] args) {
		
//		Pet p1 = new Pet("Dog", "Bones", true); // result in compilation error
		
//		// Create two dog objects
//		Dog d1 = new Dog("Fluffy", "Bones", true, "Fresby");
//		Dog d2 = new Dog("Sleeper", "Meat", false, "Pillow");
//		
//		d1.play();
//		d2.play();
//		
//		System.out.println(d1.toString());
//		System.out.println(d2.toString());
//		
//		System.out.println(d1.equals(d2));
//		System.out.println(d1.equals(d1));
//		
//		Cat c1 = new Cat("Kitten", "Fish", "Sunny");
//		Cat c2 = new Cat("Sushi", "Snacks", "Rainy");
//		
//		c1.play();
//		c2.play();
//		
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
//		
//		System.out.println(c1.equals(c1));
//		System.out.println(c1.equals(d1));
//		System.out.println(c1.equals(c2));
//		
//		// Create a Pet array to include all four objects
//		Pet[] petAry = new Pet[4];
//		petAry[0] = d1;
//		petAry[1] = d2;
//		petAry[2] = c1;
//		petAry[3] = c2;
//		
//		// Ask all pets in array to play
//		System.out.println("------------------------");
//		for (int i = 0; i < petAry.length; i++) {
//			// do something about petAry[i]
//			petAry[i].play(); 
//			// Polymorphism will make sure that dogs plays differently from cats
//		}
//		
//		// Ask all pet to print their string representation
//		System.out.println("------------------------");
//		for (int i = petAry.length - 1; i >= 0; i--) {// loop backwards
//			System.out.println(petAry[i].toString());
//		}
//		
//		System.out.println("------------------------");
//		displayPet(c1);
//		displayPet(d1);

	}
	
	public static void displayPet(Pet p) {
		p.play();
		System.out.println(p.toString());
	}
	
//	public static void displayPet(Dog d) {
//		d.play();
//		System.out.println(d.toString());
//	}
//	
//	public static void displayPet(Cat c) {
//		c.play();
//		System.out.println(c.toString());
//	}

}
