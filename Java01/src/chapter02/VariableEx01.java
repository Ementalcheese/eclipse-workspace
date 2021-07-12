package chapter02;

public class VariableEx01 {

	public static void main(String[] args) {

		// 변수이름 정하기
		// 영문자 대,소문자, 숫자,특수문자 _,$ 사용가능
		// 숫자로 시작 할 수는 없다.

		int a_name;
		int A_name;
		int _name;
		int $_name;
		// int 1_name; 숫자 시작시 에러
		// int int; 자바에서 사용중인 예약어 x
		

		int level; // 변수를 선언 후 값을 할당.
		level = 10;
		level = 50;
		level = 1000;

		System.out.println(level);

		int level2 = 20; // 선언과 동시에 값을 할당.
		level2 = 100;
		level2 = 2000;

		level = level2;

		System.out.println(level);
		System.out.println(level2);
	}

}
