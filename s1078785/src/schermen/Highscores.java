package schermen;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import panelen.HighscoresPaneel;

public class Highscores extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame Highscores;
	private Toolkit tk = Toolkit.getDefaultToolkit(); 
	private Dimension screenSize = new Dimension(800,600);
	private Dimension Size = new Dimension((int) tk.getScreenSize().getWidth(), (int)tk.getScreenSize().getHeight()); 
 
	
	
	public Highscores(){
		
		Highscores = new JFrame();
		Highscores.setSize(screenSize);
		Highscores.setLocationRelativeTo(null);
		Highscores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Highscores.setUndecorated(true);
		Highscores.add(new HighscoresPaneel());
		Highscores.setVisible(true);
	}

}
