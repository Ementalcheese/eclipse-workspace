package singleton;

public class Company {
	
	
	private static Company instance = new Company();
	private Company(){} //company ��ü�� new Ű���带 ���ؼ� �������� ���ϵ��� ����
	
	public static Company getInstance() {
		
		if(instance == null)
		{
			instance = new Company();
		}
		return instance;
	}
	
}