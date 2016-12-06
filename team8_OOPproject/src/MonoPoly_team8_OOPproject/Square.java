package MonoPoly_team8_OOPproject;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Square extends JButton{

	int size = 50;
	Color filled;
	int x, y;
	Quiz quiz;
	boolean leader;
	
	public Square(int x, int y){
			this.x=x;
			this.y=y;
			
			Square s= new Square(10, 10);
			s.
	}
	
	
	
	
	//getters and setters
	public Color getFilled() {
		return filled;
	}
	public void setFilled(Color filled) {
		this.filled = filled;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Quiz getQuiz() {
		return quiz;
	}
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	public boolean isLeader() {
		return leader;
	}
	public void setLeader(boolean leader) {
		this.leader = leader;
	}
	
	
	
	
	
}
