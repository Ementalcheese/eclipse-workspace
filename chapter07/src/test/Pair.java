package test;

import java.util.Scanner;

public class Pair {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int i = 0;
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"}; 
		int score[]  = {95, 88, 76, 62, 55}; 
		boolean trigger = true;
		
		
		while(trigger)
		{
			System.out.println("���� �̸� �Է� ���Ḧ ���ҽ� '�׸�'�Է�");
			String name =scr.next();
			
			
			for(i=0; i<5; i++)
			{
				if(course[i].equals(name))
				{
					System.out.println("�����̸� :" + name);
					System.out.println(name + "�� ������ : " + score[i]);
					break;
				}
				else if(name.equals("�׸�"))
				{
					System.out.println( name);
					trigger = false;
					break;
				}
			}
			if (i >= 5) System.out.println("���� ���� �Դϴ�");
		}
		
		scr.close();

	}

}