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
		
		System.out.println("너비입력");
		
		rect.width = scn.nextInt();
		
		System.out.println("높이입력");
		
		rect.height = scn.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scn.close();
		
		
	}

}
