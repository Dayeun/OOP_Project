package team8_OOPproject;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Questions {
	private ArrayList<JLabel> chap1question;
	private ArrayList<JLabel> chap1remember;
	private ArrayList<JLabel> chap1solve;
	private ArrayList<JButton> chap1correct;
	private JButton[][] chap1choice;
	private ArrayList<JLabel> chap2question;
	private ArrayList<JLabel> chap2remember;
	private ArrayList<JLabel> chap2solve;
	private ArrayList<JButton> chap2correct;
	private ArrayList<JLabel> chap3question;
	private ArrayList<JLabel> chap3remember;
	private ArrayList<JLabel> chap3solve;
	private ArrayList<JButton> chap3correct;
	
	private JFrame frame;
	private JPanel panel;
	
	public Questions(){
		chap1question = new ArrayList<JLabel>();
		chap1remember = new ArrayList<JLabel>();
		chap1solve = new ArrayList<JLabel>();
		chap1correct = new ArrayList<JButton>();
		chap1choice = new JButton[5][];

		
		chap1question.add(new JLabel("<html>Which property matches this object?</html>"));
		chap1question.add(new JLabel("<html>Which property do these two objects have in common?</html>"));
		chap1question.add(new JLabel("<html>Which property do these three objects have in common?</html>"));
		chap1question.add(new JLabel("<html>Which is smoother?"));
		chap1question.add(new JLabel("<html>Which property do these four objects have in common?</html>"));
		chap1question.get(0).setFont(new Font("Arial", 10, 12));
		
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
		chap1choice[0][0]=new JButton("soft");
		chap1choice[0][1]=chap1correct.get(0);
		chap1choice[1][0]=chap1correct.get(1);
		chap1choice[1][1]=new JButton("yellow");
		chap1choice[2][0]=new JButton("slippery");
		chap1choice[2][1]=new JButton("translucent");
		chap1choice[2][2]=chap1correct.get(2);
		chap1choice[3][0]=chap1correct.get(3);
		chap1choice[3][1]=new JButton("bark");
		chap1choice[4][0]=new JButton("sticky");
		chap1choice[4][1]=chap1correct.get(4);
		chap1choice[4][2]=new JButton("sweet");
		
		
		chap1remember.add(new JLabel("<html>An object has different properties. "
				+ "A property of an object can tell you how it looks, feels, tastes, or smells. "
				+ "Properties can also tell you how an object will behave when something happens to it.</html>"));
		chap1remember.add(new JLabel("<html>An object has different properties.<br>"
				+ "<html>A property of an object can tell you how it looks, feels, tastes, or smells.<br>"
				+ "<html>Different objects can have the same properties. You can use these properties to put objects into groups.</html>"));
		chap1remember.add(new JLabel("<html>An object has different properties. "
				+ "A property of an object can tell you how it looks, feels, tastes, or smells. "
				+ "Properties can also tell you how an object will behave when something happens to it.<br>"
				+ "Different objects can have properties in common. You can use these properties to put objects into groups. "
				+ "Grouping objects by their properties is called classification."));
		chap1remember.add(new JLabel("<html>Every object is made of one or more materials. "
				+ "A material is a type of matter. Wood, glass, metal, and plastic are common materials.<br>"
				+ "A material has different properties. A material's properties tell you how it looks, feels, tastes, or smells. "
				+ "Some examples of properties are shiny, hard, fragile, and stretchy."
				+ "For example, a shiny material reflects a lot of light. "
				+ "A fragile material breaks when you drop it.</html>"));
		chap1remember.add(new JLabel("<html>An object has different properties. "
				+ "A property of an object can tell you how it looks, feels, tastes, or smells. "
				+ "Properties can also tell you how an object will behave when something happens to it.<br>"
				+ "Different objects can have properties in common. "
				+ "You can use these properties to put objects into groups. "
				+ "Grouping objects by their properties is called classification.</html>"));
		
		chap1solve.add(new JLabel("<html>Thinks about each property.<br>"
				+ "A soft object changes shape when pressed or squeezed. The tree bark is not soft.<br>"
				+ "A bumpy object is covered in lumps and bumps. The tree bark is bumpy.</html>"));
		chap1solve.add(new JLabel("<html>For each object, decide if it has that property.<br>"
				+ "A bouncy object will bounce back from the floor if you drop it. Both objects are bouncy.<br>"
				+ "Yellow is a color.  This color is yellow. The spring is not yellow.<br>"
				+ "The property that both objects have in common is bouncy.\n</html>"));
		chap1solve.add(new JLabel("<html>For each object, decide if it has that property.<br>"
				+ "A slippery object is hard to hold onto or stand on. None of the objects are slippery.<br>"
				+ "A translucent object lets light through. But you cannot see clearly through a translucent object. "
				+ "The fries and the cracker are not translucent.<br>"
				+ "Potato chips have a salty taste. All three objects are salty.<br>"
				+ "The property that all three objects have in common is salty.</html>"));
		chap1solve.add(new JLabel("<html>Smooth is a property. A smooth material is not rough or bumpy.<br>"
				+ "Look at each picture, one at a time. Imagine touching the material shown in each picture.<br>"
				+ "Of the choices, the nylon track suit is smoother. If you touch nylon fabric, it will not feel rough.</html>"));
		chap1solve.add(new JLabel("<html>For each object, decide if it has that property.<br>"
				+ "A sticky object can attach or stick to other things. The jello is sticky, but the marbles are not.<br>"
				+ "A translucent object lets light through. But you cannot see clearly through a translucent object. All four objects are translucent.<br>"
				+ "Sugar has a sweet taste. The jello is sweet, but the marbles and the icicle are not.<br>"
				+ "The property that all four objects have in common is translucent.</html>"));
		
	
	}
	
	public static void main(String[] args) {
		new Questions();
	}

	public ArrayList<JLabel> getChap1question() {
		return chap1question;
	}

	public void setChap1question(ArrayList<JLabel> chap1question) {
		this.chap1question = chap1question;
	}

	public ArrayList<JLabel> getChap1remember() {
		return chap1remember;
	}

	public void setChap1remember(ArrayList<JLabel> chap1remember) {
		this.chap1remember = chap1remember;
	}

	public ArrayList<JLabel> getChap1solve() {
		return chap1solve;
	}

	public void setChap1solve(ArrayList<JLabel> chap1solve) {
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
	
	

}
