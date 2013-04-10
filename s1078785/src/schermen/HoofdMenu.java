package schermen;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import panelen.HoofdmenuPaneel;

public class HoofdMenu extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrame Hoofdmenu;
	private Toolkit tk = Toolkit.getDefaultToolkit(); 
	private Dimension screenSize = new Dimension(800,600);
	private Dimension Size = new Dimension((int) tk.getScreenSize().getWidth(), (int)tk.getScreenSize().getHeight()); 
 
	
	
	public HoofdMenu(){
		
		JFrame Hoofdmenu = new JFrame();
		Hoofdmenu.setSize(screenSize);
		Hoofdmenu.setLocationRelativeTo(null);
		Hoofdmenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Hoofdmenu.setUndecorated(true);
		Hoofdmenu.add(new HoofdmenuPaneel());
		Hoofdmenu.setVisible(true);
	}

}
