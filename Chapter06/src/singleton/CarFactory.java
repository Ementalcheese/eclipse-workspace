package singleton;

public class CarFactory {

	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	private static int serialNum = 10000;
	int CarNum = 0;
	
	public static CarFactory getInstance() {
		if(instance == null)
		{
			instance = new CarFactory();
			
		}
		
		return instance;
	}


	public Car createCar()
	{
			
		++serialNum;	
		return new Car();	
		
	}


	public static int getSerialNum() {
		return serialNum;
	}


	
	
	
	
		
}
