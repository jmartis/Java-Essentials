package test.schermen;

import java.awt.Toolkit;

import javax.swing.JFrame;

import test.Panelen.NieuwSpelPaneel;


public class NieuwSpelScherm extends JFrame{
	
	Toolkit tk = Toolkit.getDefaultToolkit();  
	private int width = ((int) tk.getScreenSize().getWidth());
	private int height = ((int) tk.getScreenSize().getHeight()); 
	
	
	
	public NieuwSpelScherm(){
		
		
		JFrame venster = new JFrame();
		venster.setSize(1024,624);
		venster.setUndecorated(true);
		venster.add(new NieuwSpelPaneel());
//		setExtendedState(venster.MAXIMIZED_BOTH);
		venster.setLocationRelativeTo(null);
		venster.setVisible(true);
		
		
	}

}
