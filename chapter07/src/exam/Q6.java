package exam;

public class Q6 {

	public static void main(String[] args) {
		
		int[] arr  = {4,5,1,2,3};
		
		int nTmp = 0;
		int nMax = 0;
		
		for(int i = 0 ; i < arr.length ; ++i)
		{
			
		 nMax = arr[i+1];
			
			if(arr[i] < nMax)
			{
				
			
				nTmp = arr[i];
				arr[i] = nMax;
				nMax = nTmp;
				
			
				
			}
			
		}
		
		for(int i = 0; i < 5 ; ++i)
		{
			System.out.print(arr[i]);
		}
		
		
	}

}
