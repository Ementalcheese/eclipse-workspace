package chapter03;

public class OperatorEx11 {

	public static void main(String[] args) {

		//���� ������
		//���ǽ� ? ���1 : ���2 = ���ǽ��� ���̸� ���1, �����̸� ���2�� ���� ex. int num = (5>3) ? 10 : 20;  num=10
		
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
