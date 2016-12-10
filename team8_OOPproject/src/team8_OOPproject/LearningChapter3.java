package team8_OOPproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class LearningChapter3 extends Learning {

	private JButton submit;
	private JPanel correct_pane;
	private JPanel incorrect_pane;
	private JPanel answer_pane;
	private JPanel explanation_pane;
	private JPanel remember_pane;
	private JPanel solve_pane;

	public LearningChapter3() {
		//super();
		
		
		quiz(question_num);
		
	}

	@Override
	public void quiz(int question_num) {
		// TODO Auto-generated method stub
		// Put a question on the screen
		TitledBorder border = BorderFactory.createTitledBorder("Question");
		border.setTitleFont(new Font(null, Font.BOLD, 24));
		question_pane.setBorder(border);
		question_pane.add(ch1.getChap3question().get(question_num));
		JLabel q_imageLabel = new JLabel();
		q_imageLabel.setIcon(ch1.getChap3Image().get(question_num));
		ch1.getChap3question().get(question_num).setAlignmentX(Component.LEFT_ALIGNMENT);
		q_imageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		question_pane.add(q_imageLabel);

		int choice_num = 0;
		// place the choice button 'randomly'
		ArrayList<Integer> random_num_array = new ArrayList<Integer>();
		for (int i = 0; i < ch1.getChap3choice()[question_num].length; i++)
			random_num_array.add(i);
		Collections.shuffle(random_num_array);
		for (choice_num = 0; choice_num < ch1.getChap3choice()[question_num].length; choice_num++) {
			choicePane.add(ch1.getChap3choice()[question_num][(random_num_array.get(choice_num))]);
			ch1.getChap3choice()[question_num][(random_num_array.get(choice_num))].addActionListener(this);
		}

		// place the submit button
		submit = new JButton("Submit");
		submit.setForeground(Color.WHITE);
		submit.setBackground(new Color(127, 255, 0));
		submit.setFont(new Font("Arial Black", Font.PLAIN, 30));
		next_pane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		next_pane.setBackground(Color.WHITE);
		submit.setFont(new Font(null, Font.BOLD, 18));
		next_pane.add(jButton_back);
		next_pane.add(submit);

		submit.addActionListener(this);
		choicePane.setVisible(true);
		question_pane.setVisible(true);
	}

	@Override
	public void correct(int question_num) {
		// TODO Auto-generated method stub
		correct_pane = new JPanel();
		correct_pane.setSize(800, 600);
		correct_pane.setBackground(Color.WHITE);
		initialization();
		// next_pane=new JPanel();
		correct_pane.setLayout(new BorderLayout());

		JLabel correct = new JLabel("Correct!");
		correct.setFont(new Font("Aharoni", Font.BOLD, 40));
		correct.setForeground(new Color(127, 255, 0));
		answer_pane.add(correct);

		showAnswers(correct_pane);

		showExplanation(correct_pane);

		settingNextBtn();

		answer = null; // clear previous answer.
		this.add(correct_pane);
	}

	public void incorrect(int question_num) {
		// TODO Auto-generated method stub
		incorrect_pane = new JPanel();
		incorrect_pane.setSize(800, 600);
		incorrect_pane.setBackground(Color.WHITE);
		initialization();
		incorrect_pane.setLayout(new BorderLayout());

		JLabel Incorrect = new JLabel("Sorry, Incorrect..");
		Incorrect.setFont(new Font("Aharoni", Font.BOLD, 40));
		Incorrect.setForeground(new Color(0, 176, 240));
		answer_pane.add(Incorrect);

		showAnswers(incorrect_pane);

		showExplanation(incorrect_pane);

		settingNextBtn();

		answer = null; // clear previous answer.
		this.add(incorrect_pane);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(ch1.getChap3correct().get(question_num))) {
			answer = ch1.getChap3correct().get(question_num).getText(); // save
																		// your
																		// answer(correct
																		// answer)
			for (int i = 0; i < ch1.getChap3choice()[question_num].length; i++) {
				ch1.getChap3choice()[question_num][i].setForeground(Color.WHITE);
				ch1.getChap3choice()[question_num][i].setBackground(new Color(127, 255, 0));
			}
			ch1.getChap3correct().get(question_num).setForeground(Color.RED);
			ch1.getChap3correct().get(question_num).setBackground(new Color(126, 187, 0));
		} else {
			for (int r = 1; r < ch1.getChap3choice()[question_num].length; r++)
				if (e.getSource().equals(ch1.getChap3choice()[question_num][r])) {
					answer = ch1.getChap3choice()[question_num][r].getText(); // save
																				// your
																				// answer(incorrect
																				// answer)
					for (int w = 0; w < ch1.getChap3choice()[question_num].length; w++) {
						ch1.getChap3choice()[question_num][w].setForeground(Color.WHITE);
						ch1.getChap3choice()[question_num][w].setBackground(new Color(127, 255, 0));
					}
					ch1.getChap3choice()[question_num][r].setForeground(Color.RED);
					ch1.getChap3choice()[question_num][r].setBackground(new Color(126, 187, 0));
				}
		}

		if (e.getSource().equals(submit)) {
			if (answer == null) {
				JOptionPane.showMessageDialog(null, "Please choose your answer!", "NO ANSWER", 2);
				System.out.println("Please choose your answer!");
				return;
			}

			if (answer == ch1.getChap3correct().get(question_num).getText()) {
				System.out.print("You're Correct!  ");
				System.out.println("Your answer: " + answer);
				correct(question_num); // If you correct.

			} else {
				System.out.print("You're Incorrect!  ");
				System.out.println("Your answer: " + answer);
				incorrect(question_num); // If you incorrect.

			}
		}

		if (e.getSource().equals(jButton_back)) {
			// remove painting of your choices
			for (int i = 0; i < ch1.getChap3choice().length; i++) {
				for (int j = 0; j < ch1.getChap3choice()[i].length; j++) {
					ch1.getChap3choice()[i][j].setForeground(Color.WHITE);
					ch1.getChap3choice()[i][j].setBackground(new Color(127, 255, 0));
				}
			}
		}

		if (e.getSource().equals(next)) {
			// if chapter is end, you automatically go back ChapterSelect
			// screen.
			if (question_num >= ch1.getChap3question().size() - 1) {
				JOptionPane.showMessageDialog(null, "Chapter 3 is END!");
				jButton_back.doClick();
				return;
			}

			question_num++;

			if(correct_pane.isVisible())
				correct_pane.setVisible(false);
			else if(incorrect_pane.isVisible())
				incorrect_pane.setVisible(false);
			
			remember_pane.removeAll();
			solve_pane.removeAll();
			next_pane.removeAll();
			quiz(question_num);
		}
	}

	@Override
	public void initialization() {
		question_pane.removeAll();
		question_pane.setBorder(null);
		choicePane.removeAll();
		next_pane.removeAll();
		question_pane.setVisible(false);
		choicePane.setVisible(false);

		answer_pane = new JPanel();
		explanation_pane = new JPanel();
		remember_pane = new JPanel();
		solve_pane = new JPanel();
	}

	public void showAnswers(JPanel pane) {
		// display correct answer and your answer
		answer_pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		answer_pane.setBackground(Color.WHITE);
		JLabel correct_answer = new JLabel(
				"<html>The correct answer is : <br>" + ch1.getChap3correct().get(question_num).getText() + "</html>");
		JLabel your_answer = new JLabel("<html>Your answer is : <br>" + answer + "</html>");

		// make blank
		answer_pane.add(Box.createRigidArea(new Dimension(30, 0))); // I refer
																	// to tips
																	// on
																	// https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html
		answer_pane.add(correct_answer);
		answer_pane.add(Box.createRigidArea(new Dimension(50, 0)));
		answer_pane.add(your_answer);

		pane.add(answer_pane, BorderLayout.NORTH);
	}

	public void showExplanation(JPanel pane) {
		explanation_pane.setLayout(new BoxLayout(explanation_pane, BoxLayout.Y_AXIS));

		// set remember(key-point) panel
		remember_pane.setLayout(new BoxLayout(remember_pane, BoxLayout.Y_AXIS));
		remember_pane.setBackground(Color.WHITE);
		TitledBorder border1 = BorderFactory.createTitledBorder("Remember");
		border1.setTitleFont(new Font(null, Font.BOLD, 24));
		remember_pane.setBorder(border1);
		remember_pane.add(ch1.getChap3remember().get(question_num));
		explanation_pane.add(remember_pane);

		// set solve panel
		solve_pane.setLayout(new BoxLayout(solve_pane, BoxLayout.Y_AXIS));
		solve_pane.setBackground(Color.WHITE);
		TitledBorder border2 = BorderFactory.createTitledBorder("Solve");
		border2.setTitleFont(new Font(null, Font.BOLD, 24));
		solve_pane.setBorder(border2);
		solve_pane.add(ch1.getChap3solve().get(question_num));
		explanation_pane.add(solve_pane);

		pane.add(explanation_pane, BorderLayout.CENTER);
	}

	public void settingNextBtn() {

		// set next button
		next = new JButton("I GOT IT!");
		next.setForeground(Color.WHITE);
		next.setBackground(new Color(127, 255, 0));
		next.setFont(new Font("Arial Black", Font.PLAIN, 20));
		next_pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		next_pane.add(next);
		next_pane.add(jButton_back);
		next.addActionListener(this);
	}

}
