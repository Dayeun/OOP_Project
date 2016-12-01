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
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class LearningChapter1 extends Learning {
	private JFrame frame;
	//private JPanel question;
	private TitledBorder border;
	private JPanel remember;
	private JPanel solve;
	// private ArrayList<JButton> incorrect_choice;
	private JButton submit;
	private ImageIcon quiz;
	private JLabel test;
	private String answer;
	private Questions ch1 = new Questions();
	private int i = 0;
	private int j = 0;

	public LearningChapter1() {
		//super();
		//incorrect_choice = new ArrayList<JButton>();
		submit = new JButton("Submit");
		this.add(question_pane);
		
		
		
		submit.setForeground(Color.WHITE);
		submit.setBackground(new Color(127, 255, 0));
		submit.setFont(new Font("Arial Black", Font.PLAIN, 30));
		next_pane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		submit.setFont(new Font(null, Font.BOLD, 18));
		next_pane.add(submit);
		
		quiz();
		
	}
	
	@Override
	public void quiz() {
		//for (i = 0; i < ch1.getChap1question().size(); i++) {
			

			
			border = BorderFactory.createTitledBorder("Question");
			border.setTitleFont(new Font(null, Font.BOLD, 24));
			question_pane.setBorder(border);
			question_pane.setLayout(new BoxLayout(question_pane, BoxLayout.Y_AXIS));
			question_pane.add(ch1.getChap1question().get(i));
			quiz = new ImageIcon("chapter1q1.jpg");
			test = new JLabel();
			test.setIcon(quiz);
			question_pane.add(test);

			choicePane.setLayout(new FlowLayout(FlowLayout.LEFT));
			for (j = 0; j < ch1.getChap1choice()[i].length; j++) {
				choicePane.add(ch1.getChap1choice()[i][j]);
				ch1.getChap1choice()[i][j].addActionListener(this);
			}
			

			submit.addActionListener(this);
			
	//	}

	}

	@Override
	public void correct(int question_num) {
		// TODO Auto-generated method stub
		//frame.removeAll();
		//frame.revalidate();
		
		JPanel correct_pane = new JPanel();
		correct_pane.setSize(800, 600);
		correct_pane.setBackground(Color.RED);
		//this.removeAll();
		question_pane.removeAll();
		question_pane.setBorder(null);
		choicePane.removeAll();
		next_pane.removeAll();
		//this.add(correct_pane);
	}

	public void incorrect(int question_num) {
		// TODO Auto-generated method stub
		//frame.removeAll();
		//this.revalidate();
		//this.removeAll();
		JPanel incorrect_pane = new JPanel();
		incorrect_pane.setSize(800, 600);
		incorrect_pane.setBackground(Color.WHITE);
		this.removeAll();
		question_pane.removeAll();
		question_pane.setBorder(null);
		choicePane.removeAll();
		next_pane.removeAll();
		this.add(incorrect_pane, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		LearningChapter1 lc1 = new LearningChapter1();
		//lc1.quiz();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(ch1.getChap1correct().get(i))) {
			answer = ch1.getChap1correct().get(i).getText(); 		// save your answer(correct answer)
		} else if (e.getSource()==ch1.getChap1choice()[i][0] && e.getSource()!=ch1.getChap1correct().get(i)) {
			answer = ch1.getChap1choice()[i][0].getText(); 			// save your answer(incorrect answer)
		}
		if (e.getSource().equals(submit)) {
			if(answer == null){
				System.out.println("Please choose your answer!");
				return;
			}
			
			if (answer == ch1.getChap1correct().get(i).getText()) {
				System.out.println("You're Correct!");
				 correct(i); //If you correct.

			} else {
				System.out.println("You're Incorrect!");
				 incorrect(i); //If you incorrect.

			}
		}
	}


	

}
