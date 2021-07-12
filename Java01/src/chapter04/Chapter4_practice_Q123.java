package chapter04;

import java.util.Scanner;

public class Chapter4_practice_Q123 {

	public static void main(String[] args) {

		
		//Q1
		
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		
		System.out.println("연산자를 입력하세요. 예)+,-,*,/");
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();     //문자열을 받아서 S 변수에 할당
		char operator = S.charAt(0); //첫번째 문자를 char 형인 operator에 저장
		
		
		
		if( operator == '+') {
				result = num1 + num2;
		}
		
		else if (operator == '-') {
			System.out.println(num1-num2);
		}
		else if(operator == '*') {
			System.out.println(num1*num2);
		}
		else if(operator =='/') {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("연산자 오류");
		}
		
		System.out.println(result);
		
		System.out.println();
		
		switch(operator)
		{
			case'+': {
				System.out.println(num1+num2);
				break;
			}
			case'=':{
				System.out.println(num1-num2);
				break;
			}
			case'*':{
				System.out.println(num1*num2);
				break;
			}
			case'/':{
				System.out.println(num1/num2);
				break;
			}
			default :{
				System.out.println("연산자 오류");
			}
			
		}
		
		scanner.close();
		/////////////////////////////////////////////////////
		System.out.println();
		//Q2
		
		int dan;
	    int i;
	    
	    for(dan=2; dan <=9; ++dan)
	    {
	    	if(dan % 2 != 0)
	    		continue;
	    	for(i=1; i <=9; ++i)
	    	{
	    		System.out.println( dan + "*" + i + "=" + dan*i );
	    	}
	    	
	    	System.out.println();
	    }
	    
		///////////////////////////////////////////////////////////////
	    //Q3
	    
	    System.out.println();
	    int dan2;
	    int i2;
	    
	    for(dan2=2; dan2 <=9; ++dan2)
	    {
	    	
	    	for(i2=1; i2 <=9; ++i2)
	    	{
	    		if(dan2 < i2)
		    		break;
	    		System.out.println( dan2 + "*" + i2 + "=" + dan2*i2 );
	    	}
	    	
	    	System.out.println();
	    }
	    
	    
		
		
	}

}
