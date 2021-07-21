package week1day2;

public class ArraysDemo {
	
	public static void modifyInt(int x) {
		
		x = x * 2;
		
	}
	
	public static void modifyArray(int[] ary) {
		ary[0] = 10;
	}

	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0] = "Alice";
		names[1] = "Bob";
		names[2] = "Charles";
		names[3] = "David";
		names[4] = "Eva";
		
//		names[5] = "Fred"; // This will cause an index-out-of-bound error.
		
		int x = 5;
		modifyInt(x);
		System.out.println(x); // 5? 10?
		
		int[] ary = {1, 2, 3, 4};
		modifyArray(ary);
		System.out.println(ary[0]); //1? 10?

	}

}
