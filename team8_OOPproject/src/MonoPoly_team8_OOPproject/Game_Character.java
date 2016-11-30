package MonoPoly_team8_OOPproject;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Game_Character extends JLabel {

	private ImageIcon MainCharacter;

	public Game_Character(int x, int y, String a) {

		MainCharacter = new ImageIcon(a);
		this.setIcon(MainCharacter);
		setLocation(x, y);
		System.out.println();
	}

	public void setIconImage(String imageName) {

		MainCharacter = new ImageIcon(imageName);
	}

	public void setLocation(int x, int y) {
		this.setBounds(x, y, MainCharacter.getIconWidth(), MainCharacter.getIconHeight());

	}
	
	public void moving_R(int x, int y,int k)
	{
		setLocation(x+k, y);
	}

	public void moving_L(int x, int y,int k)
	{
		setLocation(x-k, y);
	}

	
	public void moving_U(int x, int y,int k)
	{
		setLocation(x, y-k);
	}
	
	public void moving_D(int x, int y,int k)
	{
		setLocation(x, y+k);
	}
}