package chapter02;

public class ByteVariableEx01 {

	public static void main(String[] args) {
		
		/*
		      ������  ������ �Ǽ��� ����
		1����Ʈ byte             boolean
		2����Ʈ short char
		4����Ʈ int        float
		8����Ʈ long       double
	
		*/
		

		byte num; // byte : 1byte (-2^7 ~ 2^7-1 = -128 ~ 127)
		// num = -129; ����
		num = -128;

		byte num2;
		// num2 = 128; ����
		num2 = 127;

		short nShort = -32768; // short : 2byte (-2^15 ~ 2^15-1)
		short nShort2 = 32767; // -32768 ~ 32767

		int nInt = 2147483647; // int : 4byte (-2^31 ~ 2~31 -1)
		int nInt2= -2147483648;

		long nLong = 2200000000L; // ���� �ڿ� L
								  // long : 8byte (-2^63~2^63-1)

		System.out.println(num);
		System.out.println(num2);

		System.out.println(nShort);
		System.out.println(nShort2);
	}

}
