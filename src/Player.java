import java.util.ArrayList;
import java.util.List;

public class Player {
	/**
	 * The constructor for the player class
	 * @param name - the name of a player
	 */
	public Player(String name) {
		super();
		this.score = 0;
		this.name = name;
		this.hand = new ArrayList<Card>();
	}
	//Variables
	List<Card> hand;
	int score;
	String name;
	
	
	/**
	 * This method describes the name of a player,
	 * any cards they have in their hand, and their score,
	 * and prints it
	 */
	public void describe() {
		System.out.println(name + " has a score of " + score);
		System.out.println("Card(s) in "+name+"'s hand: ");
		for(Card card:hand) {
			card.describe();
		}
	}
	
	/**
	 * This method takes the last card in a player's hand,
	 * returns it, and removes it from their hand
	 * @return flip - the last card in their hand
	 */
	public Card flip() {
		Card flip = hand.get(hand.size()-1);
		hand.remove(hand.size()-1);
		return flip;
	}

	/**
	 * This method removes a card from a deck, and adds it to the player's hand
	 * @param drawDeck - the deck to draw from
	 */
	public void draw(Deck drawDeck) {
		this.hand.add(drawDeck.draw());
	}
	
	/**
	 * This method will increment the score value of the player
	 */
	public void incrementScore() {
		this.score++;
	}

	
	
	
}
