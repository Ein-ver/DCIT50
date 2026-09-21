// Author: Eidhan Blidenyl S. Ceneta
// Year and Section: BSCS 2-7
// Student ID: 251017563
// Date: September 21, 2026

import java.util.ArrayList;

public class Hand {
	ArrayList<Card> cards = new ArrayList<>();

	Hand addCard(Card card) {
		Hand adds = new Hand();
		cards.add(card);

		adds.cards.addAll(cards);
		return adds;	
	}

	Hand removeCard(Card card) {
		Hand remove = new Hand();

		// put the card back to where it belongs
		Blackjack.deck.put(card);

		cards.remove(card);
		remove.cards.addAll(cards);
		return remove;
	}

	int indexOfCard(Card card) {
		Card find = card;

		for ( int i = 0 ; i < cards.size() ; i++ ) {
			if (card == cards.get(i)) {
				System.out.println(cards.get(i));
				return i;
			}
		}

		return 0;
	}

	public String toString() {
		String hand = "";
		for (int i = 0 ; i < cards.size() ; i++) {
			hand += cards.get(i) + "\n";
		}
		return hand;
	}
}