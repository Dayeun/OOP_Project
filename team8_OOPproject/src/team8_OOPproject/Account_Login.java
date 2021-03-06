package team8_OOPproject;
import java.awt.*;
import javax.swing.*;

public class Account_Login extends JPanel {

	private JLabel jLable_id;
	private JLabel jLable_pw;

	private JTextField jText_id;
	private JPasswordField jText_pw;

	private JButton jButton_login;
	private JButton jButton_signup;

	// for background
	private JLabel jlabel_background;
	ImageIcon background;

	private JPanel jPanel_loginBox;

	public Account_Login() {
		
		Game_Character title = new Game_Character(200,100,"title.PNG");

		jlabel_background = new JLabel();
		jPanel_loginBox = new JPanel();

		jLable_id = new JLabel("ID:");
		jLable_pw = new JLabel("PW:");
		jText_id = new JTextField(20); // user input id
		jText_pw = new JPasswordField(20);// user input password
		jButton_login = new JButton("Login");
		jButton_login.setBackground(Color.white);
		jButton_login.setOpaque(false);
		jButton_signup = new JButton("Sign up");
		jButton_signup.setBackground(Color.white);
		jButton_signup.setOpaque(false);
		
		

		this.setSize(800, 600);
		this.setLayout(null);

		// add the component
		
		this.add(jLable_id);
		this.add(jText_id);
		this.add(jLable_pw);
		this.add(jText_pw);
		this.add(jButton_login);
		this.add(jButton_signup);
		this.add(title);
		this.add(jPanel_loginBox);
		this.add(jlabel_background);

		// set the component location
		jLable_id.setBounds(290, 250, 100, 25);
		jText_id.setBounds(320, 250, 100, 25);
		jLable_pw.setBounds(290, 300, 100, 25);
		jText_pw.setBounds(320, 300, 100, 25);
		jButton_login.setBounds(440, 250, 80, 80);
		jButton_signup.setBounds(440, 340, 80, 25);
		
		jPanel_loginBox.setBackground(Color.white);
		this.jPanel_loginBox.setBounds(250, 210, 300, 180);
		
		background = new ImageIcon("main.png");
		this.jlabel_background.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);

		this.setVisible(true);

	}

	public JButton getjButton_login() {
		return jButton_login;
	}

	public JButton getjButton_signup() {
		return jButton_signup;
	}

	public JLabel getJlabel_background() {
		return jlabel_background;
	}
	
	public boolean loginCheck() {
		// login validation
		int checking = 0;
		for (int i = 0; i < Main.user.size(); i++) {
			if (Main.user.get(i).getId().equals(jText_id.getText())
					&& Main.user.get(i).getPassword().equals(String.valueOf(jText_pw.getPassword()))) {
				// Check the user's ID and password
				checking = 1;
			}
		}
		if (checking == 1) {
			return true;
		} else {// unknown user
			JOptionPane.showMessageDialog(null, "Your ID or PW might be wrong", "Message", JOptionPane.WARNING_MESSAGE); // show
																												// dialog
			return false;
		}
	}
}
