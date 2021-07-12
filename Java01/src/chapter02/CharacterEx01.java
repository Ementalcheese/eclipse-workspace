package chapter02;

public class CharacterEx01 {

	public static void main(String[] args) {

		/*
		 * 
		'A' -> 65 문자를 코드로 = 문자 인코딩
		아스키코드 영문,숫자,특수문자 등 1바이트
		유니코드 2바이트
		
		65 -> 'A' 코드를 문자로 = 문자 디코딩
		
	    */
		
		
		char ch1 = 'A';
		System.out.println(ch1); // 문자 출력
		System.out.println((int) ch1); // 문자에 해당하는 정수 값(아스키코드) 출력

		char ch2 = 66; // 정수 값 대입
		System.out.println(ch2); // 정수 값에 해당하는 문자 출력

		int ch3 = 67;
		System.out.println(ch3); // 문자 정수 값 출력
		System.out.println((char) ch3); // 정수 값에 해당하는 문자 출력

	}

}
