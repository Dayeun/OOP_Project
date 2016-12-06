package MonoPoly_team8_OOPproject;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;


public class StartPage extends JFrame{
	
	private JTextField tfName;
	private JButton btnApeach;
	private JButton btnFredo;
	private JButton btnEasy;
	private JButton btnHard;
	private GameHandler gameHandler;
	
	public StartPage() {
		
	//	JPanel myPanel= new JPanel();
		//MyBackground ph = new MyBackground(this);
		getContentPane().add(new MyBackgroundPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
		/** From top to down*/
		
		/**Name*/
		
		JLabel nameLabel = new JLabel("Name: ");
		tfName = new JTextField();
		tfName.setColumns(20);
		JPanel namePanel = new JPanel();
		namePanel.add(nameLabel);
		namePanel.add(tfName);
		getContentPane().add(namePanel, BorderLayout.NORTH);
		
		
		/** Character*/
		JPanel cPanel = new JPanel();
		getContentPane().add(cPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JLabel lLevel = new JLabel("Level");
		panel_1.add(lLevel);
		
		JButton btnEasy = new JButton("Easy");
		panel_1.add(btnEasy);
		
		JButton btnHard = new JButton("Hard");
		panel_1.add(btnHard);
		GroupLayout gl_cPanel = new GroupLayout(cPanel);
		gl_cPanel.setHorizontalGroup(
			gl_cPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cPanel.createSequentialGroup()
					.addGap(47)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 704, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(153, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_cPanel.createSequentialGroup()
					.addContainerGap(286, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
					.addGap(187))
		);
		gl_cPanel.setVerticalGroup(
			gl_cPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_cPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(73)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(137, Short.MAX_VALUE))
		);
		
		JLabel lCharacter = new JLabel("Select Character");
		panel.add(lCharacter);
		
		JButton btnApeach = new JButton(new ImageIcon("Mg_apeach.PNG"));
		panel.add(btnApeach);
		btnApeach.setSize(50, 50);
		
		JButton btnFredo = new JButton(new ImageIcon("Mg_fredo.PNG"));
		panel.add(btnFredo);
		btnFredo.setSize(50, 50);
		
		btnFredo.addActionListener(this);
		
		btnApeach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnApeach.setEnabled(false);
			//	myCharacter=
			}
		});
		cPanel.setLayout(gl_cPanel);
		
	
		
		
		JButton btnGameStart = new JButton("Play Game");
		getContentPane().add(btnGameStart, BorderLayout.SOUTH);
		btnGameStart.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				String name= tfName.getText();
				
				e.getSource().equals(btnFredo)
				Image character=;
				
				
				if(btnFredo.isc)
				gameHandler.createCharacter(name, character);
				gameHandler.createBoard(10);
				new MymainFrame();
				
			}
			
		});
		
		
		setSize(800, 600);
		setVisible(true);
		
		
		
	}
}