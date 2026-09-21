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

	// Done i guess...
	Deck shuffle() {
		// Create new Card
		Deck newDeck = new Deck();

		// Shuffle them
		Collections.shuffle(newDeck.cards);
		
		// Add tto this card
		this.cards.clear();
		this.cards.addAll(newDeck.cards);

		return newDeck;
	}
	
	Card take() {
		return cards.get(0);
	}

	// Optional?
	//Deck put (Card card) {
			
	//}

 	// binigay ni sir na extra nung lab
	public String toString() {
		String card = "";
		for (int i = 0 ; i < cards.size() ; i++ ) {
			card += cards.get(i) + "\n";
		}
		return "Deck: \n" + card;
	}

}