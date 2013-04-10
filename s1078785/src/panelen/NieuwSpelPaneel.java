package panelen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NieuwSpelPaneel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public NieuwSpelPaneel(){
		
		setBackground(Color.black);
		JButton test = new JButton("test");
		test.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("het werkt!");
				System.exit(0);
			}
		});
		add(test);
	}

}
