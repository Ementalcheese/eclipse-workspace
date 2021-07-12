package chapter03;

public class OperatorEx11 {

	public static void main(String[] args) {

		//조건 연산자
		//조건식 ? 결과1 : 결과2 = 조건식이 참이면 결과1, 거짓이면 결과2가 선택 ex. int num = (5>3) ? 10 : 20;  num=10
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;		
		ch = (fatherAge > motherAge ) ? 'T' : 'F' ;
		System.out.println(ch);
		
		int num = 10;
		boolean isEven;
		
		isEven = (num % 2 == 0) ? true : false;
		System.out.println(isEven);
		
	}

}
