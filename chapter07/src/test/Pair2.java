import java.util.Scanner;

public class Pair {

	public static void main(String[] args) {
		
		
		
		Scanner scr = new Scanner(System.in);
		int i = 0;
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"}; 
		int score[]  = {95, 88, 76, 62, 55}; 
		boolean trigger = true;
		
		
		while(trigger)
		{
			System.out.println("과목 이름 입력 종료를 원할시 '그만'입력");
			String name =scr.next();
			
			
			for(i=0; i<5; i++)
			{
				if(course[i].equals(name))
				{
					System.out.println("과목이름 :" + name);
					System.out.println(name + "의 점수는 : " + score[i]);
					break;
				}
				else if(name.equals("그만"))
				{
					System.out.println("과목이름 :" + name);
					trigger = false;
					break;
				}
			}
			if (i >= 5) System.out.println("없는 과목 입니다");
		}
		
		scr.close();
	}
}


