package chapter05.cirlce;

import chapter05.cirlce.Circle;

public class Circle_test {

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
