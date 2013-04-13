package hoofdmenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class SpelLadenButton extends JComponent implements MouseListener {

	/**
	 * Spel laden is nummer 2
	 */
	
	private static final long serialVersionUID = 1L;
	
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL spelladenpath = cldr.getResource("res/load-game-button.png");
	private final URL  selectedspelladenpath = cldr.getResource("res/s-load-game-button.png");
	
	Image spelladen = Toolkit.getDefaultToolkit().getImage(spelladenpath);
	private Image selectedspelladen = Toolkit.getDefaultToolkit().getImage(selectedspelladenpath);

	


	private boolean hover = false;
	
	public SpelLadenButton(){
		this.addMouseListener(this);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(!hover){
		nieuwSpelButton(g);
		repaint();
		}else{
			SelectednieuwSpelButton(g);
			repaint();
		}
	}

	public void nieuwSpelButton(Graphics g){
		g.drawImage(spelladen, 0, 0, null);
		
		repaint();
	}
	
	public void SelectednieuwSpelButton(Graphics g){
		g.drawImage(selectedspelladen, 0, 0, null);
		
		repaint();
	}
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is spel laden");
		
	}

	
	public void mouseEntered(MouseEvent m) {
		System.out.println("Mouse hovered spel laden");
		hover=true;
		repaint();
		
	}


	
	public void mouseExited(MouseEvent m) {
		System.out.println("Mouse hovered spel laden exit");
		hover=false;
		repaint();
		
	}


	
	public void mousePressed(MouseEvent m) {
		
		
	}


	
	public void mouseReleased(MouseEvent m) {
	
		
	}

}
