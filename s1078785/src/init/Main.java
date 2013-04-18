package init;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;

import media.Sound;
import panelen.HoofdmenuPaneel;
import schermen.Screen;
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
	public Dimension pixel2 = new Dimension(getWidth(),getHeight());
	private final String name = "Set!";
	private JPanel paneel;
	private boolean fullscreen = true;
	Sound s;
	DisplayMode dm = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);

	private ClassLoader cldr = this.getClass().getClassLoader();
	
	private final URL path = cldr.getResource("res/set-cursor.gif");
	Toolkit toolkit = Toolkit.getDefaultToolkit();    
	Image image = toolkit.getImage(path); 
    Point xyLoc = new Point(0,0);  
    Cursor cursor = toolkit.createCustomCursor(image, xyLoc, "Custom-cursor");
    

	public Main(){
		paneel = new HoofdmenuPaneel(this);
		
		
		this.setTitle(name);
		this.setSize(screenSize);
		this.setLocationRelativeTo(null);
	    //Use the custom cursor  
		this.setCursor(cursor);  
		
		toolkit.getBestCursorSize(100, 100);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setUndecorated(true);
		this.add(paneel);
	   // s.starter(); //aanpassen , muziek activeren ? verwijder comment syntax
	
		//this.run(dm);
		this.setVisible(true);
	
	
	
	


	}
	public void setDisplayMode(DisplayMode dm){
		this.dm = dm;
	}
	
	public void setPaneel(JPanel paneel){
		this.paneel = paneel;
		this.add(paneel);

		this.setVisible(true);
	}
	

	public boolean isFullscreen() {
		return fullscreen;
	}

	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
	}

	public static void main(String [] args){
		
		Main m = new Main();
		
		System.out.println("Running....");
		
		

	}

	public void run(DisplayMode dm){
       
        Screen s = new Screen();
//        
        while (fullscreen){
        	s.setFullScreen(dm, this); 
        }
        
        	s.restoreScreen();
        
            
//        {
//                
//                Thread.sleep(5000);
//            }catch(Exception ex){};
//        }
//        finally{
//            
//        }
    }
	
	public void run() {


	}
	
	
}