package Flyingbird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ConChim {
	
	private static int y = 200;
	private static int x = 100; 
	private BufferedImage bird;
		
	public static int getY() {
		return y;
	}
	
	public static int getX() {
		return x;
	
	}
		public void paint(Graphics g) {
		//g.setColor(Color.RED);
		//g.fillRect(x, y, 45, 45);
	 try {
		bird = ImageIO.read(new File("D:\\hinhanhFB\\conchim.png"));
		g.drawImage(bird, x, y, null);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void tangY() {
		y++; 
}
	public void giamY() {
		y-=30;
	}
}