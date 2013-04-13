package hoofdmenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class SpelinstructiesButton extends JComponent implements MouseListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Spel instructies is nummer 4
	 */

	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL buttonbackgroundpath = cldr.getResource("res/how-to-play-button.png");
	private final URL selectbuttonbackgroundpath = cldr.getResource("res/s-how-to-play-button.png");
	
	private Image selectedspelinstructiesbutton = Toolkit.getDefaultToolkit().getImage(selectbuttonbackgroundpath);
	private Image spelinstructiesbutton = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	
	private boolean hover = false;
	
	
	public SpelinstructiesButton(){
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(!hover){
		Spelinstructiesbutton(g);
		repaint();
		}else{
			SelectedSpelinstructiesbutton(g);
			repaint();
		}
	}
	
	public void Spelinstructiesbutton(Graphics g){
		g.drawImage(spelinstructiesbutton, 0, 0, null);
		repaint();
	}
	
	public void SelectedSpelinstructiesbutton(Graphics g){
		g.drawImage(selectedspelinstructiesbutton, 0, 0, null);
		repaint();
	}
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is spelinstructies");
		
	}

	
	public void mouseEntered(MouseEvent m) {
		System.out.println("Mouse hovered spelinstructies");
		hover=true;
		repaint();
		
	}


	
	public void mouseExited(MouseEvent m) {
		System.out.println("Mouse hovered spelinstructies exit");
		hover=false;
		repaint();
		
	}


	
	public void mousePressed(MouseEvent m) {
		
		
	}


	
	public void mouseReleased(MouseEvent m) {
	
		
	}
	
}
