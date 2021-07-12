package chapter03;

public class OperatorEx08 {

	public static void main(String[] args) {

		// 논리연산자 !(부정)
		int num1 = 10;
		int num2 = 20;
		
		boolean flag ;
		
		flag = !(num1 > 0 );         // ! (not) : true ==> false, false ==> true
		System.out.println(flag);
		
		flag = !(num2 < 0 );
		System.out.println(flag);
		
		flag = !(num1 > num2 );
		System.out.println(flag);
		
		flag = !(num1 < num2 );
		System.out.println(flag);
		
	}

}
