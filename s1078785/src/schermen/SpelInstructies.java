package schermen;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import panelen.SpelInstructiesPaneel;

public class SpelInstructies extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame SpelInstructies;
	private Toolkit tk = Toolkit.getDefaultToolkit(); 
	private Dimension screenSize = new Dimension((int) tk.getScreenSize().getWidth(), (int)tk.getScreenSize().getHeight()); 
 
	
	
	public SpelInstructies(){
		
		SpelInstructies = new JFrame();
		SpelInstructies.setLocationRelativeTo(null);
		SpelInstructies.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpelInstructies.setSize(screenSize);
		SpelInstructies.setUndecorated(true);
		SpelInstructies.add(new SpelInstructiesPaneel());
		SpelInstructies.setVisible(true);
	}

}
