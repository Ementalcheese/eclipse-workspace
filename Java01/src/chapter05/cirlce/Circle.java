package chapter05.cirlce;

public class Circle {
	

	int radius; // 원의 반지름
	String name;
	public Circle() {}          //circle 클래스의 기본생성자 , 클래스명과 동일한 이름의 메소드
	                            //인풋매개변수,실행부가 없는 생성자 :기본 생성자,기본생성자는 생략 가능
	
	public double getArea()
	{
	
		return 3.14 * radius * radius;
	}

}
