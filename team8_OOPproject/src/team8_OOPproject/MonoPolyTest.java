package team8_OOPproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MonoPolyTest extends JPanel implements ActionListener {
	
	private JButton jButton_back;

	public MonoPolyTest(){
		jButton_back = new JButton("Back");
		jButton_back.setBackground(Color.white);
		jButton_back.setOpaque(false);
		
		this.setSize(800, 600);
		
		// button event
		jButton_back.addActionListener(this);
		
		// add the component to JPanel
		this.add(jButton_back);
		
		// set the component location
		jButton_back.setBounds(20, 20, 80, 30);
		
		this.setVisible(true);
		
		
		
	}

	public JButton getjButton_back() {
		return jButton_back;
	}

	public void setjButton_back(JButton jButton_back) {
		this.jButton_back = jButton_back;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
