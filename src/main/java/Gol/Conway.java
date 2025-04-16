package Gol;

import java.awt.Graphics;

public final class Conway {
	private final GridCanvas grid;

	public Conway(int rows, int cols, int size) {
		grid = new GridCanvas(rows, cols, size);
		this.randomGrid();
	}

	public void draw(Graphics g) {
		grid.draw(g);
	}

	public GridCanvas getGrid() {
		return this.grid;
	}

	private void update() {
		int[][] counts = countNeighbors();
		updateGrid(counts);
	}

	private void updateGrid(int[][] counts) {
		int rows = this.grid.numRows();
		int cols = this.grid.numColumns();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Cell cell = this.grid.getCell(i, j);
				updateCell(cell, counts[i][j]);
			}
		}
	}

	public void randomGrid() {
		int rows = this.grid.numRows();
		int cols = this.grid.numColumns();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (Math.random() < 0.5) {
					this.grid.turnOn(i, j);
				} else {
					this.grid.turnOff(i, j);
				}
			}
		}
	}

	private void updateCell(Cell cell, int count) {
		if (cell.isOn()) {
			if (count < 2 || count > 3) cell.turnOff();
		} else {
			if (count == 3) cell.turnOn();
		}
	}

	private int[][] countNeighbors() {
		int rows = this.grid.numRows();
		int cols = this.grid.numColumns();
		int[][] counts = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				counts[i][j] = countAlive(i, j);
			}
		}

		return counts;
	}

	public void mainLoop() {
		while (true) { 
			this.update();
			this.grid.repaint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	public int countAlive(int row, int col) {
		int count = 0;
		count += this.grid.test(row - 1, col - 1);
		count += this.grid.test(row - 1, col);
		count += this.grid.test(row - 1, col + 1);
		count += this.grid.test(row, col - 1);
		count += this.grid.test(row, col + 1);
		count += this.grid.test(row + 1, col - 1);
		count += this.grid.test(row + 1, col);
		count += this.grid.test(row + 1, col + 1);

		return count;
	}
}
