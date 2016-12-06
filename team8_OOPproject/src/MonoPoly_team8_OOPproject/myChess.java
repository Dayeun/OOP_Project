package MonoPoly_team8_OOPproject;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.GridLayout;

public class myChess extends MyBackgroundPanel{

	private JButton die;
	private JButton hand;
	
	public myChess() {
		JPanel panel1 = new JPanel();
		JPanel panel2= new JPanel();
	//	getContentPane().add(panel1, BorderLayout.EAST);
	//	panel.add(myDie);
		
	//	add(panel1, BorderLayout.EAST);
	//	add(panel2, BorderLayout.NORTH);
		
		add(die, BorderLayout.EAST);
		add(hand, BorderLayout.NORTH);
			
		
		JButton die= new JButton(new ImageIcon("die.png"));
		die.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JButton hand= new JButton(new ImageIcon("hand.png"));
		
	//	panel1.add(die);
		//panel2.add(hand);
		
		
		setSize(300, 300);
		
		JButton  = new JButton(new ImageIcon("die.png"));
		
		JButton btnNewButton = new JButton("New button");
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button)
						.addComponent(btnNewButton, Alignment.TRAILING))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(button)
							.addGap(49)
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		setLayout(groupLayout);
		setVisible(true);
		
	}
}
