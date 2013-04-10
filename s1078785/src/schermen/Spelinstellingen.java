package schermen;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import panelen.SpelinstellingenPaneel;

public class Spelinstellingen extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame Spelinstellingen;
	private Toolkit tk = Toolkit.getDefaultToolkit(); 
	private Dimension screenSize = new Dimension((int) tk.getScreenSize().getWidth(), (int)tk.getScreenSize().getHeight()); 
 
	
	
	public Spelinstellingen(){
		
		Spelinstellingen = new JFrame();
		Spelinstellingen.setLocationRelativeTo(null);
		Spelinstellingen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Spelinstellingen.setSize(screenSize);
		Spelinstellingen.setUndecorated(true);
		Spelinstellingen.add(new SpelinstellingenPaneel());
		Spelinstellingen.setVisible(true);
	}

}
