package test.schermen;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import test.Panelen.NieuwSpelPaneel;
import test.menuKnoppen.NieuwspelKnop;
import test.menuKnoppen.SpelverlatenKnop;


public class Hoofdmenu extends JFrame implements Runnable, WindowListener {

	Toolkit tk = Toolkit.getDefaultToolkit();  
	private int width = ((int) tk.getScreenSize().getWidth());
	private int height = ((int) tk.getScreenSize().getHeight()); 
	private static JFrame venster,NieuwSpelScherm;
	schermController b;
	boolean turnOff =true;
	static NieuwspelKnop n;


	

	
	public JFrame venster(){
		
		venster = new JFrame();
		venster.setTitle("Test");
		venster.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		venster.addWindowListener(this);
		venster.setSize(1024,624);
		venster.setLocationRelativeTo(null);
		venster.setUndecorated(true);
//		setExtendedState(venster.MAXIMIZED_BOTH);
		venster.add(new achtergrondScherm());
		venster.setVisible(true);
		venster.setResizable(false);
		
		return venster;
	}
	
	
	public JFrame NieuwSpelScherm(){
		
		NieuwSpelScherm = new JFrame();
		NieuwSpelScherm.setTitle("Test");
		NieuwSpelScherm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		NieuwSpelScherm.addWindowListener(this);
		NieuwSpelScherm.setSize(1024,624);
		NieuwSpelScherm.setLocationRelativeTo(null);
		NieuwSpelScherm.setUndecorated(true);
//		setExtendedState(venster.MAXIMIZED_BOTH);
		NieuwSpelScherm.add(new NieuwSpelPaneel());
		NieuwSpelScherm.setVisible(false);
		NieuwSpelScherm.setResizable(false);
	
		return NieuwSpelScherm;
	}
	
	
	public Hoofdmenu(){
		
		venster();
		NieuwSpelScherm();
	
	}

	public void start(){
		Thread thread = new Thread(this);
		thread.start();
		
	}
	
	public void run() {
	while(true){
		try {
			
			if(turnOff == true){
				venster.setVisible(true);
				schermController.isRunning();
			}
			else{
				venster.setVisible(false);
			}
			
			Thread.sleep(17);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
		
	}
	
	
	public void paintComponent(Graphics g){
		
		
		SpelverlatenKnop spelverlatenKnop;
		spelverlatenKnop = new SpelverlatenKnop("Spel verlaten");
		spelverlatenKnop.setBounds(500  , 5 ,50,50);
		
		this.add(spelverlatenKnop);
		
	}

	@Override
	public void windowActivated(WindowEvent w) {
		

		
		while(schermController.isRunning() == false){
			venster.dispose();
			
		}
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}
