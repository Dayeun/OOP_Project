package MonoPoly_team8_OOPproject;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameHandler implements ActionListener{

	boolean gameOver;
	Character myCharacter;
	Board myBoard;

	
	public Character createCharacter(String name, Image c){
		return myCharacter= new Character(name, c);
		
	}
	
	
	public Board createBoard(int size){
		return myBoard= new Board(size);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
