package team8_OOPproject;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Select extends JPanel implements ActionListener{
	
	private JButton jButton_gotoGame;
	private JButton jButton_gotoLearning;
	private JButton jButton_back;
	
	// for background
	private JLabel jlabel_background;
	ImageIcon background;

	
	public Select(){
		
		Game_Character title = new Game_Character(200,100,"title.PNG");
		jlabel_background = new JLabel();
		jButton_gotoGame = new JButton("Mini Games");
		jButton_gotoLearning = new JButton("Learning");
		
		this.setSize(800, 600);
		this.setLayout(null);
		
		jButton_gotoGame.addActionListener(this);
		
		this.add(jButton_gotoGame);
		this.add(jButton_gotoLearning);
		this.add(title);
		
		jButton_gotoGame.setBounds(250, 200, 300, 80);
		jButton_gotoLearning.setBounds(250, 320, 300, 80);
		
		//return to previous panel
		jButton_back = new JButton("Back");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setBounds(20, 20, 80, 30);
		this.add(jButton_back);
		
		background = new ImageIcon("main.png");
		this.jlabel_background.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);
		

	}
	public JButton getjButton_gotoGame() {
		return jButton_gotoGame;
	}
	public JButton getjButton_gotoLearning() {
		return jButton_gotoLearning;
	}
	public JButton getjButton_back() {
		return jButton_back;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
