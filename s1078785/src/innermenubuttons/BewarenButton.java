package innermenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class BewarenButton extends JComponent implements MouseListener {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL bewaren = cldr.getResource("res/save-button.png");

	private Image bewarenknop = Toolkit.getDefaultToolkit().getImage(bewaren);

	public BewarenButton(){
		this.addMouseListener(this);
		
		
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Annulerenknop(g);
		
	}
	
	public void Annulerenknop(Graphics g){
		
		g.drawImage(bewarenknop, 0, 0, null);
	}
	
	public void mouseClicked(MouseEvent m) {
		
		
	}

	
	public void mouseEntered(MouseEvent m) {
		
		
	}

	
	public void mouseExited(MouseEvent m) {
		
		
	}

	
	public void mousePressed(MouseEvent m) {
		
		
	}

	
	public void mouseReleased(MouseEvent m) {
		
		
	}

}
