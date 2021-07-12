package chapter04;

public class Loop_for_example01 {

	public static void main(String[] args) {
		
		int i;
		int sum = 0 ;
		
		for ( i = 0; i < 10; i++ ) {
			
			sum += (i+1);
			System.out.println("i :" + i);
			System.out.println("sum :" + sum);
			
		}
		System.out.println(sum);
		System.out.println(i);
		
	}

}
