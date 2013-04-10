package schermen;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import panelen.NieuwSpelPaneel;

public class NieuwSpel extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame nieuwspelVenster;
	private Toolkit tk = Toolkit.getDefaultToolkit(); 
	private Dimension screenSize = new Dimension(800,600);
	private Dimension Size = new Dimension((int) tk.getScreenSize().getWidth(), (int)tk.getScreenSize().getHeight()); 
 
	
	
	public NieuwSpel(){
		
		nieuwspelVenster = new JFrame();
		nieuwspelVenster.setSize(screenSize);
		nieuwspelVenster.setLocationRelativeTo(null);
		nieuwspelVenster.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		nieuwspelVenster.setUndecorated(true);
		nieuwspelVenster.add(new NieuwSpelPaneel());
		nieuwspelVenster.setVisible(true);
	}

}
