package tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class ScoreBoard extends JComponent {
	
	private String player1Name;
	private String player2Name;
	private int player1Score;
	private int player2Score;
	
	public ScoreBoard(String player1Name,
					String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
		this.player1Score = 0;
		this.player2Score = 0;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(Color.DARK_GRAY);
		g2D.setFont(new Font("Serif", Font.BOLD, 40));
		g2D.drawString("Tic Tac Toe Game", 100, 50);
		
		g2D.setColor(Color.MAGENTA);
		String scoreString = String.format(
				"%5s: %2d   -  %20s: %2d",
				player1Name, player1Score,
				player2Name, player2Score);
		g2D.drawString(scoreString, 100, 120);
	}

}
