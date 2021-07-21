package week1day2;

import java.util.Scanner;

public class Conversation {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int randNum;       // Random number 0 to 3
      String userText;      // User input

      System.out.println("Tell me something about yourself.");
      System.out.println("You can type \"Goodbye\" at anytime to quit.\n");
      System.out.println();
      System.out.print("> ");

      userText = scnr.nextLine();

      while (!userText.equals("Goodbye")) {
         randNum = userText.length() % 4; // "Random" num. %4 ensures 0-3
         System.out.println();

         if (randNum == 0) {
            System.out.println("Please explain further.");
         }
         else if (randNum == 1) {
            System.out.println("Why do you say: \"" + userText + "\"?");
         }
         else if (randNum == 2) {
            System.out.println("I don't think that's right.");
         }
         else if (randNum == 3) {
            System.out.println("What else can you share?");
         }
         else {
            System.out.println("Uh-oh, something went wrong. Try again.");
         }
         System.out.println();
                   System.out.print("> ");
         userText = scnr.nextLine();
      }
      System.out.println();

      System.out.println("It was nice talking with you. Goodbye.");
   }
}
