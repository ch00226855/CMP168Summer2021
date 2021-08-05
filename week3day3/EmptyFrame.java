package week3day3;

import javax.swing.JFrame;

public class EmptyFrame {

	public static void main(String[] args) {
		
		// Create a new window
		JFrame window = new JFrame("My First Window");
		
		Canvas canvas = new Canvas();
		
		window.add(canvas);
		
		window.setSize(1000, 500);
		window.setResizable(true);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
