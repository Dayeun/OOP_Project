package team8_OOPproject;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Questions {
	// chapter1 (1. Materials)
	private ArrayList<JTextArea> chap1question;
	private ArrayList<ImageIcon> chap1Image;
	private ArrayList<JTextArea> chap1remember;
	private ArrayList<JTextArea> chap1solve;
	private ArrayList<JButton> chap1correct;
	private JButton[][] chap1choice;
	// chapter2 (2. Force and motion)
	private ArrayList<JTextArea> chap2question;
	private ArrayList<ImageIcon> chap2Image;
	private ArrayList<JTextArea> chap2remember;
	private ArrayList<JTextArea> chap2solve;
	private ArrayList<JButton> chap2correct;
	private JButton[][] chap2choice;
	// chapter3 (3. Electricity and magnetism)
	private ArrayList<JTextArea> chap3question;
	private ArrayList<ImageIcon> chap3Image;
	private ArrayList<JTextArea> chap3remember;
	private ArrayList<JTextArea> chap3solve;
	private ArrayList<JButton> chap3correct;
	private JButton[][] chap3choice;


	public Questions() {
		chap1question = new ArrayList<JTextArea>();
		chap1Image = new ArrayList<ImageIcon>();
		chap1remember = new ArrayList<JTextArea>();
		chap1solve = new ArrayList<JTextArea>();
		chap1correct = new ArrayList<JButton>();
		chap1choice = new JButton[5][];
		chap2question = new ArrayList<JTextArea>();
		chap2Image = new ArrayList<ImageIcon>();
		chap2remember = new ArrayList<JTextArea>();
		chap2solve = new ArrayList<JTextArea>();
		chap2correct = new ArrayList<JButton>();
		chap2choice = new JButton[5][];
		chap3question = new ArrayList<JTextArea>();
		chap3Image = new ArrayList<ImageIcon>();
		chap3remember = new ArrayList<JTextArea>();
		chap3solve = new ArrayList<JTextArea>();
		chap3correct = new ArrayList<JButton>();
		chap3choice = new JButton[5][];

		// chapter1 question
		try {
			File question = new File("chapter1_question.txt");
			FileReader fr;
			fr = new FileReader(question);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] q = line.split("//");
				for (int i = 0; i < q.length; i++)
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
		// chapter2 question
		try {
			File question = new File("chapter2_question.txt");
			FileReader fr;
			fr = new FileReader(question);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] q = line.split("//");
				for (int i = 0; i < q.length; i++)
					chap2question.add(new JTextArea(q[i]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// chapter3 question
		try {
			File question = new File("chapter3_question.txt");
			FileReader fr;
			fr = new FileReader(question);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] q = line.split("//");
				for (int i = 0; i < q.length; i++)
					chap3question.add(new JTextArea(q[i]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < chap1question.size(); i++) {
			chap1question.get(i).setLineWrap(true);
			chap1question.get(i).setEditable(false);
			chap1question.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
			chap2question.get(i).setLineWrap(true);
			chap2question.get(i).setEditable(false);
			chap2question.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
			chap3question.get(i).setLineWrap(true);
			chap3question.get(i).setEditable(false);
			chap3question.get(i).setFont(new Font("Arial", Font.PLAIN, 18));

		}

		
		
		// chapter1 Image
		chap1Image.add(new ImageIcon("chapter1q1.jpg"));
		chap1Image.add(new ImageIcon("chapter1q2.jpg"));
		chap1Image.add(new ImageIcon("chapter1q3.jpg"));
		chap1Image.add(new ImageIcon("chapter1q4.jpg"));
		chap1Image.add(new ImageIcon("chapter1q5.jpg"));
		// chapter2 Image
		chap2Image.add(null);
		chap2Image.add(new ImageIcon("chapter2q2.jpg"));
		chap2Image.add(new ImageIcon("chapter2q3.jpg"));
		chap2Image.add(new ImageIcon("chapter2q4.jpg"));
		chap2Image.add(new ImageIcon("chapter2q5.jpg"));
		// chapter3 Image
		chap3Image.add(new ImageIcon("chapter3q1.jpg"));
		chap3Image.add(null);
		chap3Image.add(new ImageIcon("chapter3q3.jpg"));
		chap3Image.add(new ImageIcon("chapter3q4.jpg"));
		chap3Image.add(new ImageIcon("chapter3q5.jpg"));

		
		
		chap1correct.add(new JButton("bumpy"));
		chap1correct.add(new JButton("bouncy"));
		chap1correct.add(new JButton("salty"));
		chap1correct.add(new JButton("nylon track suit"));
		chap1correct.add(new JButton("translucent"));
		chap1choice[0] = new JButton[2]; // The choices are 2.
		chap1choice[1] = new JButton[2]; // The choices are 2.
		chap1choice[2] = new JButton[3]; // The choices are 3.
		chap1choice[3] = new JButton[2]; // The choices are 2.
		chap1choice[4] = new JButton[3]; // The choices are 3.
		chap1choice[0][0] = chap1correct.get(0);
		chap1choice[0][1] = new JButton("soft");
		chap1choice[1][0] = chap1correct.get(1);
		chap1choice[1][1] = new JButton("yellow");
		chap1choice[2][0] = chap1correct.get(2);
		chap1choice[2][1] = new JButton("slippery");
		chap1choice[2][2] = new JButton("translucent");
		chap1choice[3][0] = chap1correct.get(3);
		chap1choice[3][1] = new JButton("bark");
		chap1choice[4][0] = chap1correct.get(4);
		chap1choice[4][1] = new JButton("sticky");
		chap1choice[4][2] = new JButton("sweet");
		
		chap2correct.add(new JButton("a box holding 48 pounds"));
		chap2correct.add(new JButton("push"));
		chap2correct.add(new JButton("toward the center of Earth"));
		chap2correct.add(new JButton("4>2>1>3"));
		chap2correct.add(new JButton("speckled, black, white, brown"));
		chap2choice[0] = new JButton[2]; // The choices are 2.
		chap2choice[1] = new JButton[2]; // The choices are 2.
		chap2choice[2] = new JButton[2]; // The choices are 2.
		chap2choice[3] = new JButton[3]; // The choices are 3.
		chap2choice[4] = new JButton[3]; // The choices are 3.
		chap2choice[0][0] = chap2correct.get(0);
		chap2choice[0][1] = new JButton("a box holding 35 pounds");
		chap2choice[1][0] = chap2correct.get(1);
		chap2choice[1][1] = new JButton("pull");
		chap2choice[2][0] = chap2correct.get(2);
		chap2choice[2][1] = new JButton("away from the center of Earth");
		chap2choice[3][0] = chap2correct.get(3);
		chap2choice[3][1] = new JButton("1>2>3>4");
		chap2choice[3][2] = new JButton("3>1>2>4");
		chap2choice[4][0] = chap2correct.get(4);
		chap2choice[4][1] = new JButton("black, white, brown, speckled");
		chap2choice[4][2] = new JButton("white, speckled, black, brown");
		
		chap3correct.add(new JButton("repel"));
		chap3correct.add(new JButton("Electric charge can be positive or negative"));
		chap3correct.add(new JButton("attract"));
		chap3correct.add(new JButton("The magnitude of the magnetic force is smaller in Pair 2"));
		chap3correct.add(new JButton("This model shows that the balloon has both positive and negative charges."));
		chap3choice[0] = new JButton[2]; // The choices are 2.
		chap3choice[1] = new JButton[3]; // The choices are 3.
		chap3choice[2] = new JButton[2]; // The choices are 2.
		chap3choice[3] = new JButton[3]; // The choices are 3.
		chap3choice[4] = new JButton[3]; // The choices are 3.
		chap3choice[0][0] = chap3correct.get(0);
		chap3choice[0][1] = new JButton("attract");
		chap3choice[1][0] = chap3correct.get(1);
		chap3choice[1][1] = new JButton("Particles with any electric charge are called positive charges");
		chap3choice[1][2] = new JButton("The smallest piece of matter is called an atom");
		chap3choice[2][0] = chap3correct.get(2);
		chap3choice[2][1] = new JButton("repel");
		chap3choice[3][0] = chap3correct.get(3);
		chap3choice[3][1] = new JButton("The magnitude of the magnetic force is smaller in Pair 1");
		chap3choice[3][2] = new JButton("The magnitude of the magnetic force is the same in both pairs");
		chap3choice[4][0] = chap3correct.get(4);
		chap3choice[4][1] = new JButton("This model shows the real size and shape of the balloon's charges");
		chap3choice[4][2] = new JButton("This model shows all of the balloon's charges");
	
		for (int i = 0; i < chap1choice.length; i++) {
			for (int j = 0; j < chap1choice[i].length; j++) {
				chap1choice[i][j].setForeground(Color.WHITE);
				chap1choice[i][j].setBackground(new Color(127, 255, 0));
				chap1choice[i][j].setFont(new Font("Arial Black", Font.PLAIN, 30));
			}
			for (int j = 0; j < chap2choice[i].length; j++) {
				chap2choice[i][j].setForeground(Color.WHITE);
				chap2choice[i][j].setBackground(new Color(127, 255, 0));
				chap2choice[i][j].setFont(new Font("Arial Black", Font.PLAIN, 20));
			}
			for (int j = 0; j < chap3choice[i].length; j++) {
				chap3choice[i][j].setForeground(Color.WHITE);
				chap3choice[i][j].setBackground(new Color(127, 255, 0));
				chap3choice[i][j].setFont(new Font("Arial Black", Font.PLAIN, 20));
			}
		}

		try {
			File remember = new File("chapter1_remember.txt");
			FileReader fr;
			fr = new FileReader(remember);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] r = line.split("//");
				for (int i = 0; i < r.length; i++)
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
		try {
			File remember = new File("chapter2_remember.txt");
			FileReader fr;
			fr = new FileReader(remember);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] r = line.split("//");
				for (int i = 0; i < r.length; i++)
					chap2remember.add(new JTextArea(r[i]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			File remember = new File("chapter3_remember.txt");
			FileReader fr;
			fr = new FileReader(remember);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] r = line.split("//");
				for (int i = 0; i < r.length; i++)
					chap3remember.add(new JTextArea(r[i]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < chap1remember.size(); i++) {
			chap1remember.get(i).setLineWrap(true);
			chap1remember.get(i).setEditable(false);
			chap1remember.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
			chap2remember.get(i).setLineWrap(true);
			chap2remember.get(i).setEditable(false);
			chap2remember.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
			chap3remember.get(i).setLineWrap(true);
			chap3remember.get(i).setEditable(false);
			chap3remember.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
		}

		try {
			File solve = new File("chapter1_solve.txt");
			FileReader fr;
			fr = new FileReader(solve);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] s = line.split("//");
				for (int i = 0; i < s.length; i++)
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
		try {
			File solve = new File("chapter2_solve.txt");
			FileReader fr;
			fr = new FileReader(solve);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] s = line.split("//");
				for (int i = 0; i < s.length; i++)
					chap2solve.add(new JTextArea(s[i]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			File solve = new File("chapter3_solve.txt");
			FileReader fr;
			fr = new FileReader(solve);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] s = line.split("//");
				for (int i = 0; i < s.length; i++)
					chap3solve.add(new JTextArea(s[i]));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < chap1solve.size(); i++) {
			chap1solve.get(i).setLineWrap(true);
			chap1solve.get(i).setEditable(false);
			chap1solve.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
			chap2solve.get(i).setLineWrap(true);
			chap2solve.get(i).setEditable(false);
			chap2solve.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
			chap3solve.get(i).setLineWrap(true);
			chap3solve.get(i).setEditable(false);
			chap3solve.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
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

	public ArrayList<JTextArea> getChap2question() {
		return chap2question;
	}

	public ArrayList<JTextArea> getChap2remember() {
		return chap2remember;
	}

	public ArrayList<JTextArea> getChap2solve() {
		return chap2solve;
	}

	public ArrayList<JButton> getChap2correct() {
		return chap2correct;
	}

	public JButton[][] getChap2choice() {
		return chap2choice;
	}

	public ArrayList<ImageIcon> getChap2Image() {
		return chap2Image;
	}

	public ArrayList<ImageIcon> getChap3Image() {
		return chap3Image;
	}

	public ArrayList<JTextArea> getChap3question() {
		return chap3question;
	}

	public ArrayList<JTextArea> getChap3remember() {
		return chap3remember;
	}

	public ArrayList<JTextArea> getChap3solve() {
		return chap3solve;
	}

	public ArrayList<JButton> getChap3correct() {
		return chap3correct;
	}

	public JButton[][] getChap3choice() {
		return chap3choice;
	}

}
