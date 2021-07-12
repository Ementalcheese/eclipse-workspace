package arraytest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//배열에 입력받은 수 중 제일 큰 수 찾기.
		
		
		Scanner scr = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		int max = 0;
		
		System.out.println("양수를 5개 입력하시오.");
		
		for(int i=0; i<5; i++)
		{
			intArray[i] = scr.nextInt();
			if(intArray[i]>max)   max = intArray[i];
		}
		
		
		System.out.println("가장 큰수는 :" + max + " 입니다.");
		scr.close();
	}
	
}
