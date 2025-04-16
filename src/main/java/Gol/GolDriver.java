package Gol;

import javax.swing.JFrame;

public class GolDriver {
	public static void main(String[] args) {
		int rows = 15;
		int cols = 30;
		int size = 20;

		String title = "Bryan's Game of Life";
		Conway game = new Conway(rows, cols, size);
		
		JFrame frame = new JFrame(title);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(cols * size, rows * size);
		frame.setResizable(false);

		frame.add(game.getGrid());
		frame.pack();
		frame.setVisible(true);
	}
}
