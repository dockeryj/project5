/**
 * Represents a FreeCellPile
 * @author Chris_Surran
 *
 */
import java.util.ArrayList;
public class Tableau extends AbstractPile{
	/**
     * Constructor.
     */
	public Tableau() { 
		super(52); // 52 because we do not care if to many cards end up in one pile after start
	}
	
	public boolean inOrder(ArrayList<Card> cards) { // remember that size -1 is the top.
		int nextRank = -1;
		ArrayList<Suit> possibleSuits = new ArrayList<>();
		for(Card c: cards) {
			if (nextRank == -1) { // this will only trigger for first card
				possibleSuits = getNextSuit(c);
				nextRank = c.getRank() - 1;}
			
			else if (!(c.getRank() == nextRank) || !(possibleSuits.contains(c.getSuit()))) return false;
			}
		return true; // return true if you make it all the way through the pile
	}

	public ArrayList<Suit> getNextSuit(Card c){
		ArrayList<Suit> possibleSuits = new ArrayList<>();
		if ((c.getSuit().equals(Suit.club)) || (c.getSuit().equals(Suit.spade))){ // next card must be red
			possibleSuits.add(Suit.diamond);
			possibleSuits.add(Suit.heart);}
		else {
			possibleSuits.add(Suit.club);
			possibleSuits.add(Suit.spade);}
		return possibleSuits;
	}
	
	
	public boolean canTransfer() {
		return true;
	}
	
	public boolean transfer() {
		return true; 
	}
	
}