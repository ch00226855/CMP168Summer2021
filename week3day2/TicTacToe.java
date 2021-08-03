package week3day2;

public class TicTacToe {

	private char[][] board = null;
	
	private String player1Name;
	private String player2Name;
	private final static char PLAYER1MARKER = 'O';
	private final static char PLAYER2MARKER = 'X';
	
	public TicTacToe() {
		this.board = new char[3][3];
		this.player1Name = "";
		this.player2Name = "";
	}
	
	/*
	 * Make the board empty
	 */
	public void initializeBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	/*
	 * Display the board in the console.
	 */
	public void displayBoard() {
		System.out.println("-------");
		System.out.println("|" + board[0][0] + "|" + board[0][1] +
				"|" + board[0][2] + "|");
		System.out.println("-------");
		System.out.println("|" + board[1][0] + "|" + board[1][1] +
				"|" + board[1][2] + "|");
		System.out.println("-------");
		System.out.println("|" + board[2][0] + "|" + board[2][1] +
				"|" + board[2][2] + "|");
		System.out.println("-------");
	}
	
	/*
	 * Place a piece on the board.
	 */
	public void placePiece(String player,
							int rowIndex,
							int colIndex) {
		char marker;
		if (player.equals(player1Name)) {
			marker = PLAYER1MARKER;
		} else if (player.equals(player2Name)) {
			marker = PLAYER2MARKER;
		} else {
			System.out.println("Player not recognized.");
			marker = '?';
		}
		
		board[rowIndex][colIndex] = marker;
	}

	public String getPlayer1Name() {
		return player1Name;
	}

	public void setPlayer1Name(String player1Name) {
		this.player1Name = player1Name;
	}

	public String getPlayer2Name() {
		return player2Name;
	}

	public void setPlayer2Name(String player2Name) {
		this.player2Name = player2Name;
	}
}
