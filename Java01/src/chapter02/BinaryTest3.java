package chapter02;

public class BinaryTest3 {

	public static void main(String[] args) {

		int num1 = 0B00000000000000000000000001000110;
		int num2 = 0b11111111111111111111111110111010;
		
		int sum = num1+num2;
		//0100 0110
		
		//1011 1001
		//0000 0001
		
		//1011 1010
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
	}

}
