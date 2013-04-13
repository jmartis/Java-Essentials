package hoofdmenubuttons;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class NieuwSpelButton extends JComponent implements MouseListener {

	/**
	 * Nieuwspel is nummer 1
	 */
	private static final long serialVersionUID = 1L;
	
			
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL buttonbackgroundpath = cldr.getResource("res/new-game-button.png");
	private final URL selectedbuttonbackgroundpath = cldr.getResource("res/s-new-game-button.png");
	private Image nieuwspel = Toolkit.getDefaultToolkit().getImage(buttonbackgroundpath);
	private Image selectednieuwspel = Toolkit.getDefaultToolkit().getImage(selectedbuttonbackgroundpath);
	
	
	private boolean hover = false;


	public NieuwSpelButton(){
		this.addMouseListener(this);

	}


	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(!hover){
			nieuwSpelButton(g);
			repaint();
		}
		else{
			SelectednieuwSpelButton(g);
			repaint();
		}
	}

	public void nieuwSpelButton(Graphics g){
		g.drawImage(nieuwspel, 0, 0, null);

		repaint();

	}
	public void SelectednieuwSpelButton(Graphics g){
		g.drawImage(selectednieuwspel, 0, 0, null);

		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("working");
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse hovered nieuw spel");
		hover=true;
		repaint();
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse hovered nieuwspel exit");
		hover=false;
		repaint();
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




}