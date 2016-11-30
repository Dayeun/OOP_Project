package MonoPoly_team8_OOPproject;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyFrame extends JFrame {
	
	private JTextField textField;
	private Piece myCharacter;
//	private JLabel background;
	
	public MyFrame() {
		
	//	JPanel myPanel= new JPanel();
		//MyBackground ph = new MyBackground(this);
		add(new MyBackgroundPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	/**
		JPanel background= new JPanel();
		
		ImageIcon bImage = new ImageIcon("background.png");
		this.background.setBounds(0,0, 800, 600);
		this.background.setIcon(bImage);
		this.add(background);
		this.setLayout(null);
		this.add(background);

		
		
		
		
		
		
		/** From top to down*/
		
		/**Name*/
		
		JLabel nameLabel = new JLabel("Name: ");
		textField = new JTextField();
		textField.setColumns(20);
		JPanel namePanel = new JPanel();
		namePanel.add(nameLabel);
		namePanel.add(textField);
		getContentPane().add(namePanel, BorderLayout.NORTH);
		
		
		/** Character*/
		JPanel cPanel = new JPanel();
		getContentPane().add(cPanel, BorderLayout.CENTER);
		cPanel.setLayout(new FlowLayout());
		
		JLabel schLabel = new JLabel("Select Character");
		cPanel.add(schLabel);
				
		JButton fredo = new JButton(new ImageIcon("Mg_fredo.PNG"));
		fredo.setSize(50, 50);
		
		fredo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		JButton apeach = new JButton(new ImageIcon("Mg_apeach.PNG"));
		apeach.setSize(50, 50);
		
		apeach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apeach.setEnabled(false);
			//	myCharacter=
			}
		});
		
		cPanel.add(fredo);
		cPanel.add(apeach);
		
	
		
		
		JButton btnNewButton = new JButton("done");
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		setSize(800, 600);
		setVisible(true);
		
		
		
	}

}
