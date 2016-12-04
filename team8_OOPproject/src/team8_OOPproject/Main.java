package team8_OOPproject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;

import javax.swing.*;

public class Main extends JFrame implements ActionListener {
	
	private Account_Login account_Login;
	private Account_SignUp signup;
	private Select select;
	private Game_SelectMenu game_Select;
	private Game_PathfindingMap pathfinding;
	private MonoPolyTest monopoly;
	private Learning_SelectMenu learning_Select;
	private Learning chapter1;
	
	static ArrayList<UserInformation> user = new ArrayList<UserInformation>();

	public Main(){
		// Variables for location of frame
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		
		this.setTitle("Play Physics!");
		this.setSize(800, 600);
		
		this.setResizable(false);
		
		// Set frame center
		int x = (dim.width / 2) - (this.getWidth() / 2);
		int y = (dim.height / 2) - (this.getHeight() / 2);
		this.setLocation(x, y);
		
		account_Login = new Account_Login();
		signup = new Account_SignUp();
		select = new Select();
		game_Select = new Game_SelectMenu();
		pathfinding = new Game_PathfindingMap();
		monopoly = new MonoPolyTest();
		learning_Select = new Learning_SelectMenu();
		chapter1=new LearningChapter1();
		
		account_Login.getjButton_login().addActionListener(this);
		account_Login.getjButton_signup().addActionListener(this);
		signup.getjButton_signup().addActionListener(this);
		signup.getjButton_back().addActionListener(this);
		select.getjButton_gotoGame().addActionListener(this);
		select.getjButton_gotoLearning().addActionListener(this);
		select.getjButton_back().addActionListener(this);
		game_Select.getjButton_back().addActionListener(this);
		game_Select.getjButton_bPathFindingG().addActionListener(this);
		game_Select.getjButton_bMonopolyG().addActionListener(this);
		pathfinding.getjButton_back().addActionListener(this);
		monopoly.getjButton_back().addActionListener(this);
		learning_Select.getjButton_back().addActionListener(this);
		learning_Select.getBtnChap1().addActionListener(this);
		chapter1.getjButton_back().addActionListener(this);
		chapter1.getNext().addActionListener(this);
		
		this.add(account_Login);// add JPanel to the JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.start();
	}

	private void start() throws IOException {

		// export list of user informaion from the txt file
		BufferedReader bufferdeReader = new BufferedReader(new FileReader("user_info.txt"));

		while (true) {
			String line = bufferdeReader.readLine();
			if (line == null)// if there is no data
				break;
			else {// split format {id,password,name,score}
				String[] split = line.split(",");
				String id = split[0];
				String password = split[1];
				String name = split[2];
				int score = Integer.valueOf(split[3]);
				UserInformation user_unit = new UserInformation(id, password, name, score);
				user.add(user_unit); // add the user data to the ArrayList
			}
		}
		bufferdeReader.close();
	}

	@Override
	public void actionPerformed(ActionEvent button) {
		// button event
				if (button.getSource().equals(account_Login.getjButton_signup())) {
					changeState(signup);
			
				} else if (button.getSource().equals(signup.getjButton_signup())) {
					try {
						boolean check = signup.signupCheck(); // sign up validation
						if (check == true) { // if sign up successfully is completed
							this.dispose(); // remove the JFrame
							new Main();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				} else if (button.getSource().equals(account_Login.getjButton_login())) {
					boolean check = account_Login.loginCheck(); // user information
																// validation
					if (check == true) { // login success

						changeState(select);
						
					}
				} else if (button.getSource().equals(signup.getjButton_back())){
					changeState(account_Login);
				} else if (button.getSource().equals(select.getjButton_back())){
					changeState(account_Login);
				} else if (button.getSource().equals(select.getjButton_gotoGame())){
					changeState(game_Select);
				} else if (button.getSource().equals(game_Select.getjButton_back())){
					changeState(select);
				} else if (button.getSource().equals(game_Select.getjButton_bPathFindingG())){
					changeState(pathfinding);
				} else if (button.getSource().equals(game_Select.getjButton_bMonopolyG())){
					changeState(monopoly);
				} else if (button.getSource().equals(monopoly.getjButton_back())){
					changeState(game_Select);
				} else if (button.getSource().equals(pathfinding.getjButton_back())){
					changeState(game_Select);
				}
				else if (button.getSource().equals(select.getjButton_gotoLearning())){
					changeState(learning_Select);
				}
				else if (button.getSource().equals(learning_Select.getjButton_back())){
					changeState(select);
				}
				else if (button.getSource().equals(learning_Select.getBtnChap1())){
					//chapter1.setQuestion_num(0);
					changeState(chapter1);
				}
				else if (button.getSource().equals(chapter1.getjButton_back())){
					if(chapter1.getQuestion_num()>4)
						return;
					int result_gohome = JOptionPane.showConfirmDialog(null, "Return to Select Menu.\nThe data will not be saved.", "Warning", JOptionPane.OK_CANCEL_OPTION);
					if(result_gohome == 0)
						changeState(learning_Select);

				}
				
		
	}
	
	public void changeState(JPanel jpanel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(jpanel);
		this.revalidate();
		this.repaint();
	}
	
}
