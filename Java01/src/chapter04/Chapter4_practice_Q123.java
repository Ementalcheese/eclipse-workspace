package chapter04;

import java.util.Scanner;

public class Chapter4_practice_Q123 {

	public static void main(String[] args) {

		
		//Q1
		
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		
		System.out.println("�����ڸ� �Է��ϼ���. ��)+,-,*,/");
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();     //���ڿ��� �޾Ƽ� S ������ �Ҵ�
		char operator = S.charAt(0); //ù��° ���ڸ� char ���� operator�� ����
		
		
		
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
			System.out.println("������ ����");
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
				System.out.println("������ ����");
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
