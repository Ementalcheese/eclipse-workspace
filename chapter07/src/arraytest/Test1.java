package arraytest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//�迭�� �Է¹��� �� �� ���� ū �� ã��.
		
		
		Scanner scr = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		int max = 0;
		
		System.out.println("����� 5�� �Է��Ͻÿ�.");
		
		for(int i=0; i<5; i++)
		{
			intArray[i] = scr.nextInt();
			if(intArray[i]>max)   max = intArray[i];
		}
		
		
		System.out.println("���� ū���� :" + max + " �Դϴ�.");
		scr.close();
	}
	
}
