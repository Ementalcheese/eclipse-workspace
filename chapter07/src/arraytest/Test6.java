package arraytest;

public class Test6 {
	
	            //�迭 ����
			//���� 4���� ������ 1���� �迭�� �����ϰ� 1,2,3,4�� �ʱ�ȭ �� ����.
			//�迭�� �����ϴ� makeArray()�� �ۼ��ϰ�, �� �޼ҵ�κ��� �迭�� ���޹޾� ���� ����ϴ� ���α׷��� �ۼ��϶�.
	
	static int[] makeArray()     //������ �迭�� �����ϴ� �޼���
	{
		int temp[] = new int[4]; //�迭 ����
		for(int i = 0; i < temp.length; i++)
			temp[i] = i+1; //�迭�� ���Ҹ� 1,2,3,4 ���� �ʱ�ȭ
		return temp; //�迭����
	}

	public static void main(String[] args) {
		
		int intArray[]; // �迭 ���۷��� ���� ����
		intArray = makeArray();//�޼���κ��� �迭 ���޹���
		for(int i = 0; i<intArray.length; i++)
			System.out.println(intArray[i] + "");//�迭 ��� ���� ���
		
	
		
	}

}
