package q;

public class ViMethod {

	int num;
	void aaa()                                       // �ڹ��� Ŭ������ ��� ������ �޼���� �̷���� �ִ�
	 												 // Ŭ������ �����Ͽ� �ν��Ͻ��� ��������� ��������� �� �޸𸮿� ��ġ�Ѵ�
	{                                                // main �Լ��� ����Ǹ� ���������� ���ø޸𸮿�, �޼����� ���� ������ �޼��� ������ ��ġ�Ѵ�.
		System.out.println("aaa() ���");             // �޼��带 ȣ���ϸ� �޼��� ������ �ּҸ� �����Ͽ� ������ ����ȴ�. ���� �ν��Ͻ��� �޶�� ������ �޼��尡 ȣ��ȴ�
	}
	
	void aaa2()
	{
		System.out.println("aaa2");
	}
	

	
	
	public static void main(String[] args) {
		
	 ViMethod v1 = new ViMethod();
	 v1.aaa();
	 v1.aaa2();
	 
	 ViMethod v2 = new ViMethod2();
	 v2.aaa();
	 v2.aaa2();
	 
	 
	 
	 
	 
	 
		
		
		
	}
	


 }