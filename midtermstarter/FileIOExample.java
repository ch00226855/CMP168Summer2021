package midtermstarter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * This class demonstrates how to interact with text files.
 */

public class FileIOExample {
	
	public static void main(String[] args) {
		
		// Read from file "SchoolDB_initial.txt"
		// Display the content of "SchoolDB_initial.txt" to the screen
		
		File inputFile = new File("SchoolDB_initial.txt");
		Scanner input = null;
		String line;
		
		try {
			input = new Scanner(inputFile);
			line = input.nextLine();
			System.out.println(line);
			while (input.hasNext()) {
				line = input.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("SchoolDB_initial.txt does not exist.");
			e.printStackTrace();
		} finally {
			if (input != null) {
				input.close();
			}
		}
		
		// Read from file "SchoolDB_initial.txt"
		// Split each line into useful information about an object.
		
		int colonIndex = -1;
		String className = null;
		
		Scanner input2 = null;
		
		try {
			input2 = new Scanner(inputFile);
			
			
			// Identify the class name of this object.
			

			
			while (input2.hasNext()) {
				
				line = input2.nextLine();
				colonIndex = line.indexOf(":");
				
				if (colonIndex != -1) {
					className = line.substring(0, colonIndex);
					System.out.println("Class name:" + className);
				}
				
				switch(className) {
				case "Course":
					int commaIndex = line.indexOf(",", colonIndex);
					
					String lineAfterColon = line.substring(colonIndex + 1);
					String[] values = lineAfterColon.split(",");
					boolean isGraduateCourse = Boolean.parseBoolean(values[0].trim());
					int courseNum = Integer.parseInt(values[1].trim());
					String courseDept = values[2].trim();
					int numCredits = Integer.parseInt(values[3].trim());
					System.out.println("Course info: " + isGraduateCourse + " " + courseNum + " " + courseDept + " " + numCredits);
					Course newCourse = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
					break;
				default:
					break;
				}
			}
			
			// store the attribute values
			
			// use the attribute values to construct this object.
		} catch (Exception e) {
			// TODO implement this
			System.out.println("File Not Found exception not properly handled.");
		} finally {
			input.close();
		}
		
		// Write new information to file "SchoolDB_Updated.txt"
		Course newCourse2 = new Course(true, 123, "CMP", 3);
		File outputFile = new File("SchoolDB_Updated.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(outputFile);
			pw.println(newCourse2.toString());
			pw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

}
