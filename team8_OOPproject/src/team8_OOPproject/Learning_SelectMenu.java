package team8_OOPproject;

import java.awt.Color;
import java.awt.FlowLayout;
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
	private JButton btnChap4;
	private JButton btnChap5;
	private JButton btnChap6;
	private JButton jButton_back;
	private JLabel jlabel_background;
	private ImageIcon background;
	
	public Learning_SelectMenu()
	{
		Game_Character title = new Game_Character(210, 10, "learning_title.png");
		//GridBagConstraints c = new GridBagConstraints();
		
		jlabel_background = new JLabel();
		btnChap1 = new JButton("Chapter 1");
		btnChap2 = new JButton("Chapter 2");
		btnChap3 = new JButton("Chapter 3");
		btnChap4 = new JButton("Chapter 4");
		btnChap5 = new JButton("Chapter 5");
		btnChap6 = new JButton("Chapter 6");
		
		this.setLayout(null);
		
		this.setSize(800, 600);
		
		btnChap1.addActionListener(this);
		btnChap2.addActionListener(this);
		btnChap3.addActionListener(this);
		btnChap4.addActionListener(this);
		btnChap5.addActionListener(this);
		btnChap6.addActionListener(this);
		
		this.add(title);
		this.add(btnChap1);
		this.add(btnChap2);
		this.add(btnChap3);
		this.add(btnChap4);
		this.add(btnChap5);
		this.add(btnChap6);
		
		btnChap1.setBackground(Color.ORANGE);
		btnChap2.setBackground(Color.ORANGE);
		btnChap3.setBackground(Color.ORANGE);
		btnChap4.setBackground(Color.ORANGE);
		btnChap5.setBackground(Color.ORANGE);
		btnChap6.setBackground(Color.ORANGE);
		
		btnChap1.setBounds(230, 120, 350, 60);
		btnChap2.setBounds(230, 190, 350, 60);
		btnChap3.setBounds(230, 260, 350, 60);
		btnChap4.setBounds(230, 330, 350, 60);
		btnChap5.setBounds(230, 400, 350, 60);
		btnChap6.setBounds(230, 470, 350, 60);
		
		//return to previous panel
		jButton_back = new JButton("Back");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setBounds(20, 20, 80, 30);
		this.add(jButton_back);
		
		//this.setLayout(new GridLayout(3,3,50,50));
		
		
		background = new ImageIcon("main.png");
		this.jlabel_background.setBounds(0,0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);
		
		
		setVisible(true);
				
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public JButton getBtnChap1() {
		return btnChap1;
	}

	public void setBtnChap1(JButton btnChap1) {
		this.btnChap1 = btnChap1;
	}

	public JButton getBtnChap2() {
		return btnChap2;
	}

	public void setBtnChap2(JButton btnChap2) {
		this.btnChap2 = btnChap2;
	}

	public JButton getBtnChap3() {
		return btnChap3;
	}

	public void setBtnChap3(JButton btnChap3) {
		this.btnChap3 = btnChap3;
	}

	public JButton getBtnChap4() {
		return btnChap4;
	}

	public void setBtnChap4(JButton btnChap4) {
		this.btnChap4 = btnChap4;
	}

	public JButton getBtnChap5() {
		return btnChap5;
	}

	public void setBtnChap5(JButton btnChap5) {
		this.btnChap5 = btnChap5;
	}

	public JButton getBtnChap6() {
		return btnChap6;
	}

	public void setBtnChap6(JButton btnChap6) {
		this.btnChap6 = btnChap6;
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
