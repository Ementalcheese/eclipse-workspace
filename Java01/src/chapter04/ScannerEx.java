package chapter04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);// 2.scanner 객체생성 / ctrl+shft+o 임포트 단축키
		
		String name = scanner.next(); // 문자열 읽기 3.Scanner 에서 받을 값을 변수에 할당.
		System.out.println("이름은 " + name + ",");
		
		String city = scanner.next();
		System.out.println("도시는 "+ city +", ");
		
		int age = scanner.nextInt();
		System.out.println("나이는 "+age+"살, ");
		
		double weight = scanner.nextDouble();
		System.out.println("체중은 "+weight+"kg, ");
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는 "+single+" 입니다.");
		
		/////////////////////////////
		String S =scanner.next();
		char operator = S.charAt(0);
		
		
		
		scanner.close(); //scanner 닫기
		
		
		

		
	}

}
