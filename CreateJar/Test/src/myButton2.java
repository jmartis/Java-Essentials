import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;


public class myButton2 extends JComponent implements MouseListener{

	Image images = Toolkit.getDefaultToolkit().getImage("C:/Users/User/Desktop/images.png");
	NieuwSpel n;
	
	
	public myButton2(){
		
		this.addMouseListener(this);
		
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.drawImage(images, 0, 0, null);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
		n = new NieuwSpel();
		System.out.println("New window");
		
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
