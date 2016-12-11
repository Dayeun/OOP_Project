package team8_OOPproject;
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MonoPolyQuiz extends JFrame implements ActionListener{

	private Quiz[] quizList;
	private Quiz quiz;
	private JPanel contentPane;
	private JLabel question;
	private JButton btnanswer1;
	private JButton btnanswer2;
	private JButton btnanswer3;
	private JLabel wImage;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonoPolyQuiz frame = new MonoPolyQuiz();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		JButton btn= (JButton) e.getSource();
		System.out.println(btn.getText());
		System.out.println(quiz.getAnswer());
	
		if(btn.getText().equals(quiz.getAnswer())){
			JOptionPane.showMessageDialog(MonoPolyQuiz.this, "Correct!! Very Good:)");
		
		} else{  
			JOptionPane.showMessageDialog(MonoPolyQuiz.this, "Wrong Answer! You can find stuff in" +quiz.getRefernce());
		
		}
		
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public MonoPolyQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.ORANGE));
		setContentPane(contentPane);
		
		QuizReader qr= new QuizReader();
		quizList=qr.FileRead();
		quiz= qr.getRandomQuiz(quizList);
		
		question = new JLabel(quiz.getQuestion());
		//question.setText();
		
		btnanswer1 = new JButton(quiz.getOp1());
		
		btnanswer2 = new JButton(quiz.getOp2());
		
		btnanswer3 = new JButton(quiz.getOp3());
		
		btnanswer1.addActionListener(this);
		btnanswer2.addActionListener(this);
		btnanswer3.addActionListener(this);
		
		if(quiz.getNumberOfbtn()<3) btnanswer3.setEnabled(false);
		
		System.out.println(quiz.loadImage(quiz.getImage()));
		System.out.println(quiz.getImage());
		JLabel lblNewLabel = new JLabel(new ImageIcon(quiz.getImage()));
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnanswer1)
									.addGap(18)
									.addComponent(btnanswer2)
									.addGap(26)
									.addComponent(btnanswer3))
								.addComponent(question))))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(question)
					.addGap(18)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnanswer1)
						.addComponent(btnanswer2)
						.addComponent(btnanswer3))
					.addGap(29))
		);
		
		
		contentPane.setLayout(gl_contentPane);
	}

	public JButton getBtnanswer1() {
		return btnanswer1;
	}

	public void setBtnanswer1(JButton btnanswer1) {
		this.btnanswer1 = btnanswer1;
	}

	public JButton getBtnanswer2() {
		return btnanswer2;
	}

	public void setBtnanswer2(JButton btnanswer2) {
		this.btnanswer2 = btnanswer2;
	}

	public JButton getBtnanswer3() {
		return btnanswer3;
	}

	public void setBtnanswer3(JButton btnanswer3) {
		this.btnanswer3 = btnanswer3;
	}
}
