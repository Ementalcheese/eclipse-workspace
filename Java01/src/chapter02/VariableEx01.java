package chapter02;

public class VariableEx01 {

	public static void main(String[] args) {

		// �����̸� ���ϱ�
		// ������ ��,�ҹ���, ����,Ư������ _,$ ��밡��
		// ���ڷ� ���� �� ���� ����.

		int a_name;
		int A_name;
		int _name;
		int $_name;
		// int 1_name; ���� ���۽� ����
		// int int; �ڹٿ��� ������� ����� x
		

		int level; // ������ ���� �� ���� �Ҵ�.
		level = 10;
		level = 50;
		level = 1000;

		System.out.println(level);

		int level2 = 20; // ����� ���ÿ� ���� �Ҵ�.
		level2 = 100;
		level2 = 2000;

		level = level2;

		System.out.println(level);
		System.out.println(level2);
	}

}
