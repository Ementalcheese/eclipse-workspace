package chapter04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		System.out.println("�̸�,����,����,ü��,���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);// 2.scanner ��ü���� / ctrl+shft+o ����Ʈ ����Ű
		
		String name = scanner.next(); // ���ڿ� �б� 3.Scanner ���� ���� ���� ������ �Ҵ�.
		System.out.println("�̸��� " + name + ",");
		
		String city = scanner.next();
		System.out.println("���ô� "+ city +", ");
		
		int age = scanner.nextInt();
		System.out.println("���̴� "+age+"��, ");
		
		double weight = scanner.nextDouble();
		System.out.println("ü���� "+weight+"kg, ");
		
		boolean single = scanner.nextBoolean();
		System.out.println("���ſ��δ� "+single+" �Դϴ�.");
		
		/////////////////////////////
		String S =scanner.next();
		char operator = S.charAt(0);
		
		
		
		scanner.close(); //scanner �ݱ�
		
		
		

		
	}

}
