package test.schermen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JPanel;

import test.Panelen.hoofdmenuPaneel;
import test.menuKnoppen.HighscoresKnop;
import test.menuKnoppen.NieuwspelKnop;
import test.menuKnoppen.SpelinstellingenKnop;
import test.menuKnoppen.SpelverlatenKnop;
import test.schermen.Hoofdmenu;


public class achtergrondScherm extends JPanel{

	hoofdmenuPaneel menu = new hoofdmenuPaneel();
	Toolkit tk = Toolkit.getDefaultToolkit();  
	private int height = ((int) tk.getScreenSize().getHeight()); 
	Hoofdmenu hm;
	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL path = cldr.getResource("res/hoofdmenu.png");
	private final URL logopath = cldr.getResource("res/setlogo.png");

	
	
	public achtergrondScherm(){
		
		setLayout(null);
		
		setBackground(Color.black);
//		menu.setBounds((int) tk.getScreenSize().getWidth() / 3, 0,350, height);
//		menu.setBounds((int) tk.getScreenSize().getWidth() / 3, 0,350, height);
		this.add(menu);
		
		
	}
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Image achtergrond = Toolkit.getDefaultToolkit().getImage(path);
		Image setLogo = Toolkit.getDefaultToolkit().getImage(logopath);
		g.drawImage(achtergrond, 0,0, 1024,624, null);
		g.drawImage(setLogo, 350,80, 330,166, null);
//		g.drawImage(achtergrond, 0, 0, (int)tk.getScreenSize().getWidth(), height, null);
		

		SpelverlatenKnop spelverlatenKnop;
		spelverlatenKnop = new SpelverlatenKnop("Spel verlaten");
		spelverlatenKnop.setBounds(1024 - 50 , 5 ,50,50);
		this.add(spelverlatenKnop);
		
		NieuwspelKnop nieuwSpelKnop;
		nieuwSpelKnop = new NieuwspelKnop("Nieuw Spel");
		nieuwSpelKnop.setBounds(136,424,100,92);
		this.add(nieuwSpelKnop);
		
		SpelinstellingenKnop spelinstellingenKnop;
		spelinstellingenKnop = new SpelinstellingenKnop("Spelinstellingen");
		spelinstellingenKnop.setBounds(478,505,100,92);
		this.add(spelinstellingenKnop);
		
		HighscoresKnop highscoresKnop;
		highscoresKnop = new HighscoresKnop("Highscores");
		highscoresKnop.setBounds(805,404,100,92);
		this.add(highscoresKnop);
		
		
		repaint();
	}
}
