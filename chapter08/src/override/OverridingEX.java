package override;

class Shape                             //슈퍼클래스
{
	public Shape next;
	public Shape() {
		next = null;
	}
	
	public void drow() {
		System.out.println("Shape");
	}
}
	class Line extends Shape {
		public void drow() {            //메소드 재정의 (메소드 오버라이딩)
			System.out.println("Line");
		}
	}
	class Rect extends Shape {
		public void drow() {            //메소드 오버라이딩
			System.out.println("Rect");
		}
			}
	class Circle extends Shape {
		public void drow() {            //메소드 오버라이딩
			System.out.println("Circle");
		}
	}
	

public class OverridingEX {

	static void paint(Shape p)
	{
		p.drow();
	}
	
	
	public static void main(String[] args) {
		
		Line line = new Line();
		paint(line);
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	
	
	}

}
