package berry.valerie;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;

	public Player() {
		this.hand = hand;
		this.score = score;
		this.name = name;

	}

	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Cards:");
		for (int i = 0; i < hand.size(); i++) {
			System.out.print(hand.get(i).getName());

			if (i != hand.size()) {
				System.out.print(", ");
			}

		}
	}

	public Card flip() {
		Card tmp = (Card) hand.get(0);
		hand.remove(0);
		return tmp;
	}
	
	public void draw(Deck d) { hand.add(d.draw()); }
	public void incrementScore() { this.score++; }
	
}
