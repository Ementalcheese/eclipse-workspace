package upcasting;


public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("ȫ�浿"); // ��ĳ����
		Student s;
		
		Person pp = new Person("���浿");
		
		
		s = (Student)p; //�ٿ� ĳ����, �ݵ�� �ڷ����� ����
		
		System.out.println(p.name);
		s.grade = "A";
		
		
		
		
		
		
		
	}

}