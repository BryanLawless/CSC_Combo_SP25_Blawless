package WarProject;

public class WarDriver {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();

		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0, 25));

		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26, 51));

		while (!p1.isEmpty() && !p2.isEmpty()) { 
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();

			System.out.println(c1 + " - " + c2);

			int diff = c1.getRank() - c2.getRank();
			
			if (diff > 0) {
				p1.addCard(c1);
				p2.addCard(c2);
			} else if (diff < 0) {
				p2.addCard(c1);
				p2.addCard(c2);
			} else {}
		}

		if (p2.isEmpty()) {
			System.out.println("Player one wins!");
		} else {
			System.out.println("Player two wins!");
		}
	}

	public static Card search(Card[] cards) {
		return null;
	}
}
