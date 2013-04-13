package hoofdmenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class SpelinstellingenButton extends JComponent implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Spelinstellingen is nummer 5
	 */
	

	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL buttonbackgroundpath = cldr.getResource("res/game-options-button.png");
	private final URL selectbuttonbackgroundpath = cldr.getResource("res/s-game-options-button.png");
	private Image spelinstellingenbutton = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	private Image selectedspelinstellingenbutton = Toolkit.getDefaultToolkit().getImage(selectbuttonbackgroundpath);
	private boolean hover = false;
	
	
	public SpelinstellingenButton(){
		this.addMouseListener(this);
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(!hover){
		Spelinstellingenbutton(g);
		repaint();
		}else{
			SelectedSpelinstellingenbutton(g);
			repaint();
		}
	}
	
	public void Spelinstellingenbutton(Graphics g){
		g.drawImage(spelinstellingenbutton, 0, 0, null);
	}
	
	public void SelectedSpelinstellingenbutton(Graphics g){
		g.drawImage(selectedspelinstellingenbutton, 0, 0, null);
	}
	
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is spelinstellingen");
		
	}

	
	public void mouseEntered(MouseEvent m) {
		System.out.println("Mouse hovered spel instellingen");
		hover=true;
		repaint();
		
	}


	
	public void mouseExited(MouseEvent m) {
		System.out.println("Mouse hovered spel instellingen exit");
		hover=false;
		repaint();
		
	}


	
	public void mousePressed(MouseEvent m) {
		
		
	}


	
	public void mouseReleased(MouseEvent m) {
	
		
	}
}
