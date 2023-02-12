package berry.valerie;

public class App {

	public static void main(String[] args) {

		Deck gameDeck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();

		gameDeck.shuffle();

		player1.name = "Zach";
		player2.name = "Valerie";
		player1.score = 0;
		player2.score = 0;

		for (int i = 0; i <= 51; i++) {
			if (i % 2 == 0) {
				player1.draw(gameDeck);
			} else {
				player2.draw(gameDeck);
			}
		}
		for (int j = 0; j <= 25; j++) {
			Card p1Card = player1.flip();
			Card p2Card = player2.flip();
			
			System.out.println("=== Draw #" + (j + 1) + " ===");
			System.out.println("Player 1 drew:");
			p1Card.describe();
			System.out.println();
			System.out.println("Player 2 drew:");
			p2Card.describe();

			System.out.println();
			
			if (p1Card.getValue() > p2Card.getValue()) {
				player1.incrementScore();
				System.out.println("[Player1 gets this point]");
			} else if (p1Card.getValue() < p2Card.getValue()) {
				player2.incrementScore();
				System.out.println("[Player2 gets this point]");
			}
			System.out.println("[Player1 score: " + player1.score + "]");
			System.out.println("[Player2 score: " + player2.score + "]");
			System.out.println();
		}
		System.out.println("Player 1: " + player1.score);
		System.out.println("Player 2: " + player2.score);
		
		if (player1.score > player2.score) {
			System.out.println("Player 1 (" + player1.name + ") wins!");
		} else if (player1.score < player2.score) {
			System.out.println("Player 2 (" + player2.name + ") wins!");
		} else {
			System.out.println("It's a draw.");
		}
	}

}
