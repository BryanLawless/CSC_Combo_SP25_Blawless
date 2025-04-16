package Gol;

import java.awt.Canvas;
import java.awt.Graphics;

public class GridCanvas extends Canvas {
	private final Cell[][] cells;

	public GridCanvas(int rows, int cols, int size) {
		cells = new Cell[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				cells[i][j] = new Cell(j * size, i * size, size);
			}
		} 

		setSize(cols * size, rows * size);
	}

	public void draw(Graphics g) {
		for (Cell[] row : this.cells) {
			for (Cell cell : row) {
				cell.draw(g);
			}
		}
	}

    @Override
	public void paint(Graphics g) {
		this.draw(g);
	}

	public int numRows() {
		return this.cells.length;
	}

	public int numColumns() {
		return this.cells[0].length;
	}

	public Cell getCell(int row, int col) {
		return this.cells[row][col];
	}

	public void turnOn(int row, int col) {
		this.cells[row][col].turnOn();
	}

	public void turnOff(int row, int col) {
		this.cells[row][col].turnOff();
	}
}
