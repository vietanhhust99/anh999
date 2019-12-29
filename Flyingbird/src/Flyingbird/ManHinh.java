package Flyingbird;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ManHinh extends JFrame {
    private VeHinh vehinhM= new VeHinh();
    private ConChim conchimM = new ConChim();
    
	public ManHinh() {
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocation(400,100);
		setResizable(false);
		add(vehinhM);
	   
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				 if (conchimM.getY() >= 0) {
	                    conchimM.giamY();
	                }
			}  
		});
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if (conchimM.getY() >= 0) {
                    conchimM.giamY();
			}
			}
			 
		});
	}
	
		public static void main(String[]args) {
	
	   ManHinh mh= new ManHinh();
	   
    }

}

