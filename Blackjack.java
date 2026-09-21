// Author: Eidhan Blidenyl S. Ceneta
// Year and Section: BSCS 2-7
// Student ID: 251017563
// Date: September 21, 2026

import java.util.Scanner;

public class Blackjack {
	static Deck deck = new Deck();
	static Hand playerHand = new Hand();
	static Hand computerHand = new Hand();
	static int val = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variables
		int youHand = 0, comHand = 0;

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
				playerVal = value(playerHand.cards.get(i));
				System.out.println("val value: " + val);
			}

			// reset
			val = 0;

			System.out.println("Value: " + playerVal);

			System.out.println("Computer's Hand: \n" + computerHand);
		//}

	}

	
	static int value(Card card) {
		int value = val;

		String cardCheck = card.rank;
		System.out.println(cardCheck);

		// card.suit is brilliant Ese!!!
		// holy hell
		// lmao its rank, not suit
		if (cardCheck.contains("k") || cardCheck.contains("q") || cardCheck.contains("j")) {
			System.out.println("its special card yo");
			value += 10;
		}
		else if (cardCheck.contains("a")) {
			if (value < 11) {
				System.out.println("THE GOATTTT!!!");
				value += 10;
			}
			else {
				System.out.println("nuke the whole generation");
				value += 1;
			}
		}
		else {
			System.out.println("i mean its alright");
			value += Integer.parseInt(cardCheck);
		}

		val = value;
		return value;
	}
	

	static int handValue(Hand hand) {
		
	}
}

