package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		
		int[] arr = new int [10];
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			sum += arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println("===================");
		System.out.println("Æò±Õ°ª:" + sum / arr.length);
		
		
	
	     System.out.println("===================");
	
	
	
	   
	   }
  
	
}

