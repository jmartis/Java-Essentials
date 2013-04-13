package innermenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class JaButton extends JComponent implements MouseListener {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL ja = cldr.getResource("res/ja-button.png");

	private Image jaknop = Toolkit.getDefaultToolkit().getImage(ja);

	public JaButton(){
		this.addMouseListener(this);
		
		
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Jaknop(g);
		
	}
	
	public void Jaknop(Graphics g){
		
		g.drawImage(jaknop, 0, 0, null);
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
