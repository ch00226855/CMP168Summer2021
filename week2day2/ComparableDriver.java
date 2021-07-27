package week2day2;

public class ComparableDriver {

	public static void main(String[] args) {
		
		Course c1 = new Course("CMP", 168);
		Course c2 = new Course("MAT", 334);
		Course c3 = new Course("CMP", 167);
		
		System.out.println(c1.compareTo(c1));
		System.out.println(c1.compareTo(c2)); // -10 means c1 goes first
		System.out.println(c1.compareTo(c3)); // 1 means c3 goes first
		
		// c3 < c1 < c2
		// CMP167 < CMP168 < MAT334
		
		Person p1 = new Person("Alice", 1958);
		Person p2 = new Person("Bob", 2002);
		Person p3 = new Person("Charlie", 1999);
		Person p4 = new Person("Daivd", 2010);
		
		// Find the minimum object among the Persons
		
//		int[] ary = {19, 4, 10, 18};
//		int minSoFar = ary[0];
//		for (int i = 0; i < ary.length; i++) {
//			if (ary[i] < minSoFar) {
//				minSoFar = ary[i];
//			}
//		}
//		System.out.println("Minimum: " + minSoFar);
		
		Person[] ary = {p1, p2, p3, p4};
		Person minSoFar = p1;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i].compareTo(minSoFar) < 0) {
				minSoFar = ary[i];
			}
		}
		System.out.println("Minimum: " + minSoFar);
		
		// compare a Person with an Employee
		Employee e1 = new Employee("Fred", 2008);
		Employee e2 = new Employee("Ted", 2008);
		
		System.out.println(e1.compareTo(e2));
		System.out.println(e1.compareTo(p1));
		System.out.println(e2.compareTo(e1));
		System.out.println(p1.compareTo(e1));
		
		
	}

}
