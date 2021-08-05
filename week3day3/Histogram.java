package week3day3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Histogram extends JComponent {
	
	private int width1, width2, width3;
	
	public Histogram(int width1, int width2, int width3) {
		this.width1 = width1;
		this.width2 = width2;
		this.width3 = width3;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g.setColor(new Color(102, 102, 0));
		g.fillRect(50, 50, width1, 100);
		
		g.setColor(Color.CYAN);
		g.fillRect(50, 200, width2, 100);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(50, 350, width3, 100);
	}

}
