package chapter02;

public class CharacterEx02 {

	public static void main(String[] args) {

		char ch1 = '��';
		char ch2 = '\uD55C'; //�����ڵ尪
		
		char ch3 = '\uAE00';
		char ch4 = '\uB3C8';
		
		//char ch5 = -65; ������������ ������ ������ ����
		char ch6 = 65;

		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}

}
