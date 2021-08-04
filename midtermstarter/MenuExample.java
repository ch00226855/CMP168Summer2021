package midtermstarter;

import java.util.Scanner;

/*
 * This class is to demonstrate how to create a text menu, 
 * so that users can give orders to the program.
 */

public class MenuExample {

	public static void main(String[] args) {
		
		// print all the options in the console (provide an option 0 to exit)
		// prompt the user to enter an option number
		// perform the corresponding action (a switch block is needed)
		// repeat 1 - 3. (a loop is needed: while(userOption != 0))
		
		Scanner keyboard = new Scanner(System.in);
		int userOption = -1;
		
		while(userOption != 0) {
			
			System.out.println("============ Menu ====================");
			System.out.println("= 1. Add a new student               =");
			System.out.println("= 2. Get info of an existing student =");
			System.out.println("= 0. Exit                            =");
			System.out.println("======================================");
			
			System.out.println("Please choose an option:");
			userOption = keyboard.nextInt();
			
			switch(userOption) {
			case 1:
				// TODO ask user info about the new student
				
				// TODO create a new student object. Add the student to the student array.
				System.out.println("A new student is created.");
				break;
			case 2:
				// TODO ask user the studentID
				
				// TODO find the student, call its toString() to display student information
				System.out.println("The info of an existing student is displayed.");
				break;
				
			case 0:
				System.out.println("Exiting the program. Goodbye!");
				break;
			default:
				System.out.println("Option not implemented.");
			}
		}
	}

}
