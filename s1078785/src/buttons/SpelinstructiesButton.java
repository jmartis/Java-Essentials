package buttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class SpelinstructiesButton extends JComponent implements MouseListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Spel instructies is nummer 4
	 */
	private final String buttonbackgroundpath  = "res-buttons/how-to-play-button.png";
	//private final String buttontextpath = "res-buttons/new-game-button-text.png";
	private Image spelinstructiesbutton = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	
	public SpelinstructiesButton(){
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Spelinstructiesbutton(g);
	}
	
	public void Spelinstructiesbutton(Graphics g){
		g.drawImage(spelinstructiesbutton, 0, 0, null);
		repaint();
	}
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is spelinstructies");
		
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
