package chapter03;

public class Operator12 {

	public static void main(String[] args) {

		// ��Ʈ �� ������

		int num1 = 10;
		int num2 = 5;
		
		
		int result = ~num1; //num1 : 00001010
		                   //~num1 : 11110101
		System.out.println(result);
		
		int result2 = num1 & num2;  //00001010
		                            //00000101
		//------------------------------------------
		                            //00000000 &����
		
		
		int result3 = num1 | num2;  //00001010
                                    //00000101
		//------------------------------------------
                                    //00001111 |����
		
		
		int result4 = num1 ^ num2;    //00001010
                                      //00000101
		//------------------------------------------
                                      //00001111 ^����
		
		
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
