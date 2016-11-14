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

	public JLabel getjLable_id() {
		return jLable_id;
	}

	public void setjLable_id(JLabel jLable_id) {
		this.jLable_id = jLable_id;
	}

	public JLabel getjLable_pw() {
		return jLable_pw;
	}

	public void setjLable_pw(JLabel jLable_pw) {
		this.jLable_pw = jLable_pw;
	}

	public JTextField getjText_id() {
		return jText_id;
	}

	public void setjText_id(JTextField jText_id) {
		this.jText_id = jText_id;
	}

	public JPasswordField getjText_pw() {
		return jText_pw;
	}

	public void setjText_pw(JPasswordField jText_pw) {
		this.jText_pw = jText_pw;
	}

	public JButton getjButton_login() {
		return jButton_login;
	}

	public void setjButton_login(JButton jButton_login) {
		this.jButton_login = jButton_login;
	}

	public JButton getjButton_signup() {
		return jButton_signup;
	}

	public void setjButton_signup(JButton jButton_signup) {
		this.jButton_signup = jButton_signup;
	}

	public JLabel getJlabel_background() {
		return jlabel_background;
	}

	public void setJlabel_background(JLabel jlabel_background) {
		this.jlabel_background = jlabel_background;
	}
	
	public JPanel getjPanel_loginBox() {
		return jPanel_loginBox;
	}

	public void setjPanel_loginBox(JPanel jPanel_loginBox) {
		this.jPanel_loginBox = jPanel_loginBox;
	}

	public boolean loginCheck() {
		// login validation
		int flag = 0;
		for (int i = 0; i < Main.user.size(); i++) {
			if (Main.user.get(i).getId().equals(jText_id.getText())
					&& Main.user.get(i).getPassword().equals(String.valueOf(jText_pw.getPassword()))) {
				// exist in the ArrayList of user information
				flag = 1;
			}
		}
		if (flag == 1) {
			return true;
		} else {// unknown user
			JOptionPane.showMessageDialog(null, "Your ID or PW might be wrong", "Message", JOptionPane.WARNING_MESSAGE); // show
																												// dialog
			return false;
		}
	}
}
