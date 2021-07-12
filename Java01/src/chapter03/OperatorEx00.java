package chapter03;

public class OperatorEx00 {

	public static void main(String[] args) {

		// 증가 감소 연산자
		
		int num = 0;
		int val = 0;
		
		val = ++num; // num 값이 먼저 1 증가한 후 val 변수에 대입
		
		System.out.println(val);
		System.out.println(num);
		
		int num1 = 0;
		int val1 = 0;
		
		val1 = num1++; // val 변수에 기존 num값을 먼저 대입한 후 num값 1 증가
		
		System.out.println(val1);
		System.out.println(num1);
		
		
	}

}
