package Flyingbird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class VeHinh extends JPanel implements Runnable{
     
	private ConChim conchimT=new ConChim();
	private OngNuoc ongnuocT=new OngNuoc();
	private KiemTra kiemtraT=new KiemTra();
	private DiemSo diemsoT=new DiemSo();
	private BufferedImage bg, nendat;
	
	
	
    private static boolean bl = false;
	private Thread threadT;
	
	public VeHinh() {
		threadT = new Thread(this);
		threadT.start();
	}
	
	public void paint(Graphics g) {
        //g.setColor(Color.cyan);
        //g.fillRect(0,0,getWidth(),getHeight());
		 try {
			bg = ImageIO.read(new File ("D:\\hinhanhFB\\BG1.png"));
			g.drawImage(bg, 0, 0, null );
		
        ongnuocT.paint(g);
        g.setColor(Color.green);
        g.fillRect(0,400,getWidth(),getHeight());
        g.setColor(Color.orange);
        g.fillRect(0,410,getWidth(),getHeight());
        conchimT.paint(g);
        g.setColor(Color.black);
        g.setFont(new Font("Aria",Font.BOLD,20));
        g.drawString("Điểm:" + diemsoT.getDiem(),10,20);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			repaint();
			ongnuocT.giamX();
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			ongnuocT.laplaiX();
			
			conchimT.tangY();
			diemsoT.congdiem();
			
			if ( kiemtraT.chet() == true) {
				bl=true;
				
				repaint();
				threadT.stop();
				
				
			}
			
			
		
			
		}
		
		
	
	}
	}
