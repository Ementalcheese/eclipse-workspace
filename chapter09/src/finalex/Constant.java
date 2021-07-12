package finalex;

public class Constant {
	
	
	int nUM = 20;
	int nUm = 30;
	int num = 10;
	final int NUM = 100;
	

	public static void main(String[] args) {
		
	
		
		Constant cons = new Constant();
		cons.num = 50;
	//	cons.NUM = 200;             // 상수 이므로 값을 할당 할 수 없음.
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
		System.out.println(cons.nUM);
		System.out.println(cons.nUm);
		
		
		
		
		
		
		
		
		
		
		
	}

}
