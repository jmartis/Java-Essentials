package hoofdmenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class SpelVerlatenButton extends JComponent implements MouseListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Spel verlaten is nummer 6
	 */
	
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL buttonbackgroundpath = cldr.getResource("res/exit-game-button.png");
	private final URL selectbuttonbackgroundpath = cldr.getResource("res/s-exit-game-button.png");
		
	private Image spelverlatenbutton = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	private Image selectedspelverlatenbutton = Toolkit.getDefaultToolkit().getImage(selectbuttonbackgroundpath);
	
	private boolean hover = false;
	
	public SpelVerlatenButton(){
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(!hover){
		Spelverlatenbutton(g);
		repaint();
		}else{
			SelectedSpelverlatenbutton(g);
			repaint();
		}
	}
	
	public void Spelverlatenbutton(Graphics g){
		g.drawImage(spelverlatenbutton,0,0,null);
	}
	
	public void SelectedSpelverlatenbutton(Graphics g){
		g.drawImage(selectedspelverlatenbutton,0,0,null);
	}
	
	public void mouseClicked(MouseEvent m) {
		System.out.println("dit is spelverlaten");
		//System.exit(0);
		
	}

	
	public void mouseEntered(MouseEvent m) {
		System.out.println("Mouse hovered spel verlaten");
		hover=true;
		repaint();
		
	}


	
	public void mouseExited(MouseEvent m) {
		System.out.println("Mouse hovered spel verlaten exit");
		hover=false;
		repaint();
		
	}


	
	public void mousePressed(MouseEvent m) {
		
		
	}


	
	public void mouseReleased(MouseEvent m) {
	
		
	}
}
