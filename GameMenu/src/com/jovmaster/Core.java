package com.jovmaster;

import javax.swing.JFrame;

public class Core {
	
	private static String name = "Game menu";
	private static int width = 800;
	private static int height = 600;
	
	public static void main (String [] args){
		
		new Core();
		
		JFrame frame = new JFrame();
		frame.setTitle(name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.add(new CoreLayer());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
