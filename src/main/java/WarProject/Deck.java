package WarProject;
public class Deck {
	private Card[] cards;

	public Deck() {
		this.cards = new Card[52];
		
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				this.cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}

	public Deck(int n) {
		this.cards = new Card[n];
	}

	public Deck subDeck(int low, int high) {
		Deck sub = new Deck(high - low + 1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		
		return sub;
	}


	public Card[] getCards() {
		return this.cards;
	}

	public void print() {
		for (Card card : this.cards) {
			System.out.println(card);
		}
	}

	public void selectionSort() {
		for (int i = 0; i < this.cards.length; i++) {
			int lowestIndex = indexLowest(i, this.cards.length);
			swap(i, lowestIndex);
		}
	}

	public void shuffle() {
		for (int i = 0; i < this.cards.length; i++) {
			int randomIndex = (int) (Math.random() * this.cards.length);
			swap(i, randomIndex);
		}
	}

	private void swap(int source, int target) {
		Card temp = this.cards[source];
		this.cards[source] = this.cards[target];
		this.cards[target] = temp;
	}

	private int indexLowest(int low, int high) {
		int lowestIndex = low;
		
		for (int i = low; i < high; i++) {
			if (this.cards[i].compareTo(this.cards[lowestIndex]) < 0) {
				lowestIndex = i;
			}
		}
		
		return lowestIndex;
	}
}