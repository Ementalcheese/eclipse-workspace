package arraytest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		
		//배열 원소의 평균 구하기.
		
		
		int intArray[] = new int[5];
		int sum=0;
		
		Scanner scr = new Scanner(System.in);
		System.out.println(intArray.length + "개의 정수를 입력하세요");
		for(int i = 0; i < intArray.length; i++)
			intArray[i] = scr.nextInt();
		
		for(int i=0; i<intArray.length; i++)
			sum+=intArray[i];
		
		System.out.println("평균은"+(double)sum/intArray.length);
		scr.close();
		
	}

}
