package week1day2;

import java.util.Scanner;

public class CountLetters {
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      String inputWord;
	      int numLetters;
	      int i;

	      System.out.print("Enter a word: ");
	      inputWord = scnr.next();

	      numLetters = 0;
	      for (i = 0; i < inputWord.length(); ++i) {
	         if (Character.isLetter(inputWord.charAt(i))) {
	            numLetters += 1;
	         }
	      }

	      System.out.println("Number of letters: " + numLetters);
	   }
	}