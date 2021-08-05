package week3day3;

import javax.swing.JFrame;

public class HistogramDrawer {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Histogram");
		
		Histogram graph = new Histogram(500, 300, 800);
		
		window.setSize(1000, 550);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		window.add(graph);

	}

}
