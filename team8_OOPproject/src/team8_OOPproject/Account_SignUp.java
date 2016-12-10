package team8_OOPproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class Account_SignUp extends JPanel implements ActionListener {

	private JLabel jLable_id;
	private JLabel jLable_name;
	private JLabel jLable_pw;
	private JLabel jLable_pw_check;

	private JTextField jText_id;
	private JTextField jText_name;
	private JPasswordField jText_pw;
	private JPasswordField jText_pw_check;

	private JButton jButton_reset;
	private JButton jButton_signup;
	private JButton jButton_back;
	
	private JLabel jlabel_background;
	private ImageIcon background;
	
	private JPanel jPanel_box;

	public Account_SignUp() {

		jlabel_background = new JLabel();
		jPanel_box = new JPanel();

		jLable_id = new JLabel("User ID:");
		jLable_name = new JLabel("name:");
		jLable_pw = new JLabel("Password:");
		jLable_pw_check = new JLabel("Check:");
		jText_id = new JTextField(20);
		jText_name = new JTextField(20);
		jText_pw = new JPasswordField(20);
		jText_pw_check = new JPasswordField(20);
		jButton_reset = new JButton("Reset");
		jButton_signup = new JButton("Sign up");

		this.setSize(800, 600);

		// button event
		jButton_reset.addActionListener(this);
		jButton_signup.addActionListener(this);

		this.setLayout(null);

		// add the component to JPanel
		this.add(jLable_id);
		this.add(jText_id);
		this.add(jLable_name);
		this.add(jText_name);
		this.add(jLable_pw);
		this.add(jText_pw);
		this.add(jLable_pw_check);
		this.add(jText_pw_check);
		this.add(jLable_name);
		this.add(jText_name);
		this.add(jButton_reset);
		this.add(jButton_signup);
		
		jPanel_box.setBackground(Color.white);
		this.jPanel_box.setBounds(270, 170, 260, 220);
		this.add(jPanel_box);
		
		//return to previous panel
		jButton_back = new JButton("Back");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setBounds(20, 20, 80, 30);
		this.add(jButton_back);

		// set background image
		background = new ImageIcon("main.png");
		this.jlabel_background.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);

		// set the component location
		jLable_name.setBounds(310, 190, 100, 25);
		jText_name.setBounds(380, 190, 100, 25);
		jLable_id.setBounds(310, 230, 100, 25);
		jText_id.setBounds(380, 230, 100, 25);
		jLable_pw.setBounds(310, 270, 100, 25);
		jText_pw.setBounds(380, 270, 100, 25);
		jLable_pw_check.setBounds(310, 310, 100, 25);
		jText_pw_check.setBounds(380, 310, 100, 25);
		jButton_reset.setBounds(310, 350, 80, 25);
		jButton_signup.setBounds(400, 350, 80, 25);
		jButton_back.setBounds(20, 20, 80, 30);

		this.setVisible(true);

	}
	public JButton getjButton_reset() {
		return jButton_reset;
	}

	public JButton getjButton_signup() {
		return jButton_signup;
	}

	public JButton getjButton_back() {
		return jButton_back;
	}

	@Override
	public void actionPerformed(ActionEvent btn) {

		if (btn.getSource() == jButton_reset) { // reset button
			// initialize all to null
			jText_name.setText("");
			jText_id.setText("");
			jText_pw.setText("");
			jText_pw_check.setText("");
		}
	}

	public boolean signupCheck() throws IOException { // sign up validation

		int flag = 0; // check flag (1=fail 0=success)
		for (int i = 0; i < Main.user.size(); i++) {
			if (Main.user.get(i).getId().equals(jText_id.getText())) { 	// id already exist
				flag = 1; // fail
			}
		}
		if (flag == 1) { // duplicated id
			JOptionPane.showMessageDialog(null, "id already exist ", "Message", JOptionPane.WARNING_MESSAGE); // show dialog
			return false; // sign up fail
		} else if (jText_id.getText().isEmpty() || jText_name.getText().isEmpty()
				|| String.valueOf(jText_pw.getPassword()).isEmpty()
				|| String.valueOf(jText_pw_check.getPassword()).isEmpty()) { // if user doesn't fill out the TextField
			JOptionPane.showMessageDialog(null, "fill in all required entry fields", "Message",
					JOptionPane.WARNING_MESSAGE); // show dialog
			return false;// sign up fail
		} else if (!String.valueOf(jText_pw.getPassword()).equals(String.valueOf(jText_pw_check.getPassword()))) { 
			// if password is not correspond to the password check
			JOptionPane.showMessageDialog(null, "passaword incorrect ", "Message", JOptionPane.WARNING_MESSAGE); // show dialog
			return false;// sign up fail
		} else { // sign up success
			UserInformation user = new UserInformation(jText_id.getText(), String.valueOf(jText_pw.getPassword()), jText_name.getText(), 0); 
			// score initialize to zero
			PrintWriter user_info = new PrintWriter(new FileWriter("user_info.txt", true));
			user_info.println(user.toString()); // record new user data to the txt file
			Main.user.add(user); // add the user data to the  ArrayList
			user_info.close();// txt file close
			return true;// sign up success

		}
	}
}
