package chapter05.cirlce;

import chapter05.cirlce.Circle;

public class Circle_test {

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();               //circle ��ü ���� ���۷��� �̸� pizza
		pizza.radius = 10;                  //pizza�� �������� 10����
		pizza.name = "�ڹ� ����";             //������ name�� ����
		double area = pizza.getArea();      //������ ���� (getArea() �� ȣ���ؼ� area ������ �Ҵ�
		System.out.println(pizza.name + "�� ������ : " + area );
		
		
		
		Circle donut = new Circle();   
		                   //������
		donut.radius =2;
		donut.name = "�ڹ� ����";
		double area2 = donut.getArea();
		System.out.println(donut.name + "�� ������ :" + area2);
	}

}
