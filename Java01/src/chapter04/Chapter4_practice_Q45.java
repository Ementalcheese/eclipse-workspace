package chapter04;

public class Chapter4_practice_Q45 {

	public static void main(String[] args) {
	
		
		//Q4
		int i,j = 0;
		
		for(i=0; i < 4; ++i)
		{
			for(j=0; j <= 4+i; ++j )
			{
				
				if(i+j > 3) System.out.print("*");
				else         System.out.print(" ");
			}
			
			System.out.println();
			
		}
		
		///////////////////////////////////////////////////////
		//Q5
		
		System.out.println();
		
		int x,y =0;
		
		for(y=0; y < 7; ++y)
		{
			
			if(y < 4)
			{
				for(x=0; x <= 4+y; ++x)
					
				{
				
					if(y+x > 3) System.out.print("*");
					else         System.out.print(" ");
				}
				
				System.out.println();
			}
			
			else
			{
				for(x=0; x<=4+(6-y); ++x)
				{
					
					if(y-x < 3) System.out.print("*");
					else        System.out.print(" ");
					
				}
				System.out.println();
			}
			
		}
		
	}

}
