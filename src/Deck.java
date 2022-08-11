import java.util.*;

public class Deck {
	
	List<Card> deck = new ArrayList<Card>();
	
	/**
	 * Getter method for deck
	 * This method gets the deck
	 * @return deck - a list of Cards
	 */
	public List<Card> getdeck() {
		return deck;
	}

	/**
	 * Setter method for deck
	 * This method sets the deck
	 * @param deck - a list of Cards
	 */
	public void setdeck(List<Card> deck) {
		this.deck = deck;
	}

	/**
	 * The constructor the the Deck class with no parameters
	 * Instantiates with a full deck of 52 cards
	 */
	public Deck() {
		super();
		//Iterate 4 times for 4 suits
		for(int suit = 0; suit < 4; suit++) {
			//Iterate 13 times for 13 values							
			for(int rank = 2; rank <= 14; rank++) {				
				deck.add(cardBuilder(suit,rank));
			}
		}
		
	}
	
	/**
	 * This method shuffles the list of cards
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	/**
	 * This method removes the card with the highest index and returns it
	 * @return - The card at the end of the list
	 */
	public Card draw() {
		Card drawn = deck.get(deck.size()-1);
		deck.remove(deck.size()-1);
		return drawn;
	}

	
	/**
	 * This method is used for constructing the suit of cards
	 * @param suitType determines the suit type of a card
	 * @return a string denoting the suit type
	 */
	private String suitDescriber(int suitType) {
		switch(suitType) {
		case(0):
			return "Spades";
		case(1):
			return "Clubs";
		case(2):
			return "Hearts";
		case(3):
			return "Diamonds";
		default:
			return "non-generic suit";
			
		}
	}
	
	/**
	 * This method is used for constructing the rank description of cards
	 * @param cardValue describes the rank of a card
	 * @return a string describing the ranking of a card
	 */
	private String rankConversion(int cardValue) {
		switch(cardValue) {
		case(2):
			return "Two of ";
		case(3):
			return "Three of ";
		case(4):
			return "Four of ";
		case(5):
			return "Five of ";
		case(6):
			return "Six of ";
		case(7):
			return "Seven of ";
		case(8):
			return "Eight of ";
		case(9):
			return "Nine of ";
		case(10):
			return "Ten of ";
		case(11):
			return "Jack of ";
		case(12):
			return "Queen of ";
		case(13):
			return "King of ";
		case(14):
			return "Ace of ";
		//Shouldn't be reached
		default:
			return "Joker of ";
		}
	}
	
	/**
	 * This method helps construct a card using 2 parameters
	 * @param suit - the suit of a card to be constructed
	 * @param rank - the rank of a card to be constructed
	 * @return Card - a constructed card with a rank and fitting description
	 */
	private Card cardBuilder(int suit, int rank) {
		String description = rankConversion(rank)+suitDescriber(suit);
		Card myCard = new Card(rank, description);
		return myCard;
	}
	
	
	
	
}
