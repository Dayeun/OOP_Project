package team8_OOPproject;
import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.border.TitledBorder;

public abstract class Learning extends JPanel implements ActionListener{
	
	protected JPanel question_pane;
	protected JPanel choicePane;
	protected JPanel next_pane;
	private JButton jButton_back;
	Questions ch1 = new Questions();
	
	
	public abstract void quiz();
	public abstract void correct();
	public abstract void incorrect();
	
	
	public Learning(){
		question_pane = new JPanel();
		choicePane = new JPanel();
		next_pane = new JPanel();
		
		
		this.add(question_pane);
		TitledBorder border = BorderFactory.createTitledBorder("Question");
		border.setTitleFont(new Font(null,Font.BOLD, 24));
		question_pane.setBorder(border);
		
		question_pane.setLayout(new BoxLayout(question_pane, BoxLayout.Y_AXIS));
		choicePane.setLayout(new FlowLayout(FlowLayout.LEFT));
		next_pane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		//return to previous panel
		jButton_back = new JButton("Home");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setBounds(20, 20, 80, 30);
		
		this.add(jButton_back);
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
	public JPanel getNext() {
		return next_pane;
	}
	public Questions getCh1() {
		return ch1;
	}

	
	
}