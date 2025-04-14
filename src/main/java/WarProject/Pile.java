package WarProject;

import java.util.ArrayList;
import java.util.Arrays;

public class Pile {
	private ArrayList<Card> cards;
	
	public Pile() {
		this.cards = new ArrayList<>();
	}

	public Card popCard() {
		return this.cards.remove(0);
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}

	public void addDeck(Deck deck) {
        this.cards.addAll(Arrays.asList(deck.getCards()));
	}
}
