package schermen;
import init.Main;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.JFrame;


public class Screen {
	
	private GraphicsDevice vc;
	
	Main main;
	public Screen(){
	//env is environment variable, containing all graphics manipulation objects
    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();

    //When we get environment and getDegaultScreen Device, we get access to the entire monitor, not just a window
    vc = env.getDefaultScreenDevice();

	}

public void setFullScreen(DisplayMode dm, JFrame window){ 
		
        //window.setUndecorated(true); 
        window.setResizable(false); 
        vc.setFullScreenWindow(window); 

      

        if(dm != null && vc.isDisplayChangeSupported()) {
            try{
                vc.setDisplayMode(dm); 
            }catch(Exception ex){}
        }
}
        
        public Window getFullScreenWindow(){
        	return vc.getFullScreenWindow();
        }
        public void restoreScreen(){
        	Window w = vc.getFullScreenWindow();
        	if(w !=null){
        		w.setSize(800,600);
        		//w.dispose();
        	}
        	vc.setFullScreenWindow(null);
        }
        
        
        


}