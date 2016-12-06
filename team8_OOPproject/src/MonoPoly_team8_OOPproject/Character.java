package MonoPoly_team8_OOPproject;

import java.awt.Image;

public class Character implements Movable{

	private String name;
	private Image character;
	int[][] currentLocation;
	
	
	
	public Character(String name, Image c){
		this.name=name;
		this.character=c;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Image getCharacter() {
		return character;
	}

	public void setCharacter(Image character) {
		this.character = character;
	}

	public int[][] getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(int[][] currentLocation) {
		this.currentLocation = currentLocation;
	}

	
	@Override
	public void move_right(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move_left(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move_up(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move_down(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move_right() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
}
