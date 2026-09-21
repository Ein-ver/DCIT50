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
		int youVal = 0, comVal = 0;
		String choice = "";
		int deleteIndex = 0;
		// GAME THING

		// shuffle then add two cards
		// Dito pwede naman shuffle muna bago mag take pero kelangan ata ng method chaining
		//deck.shuffle();
		for ( int i = 0	; i < 2 ; i++ ) {
			playerHand.addCard(deck.shuffle().take());
			computerHand.addCard(deck.shuffle().take());
		}

		// Compute computer hand before(hand) funny
		comVal = handValue(computerHand);
		
		// yo
		gurt:
		while (true) {
			System.out.println("Your Hand: \n" + playerHand);
			youVal = handValue(playerHand);
			// DEBUG STUFF
			//System.out.println("Hand Value: " + youVal);
			if (youVal <= 21) {
				System.out.print("(Remove: type R) Hit [Y/N/]? ");
				choice = sc.nextLine().toUpperCase();

				switch (choice) {
					// Kapag nag yes
					case "Y":
						playerHand.addCard(deck.shuffle().take());
						break;

					// Kapag nag no
					case "N":
						if (youVal > comVal) {
							System.out.println("Computer Hand: \n" + computerHand);
							System.out.println("YOU WIN GAZZILION DOLLARS!!");
						}
						else {
							System.out.println("Computer Hand: \n" + computerHand);
							System.out.println("Lmao.");
						}
						break gurt;

					// Kapag ayaw na nya
					case "R":
						if (playerHand.cards.size() == 2) {
							System.out.println("You shall not have only one card.\n");
							break;
						}
						else {
							System.out.println("\n== [THE CARD REMOVER] ==");
							for (int i = 0 ; i < playerHand.cards.size() ; i++ ) {
								System.out.println(i+1 + ". " + playerHand.cards.get(i));
							}

							System.out.print("Choose which card to delete [Number]: ");
							deleteIndex = sc.nextInt() - 1;

							// nakalimutan ko pero alam ko lagi nagstuck kapag nagamit ng nextLine kaya meron uling ganito
							sc.nextLine();
							
							if (deleteIndex < 0) {
								System.out.println("nuh uh \n");
								break;
							}
							else {
								playerHand.removeCard(playerHand.cards.get(deleteIndex));
								System.out.println("\nCard successfully removed!\n");
								break;
							}

						}
					default:
						System.out.println("What kinda answer is that broski\n");
				}
			}
			else {
				System.out.println("You busted!");
				break gurt;
			}
		}

	}


	static int value(Card card) {
		int value = val;

		String cardCheck = card.rank;
		// DEBUG STUFF
		//System.out.println(cardCheck);

		// card.suit is brilliant Ese!!!
		// holy hell
		// lmao its rank, not suit
		if (cardCheck.contains("k") || cardCheck.contains("q") || cardCheck.contains("j")) {
			// DEBUG STUFF
			//System.out.println("its special card yo");
			value += 10;
		}
		else if (cardCheck.contains("a")) {
			if (value <= 10) {
				// DEBUG STUFF
				//System.out.println("THE GOATTTT!!!");
				value += 11;
			}
			else {
				// DEBUG STUFF
				//System.out.println("nuke the whole generation");
				value += 1;
			}
		}
		else {
			// DEBUG STUFF
			//System.out.println("i mean its alright");
			value += Integer.parseInt(cardCheck);
		}

		val = value;
		return value;
	}
	

	static int handValue(Hand hand) {	
		int handVal = 0;

		for (int i = 0 ; i < hand.cards.size() ; i++) {
				handVal = value(hand.cards.get(i));
				// DEBUG STUFF
				//System.out.println("val value: " + val);
		}

		// reset
		val = 0;

		return handVal;
	}
}

