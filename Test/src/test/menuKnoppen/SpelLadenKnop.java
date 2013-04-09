package test.menuKnoppen;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;


public class SpelLadenKnop extends JComponent implements MouseListener{

	Image spelladen = Toolkit.getDefaultToolkit().getImage("C:/Users/AuroraX/Desktop/spelknoppen/spelladen.png");
	Image spelladenmouse = Toolkit.getDefaultToolkit().getImage("C:/Users/AuroraX/Desktop/spelknoppen/spelladenmouse.png");
	boolean select = false;
	
	public SpelLadenKnop(String naam){
		
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if (select == false){
			spelLadenknop(g);
		}
		else{
			spelLadenknopmouse(g);
			
		}

	}
	
	public void spelLadenknop(Graphics g){
		
		g.drawImage(spelladen, 0, 0, null);
	}
	
	public void spelLadenknopmouse(Graphics g){
		
		g.drawImage(spelladenmouse, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		select = true;
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		select = false;
		repaint();
		
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
