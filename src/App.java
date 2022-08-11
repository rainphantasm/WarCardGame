public class App {
	/**
	 * This method compares two cards, and returns a value based
	 * on their comparison
	 * @param firstCard
	 * @param secondCard
	 * @return
	 */
	static public int compareCards(Card firstCard, Card secondCard) {
		if(firstCard.getValue() > secondCard.getValue()) {
			return 0;
		}else if(firstCard.getValue() < secondCard.getValue()) {
			return 1;
		}else {
			return 2;
		}
	}

	public static void main(String[] args) {
		//Instantiate Players
		Player playerOne = new Player("Player One");
		Player playerTwo = new Player("Player Two");
		//Instantiate Deck
		Deck warDeck = new Deck();
		warDeck.shuffle();
		
		//Split cards for players
		for(int i = 0; i < 52; i++) {
			if(i%2 == 0) {
				playerOne.draw(warDeck);
			}else {
				playerTwo.draw(warDeck);
			}			
		}
		
		//Showcase method and cards
		playerOne.describe();
		playerTwo.describe();
		
		//Simulate game
		for(int i = 0; i < 26; i++) {
			switch(compareCards(playerOne.flip(), playerTwo.flip())){
			case(0):
				playerOne.incrementScore();
				break;
			case(1):
				playerTwo.incrementScore();
				break;
			default:
				break;			
			}
			
		}
		
		//Postgame information
		System.out.println(playerOne.name + "'s score was: " + playerOne.score);
		System.out.println(playerTwo.name + "'s score was: " + playerTwo.score);
		
		
		//Postgame outcome
		if(playerOne.score > playerTwo.score) {
			System.out.println(playerOne.name + " wins War.");
		}else if(playerOne.score < playerTwo.score) {
			System.out.println(playerTwo.name + " wins War.");
		}else {
			System.out.println("Result is a draw");
		}

	}

}
