package schermen;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import panelen.SpelLadenPaneel;

public class SpelLaden extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame SpelLaden;
	private Toolkit tk = Toolkit.getDefaultToolkit(); 
	private Dimension screenSize = new Dimension((int) tk.getScreenSize().getWidth(), (int)tk.getScreenSize().getHeight()); 
 
	
	
	public SpelLaden(){
		
		SpelLaden = new JFrame();
		SpelLaden.setLocationRelativeTo(null);
		SpelLaden.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpelLaden.setSize(screenSize);
		SpelLaden.setUndecorated(true);
		SpelLaden.add(new SpelLadenPaneel());
		SpelLaden.setVisible(true);
	}

}
