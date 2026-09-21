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
		
		System.out.println(deck.shuffle());
		System.out.println("");
		System.out.println(deck);
		System.out.println("");
		System.out.println(deck.take());
		System.out.println("");
		System.out.println(deck.shuffle().take());

	}

	//static int value(Card card) {

	//}

	//static int handValue(Hand hand) {
		
	//}
}

