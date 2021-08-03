package project1;


//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver_SchoolDB {
	private static final String INITIAL_FILE_LOCATION = "SchoolDB_Initial.txt";	
	private static final String FILE_LOCATION = "SchoolDB_Updated.txt";
	
	private ArrayList<Course> courses;
	private ArrayList<Person> persons;
	private ArrayList<Employee> employees;
	private ArrayList<Faculty> faculty;
	private ArrayList<GeneralStaff> genStaff;
	private ArrayList<Student> students;
	
	
	private Driver_SchoolDB(){
		courses = new ArrayList<Course>();
		persons = new ArrayList<Person>();
		employees = new ArrayList<Employee>();
		faculty = new ArrayList<Faculty>();
		genStaff = new ArrayList<GeneralStaff>();
		students = new ArrayList<Student>();
		populateDBFromFile(INITIAL_FILE_LOCATION);//populate db from file
	}
	public static void main(String [] args){
		Driver_SchoolDB schoolDB = new Driver_SchoolDB();
		schoolDB.displayDBContent();
		
//		/*  */
//		//create content to make add to DB in memory
//		//3 Students
//		Student s1 = new Student("Me", 1870, "Hematology", true);
//		Student s2 = new Student("You", 1828, "Combat", false);
//		Student s3 = new Student("Someone", 1999, "Sleeping", false);
//		//3 Faculty
//		Faculty f1 = new Faculty("Warlock", 1918, "Magic", false);
//		Faculty f2 = new Faculty("Invisible", 1492, "Hiding", true);
//		Faculty f3 = new Faculty("Witch", 1301, "Spells", true);
//		//10 courses instead of just 3
//		Course [] someCourses = new Course[20];
//		for(int i=0; i<someCourses.length; i++){
//			someCourses[i] = new Course(false, 700+i, "MAT", 4);
//			//add courses to student and faculty objects
//			if(i%2==0){
//				s2.addCourseTaken(someCourses[i]);
//				f2.addCourseTaught(someCourses[i]);
//			}
//			else{
//				s1.addCourseTaken(someCourses[i]);
//				f1.addCourseTaught(someCourses[i]);
//			}
//		}
//		Course [] odd2Courses = {new Course(true, 788, "CMP", 4),new Course(true, 799, "CMP", 4)};
//		Course [] even2Courses = {new Course(true, 756, "BIO", 4),new Course(true, 772, "BIO", 4)};
//		
//
//		f1.addCoursesTaught(even2Courses);
//		s2.addCoursesTaken(odd2Courses);
//		
//		schoolDB.faculty.add(f1);
//		schoolDB.faculty.add(f2);
//		schoolDB.faculty.add(f3);
//		schoolDB.students.add(s1);
//		schoolDB.students.add(s2);
//		schoolDB.students.add(s3);
//		
//		/* done adding courses to faculty and students */
//
//		//3 GeneralStaff
//		GeneralStaff gs1 = new GeneralStaff("Popeye", 1898, "Cartoon", "Save Olive");
//		GeneralStaff gs2 = new GeneralStaff("Bruto", 1902, "Cartoon", "Capture Olive");
//		GeneralStaff gs3 = new GeneralStaff("Olive Oil", 1908, "Cartoon", "Screaming");
//
//		
//		
//		
//		
////		System.out.println("Course Taught at index 0 for f1: " + f1.getCourseTaught(0));
////		System.out.println("Course Taught at index 2 for f1: " + f1.getCourseTaught(2));
////		System.out.println("Course Taught at index -1 for f1: " + f1.getCourseTaught(-1));
////		System.out.println("Course Taught at index 100 for f1: " + f1.getCourseTaught(100));
////
////		System.out.println("Course Taken at index 0 for s1: " + s1.getCourseTaken(0));
////		System.out.println("Course Taken at index 2 for s1: " + s1.getCourseTaken(2));
////		System.out.println("Course Taken at index -1 for s1: " + s1.getCourseTaken(-1));
////		System.out.println("Course Taken at index 50 for s1: " + s1.getCourseTaken(50));
//		
////		System.out.println("course is taught = "+f1.getCourseTaught(0).equals(someCourses[1]));
//		
//		schoolDB.displayDBContent();
//		schoolDB.saveDBtoFile();
	}
	
	
	
	private void saveDBtoFile() {
		FileWriter fOut=null;
		try {
			fOut = new FileWriter(new File(FILE_LOCATION), false);
			for(Course c : courses){
				fOut.write("Course: "+c.isGraduateCourse()+", "+c.getCourseNum()+", "+c.getCourseDept()+", "+c.getNumCredits()+"\n");
				fOut.flush();
			}
			for(Person p : persons){
				fOut.write("Person: "+p.getName()+", "+p.getBirthYear()+"\n");
				fOut.flush();
			}
			for(Employee e : employees){
				fOut.write("Employee: "+e.getName()+", "+e.getBirthYear()+", "+e.getDeptName()+"\n");
				fOut.flush();
			}
			for(Faculty f : faculty){
				fOut.write("Faculty: "+f.getName()+", "+f.getBirthYear()+", "+f.getDeptName()+", "+f.isTenured()+"\n");
				fOut.write("Courses Taught: " + f.getAllCoursesTaughtAsString()+"\n");
				fOut.flush();
			}
			for(GeneralStaff g : genStaff){
				fOut.write("GeneralStaff: "+g.getName()+", "+g.getBirthYear()+", "+g.getDeptName()+", "+g.getDuty()+"\n");
				fOut.flush();
			}
			for(Student s : students){
				fOut.write("Student: "+s.getName()+", "+s.getBirthYear()+", "+s.getMajor()+", "+s.isGraduate()+"\n");
				fOut.write("Courses Taken: " + s.getAllCoursesTakenAsString()+"\n");
				fOut.flush();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			if(fOut !=null){
				fOut = null;
			}
			System.out.println("DONE WRITING TO FILE");
		}
		
	}
	private void populateDBFromFile(String fileName){
		Scanner fIn = null;
		try {
			fIn = new Scanner(new File(fileName));
			
			while(fIn.hasNextLine()){
				String currLine = fIn.nextLine();
				System.out.println(currLine);//display file content on console
				int indexOfColon = currLine.indexOf(":");
				if(indexOfColon != -1){
					String constructorName = currLine.substring(0,indexOfColon);
					String [] constructorParams = currLine.substring(indexOfColon+1).split(",");
					if(constructorParams.length > 0){
						createInstanceAndAddToArray(constructorName, constructorParams);
					}
				}
			}
			fIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
//			System.out.println("DONE with set up");
			if(fIn != null){
				fIn = null;
			}
		}
		
	}
	private void createInstanceAndAddToArray(String constructorName, String[] constructorParams) {
		String constName = constructorName.trim();
		switch(constName){
		case "Course":// Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits)
			courses.add(getInstanceOfCourseObject(constructorParams));
			break;
		case "Person":// Person() || Person(String name, int birthYear) 
			persons.add(getInstanceOfPersonObject(constructorParams));
			break;
		case "Employee":// Employee() || Employee(String deptName) || Employee(String name, int birthYear, String deptName) 
			employees.add(getInstanceOfEmployeeObject(constructorParams));
			break;
		case "Faculty":
			faculty.add(getInstanceOfFacultyObject(constructorParams));
			break;
		case "GeneralStaff":
			genStaff.add(getInstanceOfGeneralStaffObject(constructorParams));
			break;
		case "Student":
			students.add(getInstanceOfStudentObject(constructorParams));
			break;
		default:
//			System.out.println("Dunno what constructor "+constName);
			break;
		}
		
	}
	
	private Course getInstanceOfCourseObject(String... constructorParams){
		
				boolean isGrad = Boolean.valueOf(constructorParams[0].trim());
				int crsNum = Integer.valueOf(constructorParams[1].trim());
				String crsDept = constructorParams[2].trim();
				int numCrd = Integer.valueOf(constructorParams[3].trim());
				return new  Course(isGrad,crsNum,crsDept,numCrd);
	}
	private Person getInstanceOfPersonObject(String... constructorParams) {
		switch(constructorParams.length){
		case 2:
			String name = constructorParams[0].trim();
			int birthYear = Integer.valueOf(constructorParams[1].trim());
			return new Person(name, birthYear);
		default: 
			return new Person();
		}
	}
	private Employee getInstanceOfEmployeeObject(String... constructorParams) {	
		switch(constructorParams.length){
			case 1://Employee(String deptName)
				return new Employee(constructorParams[0].trim());
				
			case 3://Employee(String name, int birthYear, String deptName)
				String name = constructorParams[0].trim();
				int birthYear = Integer.valueOf(constructorParams[1].trim());
				return new Employee(name, birthYear, constructorParams[2].trim());
				
			default: //Employee()
				return new Employee();
			}
	}
	private Faculty getInstanceOfFacultyObject(String... constructorParams) {	
		switch(constructorParams.length){
			case 1://Faculty(boolean isTenured)	
				return new Faculty(Boolean.valueOf(constructorParams[0].trim()));
			case 2://Faculty(String deptName, boolean isTenured)
				return new Faculty(constructorParams[0].trim(), Boolean.valueOf(constructorParams[1].trim()));
			case 4://Faculty(String name, int birthYear, String deptName, boolean isTenured)
				String name = constructorParams[0].trim();
				int birthYear = Integer.valueOf(constructorParams[1].trim());
				String deptName = constructorParams[2].trim();
				boolean isTenured = Boolean.valueOf(constructorParams[3].trim());
				return new Faculty(name, birthYear, deptName, isTenured);
			default: //Faculty()
				return new Faculty();
			}
	}

	private GeneralStaff getInstanceOfGeneralStaffObject(String... constructorParams) {	
		switch(constructorParams.length){
			case 1://GeneralStaff(String duty)
				return new GeneralStaff(constructorParams[0].trim());
			case 2://GeneralStaff(String deptName, String duty)
				return new GeneralStaff(constructorParams[0].trim(), constructorParams[1].trim());
			case 4://GeneralStaff(String name, int birthYear, String deptName, String duty)
				String name = constructorParams[0].trim();
				int birthYear = Integer.valueOf(constructorParams[1].trim());
				String deptName = constructorParams[2].trim();
				String duty = constructorParams[3].trim();
				return new GeneralStaff(name, birthYear, deptName, duty);
			default: //GeneralStaff()
				return new GeneralStaff();
			}
	}
	private Student getInstanceOfStudentObject(String... constructorParams) {	
		switch(constructorParams.length){
			case 1://Student(boolean isGraduate)	
				return new Student(Boolean.valueOf(constructorParams[0].trim()));
			case 2://Student(String major, boolean isGraduate)
				return new Student(constructorParams[0].trim(), Boolean.valueOf(constructorParams[1].trim()));
			case 4://Student(String name, int birthYear, String major, boolean isGraduate)
				String name = constructorParams[0].trim();
				int birthYear = Integer.valueOf(constructorParams[1].trim());
				String deptName = constructorParams[2].trim();
				boolean isGraduate = Boolean.valueOf(constructorParams[3].trim());
				return new Student(name, birthYear, deptName, isGraduate);
			default: //Student()
				return new Student();
			}
	}

	public void displayDBContent(){
		System.out.println("\n**************************************************************\nSCHOOL DATABASE INFO:");
		System.out.println("\n************************************************\nCOURSES:");
		displayCourseArrInfo();
		System.out.println("\n************************************************\nPERSONS:");
		displayPersonArrInfo(persons);
		System.out.println("\n************************************************\nEMPLOYEES:");
		displayPersonArrInfo(employees);
		System.out.println("\n************************************************\nGENERAL STAFF:");
		displayPersonArrInfo(genStaff);
		System.out.println("\n************************************************\nFACULTY:");
		displayPersonArrInfo(faculty);
		System.out.println("\n************************************************\nSTUDENTS:");
		displayPersonArrInfo(students);
		System.out.println("\n**************************************************************\n");
	}
	private void displayPersonArrInfo(ArrayList<? extends Person> persons){
		for(Person p : persons){
			System.out.println(p.toString());
		}

		System.out.print("************************************************");
	}
	private void displayCourseArrInfo(){
		for(Course c : courses){
			System.out.println(c.toString());
		}

		System.out.print("************************************************");
	}

}
