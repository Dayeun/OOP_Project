package team8_OOPproject;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Game_Character extends JLabel {

	private ImageIcon MainCharacter;

	public Game_Character(int x, int y, String a) {

		MainCharacter = new ImageIcon(a);
		this.setIcon(MainCharacter);
		setLocation(x, y);

	}

	public void setIconImage(String imageName) {

		MainCharacter = new ImageIcon(imageName);
	}

	public void setLocation(int x, int y) {
		this.setBounds(x, y, MainCharacter.getIconWidth(), MainCharacter.getIconHeight());

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