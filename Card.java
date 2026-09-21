// Author: Eidhan Blidenyl S. Ceneta
// Year and Section: BSCS 2-7
// Student ID: 251017563
// Date: September 21, 2026

// eto okay nato

public class Card {

	// Constructor stuff
	String suit;
	String rank;

	// Static means you can access it on everywhere and it does not change 
	// or something
	final static String[] SUITS = {"hearts", "spades", "diamonds", "clubs"};
	final static String[] RANKS = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	Card(String suit, String rank) {
		// binigay ni sir na extra nung lab
		this.suit = suit;
		this.rank = rank;
	}

	public String toString() {
		// binigay ni sir na extra nung lab
		return this.suit + " of " + this.rank;
	}
}