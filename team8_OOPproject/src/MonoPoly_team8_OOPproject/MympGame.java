package MonoPoly_team8_OOPproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;

/** Built by WindowBuilder*/
public class MympGame extends JFrame{

	private JPanel contentPane;
	private JButton btnDie;
//	private URL url;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MympGame frame = new MympGame();
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
	public MympGame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	/**	
		try {
			url = new URL("http://www.animatedimages.org/data/media/710/animated-dice-image-0047.gif");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
        Icon icon = new ImageIcon(url);
*/
		
		
		/** Top Panel */
		JLabel title = new JLabel("MonoPoly");
		title.setForeground(Color.ORANGE);
		title.setFont(new Font("Arial", Font.BOLD, 24));
		
		JButton btnHome = new JButton();
		btnHome.setIcon(new ImageIcon("C:\\Users\\user\\git\\OOP_Project\\team8_OOPproject\\homeIcon.PNG"));
		
		JButton btnBack = new JButton("Back");
		
		JPanel tPanel = new JPanel();
		
		contentPane.add(tPanel, BorderLayout.NORTH);
		
		/** Center Panel*/
		JPanel mPanel = new JPanel();
		contentPane.add(mPanel, BorderLayout.CENTER);
	
		GroupLayout gl_mPanel = new GroupLayout(mPanel);
		gl_mPanel.setHorizontalGroup(
			gl_mPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 88, Short.MAX_VALUE)
		);
		gl_mPanel.setVerticalGroup(
			gl_mPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 182, Short.MAX_VALUE)
		);
		mPanel.setLayout(gl_mPanel);
		
				
		
		JPanel bPanel = new JPanel();
		bPanel.setLayout(new GridLayout(1, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		mPanel.add(bPanel);
		
		
		JButton btnDie = new JButton(new ImageIcon("C:\\Users\\user\\git\\OOP_Project\\team8_OOPproject\\animated-dice-image.gif"));
		mPanel.add(btnDie);
		
		//	contentPane.add(btnDie, BorderLayout.WEST);
		
		JButton btnHand = new JButton();
	//	contentPane.add(btnHand, BorderLayout.EAST);
		btnHand.setIcon(new ImageIcon("C:\\Users\\user\\git\\OOP_Project\\team8_OOPproject\\\uADF8\uB9BC4.png"));
		
		mPanel.add(btnHand);
		
	
		GroupLayout gl_tPanel = new GroupLayout(tPanel);
		gl_tPanel.setHorizontalGroup(
			gl_tPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(158)
					.addComponent(title)
					.addGap(126)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_tPanel.setVerticalGroup(
			gl_tPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(title)
						.addGroup(gl_tPanel.createParallelGroup(Alignment.LEADING)
							.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		tPanel.setLayout(gl_tPanel);
	//	contentPane.add(btnHome);
	//	contentPane.add(title);
	//	contentPane.add(bPanel);
		
	
		JPanel iPanel = new JPanel();
		mPanel.add(iPanel);
	//	contentPane.add(iPanel, BorderLayout.SOUTH);
		JLabel player = new JLabel("Player");
		iPanel.add(player);
	//	contentPane.add(btnDie);
	//	contentPane.add(btnHand);
	//	contentPane.add(iPanel);
	}


}
