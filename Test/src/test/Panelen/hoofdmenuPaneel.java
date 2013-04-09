package test.Panelen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Transparency;

import javax.swing.JButton;
import javax.swing.JPanel;

import test.menuKnoppen.HighscoresKnop;
import test.menuKnoppen.NieuwspelKnop;
import test.menuKnoppen.SpelLadenKnop;
import test.menuKnoppen.SpelinstellingenKnop;
import test.menuKnoppen.SpelverlatenKnop;
import test.schermen.Hoofdmenu;


public class hoofdmenuPaneel extends JPanel{


	private final int xPos = 50;
	
	
	public hoofdmenuPaneel(){
		
		this.setLayout(null);
		


		NieuwspelKnop nieuwSpelKnop;
		nieuwSpelKnop = new NieuwspelKnop("Nieuw Spel");
		nieuwSpelKnop.setBounds(xPos,100,231,63);
		this.add(nieuwSpelKnop);
		
		SpelLadenKnop spelLadenKnop;
		spelLadenKnop = new SpelLadenKnop("Spel laden");
		spelLadenKnop.setBounds(xPos,200,231,63);
		this.add(spelLadenKnop);
		
		HighscoresKnop highscoresKnop;
		highscoresKnop = new HighscoresKnop("Highscores");
		highscoresKnop.setBounds(xPos,200,200,200);
		this.add(highscoresKnop);
		
		SpelinstellingenKnop spelinstellingenKnop;
		spelinstellingenKnop = new SpelinstellingenKnop("Spelinstellingen");
		spelinstellingenKnop.setBounds(xPos,300,200,200);
		this.add(spelinstellingenKnop);
		
		SpelverlatenKnop spelverlatenKnop;
		spelverlatenKnop = new SpelverlatenKnop("Spel verlaten");
		spelverlatenKnop.setBounds(xPos,400,50,50);
		this.add(spelverlatenKnop);


		
	}
}
