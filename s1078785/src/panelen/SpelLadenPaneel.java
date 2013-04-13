package panelen;

import init.Main;
import innermenubuttons.TerugNaarHoofdmenuButton;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JPanel;

public class SpelLadenPaneel extends JPanel implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ClassLoader cldr = this.getClass().getClassLoader();
	
	private final URL path = cldr.getResource("res/menu-background.png");
	private final URL cardvoid = cldr.getResource("res/card-void-transparant.png");
	private final URL cardvoidheader = cldr.getResource("res/card-void-header.png");
	private final URL menucardsimage = cldr.getResource("res/menu-cards.png");
	private final URL paneltitle = cldr.getResource("res/load-game-title.png");
	private final URL terugnaarhoofdmenubuttontekstpath = cldr.getResource("res/back-to-main-menu-button-text.png");
	
	Image background = Toolkit.getDefaultToolkit().getImage(path);
	Image cardemptyhead = Toolkit.getDefaultToolkit().getImage(cardvoidheader);
	Image cardempty = Toolkit.getDefaultToolkit().getImage(cardvoid);
	Image menucards = Toolkit.getDefaultToolkit().getImage(menucardsimage);
	Image terugnaarhoofdmenutext = Toolkit.getDefaultToolkit().getImage(terugnaarhoofdmenubuttontekstpath);
	Image title = Toolkit.getDefaultToolkit().getImage(paneltitle);
	
	Main main;
	TerugNaarHoofdmenuButton mainButton;

	private int yPos = 380;
	private int xPos = 270;
	
	public SpelLadenPaneel(Main main){

		this.main = main;
		this.setLayout(null);
		
		mainButton = new TerugNaarHoofdmenuButton();
		mainButton.setBounds(xPos,yPos,44,41);
		mainButton.addMouseListener(this);
		add(mainButton);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.drawImage(background,0,0,800,600,this);
		g.drawImage(cardempty, 200, 20, 420, 563, this);
		g.drawImage(cardemptyhead, 200, 20, 420, 117,this);
		g.drawImage(menucards, (800-350),(600-235) , 350,235,this);
		g.drawImage(terugnaarhoofdmenutext,xPos-50,yPos+60,161,12,this);
		g.drawImage(title, 320,70,187,32,this);
		//g.drawImage(logo, 250, 30, 313, 116, this);
		//void
		//g.setColor(Color.red);
		//g.fillRect(100,100,100,100);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource().equals(mainButton)){
			main.remove(this);
			main.setPaneel(new HoofdmenuPaneel(main));
			main.revalidate();
			main.repaint();
			System.out.println("Terug naar hoofdmenu");
	}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



}