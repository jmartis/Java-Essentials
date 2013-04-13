package panelen;

import init.Main;
import innermenubuttons.JaButton;
import innermenubuttons.NeeButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HuidigeSpelVerlatenPaneel extends JPanel implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ClassLoader cldr = this.getClass().getClassLoader();
	
	private final URL backgroundpath = cldr.getResource("res/menu-background.png");
	private final URL cardemptypath = cldr.getResource("res/card-void-transparant.png");
	private final URL paneltitle = cldr.getResource("res/exit-game-title.png");
	private final URL menucardsimage = cldr.getResource("res/menu-cards.png");
	private final URL cardvoidheader = cldr.getResource("res/card-void-header.png");
	private final URL warningboxpath = cldr.getResource("res/warning-box.png");
	private final URL exitgametextpath = cldr.getResource("res/exit-game-text.png");
	private final URL confirmtextpath = cldr.getResource("res/confirm-text.png");
	private Image title = Toolkit.getDefaultToolkit().getImage(paneltitle);
	private Image background = Toolkit.getDefaultToolkit().getImage(backgroundpath);
	private Image cardempty = Toolkit.getDefaultToolkit().getImage(cardemptypath);
	private Image menucards = Toolkit.getDefaultToolkit().getImage(menucardsimage);
	private Image warningbox = Toolkit.getDefaultToolkit().getImage(warningboxpath);
	private Image exitgametext = Toolkit.getDefaultToolkit().getImage(exitgametextpath);
	private Image cardemptyhead = Toolkit.getDefaultToolkit().getImage(cardvoidheader);
	private Image confirmtext = Toolkit.getDefaultToolkit().getImage(confirmtextpath);
	JaButton jabutton;
	NeeButton neebutton;
	Main main;
	private int xPos = 260;
	private int yPos = 300;
	
	public HuidigeSpelVerlatenPaneel(Main main){

		this.main = main;
		this.setLayout(null);
		setBackground(Color.green);
		JButton test = new JButton("spelVerlaten");
		test.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("het werkt!");
				System.exit(0);
			}
		});
		add(test);
		
		jabutton = new JaButton();
		jabutton.setBounds(xPos,yPos,113,55);
		jabutton.addMouseListener(this);
		add(jabutton);
		
		neebutton = new NeeButton();
		neebutton.setBounds(xPos + 180,yPos,113,55);
		neebutton.addMouseListener(this);
		add(neebutton);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.drawImage(background,0,0,800,600,this);
		g.drawImage(cardempty, 200, 20, 420, 563, this);
		g.drawImage(cardemptyhead, 200, 20, 420, 117,this);
		g.drawImage(warningbox,210,800-340,220,110,this);
		g.drawImage(title,300,70,233,32,this);
		g.drawImage(menucards, (800-350),(600-235) , 350,235,this);
		g.drawImage(exitgametext,270,160,266,30,this);
		g.drawImage(confirmtext,300,220,209,23,this);
		//g.drawImage(logo, 250, 30, 313, 116, this);
		//void
		//g.setColor(Color.red);
		//g.fillRect(100,100,100,100);
		repaint();
	}

	
	public void mouseClicked(MouseEvent m) {
		
		if(m.getSource().equals(jabutton)){
			System.exit(0);
		}
		if(m.getSource().equals(neebutton)){
			
		}
		
	}

	
	public void mouseEntered(MouseEvent m) {
		
		
	}

	
	public void mouseExited(MouseEvent m) {
		
		
	}

	
	public void mousePressed(MouseEvent m) {
		
		
	}

	
	public void mouseReleased(MouseEvent m) {
		
		
	}



}