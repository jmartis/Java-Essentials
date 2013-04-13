package panelen;

import init.Main;
import innermenubuttons.TerugNaarHoofdmenuButton;
import innermenubuttons.VolgendePaneelButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class NieuwSpelPaneel extends JPanel implements MouseListener,ItemListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ClassLoader cldr = this.getClass().getClassLoader();
	
	private final URL path = cldr.getResource("res/menu-background.png");
	private final URL cardvoid = cldr.getResource("res/card-void-transparant.png");
	private final URL cardvoidheader = cldr.getResource("res/card-void-header.png");
	private final URL menucardsimage = cldr.getResource("res/menu-cards.png");
	private final URL paneltitle = cldr.getResource("res/new-game-title.png");
	private final URL selectplayers = cldr.getResource("res/select-players.png");
	private final URL terugnaarhoofdmenubuttontekstpath = cldr.getResource("res/back-to-main-menu-button-text.png");
	private final URL volgendebuttontekstpath = cldr.getResource("res/next-button-text.png");

	private JComboBox<String> list;
	private String [] aantalSpelers = {"","1","2","3","4","5","6","7","8"};
	
	Image background = Toolkit.getDefaultToolkit().getImage(path);
	Image cardemptyhead = Toolkit.getDefaultToolkit().getImage(cardvoidheader);
	Image cardempty = Toolkit.getDefaultToolkit().getImage(cardvoid);
	Image menucards = Toolkit.getDefaultToolkit().getImage(menucardsimage);
	Image title = Toolkit.getDefaultToolkit().getImage(paneltitle);
	Image selectPlayers = Toolkit.getDefaultToolkit().getImage(selectplayers);
	Image terugnaarhoofdmenutext = Toolkit.getDefaultToolkit().getImage(terugnaarhoofdmenubuttontekstpath);
	Image nextbuttontext = Toolkit.getDefaultToolkit().getImage( volgendebuttontekstpath);
	

	private int xLoc = 340;
	private int yLoc = (600-420);
	private int yPos = 380;
	private int xPos = 270;
	Main main;
	TerugNaarHoofdmenuButton mainButton;
	VolgendePaneelButton nextButton;

	

	public NieuwSpelPaneel(Main main){
		this.main = main;
		this.setLayout(null);
		setBackground(Color.yellow);
		Border border = new LineBorder(Color.black, 3);
		list = new JComboBox<String>(aantalSpelers);
		list.setSelectedIndex(0);
		list.setBorder(border);
		list.setBounds(xLoc+10,yLoc+40,110,25);
		list.addItemListener(this);
		add(list);
		
		
		mainButton = new TerugNaarHoofdmenuButton();
		mainButton.setBounds(xPos,yPos,44,41);
		mainButton.addMouseListener(this);
		add(mainButton);
		
		nextButton = new VolgendePaneelButton();
		nextButton.setBounds(xPos + 200,yPos,44,41);
		nextButton.addMouseListener(this);
		add(nextButton);
		
		
		
//		JButton test = new JButton("Nieuw spel");
//		test.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				System.out.println("het werkt!");
//				System.exit(0);
//			}
//		});
//		add(test);
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.drawImage(background,0,0,800,600,this);
		g.drawImage(cardempty, 200, 20, 420, 563, this);
		g.drawImage(cardemptyhead, 200, 20, 420, 117,this);
		g.drawImage(title, 320,70,187,32,this);
		g.drawImage(selectPlayers, xLoc,yLoc,130,16,this);
		g.drawImage(menucards, (800-350),(600-235) , 350,235,this);
		g.drawImage(terugnaarhoofdmenutext,xPos-50,yPos+60,161,12,this);
		g.drawImage(nextbuttontext,xPos+200,yPos+60,64,12,this);
		
		
		//g.drawImage(logo, 250, 30, 313, 116, this);
		//void
		//g.setColor(Color.red);
		//g.fillRect(100,100,100,100);
		repaint();
	}


	
	
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource().equals(mainButton)){
			main.remove(this);
			main.setPaneel(new HoofdmenuPaneel(main));
			main.revalidate();
			main.repaint();
			System.out.println("Terug naar hoofdmenu");
			
		}
		
	
		
		if(e.getSource().equals(list)){
			
	
			
			
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


	
	public void itemStateChanged(ItemEvent e) {
	
		String selectie = (String)e.getItem();
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			if(selectie == "1"){
				System.out.println("1 speler geselecteerd");
			}
			if(selectie == "2"){
				System.out.println("2 spelers geselecteerd");
			}
			if(selectie == "3"){
				System.out.println("3 spelers geselecteerd");
			}
			if(selectie == "4"){
				System.out.println("4 spelers geselecteerd");
			}
			if(selectie == "5"){
				System.out.println("5 spelers geselecteerd");
			}
			if(selectie == "6"){
				System.out.println("6 spelers geselecteerd");
			}
			if(selectie == "7"){
				System.out.println("7 spelers geselecteerd");
			}
			if(selectie == "8"){
				System.out.println("8 spelers geselecteerd");
			}
			
		}
			
		
		
	}

}