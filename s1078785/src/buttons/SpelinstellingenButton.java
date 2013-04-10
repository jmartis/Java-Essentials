package buttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class SpelinstellingenButton extends JComponent implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Spelinstellingen is nummer 5
	 */
	
	private final String buttonbackgroundpath  = "res-buttons/game-options-button.png";
	//private final String buttontextpath = "res-buttons/new-game-button-text.png";
	private Image spelinstellingenbutton = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	
	public SpelinstellingenButton(){
		this.addMouseListener(this);
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Spelinstellingenbutton(g);
	}
	
	public void Spelinstellingenbutton(Graphics g){
		g.drawImage(spelinstellingenbutton, 0, 0, null);
	}
	
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is spelinstellingen");
		
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
