package arraytest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		
		//�迭 ������ ��� ���ϱ�.
		
		
		int intArray[] = new int[5];
		int sum=0;
		
		Scanner scr = new Scanner(System.in);
		System.out.println(intArray.length + "���� ������ �Է��ϼ���");
		for(int i = 0; i < intArray.length; i++)
			intArray[i] = scr.nextInt();
		
		for(int i=0; i<intArray.length; i++)
			sum+=intArray[i];
		
		System.out.println("�����"+(double)sum/intArray.length);
		scr.close();
		
	}

}
