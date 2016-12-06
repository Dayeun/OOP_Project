package MonoPoly_team8_OOPproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JTextArea;

public class MymainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MymainFrame frame = new MymainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MymainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		JPanel mPanel = new JPanel();
		contentPane.add(mPanel, BorderLayout.CENTER);
		
	
		JButton btnDie = new JButton(new ImageIcon("C:\\Users\\user\\git\\OOP_Project\\team8_OOPproject\\animated-dice-image.gif"));
		mPanel.add(btnDie);
	
		
		JButton btnHand = new JButton();
		btnHand.setIcon(new ImageIcon("C:\\Users\\user\\git\\OOP_Project\\team8_OOPproject\\\uADF8\uB9BC4.png"));
		mPanel.add(btnHand);
		
		JPanel bPanel = new JPanel();
		
		JPanel iPanel = new JPanel();
		
		
		GroupLayout gl_mPanel = new GroupLayout(mPanel);
		gl_mPanel.setHorizontalGroup(
			gl_mPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mPanel.createSequentialGroup()
					.addGap(49)
					.addComponent(bPanel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mPanel.createSequentialGroup()
							.addGap(71)
							.addComponent(btnDie)
							.addContainerGap(126, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_mPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_mPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(iPanel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnHand, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(80))))
		);
		gl_mPanel.setVerticalGroup(
			gl_mPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mPanel.createSequentialGroup()
					.addGroup(gl_mPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mPanel.createSequentialGroup()
							.addGap(33)
							.addComponent(btnDie)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnHand, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_mPanel.createSequentialGroup()
							.addGap(46)
							.addComponent(bPanel, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_mPanel.createSequentialGroup()
							.addGap(206)
							.addComponent(iPanel, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		JTextArea textArea = new JTextArea();
		iPanel.add(textArea);
		bPanel.setLayout(new GridLayout(1, 0, 0, 0));
		mPanel.setLayout(gl_mPanel);
		
		JPanel tPanel = new JPanel();
		
		JButton btnHome = new JButton();
		btnHome.setIcon(new ImageIcon("C:\\Users\\user\\git\\OOP_Project\\team8_OOPproject\\homeIcon.PNG"));
		
		JButton btnBack = new JButton("Back");
		
		JLabel title = new JLabel("MonoPoly");
		title.setForeground(Color.ORANGE);
		title.setFont(new Font("Arial", Font.BOLD, 24));
	
		
		tPanel.add(btnHome);
		tPanel.add(title);
		tPanel.add(btnBack);
		
		contentPane.add(tPanel, BorderLayout.NORTH);
		
		
		GroupLayout gl_tpanel = new GroupLayout(tPanel);
		gl_tpanel.setHorizontalGroup(
			gl_tpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tpanel.createSequentialGroup()
					.addGap(26)
					.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
					.addComponent(title)
					.addGap(86)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(48))
		);
		gl_tpanel.setVerticalGroup(
			gl_tpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tpanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_tpanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_tpanel.createSequentialGroup()
							.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_tpanel.createSequentialGroup()
							.addGroup(gl_tpanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(title))
							.addGap(22))))
		);
		tPanel.setLayout(gl_tpanel);
		
		
	
		
	}
}
