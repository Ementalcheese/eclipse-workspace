package arraytest;

public class Test4 {

	public static void main(String[] args) {
		
		//2���� �迭�� 4�� ���� ���ϱ�
		
		double score[][] = {{3.3,3.4},   //1-1,2 ����
			            	{3.5,3.6},   //2-1,2 ����
			            	{3.7,4.0},   //3-1,2
			            	{4.1,4.2}};  //4-1,2
		
		double sum = 0;
		for(int year = 0; year < score.length; year++)           //�� �г⺰�� �ݺ�
			for(int term=0; term < score[year].length; term++)   //�� �г��� �б⺰�� �ݺ�
				sum += score[year][term];                        //��ü ���� ��
		
		int n = score.length;         //�迭�� �� ���� 4
		int m = score[0].length;      //�迭�� �� ���� 2
		System.out.println("4�� ��ü ���� �����" + sum/(n*m));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}                     

}
