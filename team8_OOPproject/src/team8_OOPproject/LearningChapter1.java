package team8_OOPproject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	private JPanel remember_pane;
	private JPanel solve_pane;

	public LearningChapter1() {
		//super();
		//incorrect_choice = new ArrayList<JButton>();
		
		
		quiz(question_num);
		
	}
	
	@Override
	public void quiz(int question_num) {
		//for (i = 0; i < ch1.getChap1question().size(); i++) {
		
			TitledBorder border = BorderFactory.createTitledBorder("Question");
			border.setTitleFont(new Font(null, Font.BOLD, 24));
			question_pane.setBorder(border);
			//question_pane.setLayout(new BoxLayout(question_pane, BoxLayout.Y_AXIS));
			question_pane.add(ch1.getChap1question().get(question_num));
			q_image = new ImageIcon("chapter1q1.jpg");
			q_imageLabel = new JLabel();
			q_imageLabel.setIcon(q_image);
			question_pane.add(q_imageLabel);

			
			//choicePane.setLayout(new FlowLayout(FlowLayout.LEFT));
			for (choice_num = 0; choice_num < ch1.getChap1choice()[question_num].length; choice_num++) {
				choicePane.add(ch1.getChap1choice()[question_num][choice_num]);
				ch1.getChap1choice()[question_num][choice_num].addActionListener(this);
			}
			
			submit = new JButton("Submit");
			
			
			
			submit.setForeground(Color.WHITE);
			submit.setBackground(new Color(127, 255, 0));
			submit.setFont(new Font("Arial Black", Font.PLAIN, 30));
			//next_pane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			submit.setFont(new Font(null, Font.BOLD, 18));
			next_pane.add(jButton_back);
			next_pane.add(submit);
			
			
			submit.addActionListener(this);
			
	//	}

	}

	@Override
	public void correct(int question_num) {
		// TODO Auto-generated method stub
		//frame.removeAll();
		//frame.revalidate();
		
		correct_pane = new JPanel();
		correct_pane.setSize(800, 600);
		correct_pane.setBackground(Color.RED);
		//this.removeAll();
		question_pane.removeAll();
		question_pane.setBorder(null);
		choicePane.removeAll();
		next_pane.removeAll();
		
		correct_pane.setLayout(new BorderLayout());
		
		remember_pane = new JPanel();
		solve_pane = new JPanel();
		
		TitledBorder border1 = BorderFactory.createTitledBorder("Remember");
		border1.setTitleFont(new Font(null, Font.BOLD, 24));
		remember_pane.setBorder(border1);
		correct_pane.add(remember_pane, BorderLayout.NORTH);
		
		
		TitledBorder border2 = BorderFactory.createTitledBorder("Solve");
		border2.setTitleFont(new Font(null, Font.BOLD, 24));
		solve_pane.setBorder(border2);
		correct_pane.add(solve_pane, BorderLayout.CENTER);
		
		next = new JButton("Next");
		next_pane.add(jButton_back);
		next_pane.add(next);
		
		next.addActionListener(this);
		
		this.add(correct_pane);
	}

	public void incorrect(int question_num) {
		// TODO Auto-generated method stub
		//frame.removeAll();
		//this.revalidate();
		//this.removeAll();
		JPanel incorrect_pane = new JPanel();
		incorrect_pane.setSize(800, 600);
		incorrect_pane.setBackground(Color.WHITE);
		//this.removeAll();
		question_pane.removeAll();
		question_pane.setBorder(null);
		choicePane.removeAll();
		next_pane.removeAll();
		this.add(incorrect_pane, BorderLayout.CENTER);
	}

	/*public static void main(String[] args) {
		LearningChapter1 lc1 = new LearningChapter1();
		//lc1.quiz();
	}*/

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(ch1.getChap1correct().get(question_num))) {
			answer = ch1.getChap1correct().get(question_num).getText(); 		// save your answer(correct answer)
		} else if (e.getSource()==ch1.getChap1choice()[question_num][0] && e.getSource()!=ch1.getChap1correct().get(question_num)) {
			answer = ch1.getChap1choice()[question_num][0].getText(); 			// save your answer(incorrect answer)
		}
		if (e.getSource().equals(submit)) {
			if(answer == null){
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
		
		if(e.getSource().equals(next)){
		
			if(question_num >= ch1.getChap1question().size()-1){
				JOptionPane.showMessageDialog(null,"Chapter 1 is END!");
				jButton_back.doClick();
				return;
			}
			
			question_num++;
			correct_pane.removeAll();
			remember_pane.removeAll();
			remember_pane.setBorder(null);
			solve_pane.removeAll();
			solve_pane.setBorder(null);
			next_pane.removeAll();
			
			
			quiz(question_num);
		}
	}

	
	

}
