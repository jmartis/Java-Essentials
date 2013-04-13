package innermenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class VolgendePaneelButton extends JComponent implements MouseListener {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL volgendepaneelbuttonpath = cldr.getResource("res/new-game-next-button.png");
	private final URL selectvolgendepaneelbuttonpath = cldr.getResource("res/s-new-game-next-button.png");
	
	Image selectedvolgendepaneel = Toolkit.getDefaultToolkit().getImage(selectvolgendepaneelbuttonpath);
	Image volgendepaneel = Toolkit.getDefaultToolkit().getImage(volgendepaneelbuttonpath);
	
	private boolean hover = false;
	
	public VolgendePaneelButton(){
		this.addMouseListener(this);
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(!hover){
			volgendepaneelButton(g);
			repaint();
		}
		else{
			SelectedVolgendepaneelButton(g);
			repaint();
		}
	}
	
	
	public void SelectedVolgendepaneelButton(Graphics g) {

		
		g.drawImage(selectedvolgendepaneel,0,0,null);
		repaint();
		
	}


	public void volgendepaneelButton(Graphics g){

		g.drawImage(volgendepaneel,0,0,null);
		repaint();
		
	}
	
	public void mouseClicked(MouseEvent m) {
		
		
	}

	
	public void mouseEntered(MouseEvent m) {
		System.out.println("Mouse hovered");
		hover=true;
		repaint();
		
	}

	
	public void mouseExited(MouseEvent m) {
		
		hover=false;
		repaint();
	}

	
	public void mousePressed(MouseEvent m) {
		
		
	}

	
	public void mouseReleased(MouseEvent m) {
		
		
	}

}
