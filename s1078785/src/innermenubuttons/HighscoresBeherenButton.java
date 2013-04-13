package innermenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class HighscoresBeherenButton extends JComponent implements MouseListener {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL highscoresinstellingen = cldr.getResource("res/highscores-settings.png");

	private Image highscoresknop = Toolkit.getDefaultToolkit().getImage(highscoresinstellingen);

	public HighscoresBeherenButton(){
		this.addMouseListener(this);
		
		
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Annulerenknop(g);
		
	}
	
	public void Annulerenknop(Graphics g){
		
		g.drawImage(highscoresknop, 0, 0, null);
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
