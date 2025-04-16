package Gol;

import java.awt.Graphics;

public class Conway {
	private final GridCanvas grid;

	public Conway(int rows, int cols, int size) {
		grid = new GridCanvas(rows, cols, size);
		grid.turnOn(2, 1);
		grid.turnOn(2, 2);
		grid.turnOn(2, 3);
		grid.turnOn(1, 7);
		grid.turnOn(2, 7);
		grid.turnOn(3, 7);
	}

	public void draw(Graphics g) {
		grid.draw(g);
	}

	public GridCanvas getGrid() {
		return this.grid;
	}
}
