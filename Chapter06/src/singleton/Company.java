package singleton;

public class Company {
	
	
	private static Company instance = new Company();
	private Company(){} //company 객체를 new 키워드를 통해서 생성하지 못하도록 설정
	
	public static Company getInstance() {
		
		if(instance == null)
		{
			instance = new Company();
		}
		return instance;
	}
	
}
