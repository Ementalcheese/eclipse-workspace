package chapter05;
import java.util.Scanner;
public class Rectangle {
	
	int width;
	int height;
	
	public int getArea()
	{
		
		return width * height;
	}
	
	

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�ʺ��Է�");
		
		rect.width = scn.nextInt();
		
		System.out.println("�����Է�");
		
		rect.height = scn.nextInt();
		
		System.out.println("�簢���� ������ " + rect.getArea());
		
		scn.close();
		
		
	}

}
