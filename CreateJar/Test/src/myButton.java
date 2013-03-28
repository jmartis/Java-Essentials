import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class myButton extends JButton{
	
	Image images = Toolkit.getDefaultToolkit().getImage("C:/Users/User/Desktop/images.jpg");
	
	public myButton(){
		
		super();
		
		
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		
		g.drawImage(images, 0, 0, null);
	}

}
