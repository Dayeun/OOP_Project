package team8_OOPproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public abstract class Learning extends JPanel implements ActionListener{
	
	protected JPanel question_pane;
	protected JPanel choicePane;
	protected JPanel next_pane;
	protected JPanel btnBack_pane;
	protected JButton jButton_back;
	protected int question_num = 0;
	protected String answer;
	protected JButton next;
	protected Questions ch1 = new Questions();
	
	
	public abstract void quiz(int question_num);
	public abstract void correct(int question_num);
	public abstract void incorrect(int question_num);
	
	
	public Learning(){
		question_pane = new JPanel();
		btnBack_pane = new JPanel();
		choicePane = new JPanel();
		next_pane = new JPanel();
		//next = new JButton("I GOT IT!");
		
		this.setLayout(new BorderLayout());
		
		//this.add(question_pane);
		TitledBorder border = BorderFactory.createTitledBorder("Question");
		border.setTitleFont(new Font(null,Font.BOLD, 24));
		question_pane.setBorder(border);
		
		question_pane.setLayout(new BoxLayout(question_pane, BoxLayout.Y_AXIS));
		choicePane.setLayout(new FlowLayout(FlowLayout.LEFT));
		next_pane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		question_pane.setBackground(Color.WHITE);
		choicePane.setBackground(Color.WHITE);
		next_pane.setBackground(Color.WHITE);
		
		//return to previous panel
		jButton_back = new JButton("Home");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setSize(80, 30);
		next_pane.add(jButton_back);
		
		/*btnBack_pane.setBackground(Color.RED);
		question_pane.setBackground(Color.YELLOW);
		choicePane.setBackground(Color.BLUE);
		next_pane.setBackground(Color.DARK_GRAY);*/
		
		this.add(question_pane, BorderLayout.NORTH);
		this.add(choicePane, BorderLayout.CENTER);
		this.add(next_pane, BorderLayout.SOUTH);
		this.setSize(800, 600);
		this.setVisible(true);
		
	}
	
	public void initialization(){
		
	}
	public JPanel getQuestion() {
		return question_pane;
	}
	public JPanel getChoicePane() {
		return choicePane;
	}
	public JPanel getNextPanel() {
		return next_pane;
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setQuestion_num(int question_num) {
		this.question_num = question_num;
	}
	public int getQuestion_num() {
		return question_num;
	}
	public JButton getNext() {
		return next;
	}
	public void setjButton_back(JButton jButton_back) {
		this.jButton_back = jButton_back;
	}
	public JButton getjButton_back() {
		return jButton_back;
	}
	public Questions getCh1() {
		return ch1;
	}

	
	
}
