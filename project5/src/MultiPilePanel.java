import java.awt.*;
import javax.swing.*;
/**
 * Panel used by all Tableaux. Can all cards from any given pile.
 * @author Chris_Surran
 *
 */
public class MultiPilePanel extends AbstractPilePanel{
	/**
	 * Constructor for MultPilePanel
	 * @param p pile the panel is representing
	 */
	public MultiPilePanel(Pile p, int R, int G, int B) {
		super(p, R, G, B);
	}
	
	/**
	 * Draws the panel in its current state
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Draw the wireframe if there is no card
		
		int y = 0;
		if (pile.isEmpty() || pile == null){
	    		Icon image = Card.getBack();
	    		g.setColor(Color.yellow);
	    		int x = (getWidth() - image.getIconWidth()) / 2;
	    		g.drawRect(x, y, image.getIconWidth(), image.getIconHeight());
		}
		// Handle Case if their is a card
		else{
			for(int i = 0; i < pile.size(); i++) {
				Icon image = pile.get(i).getImage();
		    		int x = (getWidth() - image.getIconWidth()) / 2;
		    		image.paintIcon(this, g, x, y);
		    		y += 33;
			}
	    		
	    	}
	}
	
	
}