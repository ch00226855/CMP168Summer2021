package tictactoe;

import javax.swing.JFrame;

public class GameDriver {

	public static void main(String[] args) {
		
		TicTacToeFrame window = new TicTacToeFrame();
		
		window.setTitle("Tic Tac Toe");
		window.setSize(750, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
