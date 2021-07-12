package chapter02;

public class ByteVariableEx01 {

	public static void main(String[] args) {
		
		/*
		      정수형  문자형 실수형 논리형
		1바이트 byte             boolean
		2바이트 short char
		4바이트 int        float
		8바이트 long       double
	
		*/
		

		byte num; // byte : 1byte (-2^7 ~ 2^7-1 = -128 ~ 127)
		// num = -129; 에러
		num = -128;

		byte num2;
		// num2 = 128; 에러
		num2 = 127;

		short nShort = -32768; // short : 2byte (-2^15 ~ 2^15-1)
		short nShort2 = 32767; // -32768 ~ 32767

		int nInt = 2147483647; // int : 4byte (-2^31 ~ 2~31 -1)
		int nInt2= -2147483648;

		long nLong = 2200000000L; // 숫자 뒤에 L
								  // long : 8byte (-2^63~2^63-1)

		System.out.println(num);
		System.out.println(num2);

		System.out.println(nShort);
		System.out.println(nShort2);
	}

}
