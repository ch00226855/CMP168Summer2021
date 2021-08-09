package finalprojectstarter;

import javax.swing.JFrame;

public class MineSweeperGame {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Mine Sweeper");
		
		MineSweeperBoard board = new MineSweeperBoard();
		window.add(board);
		
		window.setSize(600, 600);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

}
