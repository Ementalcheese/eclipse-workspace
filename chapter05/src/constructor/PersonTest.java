package constructor;

public class PersonTest {

	public static void main(String[] args) {

		Person personLee = new Person(); //�⺻������ ȣ��
		personLee.name = "Thomas";
		
		Person personPark = new Person("��ġ��");
		
		System.out.println(personLee.name);
		
		Person personKim = new Person();
		personKim.name = "������";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		Person personKang = new Person("������",190,100);
		
	}

}
