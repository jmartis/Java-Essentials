package screen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * 
 * Behold! This class contains panels, and link to self made buttons.JComponent is the replacement of JButton within the same hierarchy which makes
 * it possible to use the drawImage method simulating a button and removing the border on mouse over simultaneously. I combined the Class loader with 
 * the well known URL Class to access the image path.
 * 
 * 
 * **/

public class MainMenu extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private ClassLoader cldr = this.getClass().getClassLoader(); //esaki ta e classloader
	//private final URL path = cldr.getResource("res/menubackground.png"); //esaki ta e lokual ma exporta i importa den mi projekto
	//private final URL logopath = cldr.getResource("res/set-logo.png"); // mi por usa classloader pa mas rekurso
	private final String path  = "res/menu-background.png";
	private final String logopath = "res/set-logo.png";
	private final String cardvoid = "res/card-void-transparant.png";
	public static ArrayList<Image> logosequence = new ArrayList<Image>();
	
	public MainMenu(){
		
		//is void now
		setLayout(null);
		setBackground(Color.black);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//is void now
		//buske den rekursonan 
		Image background = Toolkit.getDefaultToolkit().getImage(path);
		Image logo = Toolkit.getDefaultToolkit().getImage(logopath);
		Image card0 = Toolkit.getDefaultToolkit().getImage(cardvoid);
		//awor e por wordu aplika
		g.drawImage(background,0,0,800,600,this);
		//g.drawImage(logo, 300, 30, 210, 97, this);
		g.drawImage(card0, 270, 150, 250, 400, this);
		repaint();
		
		
//		int imageID = 0;
//		int imageID2 = 00000;
//
//	
//	
//			
//	
//			String counter =  "logo-anim-res/set-logo_00000.png" ;
//			
//			imageID++;
//			Image sequencepath = Toolkit.getDefaultToolkit().getImage(counter);
//
//			logosequence.add(sequencepath);
//			
////			if(i > 10){
////				counter =  "logo-anim-res/set-logo_000"+imageID+".png" ;
////			}
////			if(i > 100){
////				counter =  "logo-anim-res/set-logo_00"+imageID+".png" ;
////			}
////			System.out.println(counter);
////			
////			break;
//			//g.drawImage(logosequence.get(0),0,0,800,600,this);
//	
//			
//		g.drawImage(logosequence.get(100),0,0,800,600,this);
//		repaint();
		
	
	}
	
	
	
}
