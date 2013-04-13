package panelen;

import hoofdmenubuttons.HighscoresButton;
import hoofdmenubuttons.NieuwSpelButton;
import hoofdmenubuttons.SpelLadenButton;
import hoofdmenubuttons.SpelVerlatenButton;
import hoofdmenubuttons.SpelinstellingenButton;
import hoofdmenubuttons.SpelinstructiesButton;
import init.Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import media.Sound;



public class HoofdmenuPaneel extends JPanel implements MouseListener{

	/**
	 * layout nog vijf set kaarten toevoegen
	 *  
	
			+----------+    +------+---+    +----------+
			|          |    |      |   |    |          |
			| Hoofdmenu| => | JPane| JP| => | Volgende |
			|          |    |      |   |    |    JP    |
			+----------+    +------+---+    +----------+
			
	
	 */
	private static final long serialVersionUID = 1L;

	private ClassLoader cldr = this.getClass().getClassLoader();
	
	private final URL backgroundpath = cldr.getResource("res/menu-background.png");
	private final URL logopath = cldr.getResource("res/set-logo.png");
	private final URL cardemptypath = cldr.getResource("res/card-void-transparant.png");
	private final URL cardemptybackgroundpath =  cldr.getResource("res/card-void-background.png");
	private Image background = Toolkit.getDefaultToolkit().getImage(backgroundpath);
	private Image logo = Toolkit.getDefaultToolkit().getImage(logopath);
	private Image cardempty = Toolkit.getDefaultToolkit().getImage(cardemptypath);
	private Image cardemptybackground = Toolkit.getDefaultToolkit().getImage(cardemptybackgroundpath);
	
	
	
	
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
	
	//panelen
	HighscoresPaneel highscorespaneel;
	SpelInstructiesPaneel spelinstructiespaneel;
	SpelLadenPaneel spelladenpaneel;
	SpelVerlatenPaneel spelverlatenpaneel;
	SpelinstellingenPaneel spelinstellingen;
	int teller = 0;

	Main main;
	
	menuKeuze keuze;
	
	public Dimension screenSize = new Dimension(800,600);
	public Dimension pixel = new Dimension(screenSize.width,screenSize.height);
	
	//geluiden
	Sound s;
	
	public HoofdmenuPaneel(Main main){
		this.main = main;
		this.setLayout(null);
		
		
		nieuwspelbutton = new NieuwSpelButton();
		nieuwspelbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		nieuwspelbutton.addMouseListener(this);
		this.add(nieuwspelbutton);
		yPos += 60;


		//laden spel button
		// dit is de tweede knop
		spelladenbutton = new SpelLadenButton();
		spelladenbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		spelladenbutton.addMouseListener(this);
		this.add(spelladenbutton);
		yPos += 60;


		//highscores button
		// dit is de derde knop
		highscoresbutton = new HighscoresButton();
		highscoresbutton.setBounds(xPos,yPos,ButtonWidth, ButtonHeight);
		highscoresbutton.addMouseListener(this);
		this.add(highscoresbutton);
		yPos += 60;


		//spelinstructies button
		// dit is de vierde knop
		spelinstructiesbutton = new SpelinstructiesButton();
		spelinstructiesbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		spelinstructiesbutton.addMouseListener(this);
		this.add(spelinstructiesbutton);
		yPos += 60;

		//spelinstellingen button
		// dit is de vijfde knop
		spelinstellingenbutton = new SpelinstellingenButton();
		spelinstellingenbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		spelinstellingenbutton.addMouseListener(this);
		this.add(spelinstellingenbutton);
		yPos += 60;

		//spelverlaten button
		// dit is de zes knop
		spelverlatenbutton = new SpelVerlatenButton();
		spelverlatenbutton.setBounds(xPos,yPos,ButtonWidth,ButtonHeight);
		spelverlatenbutton.addMouseListener(this);
		this.add(spelverlatenbutton);	
		
		//s.starter(); muziek kan gestart worden via paneel

	}


	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
	
		
		g.drawImage(background,0,0,800,600,this);
		g.drawImage(cardempty, 200, 20, 420, 563, this);
		g.drawImage(cardemptybackground,210,150,401,409,this);
		g.drawImage(logo, 250, 30, 305, 116, this);
		//g.fillRect(100,100,100,100);
		//void
		//g.setColor(Color.red);
		//g.fillRect(100,100,100,100);
		repaint();
	}



	
	public void mouseClicked(MouseEvent e) {
		
		
		
	if(e.getSource().equals(nieuwspelbutton)){
			main.remove(this);
			main.setPaneel(new NieuwSpelPaneel(main));
			main.revalidate();
			//main.setExtendedState(JFrame.MAXIMIZED_BOTH);
			main.repaint();
			
			if(teller == 0){
				//main.setFullscreen(true);
				teller++;
			}
			if(teller == 1)
			{
				main.setFullscreen(true);
			}
		
			System.out.println("Binnen nieuwspelPaneel");
			//working now
	}
		if(e.getSource().equals(spelladenbutton)){
			main.remove(this);
			main.setPaneel(new SpelLadenPaneel(main));
			main.revalidate();
			main.repaint();
			//working now
		}
		
		if(e.getSource().equals(highscoresbutton)){
			main.remove(this);
			main.setPaneel(new HighscoresPaneel(main));
			//main.setSize(1024,768); dit zou ik kunnen gebruiken om de settings volledigscherm te creeeren;
			main.revalidate();
			main.repaint();
			//working now
		}
		
		if(e.getSource().equals(spelinstructiesbutton)){
			main.remove(this);
			main.setPaneel(new SpelInstructiesPaneel(main));
			main.revalidate();
			main.repaint();
		}
		if(e.getSource().equals(spelinstellingenbutton)){
			main.remove(this);
			main.setPaneel(new SpelinstellingenPaneel(main));
			
			main.revalidate();
			main.repaint();
		
		}
		
		if(e.getSource().equals(spelverlatenbutton)){
			main.remove(this);
			main.setPaneel(new SpelVerlatenPaneel(main));
			main.revalidate();
			main.repaint();
		}
	
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
