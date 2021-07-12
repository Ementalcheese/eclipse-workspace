package exam;

public class Q4 {

	public static void main(String[] args) {
		
		int lineCount = 4;
		int starCount = 1;
		
		for(lineCount =0; lineCount < 4; ++lineCount)
		{
			for(starCount = 0; starCount <= lineCount; starCount++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		
	}

}
