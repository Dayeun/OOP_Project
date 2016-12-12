package team8_OOPproject;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class QuizImage extends JPanel{

	private Image image;
	private String fileName;
	
	
	
	public QuizImage(String fileName){
		this.fileName=fileName;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		image= new ImageIcon(fileName).getImage();
		g.drawImage(image, 100, 100, this);
	}
}
