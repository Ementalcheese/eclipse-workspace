package arraytest;

public class Test5 {

	public static void main(String[] args) {
		
		//�������� �迭�� ������ ����
		
		// 10 11 12
	  //   20 21              ���� ���� ���� �������� �迭�� ����� ���� �ʱ�ȭ�ϰ� ����Ͻÿ�.
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
