package buttons;


import init.Main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class NieuwSpelButton extends JComponent {

	/**
	 * Nieuwspel is nummer 1
	 */
	private static final long serialVersionUID = 1L;
	private final String buttonbackgroundpath  = "res-buttons/new-game-button.png";
	private Image nieuwspel = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	
	
	
	public NieuwSpelButton(){
		
		
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		nieuwSpelButton(g);
	}

	public void nieuwSpelButton(Graphics g){
		g.drawImage(nieuwspel, 0, 0, null);
		
		repaint();

	}
	



}
