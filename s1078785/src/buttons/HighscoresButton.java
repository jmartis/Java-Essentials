package buttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class HighscoresButton extends JComponent implements MouseListener{

	/**
	 * Spel laden is nummer 3
	 */
	private static final long serialVersionUID = 1L;
	private final String buttonbackgroundpath  = "res-buttons/highscores-button.png";
	//private final String buttontextpath = "res-buttons/new-game-button-text.png";
	private Image highscoresbutton = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	
	public HighscoresButton(){
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Highscoresbutton(g);
	}

	public void Highscoresbutton(Graphics g){
		g.drawImage(highscoresbutton, 0, 0, null);
		
		repaint();
	}
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is highscores");
		
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
