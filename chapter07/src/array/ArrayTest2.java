package array;

public class ArrayTest2 {
	public static void main(String[] args) {

		double[] data = new double[5]; //�迭 ����
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		
		for (int i = 0; i < data.length; i++)
		{
			System.out.println(data[i]);
		}
		
		
		int[] data2 = new int[] {1,2,3,4,5};  //����� ���ÿ� �ʱ�ȭ.
		
		for (int i = 0; i < data2.length; i++)
		{
			System.out.println(data2[i]);
		}
		
		int [] studentIDs = new int [] {10,20,30}; //���� ����
	//	int [] studentIDs = new int [3]; //�����߻�
		int [] studentIDs2 = {102,102,103}; //int�� ��Ұ� 3���� �迭 ����
		
		int[] studentsIDs; // �迭 �ڷ��� ����
		studentIDs = new int[] {101,102,103}; //new int[]�� ������ �� ����
		
		
		
		
	}
}
