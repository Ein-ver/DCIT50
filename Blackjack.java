// Author: Eidhan Blidenyl S. Ceneta
// Year and Section: BSCS 2-7
// Student ID: 251017563
// Date: September 21, 2026

import java.util.Scanner;

public class Blackjack {
	static Deck deck = new Deck();
	static Hand playerHand = new Hand();
	static Hand computerHand = new Hand();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variables
		int playerVal = 0, compVal = 0;

		//System.out.println(deck.cards.get(0));

		// GAME THING

		// shuffle then add two cards
		deck.shuffle();
		for ( int i = 0	; i < 2 ; i++ ) {
			playerHand.addCard(deck.take());
			computerHand.addCard(deck.take());
		}
		//while (true) {
			System.out.println("Your Hand: \n" + playerHand);
			for (int i = 0 ; i < playerHand.cards.size() ; i++) {
				playerVal += value(playerHand.cards.get(i));
			}
			System.out.println("Value: " + playerVal);

			System.out.println("Computer's Hand: \n" + computerHand);
		//}

	}

	
	static int value(Card card) {
		int value = 0;

		// card.suit is brilliant Ese!!!
		// holy hell
		// lmao its rank, not suit
		if (card.rank.contains("JKQ")) {
			value += 10;
		}
		else if (card.rank.contains("23456789")) {
			value += Integer.parseInt(card.rank);
		}

		if (card.rank.equals("A")) {
			if (value < 11) {
				value += 10;
			}
			else {
				value += 1;
			}
		}

		return value;
	}
	

	//static int handValue(Hand hand) {
		
	//}
}

