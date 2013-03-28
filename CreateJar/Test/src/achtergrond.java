import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;


public class achtergrond extends JPanel{

	hoofdmenuPaneel menu = new hoofdmenuPaneel();
	main m;
	
	
	public achtergrond(){
		
		setBackground(Color.black);
		menu.setPreferredSize(new Dimension(250, 650));
//		menu.setLocation(0, 0);

//		menu.setLocation(100,0);
		this.add(menu);
		
		
	}
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Image achtergrond = Toolkit.getDefaultToolkit().getImage("C:/Users/User/Desktop/set.jpg");
		g.drawImage(achtergrond, 0, 0, null);
		repaint();
	}
}
