package test.Panelen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NieuwSpelPaneel extends JPanel implements ActionListener {
	
	private JButton exit;
	
	public NieuwSpelPaneel(){
		
		setBackground(Color.yellow);
		exit = new JButton("Exit");
		exit.addActionListener(this);
		add(exit);
		
	}

	
	public void actionPerformed(ActionEvent e) {
	
		System.exit(0);
		
	}

}
