package team8_OOPproject;

public class map {	
	public int moveR_Magnet(int x, int y)
	{
		int k =0;
		int arr[][] = new int[][]{{1, 0, 1, 1 ,1}, {1, 1, 1, 0, 1}};
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
		int arr[][] = new int[][]{{1, 0, 1, 1 ,1}, {1, 1, 1, 0, 1}};
		for(int i =y; i >= 0 ; i--){	
			if(arr[x][i] == 0)
				break;
			k++;
		}
		return k;
	}
}
