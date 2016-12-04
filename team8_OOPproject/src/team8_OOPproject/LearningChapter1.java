package team8_OOPproject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class LearningChapter1 extends Learning {
	//private JFrame frame;
	//private JPanel question;
	//private JPanel remember;
	//private JPanel solve;
	// private ArrayList<JButton> incorrect_choice;
	private JButton submit;
	private JButton next;
	private ImageIcon q_image;
	private JLabel q_imageLabel;
	private String answer;
	//private Questions ch1 = new Questions();
	//private int question_num = 0;
	private int choice_num = 0;
	private JPanel correct_pane;
	private JPanel incorrect_pane;
	private JPanel answer_pane;
	private JPanel explanation_pane;
	private JPanel remember_pane;
	private JPanel solve_pane;

	
	
	public LearningChapter1() {
		//super();
		//incorrect_choice = new ArrayList<JButton>();
		
		
		quiz(question_num);
		
	}
	
	@Override
	public void quiz(int question_num) {
		
		TitledBorder border = BorderFactory.createTitledBorder("Question");
		border.setTitleFont(new Font(null, Font.BOLD, 24));
		question_pane.setBorder(border);
		//question_pane.setLayout(new BoxLayout(question_pane, BoxLayout.Y_AXIS));
		question_pane.add(ch1.getChap1question().get(question_num));
		q_imageLabel = new JLabel();
		q_imageLabel.setIcon(ch1.getChap1Image().get(question_num));
		ch1.getChap1question().get(question_num).setAlignmentX(Component.LEFT_ALIGNMENT);
		q_imageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		question_pane.add(q_imageLabel);
		
		
		
		
		//choicePane.setLayout(new FlowLayout(FlowLayout.LEFT));
		//int random_num;
		ArrayList<Integer> random_num_array = new ArrayList<Integer>();
		//Random random = new Random();
		for(int i=0 ; i<ch1.getChap1choice()[question_num].length; i++)
		{
			//random_num=random.nextInt(ch1.getChap1choice()[question_num].length);
			random_num_array.add(i);
		}
		Collections.shuffle(random_num_array);
		

		for (choice_num = 0; choice_num < ch1.getChap1choice()[question_num].length; choice_num++) {
			choicePane.add(ch1.getChap1choice()[question_num][(random_num_array.get(choice_num))]);
			ch1.getChap1choice()[question_num][(random_num_array.get(choice_num))].addActionListener(this);
		}
		
		
		//place the submit button
		submit = new JButton("Submit");
		submit.setForeground(Color.WHITE);
		submit.setBackground(new Color(127, 255, 0));
		submit.setFont(new Font("Arial Black", Font.PLAIN, 30));
		next_pane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		submit.setFont(new Font(null, Font.BOLD, 18));
		next_pane.add(jButton_back);
		next_pane.add(submit);
		
		submit.addActionListener(this);
	}

	@Override
	public void correct(int question_num) {
		// TODO Auto-generated method stub
		//frame.removeAll();
		//frame.revalidate();
		
		correct_pane = new JPanel();
		correct_pane.setSize(800, 600);
		//correct_pane.setBackground(Color.RED);
		//this.removeAll();
		question_pane.removeAll();
		question_pane.setBorder(null);
		choicePane.removeAll();
		next_pane.removeAll();
		
		answer_pane = new JPanel();
		explanation_pane = new JPanel();
		remember_pane = new JPanel();
		solve_pane = new JPanel();
		
		correct_pane.setLayout(new BorderLayout());
		
		JLabel correct = new JLabel("Correct!");
		correct.setFont(new Font("Aharoni", Font.BOLD, 40));
		correct.setForeground(new Color(127, 255, 0));
		
		answer_pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel correct_answer= new JLabel("<html>The correct answer is : <br>"+answer+"</html>");
		JLabel your_answer= new JLabel("<html>Your answer is : <br>"+ answer+"</html>");
		answer_pane.add(correct);
		answer_pane.add(Box.createRigidArea(new Dimension(30,0)));		//I refer to tips on https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html
		answer_pane.add(correct_answer);
		answer_pane.add(Box.createRigidArea(new Dimension(50,0)));
		answer_pane.add(your_answer);
		
		correct_pane.add(answer_pane, BorderLayout.NORTH);
		
		
		
		
		explanation_pane.setLayout(new BoxLayout(explanation_pane, BoxLayout.Y_AXIS));
		
		remember_pane.setLayout(new BoxLayout(remember_pane, BoxLayout.Y_AXIS));
		TitledBorder border1 = BorderFactory.createTitledBorder("Remember");
		border1.setTitleFont(new Font(null, Font.BOLD, 24));
		remember_pane.setBorder(border1);
		remember_pane.add(ch1.getChap1remember().get(question_num));
		explanation_pane.add(remember_pane);

		solve_pane.setLayout(new BoxLayout(solve_pane, BoxLayout.Y_AXIS));
		TitledBorder border2 = BorderFactory.createTitledBorder("Solve");
		border2.setTitleFont(new Font(null, Font.BOLD, 24));
		solve_pane.setBorder(border2);
		solve_pane.add(ch1.getChap1solve().get(question_num));
		explanation_pane.add(solve_pane);
		
		correct_pane.add(explanation_pane, BorderLayout.CENTER);
		
		
		
		next = new JButton("I GOT IT!");
		next.setForeground(Color.WHITE);
		next.setBackground(new Color(127, 255, 0));
		next.setFont(new Font("Arial Black", Font.PLAIN, 20));
		next_pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		next_pane.add(next);
		next_pane.add(jButton_back);
		next.addActionListener(this);
		
		answer=null;			//clear previous answer.
		this.add(correct_pane);
	}

	public void incorrect(int question_num) {
		// TODO Auto-generated method stub
		//frame.removeAll();
		//this.revalidate();
		//this.removeAll();
		question_pane.removeAll();
		question_pane.setBorder(null);
		choicePane.removeAll();
		next_pane.removeAll();
		JPanel incorrect_pane = new JPanel();
		incorrect_pane.setSize(800, 600);
		incorrect_pane.setBackground(Color.WHITE);
		
		answer_pane = new JPanel();
		explanation_pane = new JPanel();
		remember_pane = new JPanel();
		solve_pane = new JPanel();
		
		incorrect_pane.setLayout(new BorderLayout());
		
		JLabel Incorrect = new JLabel("Sorry, Incorrect..");
		Incorrect.setFont(new Font("Aharoni", Font.BOLD, 40));
		Incorrect.setForeground(new Color(0, 176, 240));
		
		answer_pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel correct_answer= new JLabel("<html>The correct answer is : <br>"+ch1.getChap1correct().get(question_num).getText()+"</html>");
		JLabel your_answer= new JLabel("<html>Your answer is : <br>"+ answer+"</html>");
		answer_pane.add(Incorrect);
		answer_pane.add(Box.createRigidArea(new Dimension(30,0)));		//Making space. I refer to tips on https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html
		answer_pane.add(correct_answer);
		answer_pane.add(Box.createRigidArea(new Dimension(50,0)));
		answer_pane.add(your_answer);
		
		incorrect_pane.add(answer_pane, BorderLayout.NORTH);
		
		
		
		
		explanation_pane.setLayout(new BoxLayout(explanation_pane, BoxLayout.Y_AXIS));
		
		remember_pane.setLayout(new BoxLayout(remember_pane, BoxLayout.Y_AXIS));
		TitledBorder border1 = BorderFactory.createTitledBorder("Remember");
		border1.setTitleFont(new Font(null, Font.BOLD, 24));
		remember_pane.setBorder(border1);
		remember_pane.setSize(700, 200);
		remember_pane.add(ch1.getChap1remember().get(question_num));
		explanation_pane.add(remember_pane);

		solve_pane.setLayout(new BoxLayout(solve_pane, BoxLayout.Y_AXIS));
		TitledBorder border2 = BorderFactory.createTitledBorder("Solve");
		border2.setTitleFont(new Font(null, Font.BOLD, 24));
		solve_pane.setBorder(border2);
		solve_pane.setSize(700, 200);
		solve_pane.add(ch1.getChap1solve().get(question_num));
		explanation_pane.add(solve_pane);
		
		incorrect_pane.add(explanation_pane, BorderLayout.CENTER);
		
		
		
		next = new JButton("I GOT IT!");
		next.setForeground(Color.WHITE);
		next.setBackground(new Color(127, 255, 0));
		next.setFont(new Font("Arial Black", Font.PLAIN, 20));
		next_pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		next_pane.add(next);
		next_pane.add(jButton_back);
		next.addActionListener(this);
		
		answer=null;			//clear previous answer.
		this.add(incorrect_pane);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(ch1.getChap1correct().get(question_num))) {
			answer = ch1.getChap1correct().get(question_num).getText(); 		// save your answer(correct answer)
			for(int i=0; i<ch1.getChap1choice()[question_num].length;i++){
				ch1.getChap1choice()[question_num][i].setForeground(Color.WHITE);
				ch1.getChap1choice()[question_num][i].setBackground(new Color(127, 255, 0));
			}
			ch1.getChap1correct().get(question_num).setForeground(Color.RED);
			ch1.getChap1correct().get(question_num).setBackground(new Color(126, 187, 0));
		} else {
			for(int i=0; i<ch1.getChap1choice()[question_num].length;i++)
				if(e.getSource().equals(ch1.getChap1choice()[question_num][i]))
					answer = ch1.getChap1choice()[question_num][1].getText();		// save your answer(incorrect answer)
			for(int i=0; i<ch1.getChap1choice()[question_num].length;i++){
				ch1.getChap1choice()[question_num][i].setForeground(Color.WHITE);
				ch1.getChap1choice()[question_num][i].setBackground(new Color(127, 255, 0));
			}
			((JComponent) e.getSource()).setForeground(Color.RED);
			((JComponent) e.getSource()).setBackground(new Color(126, 187, 0));
			
		}
		if (e.getSource().equals(submit)) {
			if(answer == null){
				JOptionPane.showMessageDialog(null,"Please choose your answer!","NO ANSWER", 2);
				System.out.println("Please choose your answer!");
				return;
			}
			
			if (answer == ch1.getChap1correct().get(question_num).getText()) {
				System.out.println("You're Correct!");
				System.out.println("Your answer: "+answer);
				correct(question_num); //If you correct.

			} else {
				System.out.println("You're Incorrect!");
				System.out.println("Your answer: "+answer);
				incorrect(question_num); //If you incorrect.

			}
		}
		
		if(e.getSource().equals(jButton_back)){
			//remove painting of your choices
			for(int i=0; i<ch1.getChap1choice().length;i++){
				for(int j=0; j<ch1.getChap1choice()[i].length;j++){
					ch1.getChap1choice()[i][j].setForeground(Color.WHITE);
					ch1.getChap1choice()[i][j].setBackground(new Color(127, 255, 0));
				}
				//question_num=0;
				answer=null;
			}
		}
		
		if(e.getSource().equals(next)){
			//if chapter is end, you automatically go back ChapterSelect screen.
			if(question_num >= ch1.getChap1question().size()-1){
				JOptionPane.showMessageDialog(null,"Chapter 1 is END!");
				jButton_back.doClick();
				return;
			}
			
			question_num++;
			
			if(this.isAncestorOf(correct_pane))				//The case that you are Correct and click next button.
				correct_pane.removeAll();
			else if(this.isAncestorOf(correct_pane))		//The case that you are Incorrect and click next button.
				incorrect_pane.removeAll();
			remember_pane.removeAll();
			remember_pane.setBorder(null);
			solve_pane.removeAll();
			solve_pane.setBorder(null);
			next_pane.removeAll();
			
			
			quiz(question_num);
		}
	}

	
	

}
