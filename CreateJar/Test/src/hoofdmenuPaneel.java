import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;


public class hoofdmenuPaneel extends JPanel{

	private JButton Nieuwspel, SpelLaden, Highscores, Spelinstellingen, SpelVerlaten;
	private final int MenuKnopWidth = 200;
	private final int MenuKnopHeight = 200;
	myButton2 b;
	main m;
	
	
	public hoofdmenuPaneel(){
		
//		setLayout(null);
		
		Nieuwspel = new JButton("Nieuw spel");
		b = new myButton2();
		b.setPreferredSize(new Dimension(200,200));
		b.setBounds(0,0,200,200);
		b.setLocation(80,150);
		this.add(b);
		
		setBackground(Color.black);
		
//		Nieuwspel.setPreferredSize(new Dimension(MenuKnopWidth, MenuKnopHeight));
//		Nieuwspel.setLocation(100, 0);
//		this.add(Nieuwspel, BorderLayout.CENTER);
//		
		SpelLaden = new JButton("Spel laden");
		SpelLaden.setPreferredSize(new Dimension(200, 100));
		
//		SpelLaden.setLocation(100, 150);
		this.add(SpelLaden, BorderLayout.CENTER);
//		
//		
		Highscores = new JButton("Highscores");
		Highscores = new JButton("Highscores");
		Highscores.setPreferredSize(new Dimension(200, 100));
		Highscores.setLocation(100, 150);
		this.add(Highscores, BorderLayout.CENTER);
		
		
		Spelinstellingen = new JButton("Spelinstellingen");
		Spelinstellingen = new JButton("Spelinstellingen");
		Spelinstellingen.setPreferredSize(new Dimension(200, 100));
		Spelinstellingen.setLocation(100, 150);
		this.add(Spelinstellingen, BorderLayout.CENTER);
		
		SpelVerlaten = new JButton("Spel verlaten");	
		SpelVerlaten = new JButton("Spel verlaten");
		SpelVerlaten.setPreferredSize(new Dimension(200, 100));
		SpelVerlaten.setLocation(100, 150);
		this.add(SpelVerlaten, BorderLayout.CENTER);
		add(SpelVerlaten);
		
	}
}
