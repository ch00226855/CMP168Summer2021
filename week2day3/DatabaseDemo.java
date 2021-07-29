package week2day3;

// import java.io.*;  // this command imports all classes from java.io.
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DatabaseDemo {

	public static void main(String[] args) throws IOException{
		
		Scanner keyboard = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.println("Enter the student's name: ");
		s1.setName(keyboard.nextLine());
		System.out.println("Enter the student's ID: ");
		s1.setId(keyboard.nextInt());
		keyboard.nextLine(); // use the new line symbol after the previous integer.
		System.out.println("Enter the student's major: ");
		s1.setMajor(keyboard.nextLine());
		
		// Write the student's info to a file
		PrintWriter pw = new PrintWriter(new FileOutputStream("data/database_demo.txt", true));
		
		pw.println(s1.toString());
		pw.flush();
		
		pw.close();
		
		// Read the student information from the file, and recreate the student
		Student s2 = new Student();
		Scanner database = new Scanner(new File("data/database_demo.txt"));
		
		String line = database.nextLine();
		String[] values = line.split(", ");
		
		s2.setName(values[0]);
		int id = Integer.parseInt(values[1]);
		s2.setId(id);
		s2.setMajor(values[2]);
		
		System.out.println(s2.toString());
	}



}
