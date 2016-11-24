package team8_OOPproject;

public class map {
	int arr[][] = new int[][]{{1, 0, 1, 1 ,1}, {1, 1, 1, 0, 1}};
	public int moveR_Magnet(int x, int y)
	{
		int k =0;
		for(int i =y; i<arr[x].length ; i++){	
			if(arr[x][i] == 0)
				break;
			k++;
		}
		return k;
	}
	
	public int moveL_Magnet(int x, int y)
	{
		int k =0;
		for(int i =y; i >= 0 ; i--){	
			if(arr[x][i] == 0)
				break;
			k++;
		}
		return k;
	}
	
	public int checkGoal(int y, int x){
		if((arr[y][x]) == 2)
			return 1;		
		return 0;
	}
}
