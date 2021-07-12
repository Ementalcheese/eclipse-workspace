package chapter03;

public class OperatorEx09 {

	public static void main(String[] args) {

		
		// 단락회로 (쇼트서킷)
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10 ) && ((i = i + 2 ) < 10);
		                                              //논리곱에서 앞 항의 결과 값이 거짓이므로 실행 x
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) > 10) || ((i = i + 2 ) < 10);
		                                       // 논리 합에서 앞항의 결과가 참이므로 실행 x
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
