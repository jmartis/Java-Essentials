package hoofdmenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class HighscoresButton extends JComponent implements MouseListener{

	/**
	 * Spel laden is nummer 3
	 */
	private static final long serialVersionUID = 1L;

	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL highscoresbuttonpath = cldr.getResource("res/highscores-button.png");
	private final URL selectedhighscoresbuttonpath = cldr.getResource("res/s-highscores-button.png");
	private Image highscoresbutton = Toolkit.getDefaultToolkit().getImage(highscoresbuttonpath);
	private Image selectedhighscoresbutton = Toolkit.getDefaultToolkit().getImage( selectedhighscoresbuttonpath);
	

	
	private boolean hover = false;
	
	public HighscoresButton(){
		this.addMouseListener(this);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(!hover){
		Highscoresbutton(g);
		repaint();
		} else{
			SelectedHighscoresbutton(g);
			repaint();
		
		}
	}

	public void Highscoresbutton(Graphics g){
		g.drawImage(highscoresbutton, 0, 0, null);
		
		repaint();
	}
	
	public void SelectedHighscoresbutton(Graphics g){
		g.drawImage(selectedhighscoresbutton, 0, 0, null);
		
		repaint();
	}
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is highscores");
		
	}

	
	public void mouseEntered(MouseEvent m) {
		System.out.println("Mouse hovered highscores");
		hover=true;
		repaint();
		
	}


	
	public void mouseExited(MouseEvent m) {
		System.out.println("Mouse hovered highscores exit");
		hover=false;
		repaint();
		
	}


	
	public void mousePressed(MouseEvent m) {
		
		
	}


	
	public void mouseReleased(MouseEvent m) {
	
		
	}
	
}
