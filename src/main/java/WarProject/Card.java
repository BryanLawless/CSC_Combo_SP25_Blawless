package WarProject;

public class Card {
	private int rank;
	private int suit;
	private final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public boolean equals(Card that) {
		return this.rank == that.rank & this.suit == that.suit;
	}

	public int compareTo(Card that) {
		if (this.suit < that.suit) return -1;
		if (this.suit > that.suit) return 1;

		if (this.rank < that.rank) return -1;
		if (this.rank > that.rank) return 1;

		return 0;
	}

    @Override
    public String toString() {
		return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
}
