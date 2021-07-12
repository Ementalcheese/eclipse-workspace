package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
	int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		
		int money;
		
		System.out.println("금액을 입력하세요");
			
			money = scr.nextInt();
			int x= 0;
			int y=0;
			
			
		for(int i=0; i<unit.length; i++)
		{
			System.out.println(unit[i]+"원 짜리"+money/unit[i] +"개");
			money -= money/unit[i] * unit[i];
			System.out.println(money);
			
		}
		
	


}
}
