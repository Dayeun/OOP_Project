package team8_OOPproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Learning_SelectMenu extends JPanel implements ActionListener{
	
	private JButton btnChap1;
	private JButton btnChap2;
	private JButton btnChap3;
	private JButton jButton_back;
	private JLabel jlabel_background;
	private ImageIcon background;
	private JLabel jlabel_title;
	private ImageIcon title;
	
	public Learning_SelectMenu()
	{	
		jlabel_title = new JLabel();
		jlabel_background = new JLabel();
		btnChap1 = new JButton("Chapter 1 : Material");
		btnChap1.setFont(new Font("Aharoni", Font.BOLD, 20));
		btnChap2 = new JButton("Chapter 2 : Force and motion");
		btnChap2.setFont(new Font("Aharoni", Font.BOLD, 20));
		btnChap3 = new JButton("Chapter 3 : Electricity & Magnetism");
		btnChap3.setFont(new Font("Aharoni", Font.BOLD, 20));
		
		this.setLayout(null);
		
		this.setSize(800, 600);
		
		btnChap1.addActionListener(this);
		btnChap2.addActionListener(this);
		btnChap3.addActionListener(this);
		
		this.add(btnChap1);
		this.add(btnChap2);
		this.add(btnChap3);
		
		btnChap1.setBackground(Color.ORANGE);
		btnChap2.setBackground(Color.ORANGE);
		btnChap3.setBackground(Color.ORANGE);
		
		btnChap1.setBounds(230, 134, 370, 85);
		btnChap2.setBounds(230, 265, 370, 85);
		btnChap3.setBounds(230, 404, 370, 85);
		
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
		
		this.repaint();
		title = new ImageIcon("learning_title.png");
		this.jlabel_title.setLocation(210,10);
		this.jlabel_title.setIcon(title);
		this.add(jlabel_title);
		
		
		setVisible(true);
				
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public JButton getBtnChap1() {
		return btnChap1;
	}

	public JButton getBtnChap2() {
		return btnChap2;
	}

	public JButton getBtnChap3() {
		return btnChap3;
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
	
	

}
