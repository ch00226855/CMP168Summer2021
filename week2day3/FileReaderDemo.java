package week2day3;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("data/words.txt");
		
		char nextChar;
		do {
			nextChar = (char) reader.read();
			System.out.print(nextChar);
		} while (nextChar != (char) -1);
	}

}
