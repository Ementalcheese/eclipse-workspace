package q;

public class ViMethod {

	int num;
	void aaa()                                       // 자바의 클래스는 멤버 변수와 메서드로 이루어져 있다
	 												 // 클래스를 생성하여 인스턴스가 만들어지면 멤버변수는 힙 메모리에 위치한다
	{                                                // main 함수가 실행되면 지역변수는 스택메모리에, 메서드의 명령 집합은 메서드 영역에 위치한다.
		System.out.println("aaa() 출력");             // 메서드를 호출하면 메서드 영역의 주소를 참조하여 명령이 실행된다. 따라서 인스턴스가 달라고 동일한 메서드가 호출된다
	}
	
	void aaa2()
	{
		System.out.println("aaa2");
	}
	

	
	
	public static void main(String[] args) {
		
	 ViMethod v1 = new ViMethod();
	 v1.aaa();
	 v1.aaa2();
	 
	 ViMethod v2 = new ViMethod2();
	 v2.aaa();
	 v2.aaa2();
	 
	 
	 
	 
	 
	 
		
		
		
	}
	


 }
