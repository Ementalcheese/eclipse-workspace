
public class Test1 {

	public static void main(String[] args) {
		
		
		int[][] arr2 = new int[4][5];
		int n = 0;
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++ )
			{
				
				arr2[i][j] = ++n;
				
			}
			
			
		}
		
		System.out.println("nÃÖÁ¾:"  + n);
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++ )
			{
				
				System.out.println(arr2[i][j]);
			}
			
			System.out.println();
		}
		
		
	}
		
	
}
