package chapter03;

public class OperatorPractice {

	public static void main(String[] args) {
		
		int num;
		num = -5 + 3 * 10 /2;
		System.out.println(num); //10
		
		///////////////////////////////////////////////////
		
		num = 10;
		
		System.out.println(num); //10
		System.out.println(num++);// 10
		System.out.println(num); //11
		System.out.println(--num); //10

		////////////////////////////////////////////////////
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10 )); //false
		System.out.println(result);
		result = ((num1 > 20 ) || (num2 > 10));
		
		System.out.println(result); //true
		System.out.println(!result); //false
		
		////////////////////////////////////////////////////
		
		num1 = 2;  //0000 0010
		num2 = 10; //0000 1010
		
		           //0000 0010 & 
		           //0000 1010 |
		           //0000 1000 ^ 
		
		System.out.println(num1 & num2); //2
		System.out.println(num1 | num2); //10
		System.out.println(num1 ^ num2); //8
		System.out.println(~num1); //-3
		
		/////////////////////////////////////////////////////
		
		num = 8;
		
		System.out.println(num += 10);// 18
		
		System.out.println(num -= 10); //8
		System.out.println(num >>= 2); //0000 1000 >>2
		                               //0000 0010 = 2
		
		/////////////////////////////////////////////////////
		
		num = 10;
		num2 = 20;
		
		int resultInt = (num >= 10) ? num2 + 10 : num2 - 10;
		System.out.println(resultInt); //30
		
		
		
		
		
		
	}

}
