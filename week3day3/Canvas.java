package week3day3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Canvas extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		
		g.drawLine(0, 0, 999, 499);
		g.drawRect(100, 150, 800, 400);
		
		g.setColor(Color.YELLOW);
		g.fillOval(100, 150, 800, 400);
		
		g.setColor(Color.BLUE);
		g.setFont(new Font("Serif", 0, 40));
		g.drawString("This is my first GUI application",
				100, 200);
		
	}

}
