package week2day1;

public class InterfaceDriver {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Husky", "Bones", true, "Balls", 50.0);
		
		Food f1 = new Food("Big bone", 500, 1);
		
		System.out.println("Weight before eating: " + d1.getWeight());
		d1.eat();
		d1.eat(f1);
		d1.metabolizeFood(f1);
		System.out.println("Weight after eating: " + d1.getWeight());
		
		d1.speak();
		d1.speak("I like food!");
		
		System.out.println("----------------");
		letItSpeak(d1);
	}

	public static void letItSpeak(Communicator c) {
		c.speak();
		c.speak("Hello!");
	}
}
