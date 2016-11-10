package team8_OOPproject;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	private JButton jButton_title;
	ImageIcon title;
	
	public Select(){
		
		jlabel_background = new JLabel();
		jButton_title = new JButton();
		jButton_gotoGame = new JButton("Mini Games");
		jButton_gotoLearning = new JButton("Learning");
		jButton_back = new JButton("back");
		jButton_back.setBackground(Color.white);
		jButton_back.setOpaque(false);
		
		this.setSize(800, 600);
		this.setLayout(null);
		
		jButton_back.addActionListener(this);
		
		
		this.add(jButton_gotoGame);
		this.add(jButton_gotoLearning);
		this.add(jButton_back);
		
		jButton_gotoGame.setBounds(250, 200, 300, 80);
		jButton_gotoLearning.setBounds(250, 320, 300, 80);
		jButton_back.setBounds(20, 20, 80, 30);
		
		title = new ImageIcon("title.png");
		jButton_title.setBorderPainted(false);
		this.jButton_title.setBounds(200, 100, 400, 69);
		this.jButton_title.setIcon(title);
		this.add(jButton_title);
		
		background = new ImageIcon("main.png");
		this.jlabel_background.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);
		

	}

	public JButton getjButton_gotoGame() {
		return jButton_gotoGame;
	}

	public void setjButton_gotoGame(JButton jButton_gotoGame) {
		this.jButton_gotoGame = jButton_gotoGame;
	}

	public JButton getjButton_gotoLearning() {
		return jButton_gotoLearning;
	}

	public void setjButton_gotoLearning(JButton jButton_gotoLearning) {
		this.jButton_gotoLearning = jButton_gotoLearning;
	}

	public JButton getjButton_back() {
		return jButton_back;
	}

	public void setjButton_back(JButton jButton_back) {
		this.jButton_back = jButton_back;
	}

	public JLabel getJlabel_background() {
		return jlabel_background;
	}

	public void setJlabel_background(JLabel jlabel_background) {
		this.jlabel_background = jlabel_background;
	}

	public JButton getjButton_title() {
		return jButton_title;
	}

	public void setjButton_title(JButton jButton_title) {
		this.jButton_title = jButton_title;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	

}