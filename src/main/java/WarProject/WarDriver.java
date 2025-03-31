package WarProject;

public class WarDriver {
	public static void main(String[] args) {
		Card[] cards = new Card[52];

		makeDeck(cards);
		printDeck(cards);

	}

	public static void printDeck(Card[] cards) {
		if (cards[0] == null) {
			System.out.println("No cards yet");
			return;
		}

		for (Card card : cards) {
			System.out.println(card);
		}
	}

	public static void makeDeck(Card[] cards) {
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
}
