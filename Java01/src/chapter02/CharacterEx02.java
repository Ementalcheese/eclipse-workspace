package chapter02;

public class CharacterEx02 {

	public static void main(String[] args) {

		char ch1 = '한';
		char ch2 = '\uD55C'; //유니코드값
		
		char ch3 = '\uAE00';
		char ch4 = '\uB3C8';
		
		//char ch5 = -65; 문자형변수에 음수를 넣으면 오류
		char ch6 = 65;

		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}

}
