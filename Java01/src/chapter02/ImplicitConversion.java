package chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {

		
		// ������ ����ȯ: ũ�Ⱑ ���� �ڷ������� ū �ڷ������� , �� ������ ��(����)���� �� ������ ��(�Ǽ�)��
		// byte ->short->int->long  -> float ->double
		//        char
		
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum); // 1byte byte
		System.out.println(iNum); // 4byte int
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2); //int
		System.out.println(fNum);  //float
		
		
		double dNum;
		dNum = fNum + iNum;  // float + int
		System.out.println(dNum); //double
		
		
	}

}
