package inheritance;

public class ColorPoint extends Point {
	
	private String color;
	
	// public ColorPoint (){} //�����Ǿ� �ִ� �⺻ ������.
	
	public void setColor (String color)
	{
		this.color = color;
	}
	
	public void showColorPoint()
	{
		System.out.println(color);
		showPoint();               //point Ŭ������ �޼��� ȣ��
	}
	
	
	
	
	

}