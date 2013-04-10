package buttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class SpelVerlatenButton extends JComponent implements MouseListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Spel verlaten is nummer 6
	 */
	private final String buttonbackgroundpath  = "res-buttons/exit-game-button.png";
	//private final String buttontextpath = "res-buttons/new-game-button-text.png";
	private Image spelverlatenbutton = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	
	public SpelVerlatenButton(){
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Spelverlatenbutton(g);
	}
	
	public void Spelverlatenbutton(Graphics g){
		g.drawImage(spelverlatenbutton,0,0,null);
	}
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("spel wordt afgesloten");
		System.exit(0);
		
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
