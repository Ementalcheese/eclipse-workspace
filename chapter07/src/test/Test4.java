package test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String text ;
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"}; 
		int score[]  = {95, 88, 76, 62, 55}; 
		String stop = "그만";
		/*
		그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. "그만"을 입력받으면 종료한다. (Java는 인덱스 0에 있으므로 score[0]을 출력) 

		과목 이름 >> Jaba 
		없는 과목입니다. 
		과목 이름 >> Java 
		Java의 점수는 95 
		과목 이름 >> 안드로이드 
		안드로이드의 점수는 55 
		과목 이름 >> 그만 

		[Hint] 문자열을 비교하기 위해서는 String 클래스의 equals()메소드를 이용해야 한다. 

		String name; 
		if(course[i].equals(name)) { 
		    int n = score[i]; 
		    ... 
		} 
		*/
		
		
		while(true)
		{
			System.out.println("과목 입력, 그만 종료");
			text = scr.next();
			//int i = scr.nextInt();
			System.out.println(text);
			
			if(text.equals(stop)) break;
			
			
			
			
			
			
			
		}
		
	}

}
