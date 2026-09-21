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

		// GAME THING

		// shuffle then add two cards
		deck.shuffle();
		for ( int i = 0	; i < 2 ; i++ ) {
			playerHand.addCard(deck.take());
			computerHand.addCard(deck.take());
		}
		//while (true) {
			System.out.println("Your Hand: \n" + playerHand);
			System.out.println("Computer's Hand: \n" + computerHand);
		//}

	}

	//static int value(Card card) {

	//}

	//static int handValue(Hand hand) {
		
	//}
}

