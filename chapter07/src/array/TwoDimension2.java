package array;

public class TwoDimension2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		//int[][] arr = {{10,20,30},{40,50,60}};
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++ )
			{
		//		System.out.println(arr[i][j]);
			}
			
		}
		
		
		//System.out.println(arr.length);
		//System.out.println(arr[0].length);
		
		
		char [][] aArr = new char[13][2];
		char alp ='a';
		
		for(int i = 0; i < aArr.length; i++)
		{
			for(int j = 0; j < aArr[i].length; j++ )
			{
		     	aArr[i][j] = alp++;
			}
			System.out.println(aArr[i][0] + "," +aArr[i][1]);
		}
		
		
		int[][] arr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		long nTotal = 1;
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++ )
			{
				nTotal *= arr2[i][j];
				System.out.println(arr2[i][j]);
			}
			
			System.out.println(nTotal);
		}
		
		
		
		System.out.println("°öÇÑ°ª :" + nTotal);

		
		
		
	}

}
