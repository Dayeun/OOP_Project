package team8_OOPproject;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Chapter1 extends JPanel implements ActionListener {
	
	private JButton[] choice;
	private JButton jButton_back;
	private JLabel jlabel_background;
	private ImageIcon background;

	public Chapter1() 
	{
		jlabel_background = new JLabel();

		// return to previous panel
		jButton_back = new JButton("Home");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setBounds(650, 50, 80, 30);
		this.add(jButton_back);

		this.setLayout(null);
		this.setSize(800, 600);
		
		
		
		background = new ImageIcon("ch1-1.png");
		this.jlabel_background.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

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

	public JButton[] getChoice() {
		return choice;
	}

	public void setChoice(JButton[] choice) {
		this.choice = choice;
	}

	
}
