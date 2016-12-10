package team8_OOPproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game_SelectMenu extends JPanel implements ActionListener{

	private JButton jButton_bMonopolyG;
	private JButton jButton_bPathFindingG;
	private JButton jButton_back;
	private JLabel jlabel_background;
	private ImageIcon background;

	
	public Game_SelectMenu() {
		Game_Character title = new Game_Character(200,100,"minigame_title.PNG");
		
		jlabel_background = new JLabel();
		
		jButton_bMonopolyG = new JButton("MonoPoly");
		jButton_bPathFindingG = new JButton("Path Finding");
		
		this.setSize(800, 600);
		
		// button event
		jButton_bMonopolyG.addActionListener(this);
		jButton_bPathFindingG.addActionListener(this);
		
		this.setLayout(null);
		
		this.add(jButton_bMonopolyG);
		this.add(jButton_bPathFindingG);
		this.add(title);
		
		jButton_bPathFindingG.setBackground(Color.ORANGE);
		jButton_bMonopolyG.setBackground(Color.ORANGE);
	
		jButton_bMonopolyG.setBounds(230, 300, 350, 60);
		jButton_bPathFindingG.setBounds(230, 400, 350, 60);

		//return to previous panel
		jButton_back = new JButton("Back");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setBounds(20, 20, 80, 30);
		this.add(jButton_back);
		
		background = new ImageIcon("main.png");
		this.jlabel_background.setBounds(0,0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);
				
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public JButton getjButton_bMonopolyG() {
		return jButton_bMonopolyG;
	}

	public JButton getjButton_bPathFindingG() {
		return jButton_bPathFindingG;
	}

	public JButton getjButton_back() {
		return jButton_back;
	}

}