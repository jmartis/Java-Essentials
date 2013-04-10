package panelen;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import buttons.HighscoresButton;
import buttons.NieuwSpelButton;
import buttons.SpelLadenButton;
import buttons.SpelVerlatenButton;
import buttons.SpelinstellingenButton;
import buttons.SpelinstructiesButton;


public class HoofdmenuPaneel extends JPanel implements MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String path  = "res/menu-background.png";
	private final String logopath = "res/set-logo.png";
	private final String cardvoid = "res/card-void-transparant.png";
	private int ButtonWidth = 215;
	private int ButtonHeight = 51;
	private final int xPos = 300;
	private int yPos = 180;
	JPanel hoofdmenuPaneel,nieuwSpelPaneel;
	NieuwSpelButton nieuwspelbutton;
	SpelLadenButton spelladenbutton;
	HighscoresButton highscoresbutton;
	SpelinstructiesButton spelinstructiesbutton;
	SpelinstellingenButton spelinstellingenbutton;
	SpelVerlatenButton spelverlatenbutton;
	
	public HoofdmenuPaneel(){
		
		this.setLayout(null);
		//working
		//add buttons
		//nieuw spel button 
		// dit is de eerste knop	
		nieuwspelbutton = new NieuwSpelButton();
		nieuwspelbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		nieuwspelbutton.addMouseListener(this);
		this.add(nieuwspelbutton);
		yPos += 60;
	
		
		//laden spel button
		// dit is de tweede knop
		spelladenbutton = new SpelLadenButton();
		spelladenbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		this.add(spelladenbutton);
		yPos += 60;
		
		
		//highscores button
		// dit is de derde knop
		highscoresbutton = new HighscoresButton();
		highscoresbutton.setBounds(xPos,yPos,ButtonWidth, ButtonHeight);
		this.add(highscoresbutton);
		yPos += 60;
		
		
		//spelinstructies button
		// dit is de vierde knop
		spelinstructiesbutton = new SpelinstructiesButton();
		spelinstructiesbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		this.add(spelinstructiesbutton);
		yPos += 60;
		
		//spelinstellingen button
		// dit is de vijfde knop
		spelinstellingenbutton = new SpelinstellingenButton();
		spelinstellingenbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		this.add(spelinstellingenbutton);
		yPos += 60;
		
		//spelverlaten button
		// dit is de zes knop
		spelverlatenbutton = new SpelVerlatenButton();
		spelverlatenbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		this.add(spelverlatenbutton);	

	}
	
		
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Image background = Toolkit.getDefaultToolkit().getImage(path);
		Image logo = Toolkit.getDefaultToolkit().getImage(logopath);
		Image cardempty = Toolkit.getDefaultToolkit().getImage(cardvoid);
		g.drawImage(background,0,0,800,600,this);
		g.drawImage(cardempty, 200, 20, 420, 563, this);
		g.drawImage(logo, 250, 30, 313, 116, this);
		//void
		//g.setColor(Color.red);
		//g.fillRect(100,100,100,100);
		repaint();
	}




	public void mouseClicked(MouseEvent e) {
		
		System.out.println("dit is nieuw spel");
		//nieuwspelbutton.setVisible(false);
		

	}




	public void mouseEntered(MouseEvent e) {
	
		
	}




	public void mouseExited(MouseEvent e) {
		
		
	}




	public void mousePressed(MouseEvent e) {
		
		
	}




	public void mouseReleased(MouseEvent e) {
		
		
	}
	
	
	  
	}
	


