package test.menuKnoppen;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

import test.schermen.Hoofdmenu;
import test.schermen.NieuwSpelScherm;
import test.schermen.schermController;


public class NieuwspelKnop extends JComponent implements MouseListener{

		private ClassLoader cldr = this.getClass().getClassLoader();
		private final URL path = cldr.getResource("res/nieuwspel.png");
		Hoofdmenu hm;
		Image nieuwspel = Toolkit.getDefaultToolkit().getImage(path);
//		Image nieuwspelmouse = Toolkit.getDefaultToolkit().getImage("C:/Users/AuroraX/Desktop/spelknoppen/nieuwspelmouse.png");
		public boolean exit = true;
		schermController m;
		
		

		
	NieuwSpelScherm n;
	boolean selected = false;
	
	public NieuwspelKnop(String naam){
		
		this.addMouseListener(this);
		
		
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
//		if (selected == true){
//			nieuwSpelknopmouse(g);
//		}
//		else{
			nieuwSpelknop(g);
			
//		}
		
		
		
		
	}
	
	
	public void nieuwSpelknop(Graphics g){
		
		g.drawImage(nieuwspel, 0, 0, null);
		repaint();
	}
	
//	public void nieuwSpelknopmouse(Graphics g){
//		
//		g.drawImage(nieuwspelmouse, 0, 0, null);
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
			exit = false;
			
			n = new NieuwSpelScherm();
			

		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
		

		repaint();
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		
		
//	selected = false;
//	repaint();
		
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
