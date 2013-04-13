package panelen;

import init.Main;
import innermenubuttons.AnnulerenButton;
import innermenubuttons.BewarenButton;
import innermenubuttons.HighscoresBeherenButton;

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
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class SpelinstellingenPaneel extends JPanel implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ClassLoader cldr = this.getClass().getClassLoader();

	private final URL path = cldr.getResource("res/menu-background.png");
	private final URL cardvoid = cldr.getResource("res/card-void-transparant.png");
	private final URL cardvoidheader = cldr.getResource("res/card-void-header.png");
	private final URL menucardsimage = cldr.getResource("res/menu-cards.png");
	private final URL paneltitle = cldr.getResource("res/game-options-title.png");
	private final URL paneltext = cldr.getResource("res/game-options-text.png");
	
	private final URL soundtitle = cldr.getResource("res/sound-title.png");
	private final URL savebutton = cldr.getResource("res/save-button.png");
	private final URL highscoressettings = cldr.getResource("res/highscores-settings.png");
	private final URL cancelbutton = cldr.getResource("res/cancel-button");
	private JCheckBox volledigScherm;
	private boolean checked = true;
	Image soundTitle = Toolkit.getDefaultToolkit().getImage(soundtitle);
	Image saveButton =Toolkit.getDefaultToolkit().getImage(savebutton);
	Image highscoreSettings = Toolkit.getDefaultToolkit().getImage(highscoressettings);
	Image cancelButton = Toolkit.getDefaultToolkit().getImage(cancelbutton);
	Image background = Toolkit.getDefaultToolkit().getImage(path);
	Image cardemptyhead = Toolkit.getDefaultToolkit().getImage(cardvoidheader);
	Image cardempty = Toolkit.getDefaultToolkit().getImage(cardvoid);
	Image menucards = Toolkit.getDefaultToolkit().getImage(menucardsimage);
	Image title = Toolkit.getDefaultToolkit().getImage(paneltitle);
	Image panelText = Toolkit.getDefaultToolkit().getImage(paneltext);
	Main main;
	AnnulerenButton annulerenbutton;
	BewarenButton bewarenbutton;
	HighscoresBeherenButton highscoresbeherenbutton;
	

	public SpelinstellingenPaneel(Main main) {

		this.main = main;
		this.setLayout(null);
		setBackground(Color.black);
		JButton test = new JButton("Spelinstellingen");
		test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("het werkt!");
				System.exit(0);
			}
		});
		add(test);

		
		
		volledigScherm = new JCheckBox("");
		volledigScherm.setLayout(null);
		Border border = new LineBorder(Color.black, 3);
		volledigScherm.setBounds(230, 343, 15, 15);
		volledigScherm.setBorderPainted(true);
		volledigScherm.setBorder(border);
		volledigScherm.setOpaque(false);
		volledigScherm.setSelected(true);
		volledigScherm.addMouseListener(this);
		add(volledigScherm);
		
		annulerenbutton = new AnnulerenButton();
		annulerenbutton.setBounds(220,490,101,29);
		annulerenbutton.addMouseListener(this);
		add(annulerenbutton);
		
		bewarenbutton = new BewarenButton();
		bewarenbutton.setBounds(340,490,101,29);
		bewarenbutton.addMouseListener(this);
		add(bewarenbutton);
		
		highscoresbeherenbutton = new HighscoresBeherenButton();
		highscoresbeherenbutton.setBounds(220,420,182,49);
		highscoresbeherenbutton.addMouseListener(this);
		add(highscoresbeherenbutton);
	}
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(background, 0, 0, 800, 600, this);
		g.drawImage(cardempty, 200, 20, 420, 563, this);
		g.drawImage(cardemptyhead, 200, 20, 420, 117, this);
		g.drawImage(menucards, (800 - 350), (600 - 235), 350, 235, this);
		g.drawImage(title, 260, 70, 297, 33, this);
		g.drawImage(panelText, 800 - 580, (600 - 405), 209, 224, this);
		g.drawImage(soundTitle,225,148,94,22,this);
		//g.drawImage(saveButton);
		//g.drawImage(cancelButton);
		//g.drawImage(highscoreSettings);
		// g.drawImage(logo, 250, 30, 313, 116, this);
		// void
		// g.setColor(Color.red);
		// g.fillRect(100,100,100,100);
		repaint();
	}

	
	public void mouseClicked(MouseEvent e) {
	
		
		
		if (e.getSource() == volledigScherm) {
			checked ^= true;
			if (!checked){
				main.setFullscreen(false);
			}
			else{
				main.setFullscreen(true);
			}
			
						
		}
		
		if(e.getSource().equals(annulerenbutton)){
			main.remove(this);
			main.setPaneel(new HoofdmenuPaneel(main));
			main.revalidate();
			main.repaint();
			System.out.println("Terug naar hoofdmenu");
		}
		if(e.getSource().equals(bewarenbutton)){
			System.out.println("spelinstellingen opslaan");
		}
		if(e.getSource().equals(highscoresbeherenbutton)){
			System.out.println("highscores beheren");
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