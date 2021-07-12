package chapter03;

public class OperatorEx05 {

	public static void main(String[] args) {

		//관계연산자
		
		int myAge = 27;
		boolean value = (myAge > 23);
		System.out.println(value);
		
		boolean value2 = (myAge < 23 );
		System.out.println(value2);
		
		boolean value3 = (myAge == 23);  // 두 값이 같으면 true
		System.out.println(value3);
		
		boolean value4 = (myAge != 23);  // 두 값이 같지 않으면 true
		System.out.println(value4);
	}

}
