package test;

import java.util.Scanner;

public class Rsp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		String game= "";
		
		String str[] = {"����", "����", "��"};
		boolean trigger = true ;
		
		while(trigger)
		{
			System.out.println("�Է� ���� ���� �� or �׸�");
			game = scr.next();
			int n = (int)(Math.random()*3);
			
			if (game.equals("�׸�")) 
			{
				System.out.println("������ �����մϴ�");
				//trigger = false;
				break;
			}

			else if (game.equals("����") || game.equals("����") || game.equals("��")) 
			{
				
				System.out.println("����� : " + game);
				System.out.println("��ǻ�� : " + str[n]);
				
				if (str[n].equals(game)) 
				{
					System.out.println("�����ϴ�");
				}

				else if (str[n].equals("����"))
				{
					if (game.equals("����"))
						System.out.println("����ڰ� �̰���ϴ�");
					else
						System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}

				else if (str[n].equals("����")) 
				{
					if (game.equals("��"))
						System.out.println("����ڰ� �̰���ϴ�");
					else
						System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}

				else if (str[n].equals("��")) 
				{
					if (game.equals("����"))
						System.out.println("����ڰ� �̰���ϴ�");
					else
						System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
			}

				else
					  System.out.println("�Է¿���");

		}
		
		scr.close();
	}

}