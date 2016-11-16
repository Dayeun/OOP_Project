package team8_OOPproject;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Game_Character extends JLabel {

	private ImageIcon Magnet;

	private int width = 150;
	private int height = 150;

	public Game_Character(int x, int y, String a) {

		Magnet = new ImageIcon(a);
		this.setIcon(Magnet);
		setLocation(x, y);

	}

	public void setIconImage(String imageName) {

		Magnet = new ImageIcon(imageName);
	}

	public void setLocation(int x, int y) {
		this.setBounds(x, y, Magnet.getIconWidth(), Magnet.getIconHeight());

	}
	
	public void moving_R(int x, int y)
	{
		setLocation(x+98, y);
	}

	public void moving_L(int x, int y)
	{
		setLocation(x-98, y);
	}

	
	public void moving_U(int x, int y)
	{
		setLocation(x, y-103);
	}
	
	public void moving_D(int x, int y)
	{
		setLocation(x, y+105);
	}
}