package Flyingbird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class OngNuoc extends JPanel {
	
	private static int x1=500,x2=x1+140,x3=x2+140,x4=x3+140;
	private static int h1,h2,h3,h4;
	private static boolean bl1=false;
	private static boolean bl2=false;
	private static boolean bl3=false;
	private static boolean bl4=false;
	
	private BufferedImage ongnuoctren, ongnuocduoi; 
	
	
	
	public static int getX1() {
		return x1;
	}
	
	public static int getX2() {
		return x2;
	}
	
	public static int getX3() {
		return x3;
	}
	
	public static int getX4() {
		return x4;
		}
	
	
	public static int getH1() {
		return h1;
	}
	
	public static int getH2() {
		return h2;
	}
	
	public static int getH3() {
		return h3;
	}
	
	public static int getH4() {
		return h4;
	}
	public void ngaunhienH() {
		Random rd = new Random();
		if(bl1==false) {
			h1 = rd.nextInt(200);
		    bl1 = true;
		}
		if(bl2==false) {
		    h2 = rd.nextInt(200);
			bl2 = true;
		}
		if(bl3==false) {
			h3 = rd.nextInt(200);
			bl3 = true;
		}
		if(bl4==false) {
		    h4 = rd.nextInt(200);
			bl4 = true;
		}
		
	}
	public void paint(Graphics g) {
		try  {
		ngaunhienH();
		
		//g.setColor(Color.green);
        //g.fillRect(x1,0,65,h1);
        
        //g.setColor(Color.green);
        //g.fillRect(x1,h1+100,65,500);
		
		
			ongnuoctren = ImageIO.read(new File("D:\\hinhanhFB\\tretren.png"));
			ongnuocduoi = ImageIO.read(new File("D:\\hinhanhFB\\treduoi.png"));
			
			g.drawImage(ongnuoctren, x1, 0, 65,h1, null);   
			g.drawImage(ongnuocduoi, x1, h1+100, 65, 500, null);
		
			g.drawImage(ongnuoctren, x2, 0, 65,h2, null);
			g.drawImage(ongnuocduoi, x2, h2+100, 65, 500, null);
		
			g.drawImage(ongnuoctren, x3, 0, 65,h3, null);
			g.drawImage(ongnuocduoi, x3, h3+100, 65, 500, null);
		
			g.drawImage(ongnuoctren, x4, 0, 65,h4, null);
			g.drawImage(ongnuocduoi, x4, h4+100, 65, 500, null);
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}	
 
    //   g.setColor(Color.green);
      //  g.fillRect(x2,0,65,h2);
        
     //   g.setColor(Color.green);
     //   g.fillRect(x2,h2+100,65,500);
        
      //  g.setColor(Color.green);
      //  g.fillRect(x3,0,65,h3);
        
      //  g.setColor(Color.green);
      //  g.fillRect(x3,h3+100,65,500);
        
    //    g.setColor(Color.green);
      //  g.fillRect(x4,0,65,h4);
        
      //  g.setColor(Color.green);
      //  g.fillRect(x4,h4+100,65,500);
        
        
	}
	
	public void giamX() {
		x1--;
		x2--;
		x3--;
		x4--;
		
    }
	public void laplaiX() {
		if(x1==-65) {
			 x1= 500;
			 bl1 = false;
		}
		if(x2==-65) {
			 x2= 500;
			 bl2 = false;
		}
		if(x3==-65) {
			 x3= 500;
			 bl3 = false;
		}
		if(x4==-65) {
			x4= 500;
			bl4 = false;
			 
		}
	}
}
