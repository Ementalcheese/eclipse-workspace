package chapter02;

public class ExplicitConversion {

	public static void main(String[] args) {

		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		System.out.println((int)fNum2);
		
		int iNum3 = (int)dNum1 + (int)fNum2; //�� �Ǽ��� ���� ����ȯ�Ǿ� ������
		int iNum4 = (int)(dNum1+fNum2);      //�� �Ǽ��� ���� ���� ���ǰ� ����ȯ.
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
		
	}

}