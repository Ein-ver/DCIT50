// Author: Eidhan Blidenyl S. Ceneta
// Year and Section: BSCS 2-7
// Student ID: 251017563
// Date: September 21, 2026

import java.util.ArrayList;

public class Hand {
	ArrayList<Card> cards = new ArrayList<>();

	//Hand addCard(Card card) {
		
	//}

	//Hand removeCard(Card card) {

	//}

	//int indexOfCard(Card card) {

	//}

	public String toString() {
		String hand = "";
		for (int i = 0 ; i < cards.size() ; i++) {
			hand += cards.get(i) + "\n";
		}
		return "Hand: \n" + hand;
	}
}