public class Card {

	// Constructor stuff
	String suit;
	String rank;

	// Static means you can access it on everywhere and it does not change 
	// or something
	final static String[] SUITS = {"hearts", "spades", "diamonds", "clubs"};
	final static String[] RANKS = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String toString() {
		return this.suit + " of " + this.rank;
	}
}