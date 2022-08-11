public class Card {
	int value;
	String name;
	
	
	/**
	 * Constructor for the Card class
	 * @param value - int - This is the ranking of the card.
	 * @param name - String - This is a description of a card, including its suit and rank
	 */
	public Card(int value, String name) {
		super();
		this.value = value;
		this.name = name;		
	}
	
	/**
	 * Getter method for value
	 * This method returns the value of the card
	 * @return value - the value of the card
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Setter method for value
	 * This method sets the value of the card
	 * @param value - the int value to be set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Getter method for name
	 * This method returns the name card
	 * @return name - the name of the card
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter method for name
	 * This method sets a name for the card
	 * @param name - the name to be set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method prints out a description of the card
	 */
	public void describe() {
		System.out.println("This card is a " + name);
	}
}


