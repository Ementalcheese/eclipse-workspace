package constructor;

public class PersonTest {

	public static void main(String[] args) {

		Person personLee = new Person(); //기본생성자 호출
		personLee.name = "Thomas";
		
		Person personPark = new Person("박치기");
		
		System.out.println(personLee.name);
		
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		Person personKang = new Person("강감찬",190,100);
		
	}

}
