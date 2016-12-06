package team8_OOPproject;

public class Pathfinding_map {
	//Path finding map  1 - 'able' 0 -'not able'  2-'goal'
	int arr[][] = new int[][]{{1, 0, 1, 1 ,1}, {1, 1, 1, 0, 2}};
	public int moveR_Magnet(int x, int y)
	{
		int k =0;
		for(int i =y; i<arr[x].length ; i++){	
			if(arr[x][i] == 0)
				break;
			k++;
		}
		return k;  // k = able to move
	}
	
	public int moveL_Magnet(int x, int y)
	{
		int k =0;
		for(int i =y; i >= 0 ; i--){	
			if(arr[x][i] == 0)
				break;
			k++;
		}
		return k; // k = able to move
	}
	
	
	public int checkGoal(int y, int x){		
		if((arr[y][x]) == 2)
			return 1;	// magnet on goal position
		return 0;
	}
	
	public int black_box(int y){
		int x = -1;
		for(int i =0; i<arr[y].length;i++){
			if(arr[y][i] == 0)
				x = i;
		}
		return x;
	}
}
