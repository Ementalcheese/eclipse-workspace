package test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String text ;
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"}; 
		int score[]  = {95, 88, 76, 62, 55}; 
		String stop = "�׸�";
		/*
		�׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�. "�׸�"�� �Է¹����� �����Ѵ�. (Java�� �ε��� 0�� �����Ƿ� score[0]�� ���) 

		���� �̸� >> Jaba 
		���� �����Դϴ�. 
		���� �̸� >> Java 
		Java�� ������ 95 
		���� �̸� >> �ȵ���̵� 
		�ȵ���̵��� ������ 55 
		���� �̸� >> �׸� 

		[Hint] ���ڿ��� ���ϱ� ���ؼ��� String Ŭ������ equals()�޼ҵ带 �̿��ؾ� �Ѵ�. 

		String name; 
		if(course[i].equals(name)) { 
		    int n = score[i]; 
		    ... 
		} 
		*/
		
		
		while(true)
		{
			System.out.println("���� �Է�, �׸� ����");
			text = scr.next();
			//int i = scr.nextInt();
			System.out.println(text);
			
			if(text.equals(stop)) break;
			
			
			
			
			
			
			
		}
		
	}

}
