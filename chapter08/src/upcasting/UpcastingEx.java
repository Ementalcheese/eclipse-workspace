package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("ȫ�浿");
		
		
		
		//Student ppp = new Person("������"); // �����Ͽ��� �θ�Ŭ������ �����Ҷ� ���� Ŭ������ ���� �� �� ����.  
		
		
		p = s;      //��ĳ���� p = (Person)s; <- ��ĳ���� �Ҷ����� Person �ڷ����� �������� �ʾƵ� 
		                                      //���������� ����
		Person pp = new Student("�Ѹ�"); //����Ŭ������ �ν��Ͻ��� ������ �� �θ�Ŭ������ �ڷ������� ����ȯ �Ͽ� ���𰡴�.
		
	//	pp.grade = "A";
		
		
		System.out.println(p.name);
		
	//	p.grade = "A";         //������ ���� student�� �������
	//	p.department = "HR";   //������ ���� student�� �������
		p.name = "�̼���";
		p.id = "ID";
		
		s.grade = "A";
		s.department = "HR";
	    s.id = "ID";
		s.name="���浿";
		
		
		
	}

}