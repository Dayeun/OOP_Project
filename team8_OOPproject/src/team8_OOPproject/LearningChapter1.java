package team8_OOPproject;
import java.awt.BorderLayout;
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
	private JPanel background_pane;
	private JPanel question;
	private JPanel remember;
	private JPanel solve;
	private JPanel choicePane;
	private JPanel next;
	// private ArrayList<JButton> incorrect_choice;
	private JButton submit;
	private ImageIcon quiz;
	private JLabel test;
	private String answer;
	private Questions ch1 = new Questions();
	private int i = 0;
	private int j = 0;

	@Override
	public void quiz() {
		//for (i = 0; i < ch1.getChap1question().size(); i++) {
			frame = new JFrame();
			background_pane = new JPanel();
			frame.setSize(800, 600);
			//incorrect_choice = new ArrayList<JButton>();
			question = new JPanel();
			choicePane = new JPanel();
			next = new JPanel();
			submit = new JButton("Submit");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			frame.add(question);
			TitledBorder border = BorderFactory.createTitledBorder("Question");
			border.setTitleFont(new Font(null, Font.BOLD, 24));
			question.setBorder(border);
			question.setLayout(new BoxLayout(question, BoxLayout.Y_AXIS));
			question.add(ch1.getChap1question().get(0));
			quiz = new ImageIcon("chapter1q1.jpg");
			test = new JLabel();
			test.setIcon(quiz);
			question.add(test);

			choicePane.setLayout(new FlowLayout(FlowLayout.LEFT));
			// choicePane.add(ch1.getChap1correct().get(i));
			// incorrect_choice.add(new JButton("soft"));
			for (j = 0; j < ch1.getChap1choice()[i].length; j++) {
				choicePane.add(ch1.getChap1choice()[i][j]);
				ch1.getChap1choice()[i][j].addActionListener(this);
			}
			next.setLayout(new FlowLayout(FlowLayout.RIGHT));
			submit.setFont(new Font(null, Font.BOLD, 18));
			next.add(submit);

			// ch1.getChap1correct().get(i).addActionListener(this);
			// incorrect_choice.get(0).addActionListener(this);

			submit.addActionListener(this);

			frame.add(question, BorderLayout.NORTH);
			frame.add(choicePane, BorderLayout.CENTER);
			frame.add(next, BorderLayout.SOUTH);

			frame.setVisible(true);
	//	}

	}

	public void correct() {
		// TODO Auto-generated method stub

	}

	public void incorrect() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		LearningChapter1 lc1 = new LearningChapter1();
		lc1.quiz();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(ch1.getChap1correct().get(i))) {
			answer = ch1.getChap1correct().get(i).getText(); 		// save your answer(correct answer)
		} else if (e.getSource()==ch1.getChap1choice()[i][0] && e.getSource()!=ch1.getChap1correct().get(i)) {
			answer = ch1.getChap1choice()[i][0].getText(); 			// save your answer(incorrect answer)
		}
		if (e.getSource().equals(submit)) {
			if (answer == ch1.getChap1correct().get(i).getText()) {
				System.out.println("You're Correct!");
				// correct(); //If you correct.

			} else {
				System.out.println("You're Incorrect!");
				// incorrect(); //If you incorrect.

			}
		}
	}

	

}
