package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
	int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ����
		
		int money;
		
		System.out.println("�ݾ��� �Է��ϼ���");
			
			money = scr.nextInt();
			int x= 0;
			int y=0;
			
			
		for(int i=0; i<unit.length; i++)
		{
			System.out.println(unit[i]+"�� ¥��"+money/unit[i] +"��");
			money -= money/unit[i] * unit[i];
			System.out.println(money);
			
		}
		
	


}
}
