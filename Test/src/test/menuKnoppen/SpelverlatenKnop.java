package test.menuKnoppen;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;


public class SpelverlatenKnop extends JComponent implements MouseListener{

	private ClassLoader cldr = this.getClass().getClassLoader();
	private URL path = cldr.getResource("res/exit.png");
	Image images = Toolkit.getDefaultToolkit().getImage(path);

	
	public SpelverlatenKnop(String naam){
		
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(images, 0,0,null);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		System.exit(0);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
