package chapter04;

public class Loop_while_example {

	public static void main(String[] args) {
		
		int num = 1;   // num : 1~10����
		int sum = 0;   // sum : ���� ����� ���� ����
		
		while (num <= 10) {
			
			sum += num;   // sum = sum + num
			num++;
		
			// 1+2+3+4+5+6+7+8+9+10
			
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
		
		
		}
		
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
		System.out.println(num);
	}

}
