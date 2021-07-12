package chapter03;

public class OperatorEx01 {
	public static void main(String[] args) {
		
		// 부호 연산자
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(+num1); // 값 10이 그대로 출력.
		System.out.println(-num2); // 값 20에 -가 붙어서 -20이 출력되지만 num2값이 실제로 바뀌진 않음.
		
		System.out.println(num2);
		
		num2 = -num2; //num2 값을 음수로 바꿔서 num에 대입.
		
		System.out.println(num2);
		
		System.out.println();
		
		
		
	}

}
