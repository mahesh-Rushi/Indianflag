package com.flag;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.BoldAction;

public class flagpanal extends JPanel {
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.decode("#FF8F1c"));
		g.drawRect(10, 10, 400, 70);
		g.fillRect(10, 10, 400, 70);
		
		g.setColor(Color.WHITE);
		g.drawRect(10, 80, 400, 70);
		g.fillRect(10, 80, 400, 70);
		
		g.setColor(Color.decode("#509E2F"));
		g.drawRect(10, 150, 400, 70);
		g.fillRect(10, 150, 400, 70);
		g.setColor(Color.BLACK);
		g.fillRect(10, 10, 5, 540);
		
		try {
			
			Image img = ImageIO.read(new FileInputStream("src/a.jpg"));
			g.drawImage(img, 165, 80, 70, 70, null);
			
			g.setFont(new Font("Lato",Font.BOLD,30));
			g.setColor(Color.BLUE);
			g.drawString("Happy Independence Day !!", 25, 400);
			
			
    
    
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
