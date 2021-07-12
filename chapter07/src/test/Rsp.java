package test;

import java.util.Scanner;

public class Rsp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		String game= "";
		
		String str[] = {"가위", "바위", "보"};
		boolean trigger = true ;
		
		while(trigger)
		{
			System.out.println("입력 가위 바위 보 or 그만");
			game = scr.next();
			int n = (int)(Math.random()*3);
			
			if (game.equals("그만")) 
			{
				System.out.println("게임을 종료합니다");
				//trigger = false;
				break;
			}

			else if (game.equals("가위") || game.equals("바위") || game.equals("보")) 
			{
				
				System.out.println("사용자 : " + game);
				System.out.println("컴퓨터 : " + str[n]);
				
				if (str[n].equals(game)) 
				{
					System.out.println("비겼습니다");
				}

				else if (str[n].equals("가위"))
				{
					if (game.equals("바위"))
						System.out.println("사용자가 이겼습니다");
					else
						System.out.println("컴퓨터가 이겼습니다");
				}

				else if (str[n].equals("바위")) 
				{
					if (game.equals("보"))
						System.out.println("사용자가 이겼습니다");
					else
						System.out.println("컴퓨터가 이겼습니다");
				}

				else if (str[n].equals("보")) 
				{
					if (game.equals("가위"))
						System.out.println("사용자가 이겼습니다");
					else
						System.out.println("컴퓨터가 이겼습니다");
				}
			}

				else
					  System.out.println("입력오류");

		}
		
		scr.close();
	}

}
