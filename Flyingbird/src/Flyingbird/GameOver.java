package Flyingbird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GameOver {
	

	public static int kichthuoc = 25;
	private static int y = 200;
	private static int x = 300;
	
	public static int getY() {
		return y;
	}
	public static int getX() {
		return x;
	}
			
	public void paint(Graphics g) {
		BufferedImage bird;
		try {
			bird = ImageIO.read(new File("D:\\hinhanhFB\\game over.png"));
			g.drawImage(bird, x,y,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
