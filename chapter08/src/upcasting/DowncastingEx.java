package upcasting;


public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("홍길동"); // 업캐스팅
		Student s;
		
		Person pp = new Person("고길동");
		
		
		s = (Student)p; //다운 캐스팅, 반드시 자료형을 명시
		
		System.out.println(p.name);
		s.grade = "A";
		
		
		
		
		
		
		
	}

}
