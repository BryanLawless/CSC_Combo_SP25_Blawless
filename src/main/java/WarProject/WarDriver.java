package WarProject;

public class WarDriver {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		deck.print();

		System.out.println(" ---------------------------------------- SORTED: ----------------------------------------");

		deck.selectionSort();
		deck.print();
	}

	public static Card search(Card[] cards) {
		return null;
	}
}
