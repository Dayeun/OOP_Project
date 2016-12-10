package team8_OOPproject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Questions {
	//chapter1 (1. Materials)
	private ArrayList<JTextArea> chap1question;
	private ArrayList<ImageIcon> chap1Image;
	private ArrayList<JTextArea> chap1remember;
	private ArrayList<JTextArea> chap1solve;
	private ArrayList<JButton> chap1correct;
	private JButton[][] chap1choice;
	//chapter2 (2. State of matter_Matter and mass)
	private ArrayList<JTextArea> chap2question;
	private ArrayList<JTextArea> chap2remember;
	private ArrayList<JTextArea> chap2solve;
	private ArrayList<JButton> chap2correct;
	private JButton[][] chap2choice;
	//chapter3 (3. Change of state)
	private ArrayList<JTextArea> chap3question;
	private ArrayList<JTextArea> chap3remember;
	private ArrayList<JTextArea> chap3solve;
	private ArrayList<JButton> chap3correct;
	private JButton[][] chap3choice;
	//chapter4 (4. Heat)
	//chapter5 (5. Force and motion)
	//chapter6 (6. Electricity and magnetism)
	
	private JFrame frame;
	private JPanel panel;
	
	public Questions(){
		chap1question = new ArrayList<JTextArea>();
		chap1Image = new ArrayList<ImageIcon>();
		chap1remember = new ArrayList<JTextArea>();
		chap1solve = new ArrayList<JTextArea>();
		chap1correct = new ArrayList<JButton>();
		chap1choice = new JButton[5][];

		try {
			File question = new File("chapter1_question.txt");
			FileReader fr;
			fr = new FileReader(question);
			BufferedReader br = new BufferedReader(fr);
			String line=null;

			while ((line = br.readLine()) != null) {
				String[] q = line.split("//");
				for(int i=0; i<q.length; i++)
				chap1question.add(new JTextArea(q[i]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<chap1question.size(); i++)
		{
			chap1question.get(i).setLineWrap(true);
			chap1question.get(i).setEditable(false);
			chap1question.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
			
		}
		
		
		chap1Image.add(new ImageIcon("chapter1q1.jpg"));
		chap1Image.add(new ImageIcon("chapter1q2.jpg"));
		chap1Image.add(new ImageIcon("chapter1q3.jpg"));
		chap1Image.add(new ImageIcon("chapter1q4.jpg"));
		chap1Image.add(new ImageIcon("chapter1q5.jpg"));
		
		
		chap1correct.add(new JButton("bumpy"));
		chap1correct.add(new JButton("bouncy"));
		chap1correct.add(new JButton("salty"));
		chap1correct.add(new JButton("nylon track suit"));
		chap1correct.add(new JButton("translucent"));
		
		chap1choice[0]=new JButton[2];			//The choices are 2.
		chap1choice[1]=new JButton[2];			//The choices are 2.
		chap1choice[2]=new JButton[3];			//The choices are 3.
		chap1choice[3]=new JButton[2];			//The choices are 2.
		chap1choice[4]=new JButton[3];			//The choices are 3.
		chap1choice[0][0]=chap1correct.get(0);
		chap1choice[0][1]=new JButton("soft");
		chap1choice[1][0]=chap1correct.get(1);
		chap1choice[1][1]=new JButton("yellow");
		chap1choice[2][0]=chap1correct.get(2);
		chap1choice[2][1]=new JButton("slippery");
		chap1choice[2][2]=new JButton("translucent");
		chap1choice[3][0]=chap1correct.get(3);
		chap1choice[3][1]=new JButton("bark");
		chap1choice[4][0]=chap1correct.get(4);
		chap1choice[4][1]=new JButton("sticky");
		chap1choice[4][2]=new JButton("sweet");
		
		for(int i=0; i<chap1choice.length; i++)
		{
			for(int j=0; j<chap1choice[i].length; j++)
			{
				chap1choice[i][j].setForeground(Color.WHITE);
				chap1choice[i][j].setBackground(new Color(127, 255, 0));
				chap1choice[i][j].setFont(new Font("Arial Black", Font.PLAIN, 30));
			}
			
		}
			
		try {
			File remember = new File("chapter1_remember.txt");
			FileReader fr;
			fr = new FileReader(remember);
			BufferedReader br = new BufferedReader(fr);
			String line=null;
			char x=' ';
			
			while ((line = br.readLine()) != null) {
				String[] r = line.split("//");
				for(int i=0; i<r.length; i++)
					chap1remember.add(new JTextArea(r[i]));
			}	
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<chap1remember.size(); i++)
		{
			chap1remember.get(i).setLineWrap(true);
			chap1remember.get(i).setEditable(false);
			chap1remember.get(i).setSize(700, 200);
			chap1remember.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
		}
		
		
		
		try {
			File solve = new File("chapter1_solve.txt");
			FileReader fr;
			fr = new FileReader(solve);
			BufferedReader br = new BufferedReader(fr);
			String line=null;
			
			while ((line = br.readLine()) != null) {
				String[] s = line.split("//");
				for(int i=0; i<s.length; i++)
					chap1solve.add(new JTextArea(s[i]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<chap1solve.size(); i++){
			chap1solve.get(i).setLineWrap(true);
			chap1solve.get(i).setEditable(false);
			chap1remember.get(i).setSize(700, 200);
			chap1solve.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
		}
		
	
	}


	public ArrayList<JTextArea> getChap1question() {
		return chap1question;
	}
	public ArrayList<JTextArea> getChap1remember() {
		return chap1remember;
	}
	public ArrayList<JTextArea> getChap1solve() {
		return chap1solve;
	}
	public ArrayList<JButton> getChap1correct() {
		return chap1correct;
	}
	public JButton[][] getChap1choice() {
		return chap1choice;
	}
	public ArrayList<ImageIcon> getChap1Image() {
		return chap1Image;
	}
	
	

}
