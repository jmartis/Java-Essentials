package com.jovmaster;

import java.awt.Color;
import java.awt.Component;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class CoreLayer extends JComponent{

	
	Random r = new Random();
	private int width = r.nextInt(80);
	
	public CoreLayer(){
	
	
		add(firstPanel());
		
		
	}

	public Component firstPanel(){
		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.black);
		p.setBounds(0,0,800,600);
		this.add(secondPanel());
		p.setVisible(true);

	
		return p;
	}
	
	public Component secondPanel(){
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(Color.green);
		p2.setBounds(250,0,300,600);
		
		p2.setVisible(true);
		return p2;
	}
	

}
