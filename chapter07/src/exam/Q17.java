package exam;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위","바위","보"};
		
		String userSelect ,comSelect = "";
		int n;
		
		System.out.println();
		
		do 
		{
			System.out.println("가위 바위 보");
			userSelect = sc.next();
			
			if(userSelect.equals("그만")) break;
			n = (int)(Math.random()*3);
			comSelect=str[n];
			
			
			
			
			
			
			
		}
		while(true)
		{
			
		}
		
		
		
		sc.close();
	}

}
