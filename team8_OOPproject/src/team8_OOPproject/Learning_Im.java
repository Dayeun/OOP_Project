package team8_OOPproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Learning_Im extends JPanel implements ActionListener {
	private JLabel question;
	
	private JButton answer1;
	private JButton answer2;
	private JButton answer3;
	private JButton insert;
	
	private JLabel explanation;
	
	public ArrayList<QuestionType> chapter = new ArrayList<QuestionType>();
	
	private boolean isAnswer1 = false;
	private boolean isAnswer2 = false;
	private boolean isAnswer3 = false;
	
	private int question_number = 0;
	
	
	public Learning_Im(){
		question = new JLabel("question");
		
		answer1 = new JButton();
		answer2 = new JButton();
		answer3 = new JButton();
		insert = new JButton("INSERT");
		
		explanation = new JLabel("123123");
		
		answer1.addActionListener(this);
		answer2.addActionListener(this);
		answer3.addActionListener(this);
		insert.addActionListener(this);
		
		
		this.setSize(800, 600);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(answer1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(answer2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(answer3))
						.addComponent(explanation)
						.addComponent(question)
						.addComponent(insert))
					.addContainerGap(557, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(question)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(answer3)
						.addComponent(answer2)
						.addComponent(answer1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(explanation)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(insert)
					.addGap(486))
		);
		setLayout(groupLayout);
		
		this.setVisible(true);
		
	}
	public void makeQuestions(){
		BufferedReader bufferdeReader;
		try {
			bufferdeReader = new BufferedReader(new FileReader("question1.txt"));
			
			while (true) {
				String line = bufferdeReader.readLine();
				if (line == null)// if there is no data
					break;
				else {// split format {id,password,name,score}
					String[] split = line.split("//");
					String question = split[0];
					String remark = split[1];
					String explain = split[2];
					String answer1 = split[3];
					String answer2 = split[4];
					String answer3 = split[5];
					String correct = split[6];
					QuestionType newchapter = new QuestionType(question, remark, explain, answer1, answer2, answer3, correct);
					chapter.add(newchapter); // add the user data to the ArrayList
				}
			}
			bufferdeReader.close();
			
			question.setText(chapter.get(0).getQuestion());
			answer1.setText(chapter.get(0).getAnswer1());
			answer2.setText(chapter.get(0).getAnswer2());
			answer3.setText(chapter.get(0).getAnswer3());
			explanation.setText(chapter.get(0).getExplain());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == answer1){
			setAnswer1(true);
			setAnswer2(false);
			setAnswer3(false);
		}
		if(e.getSource() == answer2){
			setAnswer1(false);
			setAnswer2(true);
			setAnswer3(false);
		}
		if(e.getSource() == answer3){
			setAnswer1(false);
			setAnswer2(false);
			setAnswer3(true);
		}
		
		if(e.getSource() == insert){
			boolean correct = false;
			
			if(isAnswer1() == true && chapter.get(question_number).getCorrect().equals(answer1.getText())){
				correct=true;
			} else if(isAnswer2() == true && chapter.get(question_number).getCorrect().equals(answer2.getText())){
				correct=true;
			} else if(isAnswer3() == true && chapter.get(question_number).getCorrect().equals(answer3.getText())){
				correct=true;
			}
			
			if(correct == true){
				JOptionPane.showMessageDialog(null, "CORRECT", "Message", JOptionPane.WARNING_MESSAGE);
				question_number++;
				question.setText(chapter.get(question_number).getQuestion());
				answer1.setText(chapter.get(question_number).getAnswer1());
				answer2.setText(chapter.get(question_number).getAnswer2());
				answer3.setText(chapter.get(question_number).getAnswer3());
				explanation.setText(chapter.get(question_number).getExplain());
				
			} else{
				JOptionPane.showMessageDialog(null, "INCORRECT", "Message", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public JButton getAnswer1() {
		return answer1;
	}

	public void setAnswer1(JButton answer1) {
		this.answer1 = answer1;
	}

	public JButton getAnswer2() {
		return answer2;
	}

	public void setAnswer2(JButton answer2) {
		this.answer2 = answer2;
	}

	public JButton getAnswer3() {
		return answer3;
	}

	public void setAnswer3(JButton answer3) {
		this.answer3 = answer3;
	}

	public JButton getInsert() {
		return insert;
	}

	public void setInsert(JButton insert) {
		this.insert = insert;
	}

	public boolean isAnswer1() {
		return isAnswer1;
	}

	public void setAnswer1(boolean isAnswer1) {
		this.isAnswer1 = isAnswer1;
	}

	public boolean isAnswer2() {
		return isAnswer2;
	}

	public void setAnswer2(boolean isAnswer2) {
		this.isAnswer2 = isAnswer2;
	}

	public boolean isAnswer3() {
		return isAnswer3;
	}

	public void setAnswer3(boolean isAnswer3) {
		this.isAnswer3 = isAnswer3;
	}
	public int getQuestion_number() {
		return question_number;
	}
	public void setQuestion_number(int question_number) {
		this.question_number = question_number;
	}
	
	
	
	
}
