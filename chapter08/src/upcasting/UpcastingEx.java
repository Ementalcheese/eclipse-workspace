package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("홍길동");
		
		
		
		//Student ppp = new Person("마이콜"); // 컴파일에러 부모클래스를 생성할때 하위 클래스로 선언 할 순 없다.  
		
		
		p = s;      //업캐스팅 p = (Person)s; <- 업캐스팅 할때에는 Person 자료형을 명시하지 않아도 
		                                      //묵시적으로 적용
		Person pp = new Student("둘리"); //하위클래스로 인스턴스를 생성할 떄 부모클래스의 자료형으로 형변환 하여 선언가능.
		
	//	pp.grade = "A";
		
		
		System.out.println(p.name);
		
	//	p.grade = "A";         //컴파일 오류 student의 멤버변수
	//	p.department = "HR";   //컴파일 오류 student의 멤버변수
		p.name = "이순신";
		p.id = "ID";
		
		s.grade = "A";
		s.department = "HR";
	    s.id = "ID";
		s.name="고길동";
		
		
		
	}

}
