package schermen;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import panelen.SpelVerlatenPaneel;

public class SpelVerlaten extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame SpelVerlaten;
	private Toolkit tk = Toolkit.getDefaultToolkit(); 
	private Dimension screenSize = new Dimension((int) tk.getScreenSize().getWidth(), (int)tk.getScreenSize().getHeight()); 
 
	
	
	public SpelVerlaten(){
		
		SpelVerlaten = new JFrame();
		SpelVerlaten.setLocationRelativeTo(null);
		SpelVerlaten.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpelVerlaten.setSize(screenSize);
		SpelVerlaten.setUndecorated(true);
		SpelVerlaten.add(new SpelVerlatenPaneel());
		SpelVerlaten.setVisible(true);
	}

}
