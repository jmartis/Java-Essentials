package buttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class SpelLadenButton extends JComponent implements MouseListener {

	/**
	 * Spel laden is nummer 2
	 */
	
	private static final long serialVersionUID = 1L;
	private final String buttonbackgroundpath  = "res-buttons/load-game-button.png";
	//private final String buttontextpath = "res-buttons/new-game-button-text.png";
	private Image spelladen = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	
	
	public SpelLadenButton(){
		this.addMouseListener(this);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		nieuwSpelButton(g);
	}

	public void nieuwSpelButton(Graphics g){
		g.drawImage(spelladen, 0, 0, null);
		
		repaint();
	}
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is spel laden");
		
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
