package berry.valerie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class Deck {

	List cards = new ArrayList<Card>();

	public Deck() {
		
		// A hasthable to pair each number with it's spelling
		Hashtable<Integer, String> numsToWords = new Hashtable<Integer, String>();
		numsToWords.put(2, "Two");
		numsToWords.put(3, "Three");
		numsToWords.put(4, "Four");
		numsToWords.put(5, "Five");
		numsToWords.put(6, "Six");
		numsToWords.put(7, "Seven");
		numsToWords.put(8, "Eight");
		numsToWords.put(9, "Nine");
		numsToWords.put(10, "Ten");
		numsToWords.put(11, "Jack");
		numsToWords.put(12, "Queen");
		numsToWords.put(13, "King");
		numsToWords.put(14, "Ace");

		// An ArrayList to list all suits
		List<String> suits = new ArrayList<String>();
		suits.add("Spades");
		suits.add("Hearts");
		suits.add("Clubs");
		suits.add("Diamonds");

		// Outer loop goes through each card number
		// Inner loop goes through each suit
		for (int i = 2; i <= 14; i++) {
			for (String suit : suits) {
				String numName = numsToWords.get(i);
				cards.add(new Card(numName + " of " + suit, i));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card draw() {
		Card tmp = (Card) cards.get(0);
		cards.remove(0);
		return tmp;
	}
}
