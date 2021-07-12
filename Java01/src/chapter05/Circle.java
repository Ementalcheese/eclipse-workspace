package chapter05;

public class Circle {

	int radius; // 원의 반지름
	String name;
	public Circle() {}          //circle 클래스의 기본생성자 , 클래스명과 동일한 이름의 메소드
	                            //인풋매개변수,실행부가 없는 생성자 :기본 생성자,기본생성자는 생략 가능
	
	public double getArea()
	{
	
		return 3.14 * radius * radius;	
	}
	
	public static void main(String[] args) {
		
		Circle pizza;
		pizza = new Circle();               //circle 객체 생성 레퍼런스 이름 pizza
		pizza.radius = 10;                  //pizza의 반지름을 10으로
		pizza.name = "자바 피자";             //피자의 name을 설정
		double area = pizza.getArea();      //피자의 면적 (getArea() 를 호출해서 area 변수에 할당
		System.out.println(pizza.name + "의 면적은 : " + area );
		
		
		
		Circle donut = new Circle();   
		                   //생성자
		donut.radius =2;
		donut.name = "자바 도넛";
		double area2 = donut.getArea();
		System.out.println(donut.name + "의 면적은 :" + area2);
		
		
		
		
		
		
		
		
		
	}

}
