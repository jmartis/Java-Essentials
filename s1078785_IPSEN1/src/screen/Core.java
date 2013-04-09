package screen;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author AuroraX
 * @version 0.1
 * @category board game
 * 
 * 
 * */
public class Core {

	private static JFrame frame;
	private static final String title = "s1078785";
	private static final int width = 800;
	private static final int height = 600;
	private static Dimension size = new Dimension(width, height);
	private static boolean windowed = true;
	
	
	public static void main (String [] args){
		
		new Core();

	}
	
	public Core(){
		
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(size);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(windowed);
		frame.add(new MainMenu());
		frame.setVisible(true);
	}
	
	
}
