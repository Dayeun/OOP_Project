package team8_OOPproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MonoPolyTest extends JPanel implements ActionListener {
	
	private JButton jButton_back;
	private JLabel jlabel_background;
	
	private ImageIcon background;

	public MonoPolyTest(){
		
		jlabel_background = new JLabel();
		
		jButton_back = new JButton("Back");
		jButton_back.setBackground(Color.white);
		jButton_back.setOpaque(false);
		
		this.setSize(800, 600);
		this.setLayout(null);
		
		// button event
		jButton_back.addActionListener(this);
		
		
		// add the component to JPanel
		this.add(jButton_back);
		
		// set the component location
		jButton_back.setBounds(20, 20, 80, 30);
		
		background = new ImageIcon("main.png");
		this.jlabel_background.setBounds(0,0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);
		
		this.setVisible(true);
		
		
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
