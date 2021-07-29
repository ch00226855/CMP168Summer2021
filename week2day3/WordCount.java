package week2day3;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("data/words.txt");
		Scanner fileScanner = new Scanner(file);
		Scanner keyboard = new Scanner(System.in);
		
		// Ask the user to specify the word.
		System.out.println("Enter a word:");
		String targetWord = keyboard.next();
		
		// Create a loop to go through all words in the file.
		int count = 0;
		while (fileScanner.hasNext()) {
			// Whenever the word appears, count++
			if (targetWord.equals(fileScanner.next().toLowerCase())) {
				count++;
			}
		}
		
		// Print the final value of count.
		System.out.println("Word " + targetWord + " has appeared: " + count);

	}

}
