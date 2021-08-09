package finalprojectstarter;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MineSweeperBoard extends JComponent 
							implements ActionListener {
	
	private JButton[][] board;
	private Grid grid;
	
	public MineSweeperBoard() {
		board = new JButton[10][10];
		grid = new Grid();
		
		this.setLayout(new GridLayout(10, 10));
		
//		JButton test = new JButton("Test");
//		this.add(test);
		
		// initializeBoard();
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				board[row][col] = new JButton("#");
				board[row][col].setFont(new Font("Serif", Font.BOLD, 40));
				this.add(board[row][col]);
				// link buttons to actionlistener
				board[row][col].addActionListener(this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnClicked = (JButton) e.getSource();
		
		// Find the row and column index of this button.
		int rowIndex = -1;
		int colIndex = -1;
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				if(btnClicked.equals(board[row][col])) {
					rowIndex = row;
					colIndex = col;
				}
			}
		}
		
		// Show "*" if there is a bomb under the cell.
		if(grid.isBombAtLocation(rowIndex, colIndex)) {
			btnClicked.setText("*");
		} else {
			// TODO Show the number of bombs in adjacent cells.
		}
		
		// Determine how the game show continue
		// Case 1: user clicked a bomb 
		//      -> show "Game Over" and ask if the user wants another game.
		//      -> reveal all the bombs
		// Case 2: user revealed all safe cells -> show "You won!" and ask if the user wants another game.
		
		
	}

}
