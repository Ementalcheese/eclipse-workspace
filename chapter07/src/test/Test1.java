package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++ )
			sum += i;
		
		
		System.out.println(sum);
		
		System.out.println("=================================");
		
		
		int star = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j <star; j++)
			{
				System.out.print('*');
			}
		
			star +=1;
			System.out.println();
		}
		
		System.out.println("=================================");
		
		 int[] scores = {1,2,3,4,5,6,7,8,9,10}; 
		 sum = 0;
		 
		 for(int i=0; i < 10; i++)
			 sum += scores[i];
		
		System.out.println(sum);
		
		System.out.println("=================================");
		
		int max = 0; 
		int[] array = {4,5,1,2,3}; 
		
		for(int i =0; i<5; i++)
		 if(max < array[i]) max = array[i];
				
		
		
		System.out.println("max: " + max); 

		System.out.println("=================================");
		
		
		Scanner scr = new Scanner(System.in);
		
		int[] arr = new int [10];
		
		
		System.out.println("양의 정수 10개 입력");
		
		for(int i=0; i<10; i++)
		
		arr[i] = scr.nextInt();
		
		
		for(int i = 0; i<10; i++)
		{
			
			if(arr[i] % 3 == 0)
				System.out.println("3의 배수는 : " + arr[i]);
		}
		
		
		System.out.println("=================================");
		
	
		
		
		
		
		
	}
	

}
