package inheritance;

public class ColorPoint extends Point {
	
	private String color;
	
	// public ColorPoint (){} //생략되어 있는 기본 생성자.
	
	public void setColor (String color)
	{
		this.color = color;
	}
	
	public void showColorPoint()
	{
		System.out.println(color);
		showPoint();               //point 클래스의 메서드 호출
	}
	
	
	
	
	

}
