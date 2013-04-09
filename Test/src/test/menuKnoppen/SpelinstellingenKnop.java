package test.menuKnoppen;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;


public class SpelinstellingenKnop extends JComponent implements MouseListener{

	
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL path = cldr.getResource("res/spelinstellingen.png");

	Image nieuwspel = Toolkit.getDefaultToolkit().getImage(path);
	
	Image spelladen = Toolkit.getDefaultToolkit().getImage(path);
//	Image spelladenmouse = Toolkit.getDefaultToolkit().getImage("C:/Users/AuroraX/Desktop/spelknoppen/spelladenmouse.png");
	boolean select = false;
	
	public SpelinstellingenKnop(String naam){
		
		this.addMouseListener(this);
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
//		
//		if (select == true){
			spelLadenknop(g);
//		}
//		else{
//			spelLadenknopmouse(g);
//			
//		}

	}
	
	public void spelLadenknop(Graphics g){
		
		g.drawImage(spelladen, 0, 0, null);
	}
	
//	public void spelLadenknopmouse(Graphics g){
//		
//		g.drawImage(spelladenmouse, 0, 0, null);
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
//		select = true;
		System.out.println("options button working..");
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		
//		select = false;
//		repaint();
		
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
