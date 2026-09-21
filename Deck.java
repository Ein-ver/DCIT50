// Author: Eidhan Blidenyl S. Ceneta
// Year and Section: BSCS 2-7
// Student ID: 251017563
// Date: September 21, 2026

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> cards = new ArrayList<>();

	Deck() {

		// binigay ni sir na extra nung lab
		for (String suit : Card.SUITS) {
			for (String rank : Card.RANKS) {
				Card newCard = new Card(suit, rank);
				this.cards.add(newCard);
			}
		}
	}

 	// binigay ni sir na extra nung lab
	public String toString() {
		String card = "";
		for (int i = 0 ; i < cards.size() ; i++ ) {
			card += cards.get(i) + "\n";
		}
		return "Deck: \n" + cards;
	}

}