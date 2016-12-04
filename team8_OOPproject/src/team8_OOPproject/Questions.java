package team8_OOPproject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
	private ArrayList<JTextArea> chap1question;
	private ArrayList<ImageIcon> chap1Image;
	private ArrayList<JTextArea> chap1remember;
	private ArrayList<JTextArea> chap1solve;
	private ArrayList<JButton> chap1correct;
	private JButton[][] chap1choice;
	private ArrayList<JTextArea> chap2question;
	private ArrayList<JTextArea> chap2remember;
	private ArrayList<JTextArea> chap2solve;
	private ArrayList<JButton> chap2correct;
	private ArrayList<JTextArea> chap3question;
	private ArrayList<JTextArea> chap3remember;
	private ArrayList<JTextArea> chap3solve;
	private ArrayList<JButton> chap3correct;
	
	private JFrame frame;
	private JPanel panel;
	
	public Questions(){
		chap1question = new ArrayList<JTextArea>();
		chap1Image = new ArrayList<ImageIcon>();
		chap1remember = new ArrayList<JTextArea>();
		chap1solve = new ArrayList<JTextArea>();
		chap1correct = new ArrayList<JButton>();
		chap1choice = new JButton[5][];

		
		chap1question.add(new JTextArea("Which property matches this object?"));
		chap1question.add(new JTextArea("Which property do these two objects have in common?"));
		chap1question.add(new JTextArea("Which property do these three objects have in common?"));
		chap1question.add(new JTextArea("Which is smoother?"));
		chap1question.add(new JTextArea("Which property do these four objects have in common?"));
		chap1question.get(0).setFont(new Font("Arial", 10, 12));
		
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
			
		
		
		chap1remember.add(new JTextArea("An object has different properties. "
				+ "A property of an object can tell you how it looks, feels, tastes, or smells. "
				+ "Properties can also tell you how an object will behave when something happens to it."));
		chap1remember.add(new JTextArea("An object has different properties."
				+ "A property of an object can tell you how it looks, feels, tastes, or smells."
				+ "Different objects can have the same properties. You can use these properties to put objects into groups."));
		chap1remember.add(new JTextArea("An object has different properties. "
				+ "A property of an object can tell you how it looks, feels, tastes, or smells. "
				+ "Properties can also tell you how an object will behave when something happens to it.\n"
				+ "Different objects can have properties in common. You can use these properties to put objects into groups. "
				+ "Grouping objects by their properties is called classification."));
		chap1remember.add(new JTextArea("Every object is made of one or more materials. "
				+ "A material is a type of matter. Wood, glass, metal, and plastic are common materials.\n"
				+ "A material has different properties. A material's properties tell you how it looks, feels, tastes, or smells. "
				+ "Some examples of properties are shiny, hard, fragile, and stretchy.\n"
				+ "For example, a shiny material reflects a lot of light. "
				+ "A fragile material breaks when you drop it."));
		chap1remember.add(new JTextArea("An object has different properties. "
				+ "A property of an object can tell you how it looks, feels, tastes, or smells. "
				+ "Properties can also tell you how an object will behave when something happens to it.\n"
				+ "Different objects can have properties in common. "
				+ "You can use these properties to put objects into groups. "
				+ "Grouping objects by their properties is called classification."));
		for(int i=0; i<chap1remember.size(); i++)
		{
			chap1remember.get(i).setLineWrap(true);
			chap1remember.get(i).setEditable(false);
			chap1remember.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
			//chap1remember.get(i).setSize(new Dimension(800, chap1remember.get(i).getLineCount()));
		}
		
		
		chap1solve.add(new JTextArea("Thinks about each property.\n"
				+ "A soft object changes shape when pressed or squeezed. The tree bark is not soft.\n"
				+ "A bumpy object is covered in lumps and bumps. The tree bark is bumpy.\n"));
		chap1solve.add(new JTextArea("For each object, decide if it has that property.\n"
				+ "A bouncy object will bounce back from the floor if you drop it. Both objects are bouncy.\n"
				+ "Yellow is a color.  This color is yellow. The spring is not yellow.\n"
				+ "The property that both objects have in common is bouncy.\n"));
		chap1solve.add(new JTextArea("For each object, decide if it has that property.\n"
				+ "A slippery object is hard to hold onto or stand on. None of the objects are slippery.\n"
				+ "A translucent object lets light through. But you cannot see clearly through a translucent object. "
				+ "The fries and the cracker are not translucent.\n"
				+ "Potato chips have a salty taste. All three objects are salty.\n"
				+ "The property that all three objects have in common is salty."));
		chap1solve.add(new JTextArea("Smooth is a property. A smooth material is not rough or bumpy.\n"
				+ "Look at each picture, one at a time. Imagine touching the material shown in each picture.\n"
				+ "Of the choices, the nylon track suit is smoother. If you touch nylon fabric, it will not feel rough.\n"));
		chap1solve.add(new JTextArea("For each object, decide if it has that property."
				+ "A sticky object can attach or stick to other things. The jello is sticky, but the marbles are not.\n"
				+ "A translucent object lets light through.\n But you cannot see clearly through a translucent object. All four objects are translucent.\n"
				+ "Sugar has a sweet taste. The jello is sweet, but the marbles and the icicle are not.\n"
				+ "The property that all four objects have in common is translucent.\n"));
		for(int i=0; i<chap1solve.size(); i++){
			chap1solve.get(i).setLineWrap(true);
			chap1solve.get(i).setEditable(false);
			chap1solve.get(i).setFont(new Font("Arial", Font.PLAIN, 18));
		}
		
	
	}


	public ArrayList<JTextArea> getChap1question() {
		return chap1question;
	}

	public void setChap1question(ArrayList<JTextArea> chap1question) {
		this.chap1question = chap1question;
	}

	public ArrayList<JTextArea> getChap1remember() {
		return chap1remember;
	}

	public void setChap1remember(ArrayList<JTextArea> chap1remember) {
		this.chap1remember = chap1remember;
	}

	public ArrayList<JTextArea> getChap1solve() {
		return chap1solve;
	}

	public void setChap1solve(ArrayList<JTextArea> chap1solve) {
		this.chap1solve = chap1solve;
	}

	public ArrayList<JButton> getChap1correct() {
		return chap1correct;
	}

	public void setChap1correct(ArrayList<JButton> chap1correct) {
		this.chap1correct = chap1correct;
	}

	public JButton[][] getChap1choice() {
		return chap1choice;
	}

	public ArrayList<ImageIcon> getChap1Image() {
		return chap1Image;
	}
	
	

}
