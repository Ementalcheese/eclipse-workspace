package constructor;

public class Person {
	
	String name;
	float height;
	float weight;
	
	public Person () {} //컴파일러가 자동으로 제공하는 디폴트 생성자
	                      //생성자를 직접 추가하면 디폴트 생성자는 만들어지지 않는다.
	public Person(String pname) {
		
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		
		name =pname;
		height = pheight;
		weight = pweight;
	}

}
