package singleton;

public class Car {

	
	public int CarNum;

	
	Car()
	{
		
		setCarNum(CarFactory.getSerialNum());
	}
	
	public int getCarNum() {
		return CarNum;
	}

	public  void setCarNum(int carNum) {
		this.CarNum = carNum;
	}
	
	
	
	
}
