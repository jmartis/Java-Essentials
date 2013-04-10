package init;

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import panelen.HoofdmenuPaneel;

/**
 * @author INF1K1
 * Spel digitaliseren voor opdrachtgever
 * 
 * 
 * **/
public class Main extends JFrame implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Dimension screenSize = new Dimension(800,600);
	public Dimension pixel = new Dimension(screenSize.width,screenSize.height);
	//private final String name = "Set!";

	JFrame Hoofdmenu;
	
	
	
	public JFrame Hoofdmenu(){
		

		
		return Hoofdmenu;
	}
	
	public Main(){
		 
		Hoofdmenu = new JFrame();
		//Hoofdmenu.setTitle(name);
		Hoofdmenu.setSize(screenSize);
		Hoofdmenu.setLocationRelativeTo(null);
		Hoofdmenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Hoofdmenu.setUndecorated(true);
		Hoofdmenu.add(new HoofdmenuPaneel());
		Hoofdmenu.setVisible(true);
		
		
//		menuKeuze keuze = menuKeuze.NIEUWSPEL;
//		
//		switch(keuze){
//		case NIEUWSPEL:
//			nieuwSpel = new NieuwSpel();
//										
//			break;
//			
//		case SPELLADEN:
//			nieuwSpel = new NieuwSpel();
//			
//			hoofdmenu.Hoofdmenu.dispose();
//	
//			break;
//			
//		case HIGHSCORES:
//			nieuwSpel = new NieuwSpel();
//			
//			hoofdmenu.Hoofdmenu.dispose();
//	
//			break;
//			
//		case SPELINSTRUCTIES:
//			nieuwSpel = new NieuwSpel();
//			
//			hoofdmenu.Hoofdmenu.dispose();
//	
//			break;
//			
//		case SPELINSTELLINGEN:
//			nieuwSpel = new NieuwSpel();
//			
//			hoofdmenu.Hoofdmenu.dispose();
//	
//			break;
//			
//		case SPELVERLATEN:
//			nieuwSpel = new NieuwSpel();
//			
//			hoofdmenu.Hoofdmenu.dispose();
//	
//			break;
//			
//		case HOOFDMENU:
//			hoofdmenu = new HoofdMenu();
//			
//				
//			break;
//		}
//		
	}
	
	
	public static void main(String [] args){
		
		new Main();
		
	}


	public void run() {
	
		
	}



}
