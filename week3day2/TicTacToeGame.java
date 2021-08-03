package week3day2;

public class TicTacToeGame {

	public static void main(String[] args) {
		
		TicTacToe game = new TicTacToe();
		
		game.setPlayer1Name("Alice");
		game.setPlayer2Name("Bob");
		
		game.initializeBoard();
		
		game.displayBoard();
		
		// ALice takes a move.
		game.placePiece("Alice", 0, 0);
		game.displayBoard();
		
		// Bob places a piece
		game.placePiece("Bob", 0, 2);
		game.displayBoard();

	}

}
