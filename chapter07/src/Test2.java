
public class Test2 {

	public static void main(String[] args) {
		
		int[][] arr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		long nTotal = 1;
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++ )
			{
				nTotal *= arr2[i][j];
				//System.out.println(arr2[i][j]);
			}
			
			
		}
		System.out.println("°öÇÑ°ª :" + nTotal);
	}



}
