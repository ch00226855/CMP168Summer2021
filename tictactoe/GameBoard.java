package tictactoe;
import java.awt.Font;
// import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class GameBoard extends JComponent 
		implements ActionListener {
	
	private JButton[][] board;
	private char[][] boardVals;
	private int numRounds;
	
	private static final char PLAYER1MARKER = 'O';
	private static final char PLAYER2MARKER = 'X';
	
	public GameBoard() {
		board = new JButton[3][3];
		boardVals = new char[3][3];
		numRounds = 0;
		
		// initialize each button
		initializeBoard();
		
		setLayout(new GridLayout(3, 3));
		
		// add buttons to game board and 
		// connect buttons to listener
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				this.add(board[row][col]);
				board[row][col].addActionListener(this);
			}
		}
		
		setSize(600, 600);
	}
	
	public void initializeBoard() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				board[row][col] = new JButton();
				boardVals[row][col] = ' ';
				
			}
		}
	}
	
	public void clearBoard() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				board[row][col].setText("");
				boardVals[row][col] = ' ';
				
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnClicked = (JButton) e.getSource();
		
		char marker;
		if (numRounds % 2 == 0) {
			marker = PLAYER1MARKER;
		} else {
			marker = PLAYER2MARKER;
		}
		
		if (btnClicked.getText().equals("")) {
			btnClicked.setText("" + marker);
			btnClicked.setFont(new Font("Sans Serif", Font.BOLD, 40));
		}
		
		numRounds++;
		
		// Change the corresponding value the boardVals
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (btnClicked.equals(board[row][col])) {
					boardVals[row][col] = marker;
					break;
				}
			}
		}
		
//		if (player1Wins()) {
//			JOptionPane.showMessageDialog(null, "Player 1 wins!");
//		} else if (player2Wins()) {
//			JOptionPane.showMessageDialog(null, "Player 2 wins!");
//		} else if (isFull()) {
//			JOptionPane.showMessageDialog(null, "Game ends with a draw!");
//		}
		
		if (player1Wins()) {
			int result = JOptionPane.showConfirmDialog(null,"Player 1 wins! Another game?",
						"Game Result", JOptionPane.YES_NO_OPTION);
			// 0 - yes, 1 - no.
			if (result == 0) {
				System.out.println("Create a new game.");
				clearBoard();
				numRounds = 0;
			}
		}
		
	}
	
	private boolean player1Wins() {
		
		// check if player 1 wins by a row
		for (int row = 0; row < 3; row++) {
			if(boardVals[row][0] == PLAYER1MARKER &&
				boardVals[row][1] == PLAYER1MARKER &&
				boardVals[row][2] == PLAYER1MARKER) {
				return true;
			}
		}
		
		// check if player1 wins by a column
		for (int col = 0; col < 3; col++) {
			if(boardVals[0][col] == PLAYER1MARKER &&
				boardVals[1][col] == PLAYER1MARKER &&
				boardVals[2][col] == PLAYER1MARKER) {
				return true;
			}
		}
		
		// check if player1 wins by a diagonal
		if(boardVals[0][0] == PLAYER1MARKER &&
			boardVals[1][1] == PLAYER1MARKER &&
			boardVals[2][2] == PLAYER1MARKER) {
			return true;
		}
		
		if(boardVals[0][2] == PLAYER1MARKER &&
			boardVals[1][1] == PLAYER1MARKER &&
			boardVals[2][0] == PLAYER1MARKER) {
			return true;
		}
		
		return false;
	}
	
	private boolean player2Wins() {
		
		// check if player 1 wins by a row
		for (int row = 0; row < 3; row++) {
			if(boardVals[row][0] == PLAYER2MARKER &&
				boardVals[row][1] == PLAYER2MARKER &&
				boardVals[row][2] == PLAYER2MARKER) {
				return true;
			}
		}
		
		// check if player1 wins by a column
		for (int col = 0; col < 3; col++) {
			if(boardVals[0][col] == PLAYER2MARKER &&
				boardVals[1][col] == PLAYER2MARKER &&
				boardVals[2][col] == PLAYER2MARKER) {
				return true;
			}
		}
		
		// check if player1 wins by a diagonal
		if(boardVals[0][0] == PLAYER2MARKER &&
			boardVals[1][1] == PLAYER2MARKER &&
			boardVals[2][2] == PLAYER2MARKER) {
			return true;
		}
		
		if(boardVals[0][2] == PLAYER2MARKER &&
			boardVals[1][1] == PLAYER2MARKER &&
			boardVals[2][0] == PLAYER2MARKER) {
			return true;
		}
		
		return false;
	}
	
	private boolean isFull() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (boardVals[row][col] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}
