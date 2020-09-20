package com.flag;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Myfram extends JFrame {
	
	private flagpanal panel=new flagpanal();
	public Myfram() throws HeadlessException{
		setTitle("Happy Independence Day");
		setSize(440, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
		
		
	}

}
