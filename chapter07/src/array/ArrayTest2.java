package array;

public class ArrayTest2 {
	public static void main(String[] args) {

		double[] data = new double[5]; //배열 선언
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		
		for (int i = 0; i < data.length; i++)
		{
			System.out.println(data[i]);
		}
		
		
		int[] data2 = new int[] {1,2,3,4,5};  //선언과 동시에 초기화.
		
		for (int i = 0; i < data2.length; i++)
		{
			System.out.println(data2[i]);
		}
		
		int [] studentIDs = new int [] {10,20,30}; //개수 생략
	//	int [] studentIDs = new int [3]; //오류발생
		int [] studentIDs2 = {102,102,103}; //int형 요소가 3개인 배열 생성
		
		int[] studentsIDs; // 배열 자료형 선언
		studentIDs = new int[] {101,102,103}; //new int[]를 생략할 수 없음
		
		
		
		
	}
}
