package exam;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����","����","��"};
		
		String userSelect ,comSelect = "";
		int n;
		
		System.out.println();
		
		do 
		{
			System.out.println("���� ���� ��");
			userSelect = sc.next();
			
			if(userSelect.equals("�׸�")) break;
			n = (int)(Math.random()*3);
			comSelect=str[n];
			
			
			
			
			
			
			
		}
		while(true)
		{
			
		}
		
		
		
		sc.close();
	}

}