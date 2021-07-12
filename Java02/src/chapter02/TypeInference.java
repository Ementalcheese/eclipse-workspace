package chapter02;

public class TypeInference {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "hello";
		str = "hi";
		//str = 1; 한번 선언한 자료형 변수를 다른 자료형으로 사용할 수 없다.
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		

	}

}
