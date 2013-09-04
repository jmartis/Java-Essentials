package week_1_werkcollege_1_verkeerslichten;

import javax.swing.JFrame;

public class VerkeersLichtenDemo extends JFrame {

	public VerkeersLichtenDemo(){
		
		new JFrame();
		setSize(400,400);
		setTitle("Verkeerslichten Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new HoofdPaneel());
		setVisible(true);
	}
	public static void main(String[] args) {
		new VerkeersLichtenDemo();

	}

}
