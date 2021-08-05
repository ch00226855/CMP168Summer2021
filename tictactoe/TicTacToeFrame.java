package tictactoe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class TicTacToeFrame extends JFrame {
	
	private GameBoard gameBoard;
	private ScoreBoard scoreBoard;
	
	public TicTacToeFrame() {
		gameBoard = new GameBoard();
		scoreBoard = new ScoreBoard("Alice", "Bob");
		
		setLayout(new BorderLayout());
		
		add(scoreBoard, BorderLayout.NORTH);
		scoreBoard.setPreferredSize(new Dimension(600, 150));
		add(gameBoard, BorderLayout.CENTER);
		gameBoard.setPreferredSize(new Dimension(600, 600));
		
	}

}
