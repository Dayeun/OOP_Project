package MonoPoly_team8_OOPproject;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBackgroundPanel extends JPanel{

	private Image bImage;
	
	public MyBackgroundPanel(){
		
		/**
		JPanel bPanel= new JPanel();
		bPanel.setLayout(null);
		bPanel.setBounds(0, 0, 800, 600);
	*/
				
		bImage= Toolkit.getDefaultToolkit().createImage("main.png");
	
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.drawImage(bImage, 0, 0, this);

	}
}
	/**
	public static void main(String[] args) {
		
		JFrame bFrame= new JFrame("Play Physics");
		bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bFrame.add(new MyBackgroundPanel());
		bFrame.setSize(800, 600);
		bFrame.setVisible(true);

		
	}
	}
*/