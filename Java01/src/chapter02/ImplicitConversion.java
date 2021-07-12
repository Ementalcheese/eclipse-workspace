package chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {

		
		// 묵시적 형변환: 크기가 작은 자료형에서 큰 자로형으로 , 덜 정밀한 수(정수)에서 더 정밀한 수(실수)로
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
