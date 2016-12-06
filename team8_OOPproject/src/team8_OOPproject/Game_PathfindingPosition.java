package team8_OOPproject;

public class Game_PathfindingPosition {
	public int[] CheckPosition(int xpos, int ypos, int rot)
	{
		int[] arr = new int[3];
		arr[0] = (xpos) / 90;
		arr[1] = ((ypos) -250)/ 100;
		arr[2] = (rot %2);
		
		return arr;
	}
	
	public int[] CheckPosition_(int xpos, int ypos, int rot){
		int[] arr = new int[3];
		arr[0] = (xpos) / 90;
		arr[1] = (ypos -250)/ 100;
		arr[2] = (rot %2);
		
		return arr;
	}
}
