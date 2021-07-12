package arraytest;

public class Test5 {

	public static void main(String[] args) {
		
		//비정방형 배열의 생성과 접근
		
		// 10 11 12
	  //   20 21              다음 모양과 같은 비정방형 배열을 만들어 값을 초기화하고 출력하시오.
	 	// 30 31 32
		// 40 41
		
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		
		for(int i =0; i<intArray.length; i++)
			for(int j =0; j<intArray[i].length; j++)
				intArray[i][j] = (i+1)*10 + j;
		
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j =0; j < intArray[i].length; j++)
				System.out.println(intArray[i][j] + " ");
		System.out.println();
			
		}
		
		
		
		
		
		
	} 

}
