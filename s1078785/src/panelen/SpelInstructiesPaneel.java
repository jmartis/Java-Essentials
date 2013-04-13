package panelen;

import init.Main;
import innermenubuttons.SpeciaalVolgendePaneelButton;
import innermenubuttons.TerugNaarHoofdmenuButton;
import innermenubuttons.VolgendePaneelButton;
import innermenubuttons.vorigeButton;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SpelInstructiesPaneel extends JPanel implements MouseListener {

	/**
	 * layout klaar
	 */
	private static final long serialVersionUID = 1L;

	Main main;
	TerugNaarHoofdmenuButton mainButton;
	VolgendePaneelButton nextButton;
	SpeciaalVolgendePaneelButton terugButton;
	vorigeButton previousButton;
	
	private ClassLoader cldr = this.getClass().getClassLoader();
	
	private final URL path = cldr.getResource("res/menu-background.png");
	private final URL cardvoid = cldr.getResource("res/card-void-transparant.png");
	private final URL cardvoidheader = cldr.getResource("res/card-void-header.png");
	private final URL menucardsimage = cldr.getResource("res/menu-cards.png");
	private final URL paneltitle = cldr.getResource("res/how-to-play-title.png");
	private final URL terugnaarhoofdmenubuttontekstpath = cldr.getResource("res/back-to-main-menu-button-text.png");
	private final URL volgendebuttontekstpath = cldr.getResource("res/next-button-text.png");

	private final URL twterugnaarhoofdmenutextpath = cldr.getResource("res/rules-back-to-mainmenu-button-text.png");
	private final URL vorigebuttontextpath = cldr.getResource("res/previous-menu-text.png");
	private final URL rulesbackgroundpath = cldr.getResource("res/game-rules-background.png");
	private final URL rulestitlepath = cldr.getResource("res/rules-title.png");
	
	private final URL spelregeleenpath = cldr.getResource("res/rules-1.png");
	private final URL spelregeltweepath = cldr.getResource("res/rules-2.png");
	private final URL spelregeldriepath = cldr.getResource("res/rules-3.png");
	private final URL spelregelvierpath = cldr.getResource("res/rules-4.png");
	private final URL spelregelvijfpath = cldr.getResource("res/rules-5.png");
	private final URL spelregelzespath = cldr.getResource("res/rules-6.png");
	
	Image background = Toolkit.getDefaultToolkit().getImage(path);
	Image cardemptyhead = Toolkit.getDefaultToolkit().getImage(cardvoidheader);
	Image cardempty = Toolkit.getDefaultToolkit().getImage(cardvoid);
	Image menucards = Toolkit.getDefaultToolkit().getImage(menucardsimage);
	Image terugnaarhoofdmenutext = Toolkit.getDefaultToolkit().getImage(terugnaarhoofdmenubuttontekstpath);
	Image title = Toolkit.getDefaultToolkit().getImage(paneltitle);
	Image nextbuttontext = Toolkit.getDefaultToolkit().getImage( volgendebuttontekstpath);
	
	private Image twterugnaarhoofdmenutext = Toolkit.getDefaultToolkit().getImage(twterugnaarhoofdmenutextpath);
	Image vorigebuttontext = Toolkit.getDefaultToolkit().getImage(vorigebuttontextpath);

	Image rulesbackground = Toolkit.getDefaultToolkit().getImage(rulesbackgroundpath);
	Image rulesTitle = Toolkit.getDefaultToolkit().getImage(rulestitlepath);
	Image FirstRule = Toolkit.getDefaultToolkit().getImage(spelregeleenpath);
	Image SecondRule = Toolkit.getDefaultToolkit().getImage(spelregeltweepath);
	Image ThirdRule = Toolkit.getDefaultToolkit().getImage(spelregeldriepath);
	Image FourthRule = Toolkit.getDefaultToolkit().getImage(spelregelvierpath);
	Image FifthRule = Toolkit.getDefaultToolkit().getImage(spelregelvijfpath);
	Image SixthRule = Toolkit.getDefaultToolkit().getImage(spelregelzespath);
	
	private final int RegelxPos = 250;
	private final int RegelyPos = 190;
	private int teller = 0;
	private int yPos = 410;
	private int xPos = 270;
	private Regelnummer order = Regelnummer.EERSTEREGEL;
	private boolean VorigeKnopTekst =  false;
	
	
	

	
	public SpelInstructiesPaneel(Main main){
		

		this.main = main;
		this.setLayout(null);
		mainButton = new TerugNaarHoofdmenuButton();
		mainButton.setBounds(xPos,yPos,44,41);
		mainButton.addMouseListener(this);
		add(mainButton);
		
		nextButton = new VolgendePaneelButton();
		nextButton.setBounds(xPos + 160,yPos,44,41);
		nextButton.addMouseListener(this);
		add(nextButton);
		
		terugButton = new SpeciaalVolgendePaneelButton();
		terugButton.setBounds(xPos + 160,yPos,44,41);
		terugButton.addMouseListener(this);
		terugButton.setVisible(false);
		add(terugButton);
		
		previousButton = new vorigeButton();
		previousButton.setBounds(xPos,yPos,44,41);
		previousButton.addMouseListener(this);
		previousButton.setVisible(false);
		add(previousButton);

	}
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		
		
		//draw images
		//style
		g.drawImage(background,0,0,800,600,this); 
		g.drawImage(cardempty, 200, 20, 420, 563, this);
		g.drawImage(cardemptyhead, 200, 20, 420, 117,this);
		g.drawImage(menucards, (800-350),(600-235) , 350,235,this);
		g.drawImage(rulesbackground, 225, 170, 367,224,this);
		
		//content
		g.drawImage(title, 280,70,272,32,this);
		
	
		g.drawImage(rulesTitle,305,150,196,16,this);
		
		
		//interactive content condition
		if(order != Regelnummer.ZESDEREGEL){
		g.drawImage(nextbuttontext,xPos+160,yPos+60,64,12,this);
		repaint();
		}
		
		//redraw on screen
		repaint();
	
		//display button text condition
		
		if(!VorigeKnopTekst){
			//terug naar hoofdmenu button text
			g.drawImage(terugnaarhoofdmenutext,xPos-50,yPos+60,161,12,this);
			repaint();
		}
		else{
			//terug naar vorige status text
			g.drawImage(vorigebuttontext,xPos,yPos+60,46,12,this);
			repaint();
		}
	
		
		//display instructions conditions
					
		if(order == Regelnummer.EERSTEREGEL){
			Regeleen(g);
			repaint();
		}
		if(order == Regelnummer.TWEEDEREGEL){
			Regeltwee(g);
			repaint();
		}
		if(order == Regelnummer.DERDEREGEL){
			Regeldrie(g);
			repaint();
		}
		if(order == Regelnummer.VIERDEREGEL){
			Regelvier(g);
			repaint();
		}
		if(order == Regelnummer.VIJFDEREGEL){
			Regelvijf(g);
			repaint();
		}
		if(order == Regelnummer.ZESDEREGEL){
			g.drawImage(twterugnaarhoofdmenutext,xPos+145,yPos+60,79,27,this);
			Regelzes(g);
			repaint();
			
		}
		

	}
	
	//spelregels
	public void Regeleen(Graphics g){
		
		
		g.drawImage(FirstRule, RegelxPos,RegelyPos,null);
		repaint();
	}
	
	public void Regeltwee(Graphics g){
		
	
		g.drawImage(SecondRule,RegelxPos-20,RegelyPos-10,null);
		repaint();
	}
	
	public void Regeldrie(Graphics g){
		
	
		g.drawImage(ThirdRule,RegelxPos,RegelyPos-4,null);
		repaint();
	}
	
	public void Regelvier(Graphics g){
		

		g.drawImage(FourthRule,RegelxPos-16,RegelyPos-4,null);
		repaint();
	}
	
	public void Regelvijf(Graphics g){
		
		
		g.drawImage(FifthRule,RegelxPos-16,RegelyPos,null);
		repaint();
	}
	
	public void Regelzes(Graphics g){
		
	
		g.drawImage(SixthRule,RegelxPos-16,RegelyPos,null);
		repaint();
		
	}
	
	
	private enum Regelnummer{
		EERSTEREGEL,TWEEDEREGEL,DERDEREGEL,VIERDEREGEL,VIJFDEREGEL,ZESDEREGEL
	}
	
	
	
	
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource().equals(mainButton))
		{
			main.remove(this);
			main.setPaneel(new HoofdmenuPaneel(main));
			main.revalidate();
			main.repaint();
			System.out.println("Terug naar hoofdmenu");
		}
		
		if(e.getSource().equals(nextButton))
		{
			
			teller++;			
			if(teller == 1){
				order = Regelnummer.TWEEDEREGEL;
				System.out.println("spelregel 2" + " tellernummer is: " + teller);
				mainButton.setVisible(false);
				VorigeKnopTekst = true;
				previousButton.setVisible(true);
				repaint();
				//vorige button
			}
			if(teller == 2){
				order = Regelnummer.DERDEREGEL;
				System.out.println("spelregel 3"+ " tellernummer is: " + teller);
				repaint();
			}
			if(teller == 3){
				order = Regelnummer.VIERDEREGEL;
				System.out.println("spelregel 4"+ " tellernummer is: " + teller);
				repaint();
				
			}
			if(teller ==  4){
				order = Regelnummer.VIJFDEREGEL;
				System.out.println("spelregel 5"+ " tellernummer is: " + teller);
				repaint();
				
			}
			if(teller ==  5){
				order = Regelnummer.ZESDEREGEL;
				System.out.println("spelregel 6"+ " tellernummer is: " + teller);
				nextButton.setVisible(false);
				//mainButton.setBounds(xPos + 160,yPos,44,41);
				//mainButton.setVisible(true);
				terugButton.setVisible(true);
				repaint();
			}
			if(teller > 5){
				order = Regelnummer.ZESDEREGEL;
				System.out.println("einde spelregels"+ "tellernummer is:" + teller);
				repaint();
			}
				
		}
		
		if(e.getSource().equals(previousButton))
		{
			System.out.println("previous button");
			teller--;
			
			if(teller == 0){
				order = Regelnummer.EERSTEREGEL;
				System.out.println("spelregel 1" + " tellernummer is: " + teller);
				mainButton.setVisible(true);
				VorigeKnopTekst = false;
				previousButton.setVisible(false);
				repaint();
				
				
			}
			
			if(teller == 1){
				order = Regelnummer.TWEEDEREGEL;
				System.out.println("spelregel 2" + " tellernummer is: " + teller);
				repaint();
				
			}
			if(teller == 2){
				order = Regelnummer.DERDEREGEL;
				System.out.println("spelregel 3"+ " tellernummer is: " + teller);
				repaint();
			}
			if(teller == 3){
				order = Regelnummer.VIERDEREGEL;
				System.out.println("spelregel 4"+ " tellernummer is: " + teller);
				repaint();
				
			}
			if(teller ==  4){
				order = Regelnummer.VIJFDEREGEL;
				System.out.println("spelregel 5"+ " tellernummer is: " + teller);
				mainButton.setVisible(false);
				nextButton.setVisible(true);
				mainButton.setBounds(xPos,yPos,44,41);
				repaint();
				
			}
			if(teller ==  5){
				order = Regelnummer.ZESDEREGEL;
				System.out.println("spelregel 6"+ " tellernummer is: " + teller);
				repaint();
			}
			if(teller > 5){
				order = Regelnummer.ZESDEREGEL;
				System.out.println("einde spelregels"+ "tellernummer is:" + teller);
				repaint();
			}
		}
		if(e.getSource().equals(terugButton)){
			main.remove(this);
			main.setPaneel(new HoofdmenuPaneel(main));
			main.revalidate();
			main.repaint();
			System.out.println("Terug naar hoofdmenu");
		}
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



}